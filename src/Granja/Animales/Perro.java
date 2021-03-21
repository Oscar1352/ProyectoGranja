package Granja.Animales;

import Granja.Clases.Animales;
import Granja.Interfaces.TiposDeAnimal.Carnivoro;

public class Perro extends Animales implements Carnivoro {
    public Perro(String TipoDeAnimal, double Tamaño, String nombre, Integer edad, String Producto, boolean Destazable) {
        super(TipoDeAnimal, Tamaño, nombre, edad, Producto, Destazable);
    }

    @Override
    public void ComerCarne() {

    }
}
