package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Interfaces.TiposDeAnimal.Destazable;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Vaca extends Animales implements Herviboro, Destazable{


    public Vaca(String TipoDeAnimal, String nombre, double Tamaño, int ComidaConsumida, Integer edad, String Producto, boolean Destazable) {
        super(TipoDeAnimal, nombre, Tamaño, ComidaConsumida, edad, Producto, Destazable);
    }


    @Override
    public void ProduceCuero() {

    }

    @Override
    public void ProduceCarne() {

    }

    @Override
    public void ComerPasto() {

    }

    @Override
    public void ComerHuevos() {

    }

    @Override
    public void ComerVegetales() {

    }
}