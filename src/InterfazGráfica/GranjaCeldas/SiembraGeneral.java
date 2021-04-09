package InterfazGráfica.GranjaCeldas;


import Controladores.ControladorGrama;
import Granja.Enum.EstadoGrama;
import Hilos.VidaMaizHilos;
import Hilos.VidaManzanoHilos;
import InterfazGráfica.Mercado.Ventana3;
import InterfazGráfica.Ventana1;
import InterfazGráfica.Ventana2;
import InterfazGráfica.Ventana4;
import Usuario.Ventanas.DatosUsuario;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiembraGeneral extends JFrame {
    //Declaro mis clases
    DatosUsuario datosUsuario= new DatosUsuario();

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
    private InterfazGráfica.Ventana5 ventana5;

    public SiembraGeneral(){
        // Crear el gridbag layout y su constraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        // crear un panel y ponerle ese layout
        JPanel panel = new JPanel();
        panel.setLayout(gbl);
        //Declaro un margen estético a mi ventana
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "SIEMBRA GENERAL");
        panel.setBorder(bordejpanel);

        // crear las partes del formulario
        int a = 50;
        JLabel Manual = new JLabel("SIEMBRA GENERAL");
        JLabel texto = new JLabel(".........");

        // crear las partes del formulario
        JLabel GENERAL =                     new JLabel("SIEMBRA GENERAL");
        JLabel CantidadActual =              new JLabel("Cantidad actuales de celdas disponibles "+ ControladorGrama.getCantidad());
        JLabel Producto =                    new JLabel("Producto que desea Sembrar");
        JLabel CantidadMaiz=                 new JLabel("Cantidad Disponible de Maiz :"+Ventana3.maiz.getCantidadDeSemillas());
        JLabel CantidadManzano=                 new JLabel("Cantidad Disponible de Manzano :"+Ventana3.manzano.getCantidadDeSemillas());
        JButton Maiz=                        new JButton("MAIZ");
        JButton Manzano=                        new JButton("MANZANO");


        // Creando MenuBar y agregando componentes
        gbc.gridx = 0;
        gbc.gridy = 0;

        //Muestra el Titulo
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbl.setConstraints(GENERAL, gbc);
        panel.add(GENERAL);
        //Muestra el Cantidad
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbl.setConstraints(CantidadActual, gbc);
        panel.add(CantidadActual);
        //Muestra Cantidad
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbl.setConstraints(Producto, gbc);
        panel.add(Producto);
        //Muestra el Maiz
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbl.setConstraints(CantidadMaiz, gbc);
        panel.add(CantidadMaiz);
        //Muestra el Manzano
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbl.setConstraints(CantidadManzano, gbc);
        panel.add(CantidadManzano);
        //Muestra el Boton Maiz
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbl.setConstraints(Maiz, gbc);
        panel.add(Maiz);
        //Muestra el Boton Manzano
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbl.setConstraints(Manzano, gbc);
        panel.add(Manzano);


        //Acciones del Boton
        Maiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Ventana3.grama.getEstadoGrama()==EstadoGrama.OCUPADA){
                    JOptionPane.showMessageDialog(null,"YA HAY UNA PLANTACIÓN EN CURSO");

                }else{
                    if(ventana3.maiz.getCantidadDeSemillas()<ControladorGrama.getCantidad()){
                        JOptionPane.showMessageDialog(null,"No posee la cantidad de Semillas Suficientes para Su siembra");
                    }else{
                        Ventana3.grama.setEstadoGrama(EstadoGrama.OCUPADA);
                        ventana3.maiz.setSemillasSembradas(ControladorGrama.getCantidad());
                        ventana3.maiz.setCantidadDeSemillas(ventana3.maiz.getCantidadDeSemillas()-ControladorGrama.getCantidad());
                        JOptionPane.showMessageDialog(null,"La Plantación Fue hecha con éxito, esté atento");
                        CantidadActual.setText("Cantidad actuales de celdas disponibles "+ ControladorGrama.getCantidad());
                        CantidadMaiz.setText("Cantidad Disponible de Maiz :"+Ventana3.maiz.getCantidadDeSemillas());
                        VidaMaizHilos vidaMaizHilos= new VidaMaizHilos();
                        vidaMaizHilos.start();
                    }
                }

            }
        });
        Manzano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {Ventana3.manzano.setCantidadDeSemillas(100);
                if(Ventana3.grama.getEstadoGrama()==EstadoGrama.OCUPADA){
                    JOptionPane.showMessageDialog(null,"YA HAY UNA PLANTACIÓN EN CURSO");

                }else{
                    if(ventana3.manzano.getCantidadDeSemillas()<ControladorGrama.getCantidad()){
                        JOptionPane.showMessageDialog(null,"No posee la cantidad de Semillas Suficientes para Su siembra");
                    }else{
                        ventana3.manzano.setSemillasSembradas(ControladorGrama.getCantidad());
                        ventana3.manzano.setCantidadDeSemillas(ventana3.manzano.getCantidadDeSemillas()-ControladorGrama.getCantidad());
                        ControladorGrama.setCantidad(0);
                        JOptionPane.showMessageDialog(null,"La Plantación Fue hecha con éxito, esté atento");
                        CantidadActual.setText("Cantidad actuales de celdas disponibles "+ ControladorGrama.getCantidad());
                        CantidadManzano.setText("Cantidad Disponible de Manzano :"+Ventana3.manzano.getCantidadDeSemillas());
                        VidaManzanoHilos vidaManzanoHilos= new VidaManzanoHilos();
                        vidaManzanoHilos.start();
                    }

                }
            }
        });

        // finalmente pintar todo
        frame.add( panel );
        frame.pack();
        frame.setSize(800,250);
        frame.setVisible( true );


        //Delcaro el JMenu
        JMenuBar mb = new JMenuBar();
        //Agrego mis categorias del menu
        JMenu m1 = new JMenu("TIPOS DE JUEGO");
        JMenu m2 = new JMenu("AYUDA");
        mb.add(m1);
        mb.add(m2);
        // Creando MenuBar y agregando componentes
        gbc.gridx = 0; gbc.gridy = 0;
        gbl.setConstraints( mb, gbc );
        frame.add(mb);

        //Declaro mis categorias del menu prindipal, TIPOS DE JUEGO
        JMenuItem m11 = new JMenuItem("GRANJA");
        JMenuItem m12 = new JMenuItem("BODEGA");
        JMenuItem m13 = new JMenuItem("MERCADO");
        JMenuItem m14 = new JMenuItem("REPORTES");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana11 = new JDialog();
                ventana11.setSize(300, 300);
                ventana11.setLocationRelativeTo(null);
                ventana11.setLayout(new BorderLayout());
                Ventana1 aux = new Ventana1();//Creamos una nueva
                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(true);

            }        });
        m12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana12 = new JDialog();
                ventana12.setSize(350, 250);
                ventana12.setLocationRelativeTo(null);
                ventana12.setLayout(new BorderLayout());
                Ventana2 aux = new Ventana2();//Creamos una nueva
                ventana12.add(aux, BorderLayout.NORTH);
                ventana12.setVisible(true);
            }
        });
        m13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana13 = new JDialog();
                ventana13.setSize(300, 300);
                ventana13.setLocationRelativeTo(null);
                ventana13.setLayout(new BorderLayout());
                Ventana3 aux = new Ventana3();//Creamos una nueva
                ventana13.add(aux, BorderLayout.NORTH);
                ventana13.setVisible(true);

            }
        });
        m14.addActionListener(new ActionListener() {
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
        JMenuItem m21= new JMenuItem("MANUAL DE USUARIO");
        m2.add(m21);
        panel.add(mb);
        m21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana21 = new JDialog();
                ventana21.setSize(350, 250);
                ventana21.setLocationRelativeTo(null);
                ventana21.setLayout(new BorderLayout());
                InterfazGráfica.Ventana5 aux = new InterfazGráfica.Ventana5();//Creamos una nueva
                ventana21.add(aux, BorderLayout.NORTH);
                ventana21.setVisible(true);
            }
        });

    }

    public static void main(String[] args) {
        SiembraGeneral siembraGeneral= new SiembraGeneral();
    }


}