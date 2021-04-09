package InterfazGráfica;

import Controladores.CantidadDeCeldas;
import Controladores.ControladorAgua;
import Controladores.ControladorGrama;
import Granja.Clases.Celdas;
import Granja.Enum.EstadoAgua;
import Granja.Enum.EstadoPlanta;
import Granja.Enum.FertibilidadSuelo;
import Granja.TiposDeCelda.Agua;
import Granja.TiposDeCelda.Desierto;
import Granja.TiposDeCelda.Grama;
import InterfazGráfica.GranjaCeldas.SiembraGeneral;
import InterfazGráfica.Mercado.Ventana3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Granja extends JPanel{
    //Declaro mis JDialog
    private JDialog ventana11;

    //Declaro Los datos de mi granja
    private static final int COLUMNAS = 5;
    private static final int FILAS = 7;


    //Controlador int
    int ContadorGrama=0;
    int ContadorAgua=0;


    public Granja() {


        Celdas celdas[]= new Celdas[CantidadDeCeldas.getCantidadDeCeldas()];

        Grama grama= new Grama("Grama","Siembra",40,25, FertibilidadSuelo.BASICA);
        Agua agua= new Agua("Agua","Pezca",35,25, EstadoAgua.CONPECES);
        Desierto desierto= new Desierto("Desierto","Nada",25,5);

        JFrame v = new JFrame("GRANJA");

        for(int b=0;b<CantidadDeCeldas.getCantidadDeCeldas();b++){
            celdas[b]=grama;
            celdas[b]=agua;
            celdas[b]=desierto;
            //Probabilidades
            double random1 = Math.random();// generamos un numero al azar entre 0 y 1
            double random2 = Math.random();// generamos un numero al azar entre 0 y 1
            double random3 = Math.random();// generamos un numero al azar entre 0 y 1
            if (random1 < 0.4){// el 40% de las veces
                celdas[b]=grama;
                ContadorGrama++;
                ControladorGrama.setCantidad(ContadorGrama);
            }else if (random2 < 0.35){// el 35% de las veces
                celdas[b]=agua;
                ContadorAgua++;
                ControladorAgua.setCantidad(ContadorAgua);
            }else if (random3 < 0.25){// el 25% de las veces
                celdas[b]=desierto;
            }
            if(b<=CantidadDeCeldas.getCantidadDeCeldas()){
            }

        }
        v.getContentPane().setLayout(new GridLayout(FILAS,COLUMNAS));
        JButton[] Botones = new JButton [CantidadDeCeldas.getCantidadDeCeldas()];
        for (int i=0;i<FILAS;i++){
            for (int j=0;j<COLUMNAS;j++)
            {}
        }
        for(int a= 0; a<CantidadDeCeldas.getCantidadDeCeldas();a++){
            if(celdas[a]==null){
            }else{
                Botones[a] = new JButton(""+celdas[a].getTipoDeSuelo());
                v.getContentPane().add(Botones[a]);
            }

        }
        JButton b1= new JButton("SEMBRAR");
        JButton b2= new JButton("COSECHAR");
        JButton b3= new JButton("COMPRAR CELDAS");
        JButton b4= new JButton("PESCA");
        JButton b5= new JButton("LIMPIAR");
        v.add(b1);
        v.add(b2);
        v.add(b3);
        v.add(b4);
        v.add(b5);
        v.pack();
        v.setVisible(true);
        v.setSize(800,600);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Declaro las Acciones de los botones
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"La cantidad de celdas para la siembra son: "+ ControladorGrama.getCantidad());
                ventana11 = new JDialog();
                ventana11.setSize(300, 300);
                ventana11.setLocationRelativeTo(null);
                ventana11.setLayout(new BorderLayout());
                SiembraGeneral aux = new SiembraGeneral();//Creamos una nueva
                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(true);

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Ventana3.maiz.getEstadoPlanta()== EstadoPlanta.PENDIENTEDECOSECHA){
                    try {
                        CosechaMaiz();
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }else if(Ventana3.manzano.getEstadoPlanta()== EstadoPlanta.PENDIENTEDECOSECHA){

                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Comprar Celdas");
                CantidadDeCeldas.setCantidadDeCeldas(CantidadDeCeldas.getCantidadDeCeldas()+1);
                JOptionPane.showMessageDialog(null,"Se ha comprado una Casilla más ahora tiene: "+CantidadDeCeldas.getCantidadDeCeldas());
                new Granja();
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"La cantidad de celdas para la pezca son: "+ ControladorAgua.getCantidad());

            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    public static void main(String[] args) {
        Granja granja= new Granja();
    }
    public static void CosechaMaiz() throws InterruptedException {
        //Empieza la plantacion en una de las celdas
        System.out.println("Se empezará la cosecha: ");

        System.out.println("Usted ha sembrado "+Ventana3.maiz.getNombre());
        Ventana3.maiz.setCantidadDeSemillas(Ventana3.maiz.getSemillasSembradas());
        System.out.println("Y producirá la cantidad de..."+Ventana3.maiz.getTipoDePlanta());
        System.out.println("Se harán los cálculos...");
        Thread.sleep(1000);
        if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.BASICA){
            int Cantidad= Ventana3.maiz.getEdad() * Ventana3.basica.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"Cosechó la cantidad de En cantidad de: "+Cantidad+" "+Ventana3.maiz.getTipoDePlanta());
        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.MEDIA){
            int Cantidad= Ventana3.maiz.getEdad() * Ventana3.media.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"Cosechó la cantidad de En cantidad de: "+Cantidad+" "+Ventana3.maiz.getTipoDePlanta());
        }else if(Ventana3.grama.getFertibilidadSuelo()==FertibilidadSuelo.ALTA){
            int Cantidad= Ventana3.maiz.getEdad() * Ventana3.alta.getIndiceDeMejora()*10;
            JOptionPane.showMessageDialog(null,"Cosechó la cantidad de En cantidad de: "+Cantidad+" "+Ventana3.maiz.getTipoDePlanta());
        }
    }
}
