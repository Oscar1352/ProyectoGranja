package Granja.TiposDeCelda;

import Granja.Clases.Celdas;
import Granja.Interfaces.ActividadesEnLasCeldas.Nada;

public class Desierto extends Celdas implements Nada {
    public Desierto(String TipoDeSuelo, String ActividadQuePermite, Integer PorcentajeDeDistribucion, Integer Precio) {
        super(TipoDeSuelo, ActividadQuePermite, PorcentajeDeDistribucion, Precio);

    }

    @Override
    public void Nada() {

    }
}
