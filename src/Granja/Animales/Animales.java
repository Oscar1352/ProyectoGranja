package Granja.Animales;

import java.time.LocalTime;

public class Animales {
    private int CriasCompradas;
    private int UnidadesDestazadas;

    public int getCriasCompradas() {
        return CriasCompradas;
    }

    public static void main(String[] args) {
        System.out.println("La hora de este momento es: "+ LocalTime.now());
    }

    public void setCriasCompradas(int criasCompradas) {
        CriasCompradas = criasCompradas;
    }

    public int getUnidadesDestazadas() {
        return UnidadesDestazadas;
    }

    public void setUnidadesDestazadas(int unidadesDestazadas) {
        UnidadesDestazadas = unidadesDestazadas;
    }
}
