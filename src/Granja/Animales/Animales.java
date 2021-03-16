package Granja.Animales;

public class Animales {

    private String TipoDeAnimal;
    private int Edad;
    private int ComidaConsumida;
    private String Produccion;
    private String Produccion2;
    private boolean Destazable;

    public Animales(String TipoDeAnimal, int Edad, int ComidaConsumida, String Produccion, String Produccion2, boolean Destazable){
       this.TipoDeAnimal=TipoDeAnimal;
       this.Edad=Edad;
       this.ComidaConsumida=ComidaConsumida;
       this.Produccion=Produccion;
       this.Produccion2=Produccion2;
       this.Destazable=Destazable;
    }

}
