package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Enum.EstadoAnimal;
import Granja.Interfaces.Productos.Huevos;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Peces extends Animales{
    private static int Cantidad;

    public Peces(String nombre, Integer Edad, String tipoDeAnimal, double tamaño, int cantidad, int Precio, String producto, int comidaConsumida, boolean destazable, EstadoAnimal estado) {
        super(nombre, Edad, tipoDeAnimal, tamaño, cantidad, Precio, producto, comidaConsumida, destazable, estado);
    }

    @Override
    public String getTipoDeAnimal() {
        return super.getTipoDeAnimal();
    }

    @Override
    public void setTipoDeAnimal(String tipoDeAnimal) {
        super.setTipoDeAnimal(tipoDeAnimal);
    }

    @Override
    public double getTamaño() {
        return super.getTamaño();
    }

    @Override
    public void setTamaño(double tamaño) {
        super.setTamaño(tamaño);
    }

    @Override
    public String getProducto() {
        return super.getProducto();
    }

    @Override
    public void setProducto(String producto) {
        super.setProducto(producto);
    }

    @Override
    public int getComidaConsumida() {
        return super.getComidaConsumida();
    }

    @Override
    public void setComidaConsumida(int comidaConsumida) {
        super.setComidaConsumida(comidaConsumida);
    }

    @Override
    public boolean isDestazable() {
        return super.isDestazable();
    }

    @Override
    public void setDestazable(boolean destazable) {
        super.setDestazable(destazable);
    }

    @Override
    public EstadoAnimal getEstado() {
        return super.getEstado();
    }

    @Override
    public void setEstado(EstadoAnimal estado) {
        super.setEstado(estado);
    }

    @Override
    public int getCantidad() {
        return super.getCantidad();
    }

    @Override
    public void setCantidad(int cantidad) {
        super.setCantidad(cantidad);
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(int precio) {
        super.setPrecio(precio);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void LISTOPARACOSECHA() {
        super.LISTOPARACOSECHA();
    }

    @Override
    public void MUERTO() {
        super.MUERTO();
    }

    @Override
    public void VIVO() {
        super.VIVO();
    }
}