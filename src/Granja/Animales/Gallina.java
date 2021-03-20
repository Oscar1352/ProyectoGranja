package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Interfaces.Productos.Huevos;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Gallina extends Animales implements Herviboro, Huevos {

    public Gallina(String nombre,String TipoDeAnimal, Integer edad, String Producto, boolean Destazable) {
        super(TipoDeAnimal, nombre, edad, Producto, Destazable);
    }
    Gallina gallina= new Gallina("Gallina", "Herviboro", 20, "Huevos", false);

    @Override
    public void ComerHierbas() {

    }

    public void ComerSemillas() {
        System.out.println("Mi amo me dio unas Semillas para comer");
    }
}