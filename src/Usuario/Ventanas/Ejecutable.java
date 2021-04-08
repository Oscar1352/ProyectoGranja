package Usuario.Ventanas;

import Granja.Animales.Gallina;
import Granja.Animales.Vaca;
import Granja.Clases.Animales;
import Granja.Clases.Celdas;
import Granja.Clases.Plantas;
import Granja.Enum.EstadoAgua;
import Granja.Enum.EstadoAnimal;
import Granja.Enum.EstadoPlanta;
import Granja.Enum.FertibilidadSuelo;
import Granja.Interfaces.TiposDeAnimal.Herviboro;
import Granja.Plantas.Maiz;
import Granja.Plantas.Manzano;
import Granja.TiposDeCelda.Agua;
import Granja.TiposDeCelda.Grama;
import Usuario.Actividades.Pesca;

public class Ejecutable {
    private Animales animales;
    Grama grama= new Grama("grama", "Siembra", 25,2, FertibilidadSuelo.ALTA);

    public static void main(String[] args) throws InterruptedException {
        /*//PRUEBA OBJETOS DECLARADOS
        Vaca vaca = new Vaca("Vaca",50,"Hervibvoro",2,"Carne y Leche",30 ,true,EstadoAnimal.MUERTO);
        Gallina gallina= new Gallina("Gallina",2,"Omnivoro",50,"Carne",50 ,true, EstadoAnimal.VIVO);
        Grama grama= new Grama("grama", "Siembra", 25,2, FertibilidadSuelo.ALTA);
        Maiz maiz =new Maiz("Maiz", 2,"Granos",5, EstadoPlanta.JOVEN);
        Manzano manzano =new Manzano("Manzano", 2,"Frutos",5, EstadoPlanta.JOVEN);
        Agua agua= new Agua("Agua", "Pesca", 35, 20, EstadoAgua.CONPECES);

        //PRUEBA ARREGLO
        Celdas celdas[][]= new Celdas[5][5];
        celdas[0][0] = grama;
        celdas[0][1] = grama;
        celdas[0][2] = grama;
        celdas[1][0] = grama;
        celdas[1][1] = grama;
        celdas[1][2] = grama;
        celdas[2][0] = grama;
        celdas[2][1] = grama;
        celdas[2][2] = grama;
            for (int x = 0; x < celdas.length; x++) {
                for (int y=0; y < celdas[x].length; y++) {
                    if (celdas[x][y]!=null){
                        System.out.println(celdas[x][y].getTipoDeSuelo());
                    }
            }

        }
        //Prueba Animales
        Herviboro herviboro[]= new Herviboro[2];
        herviboro[0]= vaca;
        herviboro[1]= gallina;
        mostrarAnimalesherviboro(herviboro);
        vaca.VIVO();
        vaca.setEstado(EstadoAnimal.VIVO);
        gallina.MUERTO();

        //Prueba Plantas
        Plantas plantas[]= new Plantas[5];
        plantas[0]= maiz;
        plantas[1]= manzano;
        mostrarPlantas(plantas);
        maiz.JOVEN();
        manzano.COSECHAPODRIDA();

        agua.CONPECES();
        agua.SINPECES();

        PruebaFertibilidadSuelo();
        PruebaPesca();
        PruebaLlenado();
    }
    public static void mostrarAnimalesherviboro(Herviboro herviboro[]){

        for (int i = 0; i < herviboro.length; i++) {
            if (herviboro[i]!=null){
            Herviboro animal = herviboro[i];
            System.out.println(i+" El animal es "+herviboro[i]);
            }
        }
    }
    public static void mostrarPlantas(Plantas plantas[]){

        for (int i = 0; i < plantas.length; i++) {
            if (plantas[i]!=null){
            Plantas planta = plantas[i];
            System.out.println(i+" La Planta es "+plantas[i].getTipoDePlanta());
            }
        }
    }
    public static void PruebaFertibilidadSuelo(){
        Grama grama= new Grama("grama", "Siembra", 25,2, FertibilidadSuelo.BASICA);

        int x=0;
        if(grama.getFertibilidadSuelo() == FertibilidadSuelo.BASICA){
            x=1;
            System.out.println("El valor de x cambió, es "+x);
        }
        else if(grama.getFertibilidadSuelo() == FertibilidadSuelo.MEDIA){
            x=2;
            System.out.println("El valor de x cambió, es "+x);
        }
        else if(grama.getFertibilidadSuelo() == FertibilidadSuelo.ALTA){
            x=3;
            System.out.println("El valor de x cambió, es "+x);
        }
    }
    public static void PruebaPesca() throws InterruptedException {
        Pesca pesca= new Pesca();
        pesca.Pesca();
    }
    public static void PruebaLlenado() throws InterruptedException {
        Pesca pesca= new Pesca();
        pesca.LlenarDePeces();
    }
*/
    }
}
