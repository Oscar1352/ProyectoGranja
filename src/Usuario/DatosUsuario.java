package Usuario;

import Granja.Enum.EstadoAgua;
import Granja.Enum.EstadoUsuario;

public class DatosUsuario {

    //Declaro mis varibales para datos generales
    private String Nombre;
    private String Nickname;
    private int PuntosDeVida=50;
    private int AlimentoConsumido;
    private EstadoUsuario estadoUsuario;

    //Variables de Actividades
    private int PecesPescados=0;

    //Declaro mis getters y setters
    public int getPecesPescados() {
        return PecesPescados;
    }
    public void setPecesPescados(int pecesPescados) {
        PecesPescados = pecesPescados;
    }

    public EstadoUsuario getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(EstadoUsuario estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
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

    public void VIVO(){
        setEstadoUsuario(EstadoUsuario.VIVO);
        System.out.println("El estado del usuario es: "+getEstadoUsuario());
    }
    public void HAMBRIENTO(){
        setEstadoUsuario(EstadoUsuario.HAMBRIENTO);
        System.out.println("El estado del usuario es: "+getEstadoUsuario());
    }
    public void MUERTO(){
        setEstadoUsuario(EstadoUsuario.MUERTO);
        System.out.println("El estado del usuario es: "+getEstadoUsuario());
    }


    public static void PruebaVida(){}
}
