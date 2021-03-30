package Granja.Clases;

public class Producto {

    private String Nombre;
    private int Precio;
    private int Cantidad;

    public Producto(String Nombre,int Cantidad, int Precio){
        this.Nombre=Nombre;
        this.Cantidad=Cantidad;
        this.Precio=Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
