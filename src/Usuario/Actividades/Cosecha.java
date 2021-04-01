package Usuario.Actividades;

import Granja.Clases.Celdas;
import Granja.Enum.EstadoAgua;
import Granja.Enum.EstadoPlanta;
import Granja.Enum.FertibilidadSuelo;
import Granja.Fertilizantes.Basica;
import Granja.Plantas.Maiz;
import Granja.TiposDeCelda.Agua;
import Granja.TiposDeCelda.Desierto;
import Granja.TiposDeCelda.Grama;

public class Cosecha extends Thread{
    public static void main(String[] args) throws InterruptedException {
SiembraMaiz();
    }


    public static void CeldasAleatorias() throws InterruptedException {
        int a=0;
        Celdas celdas[][]= new Celdas[6][6];

        Grama grama= new Grama("Grama","Siembra",40,25, FertibilidadSuelo.BASICA);
        Agua agua= new Agua("Agua","Pezca",35,25, EstadoAgua.CONPECES);
        Desierto desierto= new Desierto("Desierto","Nada",25,5);

        for(int b=0;b<=5;b++){
            for(int c=0;c<=5;c++){
                celdas[b][c]=grama;
                celdas[b][c]=agua;
                celdas[b][c]=desierto;
                //Probabilidades
                double random1 = Math.random();// generamos un numero al azar entre 0 y 1
                double random2 = Math.random();// generamos un numero al azar entre 0 y 1
                double random3 = Math.random();// generamos un numero al azar entre 0 y 1
                if (random1 < 0.4){// el 40% de las veces
                    celdas[b][c]=grama;
                    a++;
                    sleep(300);
                }else if (random2 < 0.35){// el 35% de las veces
                    celdas[b][c]=agua;
                    sleep(300);
                }else if (random3 < 0.25){// el 25% de las veces
                    celdas[b][c]=desierto;
                    sleep(300);
                }
                System.out.println("Prueba Random2    "+b+c+" es: "+celdas[b][c].getTipoDeSuelo());
            }
        }
        //Muestro con ayuda de mi contador a la cantidad de casillas de tierra
        System.out.println("\nLa cantidad de celdas disponibles para la siembra son: "+a);

    }
    public static void SiembraMaiz() throws InterruptedException {
        //Debo declarar mi planta, mi suelo y el Fertilizante utilizado
        Maiz maiz = new Maiz("Maiz",2,"Granos",25, EstadoPlanta.JOVEN);
        Grama grama = new Grama("Grama","Siembra y crianza",40,25,FertibilidadSuelo.BASICA);
        Basica basica= new Basica(FertibilidadSuelo.BASICA, 1, 1,25);

        //Empieza la plantacion en una de las celdas
        System.out.println("Se empezará la cosecha: ");
        int semillas= maiz.getCantidadDeSemillas();
        int siembra=semillas-1;
        System.out.println("Usted ha sembrado "+maiz.getNombre());
        maiz.setCantidadDeSemillas(siembra);
        System.out.println("Y producirá "+maiz.getTipoDePlanta());
        System.out.println("Se harán los cálculos...");
        sleep(1000);
        int Cantidad= maiz.getEdad() * basica.getIndiceDeMejora()*10;
        System.out.println("En cantidad de: "+Cantidad+" "+maiz.getTipoDePlanta());
    }
}
