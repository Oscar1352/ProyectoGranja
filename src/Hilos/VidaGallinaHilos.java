package Hilos;

import Controladores.ControladorGrama;
import Granja.Enum.EstadoAnimal;
import Granja.Enum.EstadoPlanta;
import InterfazGráfica.Mercado.Ventana3;

import javax.swing.*;

public class VidaGallinaHilos extends Thread{
    public void run() {
        JOptionPane.showMessageDialog(null,"El tiempo de vida de la Gallina es "+ Ventana3.gallina.getEdad()+" minutos, esté al pendiente");
        //Declaro mis variables de tiempo, x es igual a la cantidad de minutos
        //z es igual al doble de la cantidad de minutos
        int x= Ventana3.gallina.getEdad()*1000;
        int z=Ventana3.gallina.getEdad()*1000;
        Ventana3.gallina.VIVO();
        JOptionPane.showMessageDialog(null,"La Crianza de Gallinas Está "+Ventana3.gallina.getEstado()+" mantente atento");

        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Ventana3.gallina.LISTOPARACOSECHA();
        JOptionPane.showMessageDialog(null,"Cosecha Lista Para ser recogida, apurate");

        try {
            Thread.sleep(x+x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(Ventana3.gallina.getEstado()== EstadoAnimal.COSECHADO){
            stop();

        }else{
            Ventana3.gallina.COSECHAPERDIDA();
            JOptionPane.showMessageDialog(null,"La Crianza de Gallinas Está "+Ventana3.gallina.getEstado()+" Se perdió todo");

            try {
                Thread.sleep(z);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Ventana3.gallina.MUERTO();
            JOptionPane.showMessageDialog(null,"Limpia las celdas");
            ControladorGrama.getCantidad();
        }

    }
}
