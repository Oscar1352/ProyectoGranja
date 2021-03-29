package Granja.Clases;

import Granja.Enum.EstadoAnimal;

public abstract class Animales extends SerVivo{

    private String TipoDeAnimal;
    private double Tamaño;
    private String Producto;
    private int ComidaConsumida;
    private boolean Destazable;
    private EstadoAnimal estado;

    public Animales(String nombre, Integer Edad, String tipoDeAnimal, double tamaño, String producto, int comidaConsumida, boolean destazable, EstadoAnimal estado) {
        super(nombre, Edad);
        this.TipoDeAnimal = tipoDeAnimal;
        this.Tamaño = tamaño;
        this.Producto = producto;
        this.ComidaConsumida = comidaConsumida;
        this.Destazable = destazable;
        this.estado = estado;
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

    public int getComidaConsumida() {
        return ComidaConsumida;
    }

    public void setComidaConsumida(int comidaConsumida) {
        ComidaConsumida = comidaConsumida;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
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
    public void LISTOPARACOSECHA(){
        setEstado(EstadoAnimal.LISTOPARACOSECHA);
        System.out.println("El estado de "+this.getNombre()+ " es: "+getEstado());
    }
    public void MUERTO(){
        setEstado(EstadoAnimal.MUERTO);
        System.out.println("El estado de "+this.getNombre()+ " es: "+getEstado());
    }
    public void VIVO(){
        setEstado(EstadoAnimal.VIVO);
        System.out.println("El estado de "+this.getNombre()+ " es: "+getEstado());
    }

}
