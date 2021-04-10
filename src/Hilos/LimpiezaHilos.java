package Hilos;

import Granja.Enum.EstadoAnimal;
import Granja.Enum.EstadoGrama;
import Granja.Enum.EstadoPlanta;
import InterfazGráfica.Mercado.Ventana3;

import javax.swing.*;

public class LimpiezaHilos extends Thread{
    public void run() {

        //Declaro mis Hilos
        VidaMaizHilos vidaMaizHilos = new VidaMaizHilos();
        VidaManzanoHilos vidaManzanoHilos = new VidaManzanoHilos();
        VidaGallinaHilos vidaGallinaHilos= new VidaGallinaHilos();
        VidaVacaHilos vidaVacaHilos= new VidaVacaHilos();

        if(Ventana3.maiz.getEstadoPlanta()== EstadoPlanta.MUERTA){
        JOptionPane.showMessageDialog(null,"SE ESTÁ LIMPIANDO LAS CELDAS");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"CELDAS LIMPIAS");
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);
        vidaMaizHilos.stop();
        }else if(Ventana3.manzano.getEstadoPlanta()== EstadoPlanta.MUERTA){
            JOptionPane.showMessageDialog(null,"SE ESTÁ LIMPIANDO LAS CELDAS");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"CELDAS LIMPIAS");
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);

        vidaManzanoHilos.stop();
        }else if(Ventana3.gallina.getEstado()== EstadoAnimal.MUERTO){
            JOptionPane.showMessageDialog(null,"SE ESTÁ LIMPIANDO LAS CELDAS");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"CELDAS LIMPIAS");
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);
            vidaGallinaHilos.stop();

        }else if(Ventana3.vaca.getEstado()== EstadoAnimal.MUERTO){
            JOptionPane.showMessageDialog(null,"SE ESTÁ LIMPIANDO LAS CELDAS");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"CELDAS LIMPIAS");
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);
            vidaVacaHilos.stop();
        }
        else{
            JOptionPane.showMessageDialog(null, "NO HAY CASILLAS PARA LIMPIAR");
        }
    }
}
