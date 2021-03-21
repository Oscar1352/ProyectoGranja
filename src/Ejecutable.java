import Granja.Animales.Gallina;
import Granja.Animales.Perro;
import Granja.Animales.Vaca;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Ejecutable {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Herviboro",2,"Vaca" , 30,"Cuero y Carne",true);
        Gallina gallina= new Gallina("Herviboro",0.5,"Gallina" , 20, "Huevos", false);
        Perro perro = new Perro("Carnivoro", 1, "Perro", 2,"carne", false);

        Herviboro herviboro[]= new Herviboro[2];
        herviboro[0]= vaca;
        herviboro[1]= gallina;
        System.out.println(mostrarAnimalesherviboro(herviboro));
    }
    public static boolean mostrarAnimalesherviboro(Herviboro[] herviboro){

        for (int i = 0; i < herviboro.length; i++) {
            Herviboro animal = herviboro[i];
            System.out.println(i+" El animal es "+herviboro[i]);;

        }
        return false;
    }
}
