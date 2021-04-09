package Granja.Plantas;

import Granja.Clases.Plantas;
import Granja.Enum.EstadoPlanta;
import Granja.Interfaces.TiposDePlantas.DeGranos;

public class Maiz extends Plantas implements DeGranos {

    public Maiz(String nombre, Integer Edad, String tipoDePlanta, Integer precioDeSemillas, EstadoPlanta estadoPlanta) {
        super(nombre, Edad, tipoDePlanta, precioDeSemillas, estadoPlanta);
    }

    @Override
    public int getSemillasSembradas() {
        return super.getSemillasSembradas();
    }

    @Override
    public int setSemillasSembradas(int semillasSembradas) {
        super.setSemillasSembradas(semillasSembradas);
        return semillasSembradas;
    }

    @Override
    public void setTipoDePlanta(String tipoDePlanta) {
        super.setTipoDePlanta(tipoDePlanta);
    }

    @Override
    public Integer getPrecioDeSemillas() {
        return super.getPrecioDeSemillas();
    }

    @Override
    public void setPrecioDeSemillas(Integer precioDeSemillas) {
        super.setPrecioDeSemillas(precioDeSemillas);
    }

    @Override
    public EstadoPlanta getEstadoPlanta() {
        return super.getEstadoPlanta();
    }

    @Override
    public void setEstadoPlanta(EstadoPlanta estadoPlanta) {
        super.setEstadoPlanta(estadoPlanta);
    }

    @Override
    public String toString() {
        return super.toString();
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
    public String getTipoDePlanta() {
        return super.getTipoDePlanta();
    }

    @Override
    public Integer getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(Integer edad) {
        super.setEdad(edad);
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
    public void MUERTA() {
        super.MUERTA();
    }

    @Override
    public void ProducenGranos() {

    }
}
