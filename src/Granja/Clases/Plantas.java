package Granja.Clases;

import Granja.Enum.EstadoPlanta;

public abstract class Plantas extends SerVivo{

    private String TipoDePlanta;
    private Integer PrecioDeSemillas;
    private int CantidadDeSemillas=5;
    private EstadoPlanta estadoPlanta;
    private int SemillasSembradas=0;

    public Plantas(String nombre, Integer Edad, String tipoDePlanta, Integer precioDeSemillas, EstadoPlanta estadoPlanta) {
        super(nombre, Edad);
        TipoDePlanta = tipoDePlanta;
        PrecioDeSemillas = precioDeSemillas;
        this.estadoPlanta = estadoPlanta;
    }

    public int getSemillasSembradas() {
        return SemillasSembradas;
    }

    public int setSemillasSembradas(int semillasSembradas) {
        SemillasSembradas = semillasSembradas;
        return semillasSembradas;
    }

    public int getCantidadDeSemillas() {
        return CantidadDeSemillas;
    }

    public void setCantidadDeSemillas(int cantidadDeSemillas) {
        CantidadDeSemillas = cantidadDeSemillas;
    }

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

    public EstadoPlanta getEstadoPlanta() {
        return estadoPlanta;
    }

    public void setEstadoPlanta(EstadoPlanta estadoPlanta) {
        this.estadoPlanta = estadoPlanta;
    }

    @Override
    public String toString() {
        return "Plantas{" +
                "TipoDePlanta='" + TipoDePlanta + '\'' +
                ", PrecioDeSemillas=" + PrecioDeSemillas +
                '}';
    }
    public void JOVEN(){
        setEstadoPlanta(estadoPlanta.JOVEN);
        System.out.println("El estado de "+this.getNombre()+ " es: "+getEstadoPlanta());
    }
    public void GRANDE(){
        setEstadoPlanta(estadoPlanta.GRANDE);
        System.out.println("El estado de "+this.getNombre()+ " es: "+getEstadoPlanta());
    }
    public void PENDIENTEDECOSECHA(){
        setEstadoPlanta(estadoPlanta.PENDIENTEDECOSECHA);
        System.out.println("El estado de "+this.getNombre()+ " es: "+getEstadoPlanta());
    }
    public void COSECHAPODRIDA(){
        setEstadoPlanta(estadoPlanta.COSECHAPODRIDA);
        System.out.println("El estado de "+this.getNombre()+ " es: "+getEstadoPlanta());
    }
    public void MUERTA(){
        setEstadoPlanta(estadoPlanta.MUERTA);
        System.out.println("El estado de "+this.getNombre()+ " es: "+getEstadoPlanta());
    }
}
