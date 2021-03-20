package Granja.Plantas;

import Granja.Clases.Plantas;
import Granja.Interfaces.TiposDePlantas.DeGranos;

public class Maiz extends Plantas implements DeGranos {
    public Maiz(String nombre, String TipoDePlanta, Integer TiempoDeVida, Integer PrecioDeSemillas) {
        super(nombre, TipoDePlanta, TiempoDeVida, PrecioDeSemillas);
    }

    @Override
    public void ProducenGranos() {

    }
}
