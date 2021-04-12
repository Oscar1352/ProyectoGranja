package InterfazGráfica;


import Hilos.VidaUsuarioHilos;
import Usuario.Ventanas.DatosUsuario;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana1 extends JFrame {

    //Declaro mis JDialog
    private JDialog ventana11;
    private JDialog ventana12;
    private JDialog ventana13;
    private JDialog ventana14;
    private JDialog ventana21;

    //Declaro mis ventanas
    private Ventana1 ventana1;
    private Ventana2 ventana2;
    private Ventana1 ventana3;
    private Ventana2 ventana4;
    private Ventana5 ventana5;



    public void Ventana1() throws HeadlessException, InterruptedException {
        //Declaro mis variables
        DatosUsuario datosUsuario= new DatosUsuario();

        // Crear el gridbag layout y su constraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        // crear un panel y ponerle ese layout
        JPanel panel = new JPanel();
        panel.setLayout(gbl);
        //Declaro un margen estético a mi ventana
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "Granja MyFarm");
        panel.setBorder(bordejpanel);

        // crear las partes del formulario
        JLabel Nombre =         new JLabel("Nombre:" +datosUsuario.getNombre());
        JLabel Nickname =       new JLabel("Nickname:"+datosUsuario.getNickname());
        JLabel TituloJuego =    new JLabel("MyFarm");
        JLabel Oro =            new JLabel("Oro: "+datosUsuario.getOro());
        JLabel PV =             new JLabel("Puntos de Vida:"+datosUsuario.getPuntosDeVida());
        JButton Granja=         new JButton("Granja");
        JButton ALIMENTAR=      new JButton("ALIMENTAR");


        // ponerlos
        // en coords ( x=0,  y=0 )
        gbc.gridx = 0;
        gbc.gridy = 1;
        // fijar esas coordenadas al componente
        //Muestra el nombre
        gbl.setConstraints(Nombre, gbc);
        // ponerlos en el panel
        panel.add(Nombre);

        //Muestra el titulo del juego
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbl.setConstraints(TituloJuego, gbc);
        panel.add(TituloJuego);

        //Muestra el Nickname
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbl.setConstraints(Nickname, gbc);
        panel.add(Nickname);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbl.setConstraints(Oro, gbc);
        panel.add(Oro);

        gbc.gridx = 3;
        gbc.gridy = 4;
        gbl.setConstraints(PV, gbc);
        panel.add(PV);

        //Declaro Boton
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbl.setConstraints(Granja, gbc);
        panel.add(Granja);
        //Declaro ALIMENTAR
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbl.setConstraints(ALIMENTAR, gbc);
        panel.add(ALIMENTAR);


        // finalmente pintar todo
        JFrame frame = new JFrame();
        frame.add( panel );
        frame.pack();
        frame.setSize(500,300);
        frame.setVisible( true );



        //Declaro la accion del boton
        Granja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana11 = new JDialog();
                ventana11.setSize(400, 400);
                ventana11.setLocationRelativeTo(null);
                ventana11.setLayout(new BorderLayout());
                Granja aux = new Granja();//Creamos una nueva
                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(false);
            }
        });
        ALIMENTAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                Granja aux = new Granja();//Creamos una nueva


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
    public static void main(String[] args) throws InterruptedException {
        Ventana1 ventana1= new Ventana1();
        ventana1.Ventana1();
        VidaUsuarioHilos vidaUsuarioHilos= new VidaUsuarioHilos();
        vidaUsuarioHilos.start();
    }


}

