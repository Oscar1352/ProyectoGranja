package Granja.TiposDeCelda;

import Granja.Clases.Celdas;
import Granja.Enum.EstadoAgua;
import Granja.Enum.EstadoAnimal;
import Granja.Interfaces.ActividadesEnLasCeldas.Pesca;

public class Agua extends Celdas implements Pesca {
    private EstadoAgua estado;
    public Agua(String TipoDeSuelo, String ActividadQuePermite, Integer PorcentajeDeDistribucion, Integer Precio, EstadoAgua estado) {
        super(TipoDeSuelo, ActividadQuePermite, PorcentajeDeDistribucion, Precio);
    }

    public EstadoAgua getEstado() {
        return estado;
    }

    public void setEstado(EstadoAgua estado) {
        this.estado = estado;
    }

    public void CONPECES(){
        setEstado(EstadoAgua.CONPECES);
        System.out.println("El estado del agua es: "+getEstado());
    }
    public void SINPECES(){
        setEstado(EstadoAgua.SINPECES);
        System.out.println("El estado del agua es: "+getEstado());
    }

    @Override
    public void Pescar() {

    }

    @Override
    public void ELiminarElBarco() {

    }

    @Override
    public void AparecimientoDePeces() {

    }
}
