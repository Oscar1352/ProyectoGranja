package Granja;

import Granja.Animales.Vaca;
import Granja.Enum.EstadoAgua;
import Granja.Enum.EstadoAnimal;
import Granja.Enum.EstadoPlanta;
import Granja.Enum.EstadoUsuario;
import Granja.Plantas.Maiz;
import Granja.TiposDeCelda.Agua;
import Usuario.DatosUsuario;
import Usuario.Mercado;

import java.util.Scanner;

public class PruebaVida extends Thread{

    //Declaro mis variables
    private EstadoAgua estadoAgua;

    //HILOS
    
    public PruebaVida() throws InterruptedException {
    }

    public static void main(String[] args) throws InterruptedException {

    }
    public  void  Prueba() throws InterruptedException {
        Agua agua = new Agua("Agua", "Pesca", 35, 20, EstadoAgua.CONPECES);
        DatosUsuario datosUsuario = new DatosUsuario();
        int segundos=100;
        int Pesca= ((segundos/100)*2);
        do{
            int x=agua.getCantidadDePeces();
            int a= datosUsuario.getPecesPescados();
            System.out.println("Pescando, actuales: "+Pesca);

        datosUsuario.setPecesPescados(Pesca+a);
        agua.setCantidadDePeces(x-Pesca);
        System.out.println("La cantidad de pescados es:"+x);
        Thread.sleep(segundos);
        if(agua.getCantidadDePeces()==0){
            agua.setEstado(EstadoAgua.SINPECES);
        }
            System.out.println("Usted ha pescado: "+a+" Peces");
        }while (agua.getCantidadDePeces()!=-20);

    }
    public static void Pesca() throws InterruptedException {
        System.out.println("EL pescador empezará su actividad: ");
        System.out.println("El barco fue colocado");



    }
    public static void PruebaPlantas() throws InterruptedException {
        Maiz maiz =new Maiz("Maiz", 2,"Granos",5, EstadoPlanta.JOVEN);
        System.out.println("El tiempo de vida de la Planta es: "+maiz.getEdad()+" minutos");

        //Declaro mis variables de tiempo, x es igual a la cantidad de minutos
        //z es igual al doble de la cantidad de minutos
        int x= maiz.getEdad()*10000;
        int z=(maiz.getEdad()*2)*10000;
        maiz.JOVEN();
        Thread.sleep(x);
        maiz.GRANDE();
        Thread.sleep(x);
        maiz.PENDIENTEDECOSECHA();
        Thread.sleep(x);
        maiz.COSECHAPODRIDA();
        Thread.sleep(z);
        maiz.MUERTA();
    }
    public static void PruebaAnimal() throws InterruptedException{
        Vaca vaca = new Vaca("Vaca",50,"Hervibvoro",2,"Carne y Leche",30 ,true, EstadoAnimal.MUERTO);

        do{
            int x= vaca.getComidaConsumida();
            int Tiempo= vaca.getComidaConsumida()*100;
            int Consumido=x-10;
        Thread.sleep(Tiempo);
        System.out.println("Comida actual: "+x);
        vaca.setComidaConsumida(Consumido);
        if(vaca.getComidaConsumida()==0){
            vaca.setEstado(EstadoAnimal.MUERTO);
        }
        }while(vaca.getComidaConsumida()!=-10);
        System.out.println("El Estado del animal es: "+vaca.getEstado());

    }
    public static void PruebaVida() throws InterruptedException {
        //Declaro mis variables
        DatosUsuario datosUsuario= new DatosUsuario();
        datosUsuario.VIVO();
        do{
            int VidaPerdida= datosUsuario.getPuntosDeVida()-10;
            System.out.println("\nLa cantidad de vida del usuario es de: "+datosUsuario.getPuntosDeVida());
            System.out.println("El usuario ha perdido vida, vida actual: "+VidaPerdida);
            datosUsuario.setPuntosDeVida(VidaPerdida);
            datosUsuario.setEstadoUsuario(EstadoUsuario.HAMBRIENTO);
            Thread.sleep(100000);
            if (datosUsuario.getPuntosDeVida()==0){
                System.out.println("El usuario morirá");
                datosUsuario.MUERTO();
                datosUsuario.setEstadoUsuario(EstadoUsuario.MUERTO);
            }else{
                    datosUsuario.HAMBRIENTO();
                }
        }while(datosUsuario.getPuntosDeVida()!=0);

    }
    public static void PruebaComer() throws InterruptedException {
        PruebaVida();
        System.out.println("Comer algo?");
        Scanner comida = new Scanner(System.in);
        int Unidades = comida.nextInt();
        switch (Unidades){
            case 1:
                Mercado mercado= new Mercado();
                mercado.AlimentoHerviboro();
                mercado.AlimentoOmnivoro();
                break;
            case 2:
                break;
        }

    }
    public static void PruebaHilos() throws InterruptedException {
        Maiz maiz = new Maiz("Maiz", 2, "Granos", 5, EstadoPlanta.JOVEN);
        Maiz maiz1 = new Maiz("Maiz", 2, "Granos", 5, EstadoPlanta.JOVEN);
        Maiz maiz2 = new Maiz("Maiz", 2, "Granos", 5, EstadoPlanta.JOVEN);

        int x = maiz.getEdad() * 10000;
        int z = (maiz.getEdad() * 2) * 10000;
        maiz.JOVEN();
        Thread.sleep(x);
        maiz1.setEstadoPlanta(EstadoPlanta.MUERTA);
        System.out.println("El estado del maiz 1 es: "+maiz1.getEstadoPlanta());
        Thread.sleep(x);
        maiz.PENDIENTEDECOSECHA();
        System.out.println("El estado del maiz 1 es: "+maiz.getEstadoPlanta());
        Thread.sleep(x);
        maiz2.COSECHAPODRIDA();
        Thread.sleep(z);
        maiz.MUERTA();
    }
}
