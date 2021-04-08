package Usuario.Ventanas;

import Granja.Clases.Celdas;
import Granja.Enum.EstadoAgua;
import Granja.Enum.FertibilidadSuelo;
import Granja.TiposDeCelda.Agua;
import Granja.TiposDeCelda.Desierto;
import Granja.TiposDeCelda.Grama;

import java.util.Arrays;

public class PruebaCeldasAleatorias {
    public static void main(String[] args) {
        Prueba1();
    }
    public static void Prueba(){

        Celdas celdas[][]= new Celdas[5][5];

        Grama grama= new Grama("Grama","Siembra",40,25, FertibilidadSuelo.BASICA);
        Agua agua= new Agua("Agua","Pezca",25,25, EstadoAgua.CONPECES);
        Desierto desierto= new Desierto("Desierto","Nada",15,5);

        celdas[0][0]=grama;
        celdas[1][0]=agua;
        celdas[2][0]=desierto;
        celdas[0][0]=grama;
        celdas[0][1]=agua;
        celdas[0][2]=desierto;


        for (int i=0; i< celdas.length;i++){
            if (celdas[i]!=null){
                System.out.println("Primera Linea: "+celdas[i]);
                for(int x=0;x< celdas.length;x++){
                    if (celdas[i][x]!=null){
                        System.out.println("Segunda Fila: "+celdas[i][x].getTipoDeSuelo());
                    }
                }
            }
        }

    }
    public static void Prueba1(){
         int Columnas=2;
         int Filas=9;
        Celdas celdas[][]= new Celdas[6][10];

        Grama grama= new Grama("Grama","Siembra",40,25, FertibilidadSuelo.BASICA);
        Agua agua= new Agua("Agua","Pezca",35,25, EstadoAgua.CONPECES);
        Desierto desierto= new Desierto("Desierto","Nada",25,5);

        for(int b=0;b<=Columnas;b++){
            for(int c=0;c<=Filas;c++){
                celdas[b][c]=grama;
                celdas[b][c]=agua;
                celdas[b][c]=desierto;
                //Probabilidades
                double random1 = Math.random();// generamos un numero al azar entre 0 y 1
                double random2 = Math.random();// generamos un numero al azar entre 0 y 1
                double random3 = Math.random();// generamos un numero al azar entre 0 y 1
                if (random1 < 0.4){// el 40% de las veces
                    celdas[b][c]=grama;
                }else if (random2 < 0.35){// el 35% de las veces
                    celdas[b][c]=agua;
                }else if (random3 < 0.25){// el 25% de las veces
                    celdas[b][c]=desierto;
                }
                int tamaño=b+c;
                if(b<=2 && c<=10){
                    System.out.println("Prueba Random2 "+b+c+" es: "+celdas[b][c].getTipoDeSuelo());

                }
            }
        }
        int[][] Prueba = new int[5][2];
        Prueba[0][0]=1;
        Prueba[1][0]=2;
        Prueba[2][0]=3;
        Prueba[3][0]=4;
        Prueba[4][0]=5;
        for(int i=0;i<Prueba.length;i++){
            if(Prueba[i][0]!=0){
            }
            System.out.println("Boton: "+i);
        }
        System.out.println("Se crearon "+Prueba.length+" Botones");


    }
}
