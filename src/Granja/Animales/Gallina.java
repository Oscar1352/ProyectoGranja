package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Enum.EstadoAnimal;
import Granja.Interfaces.Productos.Huevos;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Gallina extends Animales implements Herviboro, Huevos {


    public Gallina(String nombre, Integer Edad, String tipoDeAnimal, double tamaño, int cantidad, int precio, int comidaConsumida, String producto, boolean destazable, EstadoAnimal estado) {
        super(nombre, Edad, tipoDeAnimal, tamaño, cantidad,precio, producto, comidaConsumida, destazable, estado);
    }

    public void ComerSemillas() {
        System.out.println("Mi amo me dio unas Semillas para comer");
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