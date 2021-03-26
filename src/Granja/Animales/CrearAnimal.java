package Granja.Animales;
import  Granja.Clases.Animales;
import java.util.Scanner;

public class CrearAnimal {

    //Declaro mis variables
    final int ANIMALES_INICIALES=10;
    Scanner scanner = new Scanner(System.in);
    public final static int FACTOR_CRECIMIENTO=1;
    //Creo mi arreglo
    Animales animalesExistentes[];


    public static void main(String[] args) {

        CrearAnimal crearAnimal= new CrearAnimal();
        crearAnimal.CrearAnimales();
    }


    //Se crea un arreglo dinamico
    public static String[] redimensionarArreglo(Animales animalesExistentes[]){
        String nuevoarreglo[]= new String[animalesExistentes.length * FACTOR_CRECIMIENTO];
        System.arraycopy(animalesExistentes,0,nuevoarreglo,0,animalesExistentes.length);
        return nuevoarreglo;
    }

    public void CrearAnimales(){


        // verificar el lugar del array
        int posicion = 0;
        while ((posicion < animalesExistentes.length) && (animalesExistentes[posicion] != null)) {
            posicion++;
        }
        if (posicion < animalesExistentes.length) {
            System.out.println("Se guardará en posición: " + posicion);
            System.out.print("Ingrese las caracteristicas del animal: ");
            String nombre = scanner.nextLine();
        } else {
            System.out.println("No se pueden crear más entrenadores\n");
        }
    }
}
