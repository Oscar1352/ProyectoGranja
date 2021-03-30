package Granja.Fertilizantes;

import Granja.Clases.Fertilizantes;
import Granja.Enum.FertibilidadSuelo;

public class Media extends Fertilizantes {

    public Media(FertibilidadSuelo fertibilidadSuelo, int indiceDeMejora, int Cantidad) {
        super(fertibilidadSuelo, indiceDeMejora, Cantidad);
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
