package Usuario.Ventanas;

import Granja.Enum.EstadoAgua;
import Granja.Enum.EstadoUsuario;

public class DatosUsuario {

    //Declaro mis varibales para datos generales
    private static String Nombre=" Oscar";
    private static String Nickname=" Black";
    private static int PuntosDeVida=50;
    private static int AlimentoConsumido=50;
    private static EstadoUsuario estadoUsuario;
    private static int Oro=100;

    //Variables de Actividades
    private static int PecesPescados=0;

    //Declaro mis getters y setters
    public static int getPecesPescados() {
        return PecesPescados;
    }
    public static void setPecesPescados(int pecesPescados) {
        PecesPescados = pecesPescados;
    }

    public static EstadoUsuario getEstadoUsuario() {
        return estadoUsuario;
    }

    public  void setEstadoUsuario(EstadoUsuario estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public static String getNombre() {
        return Nombre;
    }
    public static void setNombre(String nombre) {
        Nombre = nombre;
    }

    public static String getNickname() {
        return Nickname;
    }
    public static void setNickname(String nickname) {
        Nickname = nickname;
    }

    public static int getOro() {
        return Oro;
    }

    public static void setOro(int oro) {
        Oro = oro;
    }

    public static int getAlimentoConsumido() {
        return AlimentoConsumido;
    }
    public static void setAlimentoConsumido(int alimentoConsumido) {
        AlimentoConsumido = alimentoConsumido;
    }

    public static int getPuntosDeVida() {
        return PuntosDeVida;
    }
    public static void setPuntosDeVida(int puntosDeVida) {
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
