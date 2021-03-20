package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Interfaces.TiposDeAnimal.Destazable;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Vaca extends Animales implements Herviboro, Granja.Interfaces.TiposDeAnimal.Destazable {

    public Vaca(String nombre,String TipoDeAnimal , Integer edad, String Producto, boolean Destazable) {
        super(TipoDeAnimal, nombre, edad, Producto, Destazable);
    }
    Vaca vaca = new Vaca("Vaca", "Herviboro", 30,"Cuero y Carne",true);

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