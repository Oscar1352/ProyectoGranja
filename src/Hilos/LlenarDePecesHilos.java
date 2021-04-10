package Hilos;

import Granja.Enum.EstadoAgua;
import InterfazGráfica.Ventana3;

import javax.swing.*;

public class LlenarDePecesHilos extends Thread{
    //Declaro mis varibales
    private EstadoAgua estadoAgua;
    int segundos=1000;
    int Barco;

    //Declaro Accion Para llenar la celda de agua de nuevo
    public void run(){
        if(Ventana3.agua.getEstado()==EstadoAgua.CONPECES){
            JOptionPane.showMessageDialog(null,"EL AGUA ESTÁ LLENA DE PECES, NO ES NECESARIO LLENAR");
        }else{
        int ApariciónDePeces= ((segundos/100)*2);
        do{
            JOptionPane.showMessageDialog(null,"Cantidad de Peces en el lago "+Ventana3.agua.getCantidadDePeces());
            try {
                Thread.sleep(segundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int x= Ventana3.agua.getCantidadDePeces();
            JOptionPane.showMessageDialog(null,"Llenando, actuales: "+Ventana3.agua.getCantidadDePeces()+"\n");
            Ventana3.agua.setCantidadDePeces(Ventana3.agua.getCantidadDePeces()+ApariciónDePeces);
            if(Ventana3.agua.getCantidadDePeces()==100){
                Ventana3.agua.setEstado(EstadoAgua.CONPECES);
                Ventana3.agua.setCantidadDePeces(100);
            }
        }while (Ventana3.agua.getCantidadDePeces()!=100);
        JOptionPane.showMessageDialog(null,"Cantidad de Peces en el lago "+Ventana3.agua.getCantidadDePeces());
        Ventana3.agua.CONPECES();
        Ventana3.agua.setCantidadDePeces(100);
        }
    }
}
