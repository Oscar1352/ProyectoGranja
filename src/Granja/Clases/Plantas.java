package Granja.Clases;

import Granja.Plantas.Maiz;
import Granja.Plantas.Manzano;

public abstract class Plantas extends SerVivo{

    private String TipoDePlanta;
    private Integer PrecioDeSemillas;

    public Plantas(String nombre,String TipoDePlanta, Integer TiempoDeVida, Integer PrecioDeSemillas) {
        super(nombre, TiempoDeVida);
        this.TipoDePlanta=TipoDePlanta;
        this.PrecioDeSemillas=PrecioDeSemillas;
    }
    Manzano manzano = new Manzano("Manzano", "De Frutos", 20, 10);

    public String getTipoDePlanta() {
        return TipoDePlanta;
    }

    public void setTipoDePlanta(String tipoDePlanta) {
        TipoDePlanta = tipoDePlanta;
    }

    public Integer getPrecioDeSemillas() {
        return PrecioDeSemillas;
    }

    public void setPrecioDeSemillas(Integer precioDeSemillas) {
        PrecioDeSemillas = precioDeSemillas;
    }

    @Override
    public String toString() {
        return "Plantas{" +
                "TipoDePlanta='" + TipoDePlanta + '\'' +
                ", PrecioDeSemillas=" + PrecioDeSemillas +
                '}';
    }
}
