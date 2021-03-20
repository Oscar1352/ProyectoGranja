package Granja.Animales;

import Granja.Clases.Animal;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Gallina extends Animal implements Herviboro {

    public Gallina(String TipoDeAnimal, String nombre, Integer edad, String Producto, boolean Destazable) {
        super(TipoDeAnimal, nombre, edad, Producto, Destazable);
    }

    @Override
    public void ComerHierbas() {

    }
}