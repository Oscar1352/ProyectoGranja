package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Enum.EstadoAnimal;
import Granja.Interfaces.TiposDeAnimal.Destazable;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Vaca extends Animales implements Herviboro, Destazable{


    public Vaca(String nombre, Integer Edad, String tipoDeAnimal, double tamaño, int cantidad, int precio, int comidaConsumida, String producto, boolean destazable, EstadoAnimal estado) {
        super(nombre, Edad, tipoDeAnimal, tamaño, cantidad,precio, producto, comidaConsumida, destazable, estado);
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
    public void ComerChipilin() {

    }

    @Override
    public void ComerVegetales() {

    }
}