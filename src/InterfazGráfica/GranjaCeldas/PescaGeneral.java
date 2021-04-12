package InterfazGráfica.GranjaCeldas;

import Controladores.ControladorAgua;
import Granja.Enum.PosesionDeBarco;
import Hilos.LlenarDePecesHilos;
import Hilos.PescaHilos;
import Hilos.VidaUsuarioHilos;
import InterfazGráfica.*;
import Usuario.Ventanas.DatosUsuario;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PescaGeneral extends JFrame {
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

    public PescaGeneral(){
        // Crear el gridbag layout y su constraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        // crear un panel y ponerle ese layout
        JPanel panel = new JPanel();
        panel.setLayout(gbl);
        //Declaro un margen estético a mi ventana
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "PESCA GENERAL");
        panel.setBorder(bordejpanel);

        // crear las partes del formulario
        JLabel GENERAL =                     new JLabel("PESCA GENERAL");
        JLabel Oro =                        new JLabel("Oro: "+datosUsuario.getOro());
        JLabel CantidadActual =              new JLabel("Cantidad actuales de celdas disponibles "+ ControladorAgua.getCantidad());
        JLabel Barco =                       new JLabel("Posee un barco? "+DatosUsuario.getPosesionDeBarco());
        JLabel comprarBarco=                 new JLabel("Comprar Barco a un costo de: 50 monedas de Oro");
        JButton ComprarBarco=                new JButton("COMPRAR");
        JButton LLENAR=                     new JButton("LLENAR DE PECES DE NUEVO");
        JButton PESCAR=                     new JButton("PESCAR");


        // Creando MenuBar y agregando componentes
        gbc.gridx = 0;
        gbc.gridy = 0;

        //Muestra el Titulo
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbl.setConstraints(GENERAL, gbc);
        panel.add(GENERAL);
        //Muestra el Oro
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbl.setConstraints(Oro, gbc);
        panel.add(Oro);
        //Muestra el Cantidad
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbl.setConstraints(CantidadActual, gbc);
        panel.add(CantidadActual);
        //Muestra Cantidad
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbl.setConstraints(Barco, gbc);
        panel.add(Barco);
        //Muestra el Maiz
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbl.setConstraints(comprarBarco, gbc);
        panel.add(comprarBarco);
        //Muestra el Boton Maiz
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbl.setConstraints(ComprarBarco, gbc);
        panel.add(ComprarBarco);
        //Muestra el Boton PESCAR
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbl.setConstraints(PESCAR, gbc);
        panel.add(PESCAR);
        //Muestra el Boton LLENAR
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbl.setConstraints(LLENAR, gbc);
        panel.add(LLENAR);



        //Acciones del Boton
        ComprarBarco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(DatosUsuario.getPosesionDeBarco()== PosesionDeBarco.SI){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,"USTED ACTUALMENTE YA POSEE UN BARCO");

                }else{
                    DatosUsuario.setPosesionDeBarco(PosesionDeBarco.SI);
                    DatosUsuario.setOro(DatosUsuario.getOro()-50);
                    Oro.setText("Oro: "+DatosUsuario.getOro());
                    Barco.setText("Posee un barco? "+DatosUsuario.getPosesionDeBarco());
                    JOptionPane.showMessageDialog(null,"COMPRA REALIZADA CON EXITO, YA POSEE UN BARCO");
                }
            }
        });
        PESCAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(DatosUsuario.getPosesionDeBarco()== PosesionDeBarco.SI){
                    PescaHilos pescaHilos = new PescaHilos();
                    pescaHilos.start();
                }else{
                    JOptionPane.showMessageDialog(null,"USTED NO POSEE NINGUN BARCO");
                }

            }
        });
        LLENAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Ventana3.agua.getCantidadDePeces()==100){
                    JOptionPane.showMessageDialog(null,"EL AGUA YA ESTÁ LLENA, NO PUEDE LLENARLA");
                }else{
                    LlenarDePecesHilos llenarDePecesHilos = new LlenarDePecesHilos();
                    llenarDePecesHilos.start();
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
                Granja aux = new Granja();//Creamos una nueva

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
        PescaGeneral pescaGeneral= new PescaGeneral();
    }


}
