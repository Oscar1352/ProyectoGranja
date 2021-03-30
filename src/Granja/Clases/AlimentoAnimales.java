package Granja.Clases;

import Granja.TiposDeAlimento.Herviboros.Chipilin;

public abstract class AlimentoAnimales {
    private String Tipo;
    private int Precio;
    private String Nombre;
    private int Cantidad;

    public AlimentoAnimales(String tipo, String nombre,int Cantidad, int precio) {
        this.Tipo = tipo;
        this.Precio = precio;
        this. Nombre = nombre;
        this.Cantidad= Cantidad;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
