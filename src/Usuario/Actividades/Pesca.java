package Usuario.Actividades;

import Granja.Enum.EstadoAgua;
import Granja.TiposDeCelda.Agua;
import Usuario.Ventanas.DatosUsuario;

import java.util.Scanner;

public class Pesca extends Thread {

    //Declaro mis variables
    private EstadoAgua estadoAgua;
    Agua agua = new Agua("Agua", "Pesca", 35, 20, EstadoAgua.CONPECES);
    DatosUsuario datosUsuario = new DatosUsuario();
    int segundos=1000;
    int Barco;

    //Declaro Accion de Pesca
    public  void   Pesca() throws InterruptedException {
        System.out.println("Comprar barco de pesca a 50 monedas de oro?");
        System.out.println("1.SI");
        System.out.println("2.NO");
        System.out.println("INGRESE SU ELECCIÓN: ");
        Scanner comprarbarco = new Scanner(System.in);
        int Cbarco = comprarbarco.nextInt();
        switch (Cbarco){
            case 1:
                int oro= datosUsuario.getOro();
                datosUsuario.setOro(oro-50);
                int Pesca= ((segundos/100)*2);
                agua.setCantidadDePeces(100);
                do{
                    int x=agua.getCantidadDePeces();
                    int a= datosUsuario.getPecesPescados();
                    sleep(segundos);
                    System.out.println("La cantidad de pescados en el lago es:"+x);
                    datosUsuario.setPecesPescados(Pesca+a);
                    agua.setCantidadDePeces(x-Pesca);
                    if(agua.getCantidadDePeces()==-20){
                        agua.setEstado(EstadoAgua.SINPECES);
                    }
                    System.out.println("\nUsted ha pescado: "+(Pesca+a)+" Peces");
                }while (agua.getCantidadDePeces()!=0);
                agua.SINPECES();
                LlenarDePeces();
                break;
            case 2:
                agua.CONPECES();
                break;
        }
    }

    //Declaro Accion Para llenar la celda de agua de nuevo
    public void LlenarDePeces()throws InterruptedException{
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
                do{
                    System.out.println("Cantidad de Peces en el lago "+agua.getCantidadDePeces());
                    Thread.sleep(segundos);
                    int x=agua.getCantidadDePeces();
                    System.out.println("Llenando, actuales: "+agua.getCantidadDePeces()+"\n");
                    agua.setCantidadDePeces(agua.getCantidadDePeces()+ApariciónDePeces);
                    if(agua.getCantidadDePeces()==100){
                        agua.setEstado(EstadoAgua.CONPECES);
                        agua.setCantidadDePeces(100);
                    }
                }while (agua.getCantidadDePeces()!=100);
                System.out.println("Cantidad de Peces en el lago "+agua.getCantidadDePeces());
                agua.CONPECES();
                agua.setCantidadDePeces(100);

                //Declaro mi variable para volver a pesacar
                System.out.println("Volver a pescar?");
                System.out.println("1.SI");
                System.out.println("2.NO");
                System.out.print("Ingrese su elección: ");
                Scanner pesca = new Scanner(System.in);
                int Pesca1 = pesca.nextInt();
                switch (Pesca1){
                    case 1:
                        Pesca();
                        break;
                    case 2:
                        System.out.println("Nos vemos");
                        break;
                }
                break;
            case 2:
                System.out.println("El estado del agua seguirá igual: "+agua.getEstado());
                break;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Pesca pesca= new Pesca();
        pesca.Pesca();
    }
}

