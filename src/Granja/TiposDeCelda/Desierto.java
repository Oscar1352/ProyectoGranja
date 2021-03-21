package Granja.TiposDeCelda;

import Granja.Clases.Celdas;
import Granja.Interfaces.ActividadesEnLasCeldas.Nada;

public class Desierto extends Celdas implements Nada {
    public Desierto(String TipoDeSuelo, String ActividadQuePermite, Integer PorcentajeDeDistribucion, Integer Precio) {
        super(TipoDeSuelo, ActividadQuePermite, PorcentajeDeDistribucion, Precio);

    Desierto desierto= new Desierto("Desierto","Ninguna",25,5);
    }

    @Override
    public void Nada() {

    }
}
