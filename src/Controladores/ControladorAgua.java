package Controladores;

public class ControladorAgua{
    private static int Cantidad=0;

    public static int getCantidad() {
        return Cantidad;
    }

    public static void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
