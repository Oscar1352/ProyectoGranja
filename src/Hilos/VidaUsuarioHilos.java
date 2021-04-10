package Hilos;

import Granja.Enum.EstadoUsuario;
import Usuario.Ventanas.DatosUsuario;

import javax.swing.*;

public class VidaUsuarioHilos extends Thread{
    //Vida Usuario
    public void run(){
        //Declaro mi variables
        DatosUsuario datosUsuario= new DatosUsuario();

        datosUsuario.VIVO();
        JOptionPane.showMessageDialog(null, "El juego ha comenzado alimentate para seguir con vida");
        do{
            int VidaPerdida= datosUsuario.getPuntosDeVida()-10;
            datosUsuario.setPuntosDeVida(VidaPerdida);
            datosUsuario.setEstadoUsuario(EstadoUsuario.HAMBRIENTO);
            JOptionPane.showMessageDialog(null, "El Usuario Está hambriento, come algo, Vida Restante: "+DatosUsuario.getPuntosDeVida());

            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (datosUsuario.getPuntosDeVida()==0) {
                System.out.println("El usuario morirá");
                datosUsuario.MUERTO();
                JOptionPane.showMessageDialog(null, "El Usuario ha muerto");
                datosUsuario.setEstadoUsuario(EstadoUsuario.MUERTO);
                System.exit(0);
            }else{
                datosUsuario.HAMBRIENTO();
            }
        }while(datosUsuario.getPuntosDeVida()!=0);
    }
}
