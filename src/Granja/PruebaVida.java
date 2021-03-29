package Granja;

import Granja.Enum.EstadoAgua;
import Granja.TiposDeCelda.Agua;
import Usuario.DatosUsuario;

public class PruebaVida extends Thread{
    private EstadoAgua estadoAgua;
    public static void main(String[] args) throws InterruptedException {


    }

    public  void  Prueba() throws InterruptedException {
        Agua agua = new Agua("Agua", "Pesca", 35, 20, EstadoAgua.CONPECES);
        DatosUsuario datosUsuario = new DatosUsuario();
        int segundos=1000;
        int Pesca= ((segundos/100)*2);
        do{
            Thread.sleep(segundos);
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
        }while (agua.getCantidadDePeces()!=-20);
        agua.SINPECES();

    }
    public static void Pesca() throws InterruptedException {
        System.out.println("EL pescador empezará su actividad: ");
        System.out.println("El barco fue colocado");



    }
}
