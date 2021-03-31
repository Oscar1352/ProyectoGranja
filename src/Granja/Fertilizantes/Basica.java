package Granja.Fertilizantes;

import Granja.Clases.Fertilizantes;
import Granja.Enum.FertibilidadSuelo;

public class Basica extends Fertilizantes {


    public Basica(FertibilidadSuelo fertibilidadSuelo, int indiceDeMejora, int Cantidad, int Precio) {
        super(fertibilidadSuelo, indiceDeMejora, Cantidad, Precio);
    }
    @Override
    public void FERTIBILIDADBASICA() {
        super.FERTIBILIDADBASICA();
    }

    @Override
    public void FERTIBILIDADMEDIA() {
        super.FERTIBILIDADMEDIA();
    }

    @Override
    public void FERTIBILIDADALTA() {
        super.FERTIBILIDADALTA();
    }
}
