package Granja.Clases;

public abstract class Producto {

    private String Tipo;
    private double Precio;

    public Producto(String Tipo, double Precio){
        this.Tipo=Tipo;
        this.Precio=Precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Tipo='" + Tipo + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
