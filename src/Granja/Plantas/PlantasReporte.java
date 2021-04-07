package Granja.Plantas;

public class PlantasReporte {
    private static int CantidadDeSemillasCompradas;
    private static int CantidadDeCeldasSembradas;

    public static int getCantidadDeSemillasCompradas() {
        return CantidadDeSemillasCompradas;
    }

    public static void setCantidadDeSemillasCompradas(int cantidadDeSemillasCompradas) {
        CantidadDeSemillasCompradas = cantidadDeSemillasCompradas;
    }

    public static int getCantidadDeCeldasSembradas() {
        return CantidadDeCeldasSembradas;
    }

    public static void setCantidadDeCeldasSembradas(int cantidadDeCeldasSembradas) {
        CantidadDeCeldasSembradas = cantidadDeCeldasSembradas;
    }
}
