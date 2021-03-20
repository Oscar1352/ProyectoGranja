package Granja.CeldasDeTerreno;
import javax.swing.*;
import java.awt.*;

public class Celdas {

    //Declaro mi arreglo
    String[] CeldasDeTerreno=  new String[3];

    //Establezco mis variables
    int ancho;
    int alto;
    public int posicion;
    public char simbolo;
    Celdas Granja[][];

    public class formulario extends JFrame {
        private JTextField textField;
    }
    public Celdas(char simbolo, int ancho){
        this.posicion = 0;
        this.simbolo = simbolo;
        this.ancho = ancho;
    }


    public void Celdas() {
        //Doy valor a mis celdas

        CeldasDeTerreno[0]="Agua";
        CeldasDeTerreno[1]="Cesped";
        CeldasDeTerreno[2]="Desierto";

        for(int i=0;i<CeldasDeTerreno.length;i++){
            System.out.println(" "+i+" "+CeldasDeTerreno[i]);
        }
        System.out.printf("");
    }


    public void Carretera(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        Granja = new Celdas[alto][ancho];

        for (int i = 0; i < alto; i++) {
            for (int x = 0; x < ancho; x++) {
                Granja[i][x] = new Celdas(obtenerCaracter(x, i), 5);
            }
        }
    }
    public char obtenerCaracter(int columna, int fila) {
        if (fila % 2 != 0)
            columna = columna;

        return '_';
    }

    public void imprimirCasilla2(int numLinea){
        if (numLinea < alto){
            for (int x = 0; x<ancho; x++){
                System.out.print(this.simbolo);
            }
        }
    }
    public void pintarCarretera() {
        for (int i = 0; i < alto; i++) {
            for (int x = 0; x < ancho; x++) {
                Granja[i][x].imprimirCasilla2(0);
            }
            System.out.println();
        }
    }
    public void GenerarCasillaAleatoria(){
        int numero = (int)(Math.random()*3+0);
        System.out.println(numero);
        if (numero==0){
            CeldasDeTerreno[0]="Agua";
            System.out.println(CeldasDeTerreno[numero]);
        }else if (numero==1){
            CeldasDeTerreno[0]="Cesped";
            System.out.println(CeldasDeTerreno[numero]);
        }
        else {
            CeldasDeTerreno[0]="Desierto";
            System.out.println(CeldasDeTerreno[numero]);
        }
    }


}
