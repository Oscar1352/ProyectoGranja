package Usuario.Ventanas;
import Granja.Clases.AlimentosHerviboros;
import Granja.Clases.AlimentosOmnivoro;
import Granja.Clases.Producto;
import Granja.ProductosAnimales.Carne;
import Granja.ProductosAnimales.Cuero;
import Granja.ProductosAnimales.Huevos;
import Granja.ProductosAnimales.Lana;
import Granja.TiposDeAlimento.Herviboros.Chipilin;
import Granja.TiposDeAlimento.Herviboros.Pasto;
import Granja.TiposDeAlimento.Herviboros.Vegetales;
import Granja.TiposDeAlimento.Omnivoros.Nueces;
import Granja.TiposDeAlimento.Omnivoros.Frutas;
import Granja.TiposDeAlimento.Omnivoros.Insectos;

public class Bodega  {

    public static void main(String[] args) {
        Prueba();
        AlimentoHerviboro();
        AlimentoOmnivoro();
        ProductosAnimales();
    }

    public static void Prueba(){
        Chipilin chipilin= new Chipilin("Herviboros", "Chipilin",6, 5);
        Insectos insectos= new Insectos("Herviboros", "Chipilin",6,2);

        AlimentosHerviboros alimentosHerviboros[]= new AlimentosHerviboros[3];
        alimentosHerviboros[0]= chipilin;

        AlimentosOmnivoro alimentosOmnivoros[]= new AlimentosOmnivoro[3];
        alimentosOmnivoros[0]= insectos;

    }
    public static void AlimentoHerviboro(){
        //Declaro mis tipos de comida
        Chipilin chipilin= new Chipilin("Herviboros", "Chipilin",5, 5);
        Pasto pasto= new Pasto("Herviboros", "Chipilin",5,1);
        Vegetales vegetales= new Vegetales("Herviboros","Vegetales",5,5);

        //Declaro miarreglo
        AlimentosHerviboros alimentosHerviboros[]= new AlimentosHerviboros[3];
        alimentosHerviboros[0]= chipilin;
        alimentosHerviboros[1]= pasto;
        alimentosHerviboros[2]= vegetales;

        //Mostrar mi arreglo
        System.out.println("\n\t\tComida de Herviboros");
        for (int i=0;i< alimentosHerviboros.length; i++){
            if (alimentosHerviboros[i]!=null){
                System.out.println(i+". "+alimentosHerviboros[i].getNombre()+
                        " "+ alimentosHerviboros[i].getCantidad()+" unidades");
            }
        }
    }
    public static void AlimentoOmnivoro(){
        //Declaro mis tipos de comida
        Nueces nueces= new Nueces("Omnivoros", "Aves",5, 5);
        Frutas frutas= new Frutas("Omnivoros", "Frutas",5,1);
        Insectos insectos= new Insectos("Omnivoros","Insectos",5,5);

        //Declaro mi arreglo
        AlimentosOmnivoro alimentosOmnivoros[]= new AlimentosOmnivoro[3];
        alimentosOmnivoros[0]= nueces;
        alimentosOmnivoros[1]= frutas;
        alimentosOmnivoros[2]= insectos;

        //Mostrar mi arreglo
        System.out.println("\n\t\tComida de Omnivoros");
        for (int i=0;i< alimentosOmnivoros.length; i++){
            if (alimentosOmnivoros[i]!=null){
                System.out.println(i+". "+alimentosOmnivoros[i].getNombre()+
                        " "+ alimentosOmnivoros[i].getCantidad()+" unidades");
            }
        }
    }
    public static void ProductosAnimales(){

        //Declaro mis variables
        Cuero cuero = new Cuero("Cuero",0,25);
        Carne carne = new Carne("Carne",0,30);
        Huevos huevos = new Huevos("Huevos",0, 20);
        Lana lana = new Lana("Lana",0,15);


        //Declaro mi arreglo
        Producto producto[]= new Producto[4];
        producto[0]= cuero;
        producto[1]= carne;
        producto[2]= huevos;
        producto[3]= lana;

        //Mostrar mi arreglo
        System.out.println("\n\t\tProductos Animales");
        for (int i=0;i< producto.length; i++){
            if (producto[i]!=null){
                System.out.println(i+". "+producto[i].getNombre()+
                        " "+ producto[i].getCantidad()+" unidades");
            }
        }
    }
}