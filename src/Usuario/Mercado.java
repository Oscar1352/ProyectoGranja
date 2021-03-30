package Usuario;

import Granja.Clases.AlimentosHerviboros;
import Granja.Clases.AlimentosOmnivoro;
import Granja.Clases.Fertilizantes;
import Granja.Clases.Producto;
import Granja.Enum.FertibilidadSuelo;
import Granja.Fertilizantes.Alta;
import Granja.Fertilizantes.Basica;
import Granja.Fertilizantes.Media;
import Granja.ProductosAnimales.Carne;
import Granja.ProductosAnimales.Cuero;
import Granja.ProductosAnimales.Huevos;
import Granja.ProductosAnimales.Lana;
import Granja.TiposDeAlimento.Herviboros.Chipilin;
import Granja.TiposDeAlimento.Herviboros.Pasto;
import Granja.TiposDeAlimento.Herviboros.Vegetales;
import Granja.TiposDeAlimento.Omnivoros.Aves;
import Granja.TiposDeAlimento.Omnivoros.Frutas;
import Granja.TiposDeAlimento.Omnivoros.Insectos;

import java.util.Scanner;

public class Mercado {

    public static void main(String[] args) {
        Fertilizante();
        AlimentoHerviboro();
        AlimentoOmnivoro();
        ProductosAnimales();
    }

