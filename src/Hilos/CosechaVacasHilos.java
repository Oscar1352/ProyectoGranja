package Hilos;

import Granja.Enum.EstadoAnimal;
import Granja.Enum.EstadoGrama;
import Granja.Enum.FertibilidadSuelo;
import InterfazGráfica.Ventana3;

import javax.swing.*;

public class CosechaVacasHilos extends Thread{

    public void run(){
        //Empieza la plantacion en una de las celdas
        System.out.println("Se empezará la cosecha: ");
        int Crias= Ventana3.vaca.getCantidad();
        int Cosecha=Crias-1;
        JOptionPane.showMessageDialog(null,"Usted Crió "+Ventana3.vaca.getNombre());
        Ventana3.vaca.setCantidad(Cosecha);
        JOptionPane.showMessageDialog(null,"Y producirá "+Ventana3.vaca.getProducto());
        JOptionPane.showMessageDialog(null,"Se harán los cálculos...");

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.BASICA){
            int Cantidad= Ventana3.vaca.getEdad() * Ventana3.basica.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.vaca.getProducto());
            Ventana3.vaca.setEstado(EstadoAnimal.COSECHADO);
            Ventana3.vaca.setCantidad(Ventana3.vaca.getCantidad()+Cantidad);
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);

        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.MEDIA){
            int Cantidad= Ventana3.vaca.getEdad() * Ventana3.media.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.vaca.getProducto());
            Ventana3.vaca.setEstado(EstadoAnimal.COSECHADO);
            Ventana3.vaca.setCantidad(Ventana3.vaca.getCantidad()+Cantidad);
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);


        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.ALTA){
            int Cantidad= Ventana3.vaca.getEdad() * Ventana3.alta.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.vaca.getProducto());
            Ventana3.vaca.setEstado(EstadoAnimal.COSECHADO);
            Ventana3.vaca.setCantidad(Ventana3.vaca.getCantidad()+Cantidad);
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);


        }else{
            JOptionPane.showMessageDialog(null,"LA COSECHA AUN NO ESTÁ LISTA, ESPERE");

        }

    }
}
