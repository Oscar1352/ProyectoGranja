package Usuario;

import Granja.Animales.AnimalesReporte;
import Granja.CaracteristicasDeLaGranja;
import Granja.Plantas.PlantasReporte;

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
        AnimalesReporte animalesReporte= new AnimalesReporte();
        System.out.println("La cantidad de crías compradas es de: "+animalesReporte.getCriasCompradas());
        System.out.println("La cantidad de animales destazados es de: "+animalesReporte.getUnidadesDestazadas());
    }

    public static void ReporteDePlantas() {
        PlantasReporte plantas= new PlantasReporte();
        System.out.println("La cantidad de semillas compradas es de: "+plantas.getCantidadDeSemillasCompradas());
        System.out.println("La cantidad de celdas compradas es de: "+plantas.getCantidadDeCeldasSembradas());

    }
}
