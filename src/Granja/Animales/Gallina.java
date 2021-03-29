package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Enum.EstadoAnimal;
import Granja.Interfaces.Productos.Huevos;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Gallina extends Animales implements Herviboro, Huevos {


    public Gallina(String nombre, Integer Edad, String tipoDeAnimal, double tamaño, String producto, int comidaConsumida, boolean destazable, EstadoAnimal estado) {
        super(nombre, Edad, tipoDeAnimal, tamaño, producto, comidaConsumida, destazable, estado);
    }

    public void ComerSemillas() {
        System.out.println("Mi amo me dio unas Semillas para comer");
    }

    @Override
    public void ComerPasto() {

    }

    @Override
    public void LISTOPARACOSECHA() {
        super.LISTOPARACOSECHA();
    }

    @Override
    public void MUERTO() {
        super.MUERTO();
    }

    @Override
    public void VIVO() {
        super.VIVO();
    }

    @Override
    public void ComerChipilin() {

    }

    @Override
    public void ComerVegetales() {

    }
}