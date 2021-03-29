package Granja.Plantas;

import Granja.Clases.Plantas;
import Granja.Enum.EstadoPlanta;
import Granja.Interfaces.TiposDePlantas.DeGranos;

public class Maiz extends Plantas implements DeGranos {

    public Maiz(String nombre, Integer Edad, String tipoDePlanta, Integer precioDeSemillas, EstadoPlanta estadoPlanta) {
        super(nombre, Edad, tipoDePlanta, precioDeSemillas, estadoPlanta);
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

    @Override
    public void ProducenGranos() {

    }
}
