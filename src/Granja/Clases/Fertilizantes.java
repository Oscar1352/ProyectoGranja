package Granja.Clases;

import Granja.Enum.EstadoAnimal;
import Granja.Enum.FertibilidadSuelo;

public abstract class Fertilizantes {
    private FertibilidadSuelo fertibilidadSuelo;
    private int IndiceDeMejora;
    private int Cantidad;
    private int Precio;

    public Fertilizantes(FertibilidadSuelo fertibilidadSuelo, int indiceDeMejora, int Cantidad, int Precio) {
        this.fertibilidadSuelo = fertibilidadSuelo;
        this.Cantidad=Cantidad;
        this.Precio= Precio;
        IndiceDeMejora = indiceDeMejora;
    }

    public FertibilidadSuelo getFertibilidadSuelo() {
        return fertibilidadSuelo;
    }

    public void setFertibilidadSuelo(FertibilidadSuelo fertibilidadSuelo) {
        this.fertibilidadSuelo = fertibilidadSuelo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public int getIndiceDeMejora() {
        return IndiceDeMejora;
    }

    public void setIndiceDeMejora(int indiceDeMejora) {
        IndiceDeMejora = indiceDeMejora;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public void FERTIBILIDADBASICA(){
        setFertibilidadSuelo(FertibilidadSuelo.BASICA);
        System.out.println("El estado de fertibilidad del suelo es: "+getFertibilidadSuelo());
    }
    public void FERTIBILIDADMEDIA(){
        setFertibilidadSuelo(FertibilidadSuelo.MEDIA);
        System.out.println("El estado de fertibilidad del suelo es: "+getFertibilidadSuelo());
    }
    public void FERTIBILIDADALTA(){
        setFertibilidadSuelo(FertibilidadSuelo.ALTA);
        System.out.println("El estado de fertibilidad del suelo es: "+getFertibilidadSuelo());
    }

}
