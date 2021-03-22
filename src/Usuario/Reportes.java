package Usuario;

import Granja.Animales.Animales;
import Granja.CaracteristicasDeLaGranja;
import Granja.Plantas.Plantas;

public class Reportes {

    //Declaro mis variables

    public static void main(String[] args) {
        ResumenDePartida();
        ReporteDeAnimales();
        ReporteDePlantas();
    }

    public static void ResumenDePartida(){
        DatosUsuario datosUsuario= new DatosUsuario();
        CaracteristicasDeLaGranja caracteristicasDeLaGranja= new CaracteristicasDeLaGranja();
        System.out.println("El nombre del granjero es: "+datosUsuario.getNombre());
        System.out.println("La duración de partida es: "+caracteristicasDeLaGranja.getDuraciónDePartida());
        System.out.println("La cantidad de Oro Generado es: "+caracteristicasDeLaGranja.getOro());
        System.out.println("La cantidad de alimento generado es: "+caracteristicasDeLaGranja.getAlimento());
        System.out.println("El alimento consumido por el granjeto es de: "+datosUsuario.getAlimentoConsumido());
        System.out.println("La cantidad de Celdas compradas es de: "+caracteristicasDeLaGranja.getCantidadDeCeldasCompradas());

    }

    public static void ReporteDeAnimales(){
        Animales animales= new Animales();
        System.out.println("La cantidad de crías compradas es de: "+animales.getCriasCompradas());
        System.out.println("La cantidad de animales destazados es de: "+animales.getUnidadesDestazadas());
    }

    public static void ReporteDePlantas() {
        Plantas plantas= new Plantas();
        System.out.println("La cantidad de semillas compradas es de: "+plantas.getCantidadDeSemillasCompradas());
        System.out.println("La cantidad de celdas compradas es de: "+plantas.getCantidadDeCeldasSembradas());

    }
}
