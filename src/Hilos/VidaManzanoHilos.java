package Hilos;

import Granja.Enum.EstadoPlanta;
import InterfazGráfica.Ventana3;

import javax.swing.*;


    public class VidaManzanoHilos extends Thread{
        public void run() {
            JOptionPane.showMessageDialog(null,"El tiempo de vida es "+ Ventana3.manzano.getEdad()+" minutos, esté al pendiente");
            //Declaro mis variables de tiempo, x es igual a la cantidad de minutos
            //z es igual al doble de la cantidad de minutos
            int x= Ventana3.manzano.getEdad()*10000;
            int z=(Ventana3.manzano.getEdad()*2)*10000;
            Ventana3.manzano.JOVEN();
            JOptionPane.showMessageDialog(null,"La plantación está "+Ventana3.manzano.getEstadoPlanta()+" mantente atento");

            try {
                Thread.sleep(x);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Ventana3.manzano.GRANDE();
            JOptionPane.showMessageDialog(null,"La plantación está "+Ventana3.manzano.getEstadoPlanta()+" mantente atento");

            try {
                Thread.sleep(x);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Ventana3.manzano.PENDIENTEDECOSECHA();
            JOptionPane.showMessageDialog(null,"Cosecha Lista Para ser recogida, apurate");

            try {
                Thread.sleep(x+x);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(Ventana3.manzano.getEstadoPlanta()== EstadoPlanta.COSECHADA){
                stop();
            }else{
                Ventana3.manzano.COSECHAPODRIDA();
                JOptionPane.showMessageDialog(null,"La plantación está "+Ventana3.manzano.getEstadoPlanta()+" Se perdió todo");

                try {
                    Thread.sleep(z);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Ventana3.manzano.MUERTA();
                JOptionPane.showMessageDialog(null,"Limpia las celdas");
            }

        }
    }

