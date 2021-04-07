package Granja.Animales;


import Granja.Enum.EstadoAnimal;

public class AnimalesReporte {
    private static int CriasCompradas;
    private static int UnidadesDestazadas;

    public static int getCriasCompradas() {
        return CriasCompradas;
    }

    public static void setCriasCompradas(int criasCompradas) {
        CriasCompradas = criasCompradas;
    }

    public static int getUnidadesDestazadas() {
        return UnidadesDestazadas;
    }

    public static void setUnidadesDestazadas(int unidadesDestazadas) {
        UnidadesDestazadas = unidadesDestazadas;
    }
}
