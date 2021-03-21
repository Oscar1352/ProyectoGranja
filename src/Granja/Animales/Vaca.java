package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Interfaces.TiposDeAnimal.Destazable;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Vaca extends Animales implements Herviboro, Granja.Interfaces.TiposDeAnimal.Destazable {


    public Vaca(String TipoDeAnimal, double Tamaño, String nombre, Integer edad, String Producto, boolean Destazable) {
        super(TipoDeAnimal, Tamaño, nombre, edad, Producto, Destazable);
    }

    Vaca vaca = new Vaca("Vaca",2, "Herviboro", 30,"Cuero y Carne",true);

    @Override
    public void ComerHierbas() {

    }

    @Override
    public void ProduceCuero() {

    }

    @Override
    public void ProduceCarne() {

    }
}