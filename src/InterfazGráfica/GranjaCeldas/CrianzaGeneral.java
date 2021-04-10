package InterfazGráfica.GranjaCeldas;


import Controladores.ControladorGrama;
import Granja.Enum.EstadoGrama;
import Hilos.VidaGallinaHilos;
import Hilos.VidaUsuarioHilos;
import Hilos.VidaVacaHilos;
import InterfazGráfica.*;
import Usuario.Ventanas.DatosUsuario;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrianzaGeneral extends JFrame {
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

    public CrianzaGeneral(){
        // Crear el gridbag layout y su constraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        // crear un panel y ponerle ese layout
        JPanel panel = new JPanel();
        panel.setLayout(gbl);
        //Declaro un margen estético a mi ventana
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "CRIANZA GENERAL");
        panel.setBorder(bordejpanel);

        // crear las partes del formulario
        int a = 50;
        JLabel Manual = new JLabel("CRIANZA GENERAL");
        JLabel texto = new JLabel(".........");

        // crear las partes del formulario
        JLabel GENERAL =                     new JLabel("CRIANZA GENERAL");
        JLabel vacas =                          new JLabel("VACAS");
        JLabel gallinas =                       new JLabel("GALLINAS");
        JLabel celdas =                    new JLabel("CANTIDAD DE CELDAS DISPONIBLES "+ControladorGrama.getCantidad());
        JLabel Producto =                    new JLabel("QUE ANIMAL DESEA CRIAR?");
        JLabel CantidadActualVacas =         new JLabel("Cantidad actuales de Vacas disponibles "+ Ventana3.vaca.getCantidad());
        JLabel CantidadActualGallinas =      new JLabel("Cantidad actuales de Gallinas disponibles "+ Ventana3.gallina.getCantidad());
        JButton VACAS=                        new JButton("VACAS");
        JButton GALLINA=                     new JButton("GALLINAS");


        // Creando MenuBar y agregando componentes
        gbc.gridx = 0;
        gbc.gridy = 0;

        //Muestra el Titulo
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbl.setConstraints(GENERAL, gbc);
        panel.add(GENERAL);
        //Muestra el Controlador
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbl.setConstraints(celdas, gbc);
        panel.add(celdas);
        //Muestra las Gallinas
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbl.setConstraints(gallinas, gbc);
        panel.add(gallinas);
        //Muestra el vacas
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbl.setConstraints(vacas, gbc);
        panel.add(vacas);
        //Muestra Producto
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbl.setConstraints(Producto, gbc);
        panel.add(Producto);
        //Muestra el Gallinas
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbl.setConstraints(CantidadActualGallinas, gbc);
        panel.add(CantidadActualGallinas);
        //Muestra el Vacas
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbl.setConstraints(CantidadActualVacas, gbc);
        panel.add(CantidadActualVacas);
        //Muestra el Boton Vacas
        gbc.gridx = 4;
        gbc.gridy = 6;
        gbl.setConstraints(VACAS, gbc);
        panel.add(VACAS);
        //Muestra el Boton Gallinas
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbl.setConstraints(GALLINA, gbc);
        panel.add(GALLINA);


        //Acciones del Boton
        VACAS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Ventana3.vaca.getCantidad()<ControladorGrama.getCantidad()){
                    JOptionPane.showMessageDialog(null,"NO POSEE LA CANTIDAD NECESARIA");

                }else{
                if(Ventana3.grama.getEstadoGrama()==EstadoGrama.OCUPADA){
                    JOptionPane.showMessageDialog(null,"YA HAY UNA ACTIVIDAD EN CURSO");

                }else{
                    Ventana3.grama.setEstadoGrama(EstadoGrama.OCUPADA);
                    ventana3.vaca.setCantidad(ventana3.vaca.getCantidad()-ControladorGrama.getCantidad());
                    JOptionPane.showMessageDialog(null,"La Crianza fue hecha con éxito, esté atento");
                    CantidadActualVacas.setText("Cantidad Disponible de Vacas :"+Ventana3.vaca.getCantidad());
                    VidaVacaHilos vidaVacaHilos= new VidaVacaHilos();
                    vidaVacaHilos.start();
                }
                }

            }
        });
        GALLINA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Ventana3.gallina.getCantidad()<ControladorGrama.getCantidad()){
                    JOptionPane.showMessageDialog(null,"NO POSEE LA CANTIDAD NECESARIA");

                }else{
                    if(Ventana3.grama.getEstadoGrama()==EstadoGrama.OCUPADA){
                        JOptionPane.showMessageDialog(null,"YA HAY UNA ACTIVIDAD EN CURSO");

                    }else{
                        Ventana3.grama.setEstadoGrama(EstadoGrama.OCUPADA);
                        ventana3.gallina.setCantidad(ventana3.gallina.getCantidad()-ControladorGrama.getCantidad());
                        JOptionPane.showMessageDialog(null,"La Crianza fue hecha con éxito, esté atento");
                        CantidadActualGallinas.setText("Cantidad Disponible de Vacas :"+Ventana3.gallina.getCantidad());
                        VidaGallinaHilos vidaGallinaHilos= new VidaGallinaHilos();
                        vidaGallinaHilos.start();
                    }
                }

            }
        });

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

            }
        });
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
                dispose();
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
                ventana1.dispose();

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
        m21.addActionListener(new ActionListener() {
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

        JMenuItem m31= new JMenuItem("ALIMENTARSE");
        m3.add(m31);
        m31.addActionListener(new ActionListener() {
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
        CrianzaGeneral crianzaGeneral= new CrianzaGeneral();
    }


}