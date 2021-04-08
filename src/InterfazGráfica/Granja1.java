package InterfazGráfica;

import Granja.Clases.Celdas;
import Granja.Enum.EstadoAgua;
import Granja.Enum.FertibilidadSuelo;
import Granja.TiposDeCelda.Agua;
import Granja.TiposDeCelda.Desierto;
import Granja.TiposDeCelda.Grama;

import javax.swing.*;
import java.awt.*;

public class Granja1 {
    private static final int COLUMNAS = 6;
    private static final int FILAS = 4;

    public static void main(String [] args) throws InterruptedException {

        int Elementos=26;
        Celdas celdas[]= new Celdas[Elementos];
        int b;

        Grama grama= new Grama("Grama","Siembra",40,25, FertibilidadSuelo.BASICA);
        Agua agua= new Agua("Agua","Pezca",35,25, EstadoAgua.CONPECES);
        Desierto desierto= new Desierto("Desierto","Nada",25,5);

        for(b=0;b<Elementos;b++){
            celdas[b]=grama;
            celdas[b]=agua;
            celdas[b]=desierto;
            //Probabilidades
            double random1 = Math.random();// generamos un numero al azar entre 0 y 1
            double random2 = Math.random();// generamos un numero al azar entre 0 y 1
            double random3 = Math.random();// generamos un numero al azar entre 0 y 1
            if (random1 < 0.4){// el 40% de las veces
                celdas[b]=grama;
            }else if (random2 < 0.35){// el 35% de las veces
                celdas[b]=agua;
            }else if (random3 < 0.25){// el 25% de las veces
                celdas[b]=desierto;
            }
            if(b<=Elementos){
                System.out.println("Prueba Random2 "+b+" es: "+celdas[b].getTipoDeSuelo());
            }
        }
        JFrame v = new JFrame("Granja MyFarm");
        v.getContentPane().setLayout(new GridLayout(COLUMNAS, FILAS));
                JButton [][] Botones = new JButton [COLUMNAS][FILAS];
                for (int i=0;i<COLUMNAS;i++){
                    for (int j=0;j<FILAS;j++)
                    {
                for(int a= 0; a<Elementos;a++){
                    Botones[i][j] = new JButton(""+celdas[a].getTipoDeSuelo());
                    System.out.println(""+celdas[a].getTipoDeSuelo());
                }
                v.getContentPane().add(Botones[i][j]);
            }
        }
        JButton b0= new JButton("");
        JButton b1= new JButton("SEMBRAR");
        JButton b2= new JButton("COSECHAR");
        JButton b3= new JButton("COMPRAR CELDAS");
        JButton b4= new JButton("PESCA");
        JButton b5= new JButton("LIMPIAR");
        v.add(b0);
        v.add(b1);
        v.add(b2);
        v.add(b3);
        v.add(b4);
        v.add(b5);
        v.pack();
        v.setVisible(true);
        v.setSize(700,500);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);}
}