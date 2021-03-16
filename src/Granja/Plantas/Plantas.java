package Granja.Plantas;
import javax.management.monitor.MonitorSettingException;
import java.util.Scanner;
public class Plantas {

    private String TiposDePlanta;
    private String TiempoDeVida;
    private int PrecioDeSemillas;

    public void Plantas(String TiposDePlanta,String TiempoDeVida,int PrecioDeSemillas){
     this.TiposDePlanta=TiposDePlanta;
     this.TiempoDeVida=TiempoDeVida;
     this.PrecioDeSemillas=PrecioDeSemillas ;
    }
    public void MostrarPlanta(){
        Plantas(TiposDePlanta, TiempoDeVida, PrecioDeSemillas);
        System.out.println(" ");
    }

    public void CrearPlanta(String TiposDePlanta, String TiempoDeVida, int PrecioDeSemillas){
        System.out.println("Ingrese los datos requerridos");
        System.out.println("Ingrese que tipo de planta es: ");
        Scanner Tipo = new Scanner(System.in);
        this.TiposDePlanta = Tipo.nextLine();
        System.out.println("Ingrese el tiempo de vida de la planta: ");
        Scanner Vida = new Scanner(System.in);
        this.TiempoDeVida = Vida.nextLine();
        MostrarPlanta();

    }


}
