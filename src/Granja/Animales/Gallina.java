package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Interfaces.Productos.Huevos;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Gallina extends Animales implements Herviboro, Huevos {

    public Gallina(String TipoDeAnimal, double Tamaño, String nombre, Integer edad, String Producto, boolean Destazable) {
        super(TipoDeAnimal, Tamaño, nombre, edad, Producto, Destazable);
    }

    Gallina gallina= new Gallina("Gallina",0.5, "Herviboro", 20, "Huevos", false);

    @Override
    public void ComerHierbas() {

    }


    public void ComerSemillas() {
        System.out.println("Mi amo me dio unas Semillas para comer");
    }
}