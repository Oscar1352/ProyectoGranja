package Usuario.Actividades;

import Granja.Enum.EstadoAgua;
import Granja.TiposDeCelda.Agua;
import Usuario.DatosUsuario;

import java.util.Scanner;

public class Pesca extends Thread {
    private EstadoAgua estadoAgua;
    Agua agua = new Agua("Agua", "Pesca", 35, 20, EstadoAgua.CONPECES);
    DatosUsuario datosUsuario = new DatosUsuario();
    int segundos=1000;
    int Barco;

    //Declaro Accion de Pesca
    public  void  Pesca() throws InterruptedException {
    int Pesca= ((segundos/100)*2);
    agua.setCantidadDePeces(1000);
        do{
        int x=agua.getCantidadDePeces();
        int a= datosUsuario.getPecesPescados();
        System.out.println("Pescando, actuales: "+Pesca);
        datosUsuario.setPecesPescados(Pesca+a);
        agua.setCantidadDePeces(x-Pesca);
        System.out.println("La cantidad de pescados es:"+x);
        if(agua.getCantidadDePeces()==0){
            agua.setEstado(EstadoAgua.SINPECES);
        }
        System.out.println("Usted ha pescado: "+a+" Peces");
    }while (agua.getCantidadDePeces()!=0);
        agua.SINPECES();
        System.out.println(agua.getCantidadDePeces());
    }

    //Declaro Accion Para llenar la celda de agua de nuevo
    public void LlenarDePeces()throws InterruptedException{
        System.out.println("Cantidad de Peces: "+agua.getCantidadDePeces());
        System.out.println("\n\nQuitar el Barco?");
        do{
            System.out.println("1.SI");
            System.out.println("2.NO");
            System.out.print("Ingrese su elección: ");
            Scanner barco = new Scanner(System.in);
        Barco = barco.nextInt();

        }while( Barco < 1 || Barco > 2 );

        switch (Barco){
            case 1:
                int ApariciónDePeces= ((segundos/100)*2);
                System.out.println("Cantidad de Peces: "+agua.getCantidadDePeces());
                do{
                    System.out.println("Cantidad de Peces en el lago "+agua.getCantidadDePeces());
                    Thread.sleep(segundos);
                    int x=agua.getCantidadDePeces();
                    System.out.println("Llenando, actuales: "+agua.getCantidadDePeces()+"\n\n");
                    agua.setCantidadDePeces(agua.getCantidadDePeces()+ApariciónDePeces);
                    System.out.println("La cantidad de pescados es:"+agua.getCantidadDePeces());
                    if(agua.getCantidadDePeces()==100){
                        agua.setEstado(EstadoAgua.CONPECES);
                    }
                }while (agua.getCantidadDePeces()!=100);
                agua.CONPECES();
                break;
            case 2:
                System.out.println("El estado del agua seguirá igual: "+agua.getEstado());
                break;
        }
    }
}

