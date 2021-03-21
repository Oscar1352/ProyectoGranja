package Granja.TiposDeCelda;

import Granja.Clases.Celdas;
import Granja.Interfaces.ActividadesEnLasCeldas.Crianza;
import Granja.Interfaces.ActividadesEnLasCeldas.Siembra;

public class Grama extends Celdas implements Siembra, Crianza {
    public Grama(String TipoDeSuelo, String ActividadQuePermite, Integer PorcentajeDeDistribucion, Integer Precio) {
        super(TipoDeSuelo, ActividadQuePermite, PorcentajeDeDistribucion, Precio);

    Grama grama= new Grama("Grama", "Siembra y Crianza de Animales", 40,30);
    }

    @Override
    public void ComprarSemillas() {

    }

    @Override
    public void Sembrar() {

    }

    @Override
    public void Cosechar() {

    }

    @Override
    public void CriarAnimales() {

    }

    @Override
    public void ComprarAnimales() {

    }
}
