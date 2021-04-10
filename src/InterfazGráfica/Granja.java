package InterfazGráfica;

import Controladores.CantidadDeCeldas;
import Controladores.ControladorAgua;
import Controladores.ControladorGrama;
import Granja.Clases.Celdas;
import Granja.Enum.*;
import Granja.TiposDeCelda.Agua;
import Granja.TiposDeCelda.CaracteristicasDeLaGranja;
import Granja.TiposDeCelda.Desierto;
import Granja.TiposDeCelda.Grama;
import Hilos.*;
import InterfazGráfica.GranjaCeldas.CrianzaGeneral;
import InterfazGráfica.GranjaCeldas.PescaGeneral;
import InterfazGráfica.GranjaCeldas.SiembraGeneral;

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

        Grama grama= new Grama("Grama","Siembra",40,25, EstadoGrama.DISPONIBLE, FertibilidadSuelo.BASICA);
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
                if(celdas[a].getTipoDeSuelo()=="Grama"){
                   JButton boton = new JButton(celdas[a].getTipoDeSuelo());
                   ImageIcon icono= new ImageIcon("C:\\Users\\Oscar Luna\\OneDrive\\Imágenes\\Granja.jpg");
                   boton.setIcon(icono);
                   v.add(boton);
                   setSize(50,50);

                }else if(celdas[a].getTipoDeSuelo()=="Agua"){
                    JButton boton = new JButton(celdas[a].getTipoDeSuelo());
                    ImageIcon icono= new ImageIcon("C:\\Users\\Oscar Luna\\OneDrive\\Imágenes\\agua.jpg");
                    boton.setIcon(icono);
                    v.add(boton);
                    setSize(50,50);
                }else if(celdas[a].getTipoDeSuelo()=="Desierto"){
                    JButton boton = new JButton(celdas[a].getTipoDeSuelo());
                    ImageIcon icono= new ImageIcon("C:\\Users\\Oscar Luna\\OneDrive\\Imágenes\\Desiertos.png");
                    boton.setIcon(icono);
                    v.add(boton);
                    setSize(50,50);
                }

            }

        }
        JButton b1= new JButton("SEMBRAR");
        JButton b2= new JButton("COSECHAR");
        JButton b3= new JButton("COMPRAR CELDAS");
        JButton b4= new JButton("PESCA");
        JButton b5= new JButton("LIMPIAR");
        JButton b6= new JButton("CRIANZA");
        v.add(b1);
        v.add(b2);
        v.add(b3);
        v.add(b4);
        v.add(b5);
        v.add(b6);
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
                    CosechaMaizHilos cosechaMaizHilos= new CosechaMaizHilos();
                    cosechaMaizHilos.start();

                }else if(Ventana3.maiz.getEstadoPlanta()== EstadoPlanta.COSECHADA){
                    JOptionPane.showMessageDialog(null, "LA CELDA YA FUE COSECHADA POR FAVOR PLANTAR O CRIAR DE NUEVO");

                } else if(Ventana3.manzano.getEstadoPlanta()== EstadoPlanta.PENDIENTEDECOSECHA){
                    CosechaManzanoHilos cosechaManzanoHilos= new CosechaManzanoHilos();
                    cosechaManzanoHilos.start();

                } else if(Ventana3.manzano.getEstadoPlanta()== EstadoPlanta.COSECHADA){
                    JOptionPane.showMessageDialog(null, "LA CELDA YA FUE COSECHADA POR FAVOR PLANTAR O CRIAR DE NUEVO");

                }else if(Ventana3.vaca.getEstado()== EstadoAnimal.LISTOPARACOSECHA){
                    CosechaVacasHilos cosechaVacasHilos= new CosechaVacasHilos();
                    cosechaVacasHilos.start();

                }else if(Ventana3.vaca.getEstado()== EstadoAnimal.COSECHADO) {
                    JOptionPane.showMessageDialog(null, "LA CELDA YA FUE COSECHADA POR FAVOR PLANTAR O CRIAR DE NUEVO");

                }else if(Ventana3.gallina.getEstado()== EstadoAnimal.LISTOPARACOSECHA){
                    CosechaGallinasHilos cosechaGallinasHilos= new CosechaGallinasHilos();
                    cosechaGallinasHilos.start();

                }else if(Ventana3.gallina.getEstado()== EstadoAnimal.COSECHADO) {
                    JOptionPane.showMessageDialog(null, "LA CELDA YA FUE COSECHADA POR FAVOR PLANTAR O CRIAR DE NUEVO");

                }else{
                    JOptionPane.showMessageDialog(null,"NO HAY NINGUNA COSECHA PENDIENTE");

                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Se ha comprado una Casilla más");
                JOptionPane.showMessageDialog(null,"Ahora Tiene la cantidad de: "+CantidadDeCeldas.getCantidadDeCeldas()+"Celdas");
                CantidadDeCeldas.setCantidadDeCeldas(CantidadDeCeldas.getCantidadDeCeldas()+1);
                CaracteristicasDeLaGranja.setCantidadDeCeldasCompradas(CaracteristicasDeLaGranja.getCantidadDeCeldasCompradas()+1);
                JOptionPane.showMessageDialog(null,"Se ha comprado una Casilla más ahora tiene: "+CantidadDeCeldas.getCantidadDeCeldas());
                new Granja();
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana11 = new JDialog();
                ventana11.setSize(300, 300);
                ventana11.setLocationRelativeTo(null);
                ventana11.setLayout(new BorderLayout());
                PescaGeneral aux = new PescaGeneral();//Creamos una nueva
                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(true);

            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LimpiezaHilos limpiezaHilos= new LimpiezaHilos();
                limpiezaHilos.start();
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana11 = new JDialog();
                ventana11.setSize(300, 300);
                ventana11.setLocationRelativeTo(null);
                ventana11.setLayout(new BorderLayout());
                CrianzaGeneral aux = new CrianzaGeneral();//Creamos una nueva
                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(true);
            }
        });

    }

    public static void main(String[] args) {
        Granja granja= new Granja();

    }
}
