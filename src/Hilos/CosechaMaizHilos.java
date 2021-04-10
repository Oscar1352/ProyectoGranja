package Hilos;

import Granja.Enum.EstadoGrama;
import Granja.Enum.EstadoPlanta;
import Granja.Enum.FertibilidadSuelo;
import InterfazGráfica.Ventana3;

import javax.swing.*;

public class CosechaMaizHilos extends Thread{

    public void run(){
        //Empieza la plantacion en una de las celdas
        System.out.println("Se empezará la cosecha: ");
        int semillas= Ventana3.maiz.getCantidadDeSemillas();
        int siembra=semillas-1;
        JOptionPane.showMessageDialog(null,"Usted Plantó "+Ventana3.maiz.getNombre());
        Ventana3.maiz.setCantidadDeSemillas(siembra);
        JOptionPane.showMessageDialog(null,"Y producirá "+Ventana3.maiz.getTipoDePlanta());
        JOptionPane.showMessageDialog(null,"Se harán los cálculos...");

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.BASICA){
            int Cantidad= Ventana3.maiz.getEdad() * Ventana3.basica.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.maiz.getTipoDePlanta());
            Ventana3.maiz.setEstadoPlanta(EstadoPlanta.COSECHADA);
            Ventana3.maiz.setCantidadDeSemillas(Ventana3.maiz.getCantidadDeSemillas()+Cantidad);
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);

        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.MEDIA){
            int Cantidad= Ventana3.maiz.getEdad() * Ventana3.media.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.maiz.getTipoDePlanta());
            Ventana3.maiz.setEstadoPlanta(EstadoPlanta.COSECHADA);
            Ventana3.maiz.setEstadoPlanta(EstadoPlanta.COSECHADA);
            Ventana3.maiz.setCantidadDeSemillas(Ventana3.maiz.getCantidadDeSemillas()+Cantidad);
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);


        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.ALTA){
            int Cantidad= Ventana3.maiz.getEdad() * Ventana3.alta.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.maiz.getTipoDePlanta());
            Ventana3.maiz.setEstadoPlanta(EstadoPlanta.COSECHADA);
            Ventana3.maiz.setCantidadDeSemillas(Ventana3.maiz.getCantidadDeSemillas()+Cantidad);
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);


        }else{
            JOptionPane.showMessageDialog(null,"LA COSECHA AUN NO ESTÁ LISTA, ESPERE");

        }

    }
}
