package Usuario;


import Granja.Clases.AlimentosHerviboros;
import Granja.Clases.AlimentosOmnivoro;
import Granja.TiposDeAlimento.Herviboros.Chipilin;
import Granja.TiposDeAlimento.Omnivoros.Insectos;

public class Bodega  {

    public static void main(String[] args) {
        AlimentoHerviboro();
        AlimentoOmnivoro();
    }

    public void Prueba(){
        Chipilin chipilin= new Chipilin("Herviboros", "Chipilin",6);
        Insectos insectos= new Insectos("Herviboros", "Chipilin",6);

        AlimentosHerviboros alimentosHerviboros[]= new AlimentosHerviboros[3];
        alimentosHerviboros[0]= chipilin;

        AlimentosOmnivoro alimentosOmnivoros[]= new AlimentosOmnivoro[3];
        alimentosOmnivoros[0]= insectos;

    }
    public static void AlimentoHerviboro(){
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
    public static void AlimentoOmnivoro(){
        String[] Alimento;
        Alimento= new String[3];

        System.out.println("El alimento de los Omnivoros es: ");
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
