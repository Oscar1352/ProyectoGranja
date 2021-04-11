package InterfazGráfica;

import Granja.Animales.AnimalesReporte;
import Granja.TiposDeCelda.CaracteristicasDeLaGranja;
import Granja.Plantas.PlantasReporte;
import Hilos.VidaUsuarioHilos;
import Usuario.Ventanas.DatosUsuario;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana4 extends JFrame {

    //Declaro mis JDialog
    private JDialog ventana11;
    private JDialog ventana12;
    private JDialog ventana13;
    private JDialog ventana14;
    private JDialog ventana21;


    //Declaro mis ventanas
    private Ventana1 ventana1;
    private Ventana2 ventana2;
    private Ventana3 ventana3;
    private Ventana4 ventana4;
    private Ventana5 ventana5;

    public Ventana4() {
        // Crear el gridbag layout y su constraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        // crear un panel y ponerle ese layout
        JPanel panel = new JPanel();
        panel.setLayout(gbl);
        //Declaro un margen estético a mi ventana
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "REPORTE");
        panel.setBorder(bordejpanel);

        // crear las partes del formulario
        JLabel RP =         new JLabel(" Resumen de Partida  ");
        JLabel Nombre =     new JLabel(" Nombre:  "+DatosUsuario.getNombre());
        JLabel DP =         new JLabel(" Duración de partida: "+CaracteristicasDeLaGranja.getDuraciónDePartida());
        JLabel AG =         new JLabel(" Alimento Generado: "+CaracteristicasDeLaGranja.getAlimento());
        JLabel OG =         new JLabel(" Oro Generado: "+DatosUsuario.getOro());
        JLabel AC =         new JLabel(" Alimento Consumido: "+ DatosUsuario.getAlimentoConsumido());
        JLabel CC =         new JLabel(" Celdas compradas: "+CaracteristicasDeLaGranja.getCantidadDeCeldasCompradas());

        JLabel Espacio1=     new JLabel("    ");
        JLabel Espacio2=     new JLabel("    ");

        JLabel RA = new JLabel(" Reporte de Animales");
        JLabel CriasC = new JLabel(" Crias Compradas: "+AnimalesReporte.getCriasCompradas());
        JLabel AD = new JLabel(" Animales Destozados: "+AnimalesReporte.getUnidadesDestazadas());

        JLabel RPlantas = new JLabel(" Reporte de Plantas ");
        JLabel SP = new JLabel(" Semillas Compradas: "+PlantasReporte.getCantidadDeSemillasCompradas());
        JLabel CC2 =         new JLabel(" Celdas compradas "+CaracteristicasDeLaGranja.getCantidadDeCeldasCompradas());


        //Muestra el Resumen de Partida
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbl.setConstraints(RP, gbc);
        panel.add(RP);
        //Muestra el Nombre
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbl.setConstraints(Nombre, gbc);
        panel.add(Nombre);
        //Muestra La duración de Partida
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbl.setConstraints(DP, gbc);
        panel.add(DP);
        //Muestra Oro Generado
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbl.setConstraints(OG, gbc);
        panel.add(OG);
        //Muestra ALimento Generado
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbl.setConstraints(AG, gbc);
        panel.add(AG);
        //Muestra Alimento Consumido
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbl.setConstraints(AC, gbc);
        panel.add(AC);
        //Muestra Celdas Compradas
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbl.setConstraints(CC, gbc);
        panel.add(CC);


        //Espacio
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbl.setConstraints(Espacio1, gbc);
        panel.add(Espacio1);


        //Muestra el Reporte de Animales
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbl.setConstraints(RA, gbc);
        panel.add(RA);
        //Muestra Crias Compradas
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbl.setConstraints(CriasC, gbc);
        panel.add(CriasC);
        //Muestra Animales Destozados
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbl.setConstraints(AD, gbc);
        panel.add(AD);


        //Espacio
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbl.setConstraints(Espacio2, gbc);
        panel.add(Espacio2);

        //Muestra el Reporte de Plantas
        gbc.gridx = 3;
        gbc.gridy = 7;
        gbl.setConstraints(RPlantas, gbc);
        panel.add(RPlantas);
        //Muestra el Semillas Compradas
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbl.setConstraints(SP, gbc);
        panel.add(SP);
        //Muestra Celdas Compradas
        gbc.gridx = 3;
        gbc.gridy = 8;
        gbl.setConstraints(CC2, gbc);
        panel.add(CC2);


        // finalmente pintar todo

        frame.add( panel );
        frame.pack();
        frame.setSize(1000,250);
        frame.setVisible( true );


//Delcaro el JMenu
        JMenuBar mb = new JMenuBar();
        //Agrego mis categorias del menu
        JMenu m1 = new JMenu("TIPOS DE JUEGO");
        JMenu m2 = new JMenu("AYUDA");
        JMenu m3 = new JMenu("ALIMENTARSE");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        // Creando MenuBar y agregando componentes
        gbc.gridx = 0; gbc.gridy = 0;
        gbl.setConstraints( mb, gbc );
        frame.add(mb);


        //Declaro mis categorias del menu prindipal, TIPOS DE JUEGO
        JMenuItem granja = new JMenuItem("GRANJA");
        JMenuItem bodega = new JMenuItem("BODEGA");
        JMenuItem mercado = new JMenuItem("MERCADO");
        JMenuItem reportes = new JMenuItem("REPORTES");
        m1.add(granja);
        m1.add(bodega);
        m1.add(mercado);
        m1.add(reportes);
        granja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana11 = new JDialog();
                ventana11.setSize(300, 300);
                ventana11.setLocationRelativeTo(null);
                ventana11.setLayout(new BorderLayout());
                Granja aux = new Granja();//Creamos una nueva                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(false);

            }
        });
        bodega.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana12 = new JDialog();
                ventana12.setSize(350, 250);
                ventana12.setLocationRelativeTo(null);
                ventana12.setLayout(new BorderLayout());
                Ventana2 aux = new Ventana2();//Creamos una nueva
                ventana12.add(aux, BorderLayout.NORTH);
                ventana12.setVisible(true);
                dispose();
            }
        });
        mercado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana13 = new JDialog();
                ventana13.setSize(300, 300);
                ventana13.setLocationRelativeTo(null);
                ventana13.setLayout(new BorderLayout());
                Ventana3 aux = new Ventana3();//Creamos una nueva
                ventana13.add(aux, BorderLayout.NORTH);
                ventana13.setVisible(true);
                ventana1.dispose();

            }
        });
        reportes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana14 = new JDialog();
                ventana14.setSize(350, 250);
                ventana14.setLocationRelativeTo(null);
                ventana14.setLayout(new BorderLayout());
                Ventana4 aux = new Ventana4();//Creamos una nueva
                ventana14.add(aux, BorderLayout.NORTH);
                ventana14.setVisible(true);
            }
        });

        //Declaro mis categorias del submenu, AYUDA
        JMenuItem manual= new JMenuItem("MANUAL DE USUARIO");
        m2.add(manual);
        manual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana21 = new JDialog();
                ventana21.setSize(350, 250);
                ventana21.setLocationRelativeTo(null);
                ventana21.setLayout(new BorderLayout());
                Ventana5 aux = new Ventana5();//Creamos una nueva
                ventana21.add(aux, BorderLayout.NORTH);
                ventana21.setVisible(true);
            }
        });
        panel.add(mb);

        JMenuItem alimentarse= new JMenuItem("ALIMENTARSE");
        m3.add(alimentarse);
        alimentarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                VidaUsuarioHilos vidaUsuarioHilo= new VidaUsuarioHilos();
                vidaUsuarioHilo.stop();
                ventana11 = new JDialog();
                ventana11.setSize(400, 400);
                ventana11.setLocationRelativeTo(null);
                ventana11.setLayout(new BorderLayout());
                ConsumirAlimento aux = new ConsumirAlimento();//Creamos una nueva
                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(true);
                vidaUsuarioHilo.start();
            }
        });
    }

    public static void main(String[] args) {
        Ventana4 ventana4= new Ventana4();
    }

}

