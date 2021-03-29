package Usuario;

public class DatosUsuario {

    //Declaro mis varibales para datos generales
    private String Nombre;
    private String Nickname;
    private int PuntosDeVida;
    private int AlimentoConsumido;

    //Variables de Actividades
    private int PecesPescados=0;

    //Declaro mis getters y setters

    public int getPecesPescados() {
        return PecesPescados;
    }

    public void setPecesPescados(int pecesPescados) {
        PecesPescados = pecesPescados;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNickname() {
        return Nickname;
    }
    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public int getAlimentoConsumido() {
        return AlimentoConsumido;
    }

    public void setAlimentoConsumido(int alimentoConsumido) {
        AlimentoConsumido = alimentoConsumido;
    }

    public int getPuntosDeVida() {
        return PuntosDeVida;
    }
    public void setPuntosDeVida(int puntosDeVida) {
        PuntosDeVida = puntosDeVida;
    }
}
