package Usuario;


import Granja.Interfaces.TiposDeAnimal.Herviboro;
import Granja.TiposDeAlimento.Herviboros.Huevos;
import Granja.TiposDeAlimento.Herviboros.Pasto;

public class Bodega  {
    public static void main(String[] args) {
        AlimentoHerviboros();
        AlimentoOmnivoros();
    }
    public static void AlimentoHerviboros(){
        String[] Alimento;
        Alimento= new String[3];

        Alimento[0]= "Pasto";
        Alimento[1]= "Huevos";
        Alimento[2]= "Vegetales";
        for (int i=0;i< Alimento.length; i++){
            if (Alimento[i]!=null){
                System.out.println(i+" "+Alimento[i]);
            }
        }


    }
    public static void AlimentoOmnivoros(){
        String[] Alimento;
        Alimento= new String[3];

        Alimento[0]= "Aves";
        Alimento[1]= "Frutas";
        Alimento[2]= "Insectos";
        for (int i=0;i< Alimento.length; i++){
            if (Alimento[i]!=null){
                System.out.println(i+" "+Alimento[i]);
            }
        }

    }

}
