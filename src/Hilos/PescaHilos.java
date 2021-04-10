package Hilos;

import Granja.Enum.EstadoAgua;
import InterfazGráfica.Ventana3;
import Usuario.Ventanas.DatosUsuario;

import javax.swing.*;

public class PescaHilos extends Thread{
    //Declaro mis varibales
    private EstadoAgua estadoAgua;
    int segundos=1000;
    int Barco;


    public void run() {

        if(Ventana3.agua.getEstado()==EstadoAgua.SINPECES){
            JOptionPane.showMessageDialog(null,"EL AGUA NO TIENE PECES, NO SE PUEDE PESCAR");
        }else{
        int oro= DatosUsuario.getOro();
        DatosUsuario.setOro(oro-50);
        int Pesca= ((segundos/100)*2);
        Ventana3.agua.setCantidadDePeces(100);
        do{
            int x=Ventana3.agua.getCantidadDePeces();
            int a= DatosUsuario.getPecesPescados();
            try {
                sleep(segundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"La cantidad de pescados en el lago es:"+x);
            DatosUsuario.setPecesPescados(Pesca+a);
            Ventana3.agua.setCantidadDePeces(x-Pesca);
            if(Ventana3.agua.getCantidadDePeces()==-20){
                Ventana3.agua.setEstado(EstadoAgua.SINPECES);
            }
            JOptionPane.showMessageDialog(null,"\nUsted ha pescado: "+(Pesca+a)+" Peces");
        }while (Ventana3.agua.getCantidadDePeces()!=0);
        Ventana3.agua.SINPECES();
        }
    }
}
