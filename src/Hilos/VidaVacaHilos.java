package Hilos;

import Controladores.ControladorGrama;
import Granja.Enum.EstadoAnimal;
import Granja.Enum.EstadoPlanta;
import InterfazGráfica.Mercado.Ventana3;

import javax.swing.*;

public class VidaVacaHilos extends Thread{
    public void run() {
        JOptionPane.showMessageDialog(null,"El tiempo de vida la Vaca es "+ Ventana3.vaca.getEdad()+" minutos, esté al pendiente");
        //Declaro mis variables de tiempo, x es igual a la cantidad de minutos
        //z es igual al doble de la cantidad de minutos
        int x= Ventana3.vaca.getEdad()*1000;
        int z=Ventana3.vaca.getEdad()*1000;
        Ventana3.vaca.VIVO();
        JOptionPane.showMessageDialog(null,"La Crianza de Vacas está "+Ventana3.vaca.getEstado()+" mantente atento");

        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Ventana3.vaca.LISTOPARACOSECHA();
        JOptionPane.showMessageDialog(null,"Cosecha Lista Para ser recogida, apurate");

        try {
            Thread.sleep(x+x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(Ventana3.vaca.getEstado()== EstadoAnimal.COSECHADO){
            stop();

        }else{
            Ventana3.vaca.COSECHAPERDIDA();
            JOptionPane.showMessageDialog(null,"La crianza está "+Ventana3.vaca.getEstado()+" Se perdió todo");

            try {
                Thread.sleep(z);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Ventana3.vaca.MUERTO();
            JOptionPane.showMessageDialog(null,"Limpia las celdas");
            ControladorGrama.getCantidad();
        }

    }

}
