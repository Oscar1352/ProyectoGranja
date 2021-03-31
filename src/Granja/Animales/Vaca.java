package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Enum.EstadoAnimal;
import Granja.Interfaces.TiposDeAnimal.Destazable;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Vaca extends Animales implements Herviboro, Destazable{


    public Vaca(String nombre, Integer Edad, String tipoDeAnimal, double tamaño, String producto, int comidaConsumida, boolean destazable, EstadoAnimal estado) {
        super(nombre, Edad, tipoDeAnimal, tamaño, producto, comidaConsumida, destazable, estado);
    }


    @Override
    public void ProduceCuero() {

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

    @Override
    public EstadoAnimal getEstado() {
        return super.getEstado();
    }

    @Override
    public void setEstado(EstadoAnimal estado) {
        super.setEstado(estado);
    }

}