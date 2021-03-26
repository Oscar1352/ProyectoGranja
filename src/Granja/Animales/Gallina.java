package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Interfaces.Productos.Huevos;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Gallina extends Animales implements Herviboro, Huevos {


    public Gallina(String TipoDeAnimal, String nombre, double Tamaño, int ComidaConsumida, Integer edad, String Producto, boolean Destazable) {
        super(TipoDeAnimal, nombre, Tamaño, ComidaConsumida, edad, Producto, Destazable);
    }


    public void ComerSemillas() {
        System.out.println("Mi amo me dio unas Semillas para comer");
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