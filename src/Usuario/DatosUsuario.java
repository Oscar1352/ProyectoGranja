package Usuario;

public class DatosUsuario {

    //Declaro mis varibales para datos generales
    private String Nombre;
    private String Nickname;
    private int Oro;
    private int PuntosDeVida;

    //Declaro mis getters y setters
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

    public int getOro() {
        return Oro;
    }
    public void setOro(int oro) {
        Oro = oro;
    }

    public int getPuntosDeVida() {
        return PuntosDeVida;
    }
    public void setPuntosDeVida(int puntosDeVida) {
        PuntosDeVida = puntosDeVida;
    }
}
