package Granja.TiposDeAlimento.Herviboros;

import Granja.Clases.AlimentosHerviboros;
import Granja.Interfaces.TiposDeAnimal.Herviboro;

public class Pasto extends AlimentosHerviboros {

    public Pasto(String tipo, String nombre, int Cantidad, int precio) {
        super(tipo, nombre, Cantidad, precio);
    }
}
