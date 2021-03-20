package Granja.Plantas;

import Granja.Clases.Plantas;
import Granja.Interfaces.TiposDePlantas.DeFruta;

public class Manzano extends Plantas implements DeFruta {
    public Manzano(String nombre, String TipoDePlanta, Integer TiempoDeVida, Integer PrecioDeSemillas) {
        super(nombre, TipoDePlanta, TiempoDeVida, PrecioDeSemillas);
    }

    @Override
    public void ProducenFrutas() {

    }
}
