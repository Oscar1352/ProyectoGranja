package Granja.Clases;

public abstract class Celdas {
    private String TipoDeSuelo;
    private String ActividadQuePermite;
    private Integer PorcentajeDeDistribucion;
    private Integer Precio;

    public Celdas(String TipoDeSuelo,String ActividadQuePermite, Integer PorcentajeDeDistribucion, Integer Precio) {
        this.TipoDeSuelo = TipoDeSuelo;
        this.ActividadQuePermite = ActividadQuePermite;
        this.PorcentajeDeDistribucion=PorcentajeDeDistribucion;
        this.Precio=Precio;
    }

    Celdas celdas[][]= new Celdas[5][5];
    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer precio) {
        Precio = precio;
    }

    public String getTipoDeSuelo() {
        return TipoDeSuelo;
    }

    public void setTipoDeSuelo(String tipoDeSuelo) {
        TipoDeSuelo = tipoDeSuelo;
    }

    public String getActividadQuePermite() {
        return ActividadQuePermite;
    }

    public void setActividadQuePermite(String actividadQuePermite) {
        ActividadQuePermite = actividadQuePermite;
    }

    public Integer getPorcentajeDeDistribucion() {
        return PorcentajeDeDistribucion;
    }

    public void setPorcentajeDeDistribucion(Integer porcentajeDeDistribucion) {
        PorcentajeDeDistribucion = porcentajeDeDistribucion;
    }

    @Override
    public String toString() {
        return "Celdas{" +
                "TipoDeSuelo='" + TipoDeSuelo + '\'' +
                ", ActividadQuePermite='" + ActividadQuePermite + '\'' +
                ", PorcentajeDeDistribucion=" + PorcentajeDeDistribucion +
                ", Precio=" + Precio +
                '}';
    }
}
