package Granja.TiposDeCelda;

import Granja.Clases.Celdas;
import Granja.Enum.EstadoGrama;
import Granja.Enum.FertibilidadSuelo;
import Granja.Interfaces.ActividadesEnLasCeldas.Cosecha;
import Granja.Interfaces.ActividadesEnLasCeldas.Crianza;
import Granja.Interfaces.ActividadesEnLasCeldas.Siembra;

public class Grama extends Celdas implements Siembra, Crianza, Cosecha {
    private FertibilidadSuelo fertibilidadSuelo;
    private EstadoGrama estadoGrama;
    public Grama(String TipoDeSuelo, String ActividadQuePermite, Integer PorcentajeDeDistribucion, Integer Precio,EstadoGrama estadoGrama, FertibilidadSuelo fertibilidadSuelo) {
        super(TipoDeSuelo, ActividadQuePermite, PorcentajeDeDistribucion, Precio);
    this.estadoGrama= estadoGrama;
    this.fertibilidadSuelo= fertibilidadSuelo;
    }

    public EstadoGrama getEstadoGrama() {
        return estadoGrama;
    }

    public void setEstadoGrama(EstadoGrama estadoGrama) {
        this.estadoGrama = estadoGrama;
    }

    @Override
    public void ComprarSemillas() {

    }

    @Override
    public void Sembrar() {

    }

    @Override
    public void CriarAnimales() {

    }

    @Override
    public void ComprarAnimales() {

    }

    @Override
    public void AlimentarAnimal() {

    }

    public FertibilidadSuelo getFertibilidadSuelo() {
        return fertibilidadSuelo;
    }

    public void setFertibilidadSuelo(FertibilidadSuelo fertibilidadSuelo) {
        this.fertibilidadSuelo = fertibilidadSuelo;
    }

    @Override
    public void LimpiarAnimalMuerto() {

    }

    @Override
    public void Cosechar() {

    }

    @Override
    public void VencimientoDePlanta() {

    }
}
