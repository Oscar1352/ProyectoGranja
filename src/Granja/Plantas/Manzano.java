package Granja.Plantas;

import Granja.Clases.Plantas;
import Granja.Enum.EstadoPlanta;
import Granja.Interfaces.TiposDePlantas.DeFruta;

public class Manzano extends Plantas implements DeFruta {


    public Manzano(String nombre, Integer Edad, String tipoDePlanta, Integer precioDeSemillas, EstadoPlanta estadoPlanta) {
        super(nombre, Edad, tipoDePlanta, precioDeSemillas, estadoPlanta);
    }

    @Override
    public int getCantidadDeSemillas() {
        return super.getCantidadDeSemillas();
    }

    @Override
    public void setCantidadDeSemillas(int cantidadDeSemillas) {
        super.setCantidadDeSemillas(cantidadDeSemillas);
    }
    @Override
    public void ProducenFrutas() {

    }
    @Override
    public void JOVEN() {
        super.JOVEN();
    }

    @Override
    public void GRANDE() {
        super.GRANDE();
    }

    @Override
    public void PENDIENTEDECOSECHA() {
        super.PENDIENTEDECOSECHA();
    }

    @Override
    public void COSECHAPODRIDA() {
        super.COSECHAPODRIDA();
    }
}
