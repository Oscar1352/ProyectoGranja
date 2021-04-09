package Hilos;

import Granja.Enum.EstadoPlanta;
import Granja.Enum.FertibilidadSuelo;
import InterfazGráfica.Mercado.Ventana3;

import javax.swing.*;

public class CosechaManzanoHilos extends Thread{
    public void run(){
        //Empieza la plantacion en una de las celdas
        System.out.println("Se empezará la cosecha: ");
        int semillas= Ventana3.manzano.getCantidadDeSemillas();
        int siembra=semillas-1;
        JOptionPane.showMessageDialog(null,"Usted Plantó "+Ventana3.manzano.getNombre());
        Ventana3.manzano.setCantidadDeSemillas(siembra);
        JOptionPane.showMessageDialog(null,"Y producirá "+Ventana3.manzano.getTipoDePlanta());
        JOptionPane.showMessageDialog(null,"Se harán los cálculos...");

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(Ventana3.grama.getFertibilidadSuelo()== FertibilidadSuelo.BASICA){
            int Cantidad= Ventana3.manzano.getEdad() * Ventana3.basica.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.manzano.getTipoDePlanta());
            Ventana3.manzano.setEstadoPlanta(EstadoPlanta.COSECHADA);
            Ventana3.manzano.setCantidadDeSemillas(Ventana3.manzano.getCantidadDeSemillas()+Cantidad);

        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.MEDIA){
            int Cantidad= Ventana3.manzano.getEdad() * Ventana3.media.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.manzano.getTipoDePlanta());
            Ventana3.manzano.setEstadoPlanta(EstadoPlanta.COSECHADA);
            Ventana3.manzano.setEstadoPlanta(EstadoPlanta.COSECHADA);
            Ventana3.manzano.setCantidadDeSemillas(Ventana3.manzano.getCantidadDeSemillas()+Cantidad);

        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.ALTA){
            int Cantidad= Ventana3.manzano.getEdad() * Ventana3.alta.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.manzano.getTipoDePlanta());
            Ventana3.manzano.setEstadoPlanta(EstadoPlanta.COSECHADA);
            Ventana3.manzano.setCantidadDeSemillas(Ventana3.manzano.getCantidadDeSemillas()+Cantidad);

        }else{
            JOptionPane.showMessageDialog(null,"LA COSECHA AUN NO ESTÁ LISTA, ESPERE");

        }

    }
}
