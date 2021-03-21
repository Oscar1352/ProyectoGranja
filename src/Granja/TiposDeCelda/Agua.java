package Granja.TiposDeCelda;

import Granja.Clases.Celdas;
import Granja.Interfaces.ActividadesEnLasCeldas.Pesca;

public class Agua extends Celdas implements Pesca {
    public Agua(String TipoDeSuelo, String ActividadQuePermite, Integer PorcentajeDeDistribucion, Integer Precio) {
        super(TipoDeSuelo, ActividadQuePermite, PorcentajeDeDistribucion, Precio);
    Agua agua= new Agua("Agua", "Pesca", 35, 20);
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
