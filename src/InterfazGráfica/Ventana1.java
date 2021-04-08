package InterfazGráfica;


import Granja.Enum.EstadoUsuario;
import InterfazGráfica.Mercado.Ventana3;
import Usuario.DatosUsuario;

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
        int a = 50;
        JLabel Nombre =         new JLabel("Nombre:" +datosUsuario.getNombre());
        JLabel Nickname =       new JLabel("Nickname:"+datosUsuario.getNickname());
        JLabel TituloJuego =    new JLabel("MyFarm");
        JLabel Oro =            new JLabel("Oro: "+datosUsuario.getOro());
        JLabel PV =             new JLabel("Puntos de Vida:"+datosUsuario.getPuntosDeVida());
        JButton Granja=         new JButton("Granja");
        JButton ALIMENTAR=      new JButton("ALIMENTAR");
        JLabel imagen =         new JLabel("");


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

        //Agregar imagen
        imagen.setIcon(new ImageIcon("C:\\Users\\Oscar Luna\\OneDrive\\Imágenes\\Granja.jpg"));
        panel.add(imagen);
        imagen.setOpaque(false);
        imagen.setVisible(false);

        // finalmente pintar todo
        JFrame frame = new JFrame();
        frame.add( panel );
        frame.pack();
        frame.setSize(450,240);
        frame.setVisible( true );

        // Creando MenuBar y agregando componentes
        gbc.gridx = 0; gbc.gridy = 0;

        //Declaro la accion del boton
        Granja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ALIMENTAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana11 = new JDialog();
                ventana11.setSize(300, 300);
                ventana11.setLocationRelativeTo(null);
                ventana11.setLayout(new BorderLayout());
                ConsumirAlimento aux = new ConsumirAlimento();//Creamos una nueva
                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(true);
            }
        });

        //Vida Usuario
        datosUsuario.VIVO();
        JOptionPane.showMessageDialog(null, "El juego ha comenzado alimentate para seguir con vida");
        do{
            int VidaPerdida= datosUsuario.getPuntosDeVida()-10;
            System.out.println("\nLa cantidad de vida del usuario es de: "+datosUsuario.getPuntosDeVida());
            System.out.println("El usuario ha perdido vida, vida actual: "+VidaPerdida);
            datosUsuario.setPuntosDeVida(VidaPerdida);
            datosUsuario.setEstadoUsuario(EstadoUsuario.HAMBRIENTO);
            JOptionPane.showMessageDialog(null, "El Usuario Está hambriento, come algo");

            Thread.sleep(100000);
            if (datosUsuario.getPuntosDeVida()==0) {
                System.out.println("El usuario morirá");
                datosUsuario.MUERTO();
                JOptionPane.showMessageDialog(null, "El Usuario ha muerto");
                datosUsuario.setEstadoUsuario(EstadoUsuario.MUERTO);
                System.exit(0);
            }else{
                datosUsuario.HAMBRIENTO();
                PV.setText("Puntos de Vida:"+datosUsuario.getPuntosDeVida());
            }
        }while(datosUsuario.getPuntosDeVida()!=0);

        //Delcaro el JMenu
        JMenuBar mb = new JMenuBar();
        //Agrego mis categorias del menu
        JMenu m1 = new JMenu("TIPOS DE JUEGO");
        JMenu m2 = new JMenu("AYUDA");
        mb.add(m1);
        mb.add(m2);
        gbl.setConstraints( mb, gbc );
        frame.getContentPane().add(BorderLayout.NORTH, mb);
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
                dispose();

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
        panel.add(mb);
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
    }
    public static void main(String[] args) throws InterruptedException {
        Ventana1 ventana1= new Ventana1();
        ventana1.Ventana1();

    }


}

