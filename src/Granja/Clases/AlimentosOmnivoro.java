package Granja.Clases;


public abstract class AlimentosOmnivoro extends AlimentoAnimales {

    public AlimentosOmnivoro(String tipo, String nombre, int precio) {
        super(tipo, nombre, precio);
    }
    @Override
    public String getTipo() {
        return super.getTipo();
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo);
    }

    @Override
    public int getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(int precio) {
        super.setPrecio(precio);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }
}
