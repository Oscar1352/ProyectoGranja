package Granja.Plantas;

import Granja.Clases.Plantas;
import Granja.Interfaces.TiposDePlantas.DeGranos;

public class Maiz extends Plantas implements DeGranos {
    public Maiz(String nombre, String TipoDePlanta, Integer TiempoDeVida, Integer PrecioDeSemillas) {
        super(nombre, TipoDePlanta, TiempoDeVida, PrecioDeSemillas);
    }
    Maiz maiz = new Maiz("Maiz", "De Granos", 10, 5);

    @Override
    public void ProducenGranos() {

    }
}
