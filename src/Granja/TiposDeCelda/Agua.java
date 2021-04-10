package Granja.TiposDeCelda;

import Granja.Clases.Celdas;
import Granja.Enum.EstadoAgua;
import Granja.Interfaces.ActividadesEnLasCeldas.Pesca;

public class Agua extends Celdas implements Pesca {
    private EstadoAgua estado;
    private int CantidadDePeces=100;
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

    public int getCantidadDePeces() {
        return CantidadDePeces;
    }

    public void setCantidadDePeces(int cantidadDePeces) {
        CantidadDePeces = cantidadDePeces;
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
