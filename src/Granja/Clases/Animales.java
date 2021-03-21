package Granja.Clases;

public abstract class Animales extends SerVivo{

    private String TipoDeAnimal;
    private double Tamaño;
    private String Producto;
    private boolean Destazable;

    public Animales(String TipoDeAnimal, double Tamaño, String nombre,Integer edad,String Producto,boolean Destazable) {
        super(nombre, edad);
        this.TipoDeAnimal = TipoDeAnimal;
        this.Tamaño=Tamaño;
        this.Producto = Producto;
        this.Destazable = Destazable;
    }

    public String getTipoDeAnimal() {
        return TipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        TipoDeAnimal = tipoDeAnimal;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String producto) {
        Producto = producto;
    }

    public boolean isDestazable() {
        return Destazable;
    }

    public void setDestazable(boolean destazable) {
        Destazable = destazable;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(double tamaño) {
        Tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "TipoDeAnimal='" + TipoDeAnimal + '\'' +
                ", Tamaño='" + Tamaño + '\'' +
                ", Producto='" + Producto + '\'' +
                ", Destazable=" + Destazable +
                '}';
    }

}
