import Granja.Clases.Celdas;
import Granja.Enum.EstadoAgua;
import Granja.Enum.FertibilidadSuelo;
import Granja.TiposDeCelda.Agua;
import Granja.TiposDeCelda.Desierto;
import Granja.TiposDeCelda.Grama;

public class PruebaCeldasAleatorias {
    public static void main(String[] args) {
        Prueba();
    }
    public static void Prueba(){

        Celdas celdas[][]= new Celdas[5][5];

        Grama grama= new Grama("Grama","Siembra",40,25, FertibilidadSuelo.BASICA);
        Agua agua= new Agua("Agua","Pezca",25,25, EstadoAgua.CONPECES);
        Desierto desierto= new Desierto("Desierto","Nada",15,5);

        celdas[0][0]=grama;
        celdas[1][0]=agua;
        celdas[2][0]=desierto;
        celdas[0][0]=grama;
        celdas[0][1]=agua;
        celdas[0][2]=desierto;


        for (int i=0; i< celdas.length;i++){
            if (celdas[i]!=null){
                System.out.println("Primera Linea: "+celdas[i]);
                for(int x=0;x< celdas.length;x++){
                    if (celdas[i][x]!=null){
                        System.out.println("Segunda Fila: "+celdas[i][x].getTipoDeSuelo());
                    }
                }
            }
        }
    }
}
