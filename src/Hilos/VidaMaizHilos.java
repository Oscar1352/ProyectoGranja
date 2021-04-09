package Hilos;

import Controladores.ControladorGrama;
import Granja.Enum.EstadoPlanta;
import InterfazGráfica.Mercado.Ventana3;

import javax.swing.*;

public class VidaMaizHilos extends Thread{
    public void run() {
        JOptionPane.showMessageDialog(null,"El tiempo de vida es "+ Ventana3.maiz.getEdad()+" minutos, esté al pendiente");
        //Declaro mis variables de tiempo, x es igual a la cantidad de minutos
        //z es igual al doble de la cantidad de minutos
        int x= Ventana3.maiz.getEdad()*10000;
        int z=(Ventana3.maiz.getEdad()*2)*10000;
        Ventana3.maiz.JOVEN();
        JOptionPane.showMessageDialog(null,"La plantación está "+Ventana3.maiz.getEstadoPlanta()+" mantente atento");

        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Ventana3.maiz.GRANDE();
        JOptionPane.showMessageDialog(null,"La plantación está "+Ventana3.maiz.getEstadoPlanta()+" mantente atento");

        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Ventana3.maiz.PENDIENTEDECOSECHA();
        JOptionPane.showMessageDialog(null,"Cosecha Lista Para ser recogida, apurate");

        try {
            Thread.sleep(x+x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(Ventana3.maiz.getEstadoPlanta()== EstadoPlanta.COSECHADA){
            stop();

        }else{
        Ventana3.maiz.COSECHAPODRIDA();
        JOptionPane.showMessageDialog(null,"La plantación está "+Ventana3.maiz.getEstadoPlanta()+" Se perdió todo");

        try {
            Thread.sleep(z);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Ventana3.maiz.MUERTA();
        JOptionPane.showMessageDialog(null,"Limpia las celdas");
            ControladorGrama.getCantidad();
        }

    }

}
