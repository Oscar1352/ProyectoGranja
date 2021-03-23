import Granja.Animales.Gallina;
import Granja.Animales.Perro;
import Granja.Animales.Vaca;
import Granja.Clases.Celdas;
import Granja.Interfaces.TiposDeAnimal.Herviboro;
import Granja.TiposDeCelda.Grama;

public class Ejecutable {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Herviboro",2,"Vaca" , 30,"Cuero y Carne",true);
        Gallina gallina= new Gallina("Herviboro",0.5,"Gallina" , 20, "Huevos", false);
        Perro perro = new Perro("Carnivoro", 1, "Perro", 2,"carne", false);

        Grama grama= new Grama("grama", "Siembra", 25,2); {
        }
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
                System.out.println (celdas[x][y]);
            }
        }
        Herviboro herviboro[]= new Herviboro[2];
        herviboro[0]= vaca;
        herviboro[1]= gallina;
        mostrarAnimalesherviboro(herviboro);
    }
    public static void mostrarAnimalesherviboro(Herviboro herviboro[]){

        for (int i = 0; i < herviboro.length; i++) {
            Herviboro animal = herviboro[i];
            System.out.println(i+" El animal es "+herviboro[i]);;
        }
    }
}
