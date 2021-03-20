package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Vaca extends Animales implements Herviboro {

    public Vaca(String TipoDeAnimal, String nombre, Integer edad, String Producto, boolean Destazable) {
        super(TipoDeAnimal, nombre, edad, Producto, Destazable);
    }

    @Override
    public void ComerHierbas() {

    }
}