    public static void AlimentoHerviboro(){

        //Declaro Variables
        int Comida;
        DatosUsuario datosUsuario= new DatosUsuario();

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
        System.out.println("\n\t\tActualmente posee:");
        System.out.println("\t\tComida de Herviboros");
        for (int i=0;i< alimentosHerviboros.length; i++){
            if (alimentosHerviboros[i]!=null){
                System.out.println(i+". "+alimentosHerviboros[i].getNombre()+
                        " "+ alimentosHerviboros[i].getCantidad()+" unidades");
            }
        }
        System.out.println("Comprar más comida?");
        System.out.println("1. SI");
        System.out.println("2.NO");
        System.out.println("INGRESE SU ELECCIÓN: ");
        Scanner comida = new Scanner(System.in);
        Comida = comida.nextInt();
        switch (Comida){
            case 1:
                System.out.println("Qué producto desea comprar: ");
                for (int i=0;i< alimentosHerviboros.length; i++){
                    if (alimentosHerviboros[i]!=null){
                        System.out.println(i+". "+alimentosHerviboros[i].getNombre()+
                                " "+ alimentosHerviboros[i].getCantidad()+" unidades");
                    }
                }
                System.out.println("INGRESE SU ELECCIÓN: ");
                Scanner Compra = new Scanner(System.in);
                int compra = Compra.nextInt();
                switch (compra){
                    case 0:
                        System.out.println("Actualmente tiene "+chipilin.getCantidad()+" unidades de Chipilin");
                        System.out.println("Cuantas desea comprar, a un costo de: "+chipilin.getPrecio());
                        Scanner chipilinCompra = new Scanner(System.in);
                        int comprachipilin = chipilinCompra.nextInt();
                        int x= chipilin.getPrecio();
                        int Total=comprachipilin*x;
                        datosUsuario.setOro(datosUsuario.getOro()-Total);
                        System.out.println("Usted ha comprado "+comprachipilin+" unidades "+
                                " y ha gastado "+Total+" de oro");
                        chipilin.setCantidad(chipilin.getCantidad()+comprachipilin);
                        break;
                    case 1:
                        System.out.println("Actualmente tiene "+pasto.getCantidad()+" unidades de pasto");
                        System.out.println("Cuantas desea comprar, a un costo de: "+pasto.getPrecio());
                        Scanner pastoCompra = new Scanner(System.in);
                        int comprapasto = pastoCompra.nextInt();
                        int x1= pasto.getPrecio();
                        int Total1=comprapasto*x1;
                        datosUsuario.setOro(datosUsuario.getOro()-Total1);
                        System.out.println("Usted ha comprado "+comprapasto+" unidades "+
                                " y ha gastado "+Total1+" de oro");
                        pasto.setCantidad(pasto.getCantidad()+comprapasto);

                        break;
                    case 2:
                        System.out.println("Actualmente tiene "+vegetales.getCantidad()+" unidades de vegetales");
                        System.out.println("Cuantas desea comprar, a un costo de: "+vegetales.getPrecio());
                        Scanner vegetalesCompra = new Scanner(System.in);
                        int compravegetales = vegetalesCompra.nextInt();
                        int x2= vegetales.getPrecio();
                        int Total2=compravegetales*x2;
                        datosUsuario.setOro(datosUsuario.getOro()-Total2);
                        System.out.println("Usted ha comprado "+compravegetales+" unidades "+
                                " y ha gastado "+Total2+" de oro");
                        vegetales.setCantidad(vegetales.getCantidad()+compravegetales);
                        break;
                }
                for (int i=0;i< alimentosHerviboros.length; i++){
                    if (alimentosHerviboros[i]!=null){
                        System.out.println(i+". "+alimentosHerviboros[i].getNombre()+
                                " "+ alimentosHerviboros[i].getCantidad()+" unidades");
                    }
                }
                break;
            case 2:
                System.out.println("Adiós");
                break;
        }
    }
    public static void AlimentoOmnivoro(){
        //Declaro mis variables
        DatosUsuario datosUsuario= new DatosUsuario();

        //Declaro mis tipos de comida
        Aves aves= new Aves("Omnivoros", "Aves",5, 5);
        Frutas frutas= new Frutas("Omnivoros", "Frutas",5,1);
        Insectos insectos= new Insectos("Omnivoros","Insectos",5,5);

        //Declaro mi arreglo
        AlimentosOmnivoro alimentosOmnivoros[]= new AlimentosOmnivoro[3];
        alimentosOmnivoros[0]= aves;
        alimentosOmnivoros[1]= frutas;
        alimentosOmnivoros[2]= insectos;

        //Mostrar mi arreglo
        System.out.println("\n\t\tActualmente posee:");
        System.out.println("\t\tComida de Omnivoros");
        for (int i=0;i< alimentosOmnivoros.length; i++){
            if (alimentosOmnivoros[i]!=null){
                System.out.println(i+". "+alimentosOmnivoros[i].getNombre()+
                        " "+ alimentosOmnivoros[i].getCantidad()+" unidades");
            }
        }
        System.out.println("Comprar más comida?");
        System.out.println("1. SI");
        System.out.println("2.NO");
        System.out.println("INGRESE SU ELECCIÓN: ");
        Scanner comida = new Scanner(System.in);
        int Comida = comida.nextInt();
        switch (Comida){
            case 1:
                System.out.println("Qué producto desea comprar: ");
                for (int i=0;i< alimentosOmnivoros.length; i++){
                    if (alimentosOmnivoros[i]!=null){
                        System.out.println(i+". "+alimentosOmnivoros[i].getNombre()+
                                " "+ alimentosOmnivoros[i].getCantidad()+" unidades");
                    }
                }
                System.out.println("INGRESE SU ELECCIÓN: ");
                Scanner Compra = new Scanner(System.in);
                int compra = Compra.nextInt();
                switch (compra){
                    case 0:
                        System.out.println("Actualmente tiene "+aves.getCantidad()+" unidades de aves");
                        System.out.println("Cuantas desea comprar, a un costo de: "+aves.getPrecio());
                        Scanner avesCompra = new Scanner(System.in);
                        int compraaves = avesCompra.nextInt();
                        int x= aves.getPrecio();
                        int Total=compraaves*x;
                        datosUsuario.setOro(datosUsuario.getOro()-Total);
                        System.out.println("Usted ha comprado "+compraaves+" unidades "+
                                " y ha gastado "+Total+" de oro");
                        aves.setCantidad(aves.getCantidad()+compraaves);
                        break;
                    case 1:
                        System.out.println("Actualmente tiene "+frutas.getCantidad()+" unidades de frutas");
                        System.out.println("Cuantas desea comprar, a un costo de: "+frutas.getPrecio());
                        Scanner pastoCompra = new Scanner(System.in);
                        int comprafrutas = pastoCompra.nextInt();
                        int x1= frutas.getPrecio();
                        int Total1=comprafrutas*x1;
                        datosUsuario.setOro(datosUsuario.getOro()-Total1);
                        System.out.println("Usted ha comprado "+comprafrutas+" unidades "+
                                " y ha gastado "+Total1+" de oro");
                        frutas.setCantidad(frutas.getCantidad()+comprafrutas);

                        break;
                    case 2:
                        System.out.println("Actualmente tiene "+insectos.getCantidad()+" unidades de insectos");
                        System.out.println("Cuantas desea comprar, a un costo de: "+insectos.getPrecio());
                        Scanner insectosCompra = new Scanner(System.in);
                        int comprainsectos = insectosCompra.nextInt();
                        int x2= insectos.getPrecio();
                        int Total2=comprainsectos*x2;
                        datosUsuario.setOro(datosUsuario.getOro()-Total2);
                        System.out.println("Usted ha comprado "+comprainsectos+" unidades "+
                                " y ha gastado "+Total2+" de oro");
                        insectos.setCantidad(insectos.getCantidad()+comprainsectos);
                        break;
                }
                for (int i=0;i< alimentosOmnivoros.length; i++){
                    if (alimentosOmnivoros[i]!=null){
                        System.out.println(i+". "+alimentosOmnivoros[i].getNombre()+
                                " "+ alimentosOmnivoros[i].getCantidad()+" unidades");
                    }
                }
                break;
            case 2:
                System.out.println("Adiós");
                break;
        }
    }
    public static void ProductosAnimales(){

        //Declaro mis variables
        Cuero cuero = new Cuero("Cuero",0,25);
        Carne carne = new Carne("Carne",0,30);
        Huevos huevos = new Huevos("Huevos",0, 20);
        Lana lana = new Lana("Lana",0,15);
        DatosUsuario datosUsuario= new DatosUsuario();


        //Declaro mi arreglo
        Producto producto[]= new Producto[4];
        producto[0]= cuero;
        producto[1]= carne;
        producto[2]= huevos;
        producto[3]= lana;

        //Mostrar mi arreglo
        System.out.println("\n\t\tActualmente posee:");
        System.out.println("\t\tComida de Omnivoros");
        for (int i=0;i< producto.length; i++){
            if (producto[i]!=null){
                System.out.println(i+". "+producto[i].getNombre()+
                        " "+ producto[i].getCantidad()+" unidades");
            }
        }
        System.out.println("Comprar más comida?");
        System.out.println("1. SI");
        System.out.println("2.NO");
        System.out.println("INGRESE SU ELECCIÓN: ");
        Scanner comida = new Scanner(System.in);
        int Comida = comida.nextInt();
        switch (Comida){
            case 1:
                System.out.println("Qué producto desea comprar: ");
                for (int i=0;i< producto.length; i++){
                    if (producto[i]!=null){
                        System.out.println(i+". "+producto[i].getNombre()+
                                " "+ producto[i].getCantidad()+" unidades");
                    }
                }
                System.out.println("INGRESE SU ELECCIÓN: ");
                Scanner Compra = new Scanner(System.in);
                int compra = Compra.nextInt();
                switch (compra){
                    case 0:
                        System.out.println("Actualmente tiene "+cuero.getCantidad()+" unidades de aves");
                        System.out.println("Cuantas desea comprar, a un costo de: "+cuero.getPrecio());
                        Scanner cueroCompra = new Scanner(System.in);
                        int compracuero = cueroCompra.nextInt();
                        double Total=compracuero*cuero.getPrecio();
                        datosUsuario.setOro((int) (datosUsuario.getOro()-Total));
                        System.out.println("Usted ha comprado "+compracuero+" unidades "+
                                " y ha gastado "+Total+" de oro");
                        cuero.setCantidad(cuero.getCantidad()+compracuero);
                        break;
                    case 1:
                        System.out.println("Actualmente tiene "+carne.getCantidad()+" unidades de carne");
                        System.out.println("Cuantas desea comprar, a un costo de: "+carne.getPrecio());
                        Scanner carneCompra = new Scanner(System.in);
                        int compracarne = carneCompra.nextInt();
                        double x1= carne.getPrecio();
                        double Total1=compracarne*x1;
                        datosUsuario.setOro((int) (datosUsuario.getOro()-Total1));
                        System.out.println("Usted ha comprado "+compracarne+" unidades "+
                                " y ha gastado "+Total1+" de oro");
                        carne.setCantidad(carne.getCantidad()+compracarne);

                        break;
                    case 2:
                        System.out.println("Actualmente tiene "+huevos.getCantidad()+" unidades de huevos");
                        System.out.println("Cuantas desea comprar, a un costo de: "+huevos.getPrecio());
                        Scanner huevosCompra = new Scanner(System.in);
                        int comprahuevos = huevosCompra.nextInt();
                        double x2= huevos.getPrecio();
                        double Total2=comprahuevos*x2;
                        datosUsuario.setOro((int) (datosUsuario.getOro()-Total2));
                        System.out.println("Usted ha comprado "+comprahuevos+" unidades "+
                                " y ha gastado "+Total2+" de oro");
                        huevos.setCantidad(huevos.getCantidad()+comprahuevos);
                        break;
                    case 3:
                        System.out.println("Actualmente tiene "+lana.getCantidad()+" unidades de lana");
                        System.out.println("Cuantas desea comprar, a un costo de: "+lana.getPrecio());
                        Scanner lanaCompra = new Scanner(System.in);
                        int compralana = lanaCompra.nextInt();
                        double x3= lana.getPrecio();
                        double Total3=compralana*x3;
                        datosUsuario.setOro((int) (datosUsuario.getOro()-Total3));
                        System.out.println("Usted ha comprado "+compralana+" unidades "+
                                " y ha gastado "+Total3+" de oro");
                        lana.setCantidad(lana.getCantidad()+compralana);
                        break;
                }
                for (int i=0;i< producto.length; i++){
                    if (producto[i]!=null){
                        System.out.println(i+". "+producto[i].getNombre()+
                                " "+ producto[i].getCantidad()+" unidades");
                    }
                }
                break;
            case 2:
                System.out.println("Adiós");
                break;
        }
    }
    public static void Fertilizante(){
        //Declaro mis variables
        Basica basica= new Basica(FertibilidadSuelo.BASICA,1,0);
        Media media= new Media(FertibilidadSuelo.MEDIA,2,0);
        Alta alta= new Alta(FertibilidadSuelo.ALTA,3,0);

        //Muestro mi arreglo
        System.out.println("\t\tLos Fertilizantes son: ");
        Fertilizantes Fertilizante[]=new Fertilizantes[3];
        Fertilizante[0]=basica;
        Fertilizante[1]=media;
        Fertilizante[2]=alta;
        for (int i=0;i<Fertilizante.length;i++){
            if(Fertilizante[i]!=null){
                System.out.println(i+".  "+Fertilizante[i].getFertibilidadSuelo()+" y tiene una cantidad de: "+
                        Fertilizante[i].getCantidad());
            }
        }
    }
}
