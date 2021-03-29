package Granja.Clases;

public abstract class AlimentoAnimales {
    private String Tipo;
    private int Precio;
    private String Nombre;

    public AlimentoAnimales(String tipo, String nombre, int precio) {
        this.Tipo = tipo;
        this.Precio = precio;
        this. Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
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
