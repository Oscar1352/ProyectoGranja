package Hilos;

import Controladores.ControladorGrama;
import Granja.Enum.EstadoAnimal;
import Granja.Enum.EstadoGrama;
import Granja.Enum.EstadoPlanta;
import Granja.Enum.FertibilidadSuelo;
import Granja.Fertilizantes.Alta;
import Granja.Fertilizantes.Basica;
import Granja.Fertilizantes.Media;
import Granja.Plantas.Maiz;
import Granja.TiposDeCelda.Grama;
import InterfazGráfica.Mercado.Ventana3;

import javax.swing.*;

public class CosechaGallinasHilos extends Thread{

    public void run(){
        //Empieza la plantacion en una de las celdas
        System.out.println("Se empezará la cosecha: ");
        int Crias= Ventana3.gallina.getCantidad();
        int Cosecha=Crias-1;
        JOptionPane.showMessageDialog(null,"Usted Crió "+Ventana3.gallina.getNombre());
        Ventana3.gallina.setCantidad(Cosecha);
        JOptionPane.showMessageDialog(null,"Y producirá "+Ventana3.gallina.getProducto());
        JOptionPane.showMessageDialog(null,"Se harán los cálculos...");

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        VidaGallinaHilos vidaGallinaHilos= new VidaGallinaHilos();
        if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.BASICA){
            int Cantidad= Ventana3.gallina.getEdad() * Ventana3.basica.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.gallina.getProducto());
            Ventana3.gallina.setEstado(EstadoAnimal.COSECHADO);
            Ventana3.gallina.setCantidad(Ventana3.gallina.getCantidad()+Cantidad);
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);
            vidaGallinaHilos.stop();

        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.MEDIA){
            int Cantidad= Ventana3.gallina.getEdad() * Ventana3.media.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.gallina.getProducto());
            Ventana3.gallina.setEstado(EstadoAnimal.COSECHADO);
            Ventana3.gallina.setCantidad(Ventana3.gallina.getCantidad()+Cantidad);
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);
            vidaGallinaHilos.stop();


        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.ALTA){
            int Cantidad= Ventana3.gallina.getEdad() * Ventana3.alta.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"En cantidad de: "+Cantidad+" "+Ventana3.gallina.getProducto());
            Ventana3.gallina.setEstado(EstadoAnimal.COSECHADO);
            Ventana3.gallina.setCantidad(Ventana3.gallina.getCantidad()+Cantidad);
            Ventana3.grama.setEstadoGrama(EstadoGrama.DISPONIBLE);
            vidaGallinaHilos.stop();


        }else{
            JOptionPane.showMessageDialog(null,"LA COSECHA AUN NO ESTÁ LISTA, ESPERE");

        }

    }
}