package InterfazGráfica;

import InterfazGráfica.Mercado.Ventana3;
import Usuario.DatosUsuario;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsumirAlimento extends JFrame {
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

    public ConsumirAlimento() {
        // Crear el gridbag layout y su constraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        // crear un panel y ponerle ese layout
        JPanel panel = new JPanel();
        panel.setLayout(gbl);
        //Declaro un margen estético a mi ventana
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "CONSUMIR ALIMENTO");
        panel.setBorder(bordejpanel);

        // crear las partes del formulario
        int a = 50;
        JLabel Productos =          new JLabel("Productos");
        JLabel Alimento1 =          new JLabel("Alimento Herviboros ");
        JLabel Producto1 =          new JLabel("Chipilin: "+ventana3.chipilin.getCantidad());
        JLabel Producto3 =          new JLabel("Vegetales: "+ventana3.vegetales.getCantidad());
        JLabel Alimento2 =          new JLabel("Alimento Omnivoros: ");
        JLabel Producto11 =         new JLabel("Nueces: "+ventana3.nueces.getCantidad());
        JLabel Producto22 =         new JLabel("Frutas: "+ventana3.frutas.getCantidad());
        JLabel Cantidad =           new JLabel("Producto Animal");
        JLabel Cantidad2 =          new JLabel("Carne: "+ventana3.carne.getCantidad());
        JLabel Cantidad3 =          new JLabel("Huevos: "+ventana3.huevos.getCantidad());
        JButton ALIMENTARSE=        new JButton("ALIMENTARSE");


        // Creando MenuBar y agregando componentes
        gbc.gridx = 0;
        gbc.gridy = 0;

        //Muestra el Producto
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbl.setConstraints(Productos, gbc);
        panel.add(Productos);
        //Muestra el Herviboros
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbl.setConstraints(Alimento1, gbc);
        panel.add(Alimento1);
        //Muestra Producto 1
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbl.setConstraints(Producto1, gbc);
        panel.add(Producto1);
        //Muestra Producto 3
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbl.setConstraints(Producto3, gbc);
        panel.add(Producto3);


        //Muestra el Omnivoros
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbl.setConstraints(Alimento2, gbc);
        panel.add(Alimento2);
        //Muestra Producto 1
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbl.setConstraints(Producto11, gbc);
        panel.add(Producto11);
        //Muestra Producto 2
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbl.setConstraints(Producto22, gbc);
        panel.add(Producto22);


        //Muestra el Cantidad
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbl.setConstraints(Cantidad, gbc);
        panel.add(Cantidad);
        //Muestra el Cantidad2
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbl.setConstraints(Cantidad2, gbc);
        panel.add(Cantidad2);
        //Muestra el Cantidad3
        gbc.gridx = 4;
        gbc.gridy = 7;
        gbl.setConstraints(Cantidad3, gbc);
        panel.add(Cantidad3);
        //Muestra el ALIMENTARSE
        gbc.gridx = 3;
        gbc.gridy = 9;
        gbl.setConstraints(ALIMENTARSE, gbc);
            panel.add(ALIMENTARSE);

            //Declaro la Acción del Boton
        ALIMENTARSE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ventana3.chipilin.getCantidad()>0){
                Ventana3.chipilin.setCantidad(Ventana3.chipilin.getCantidad()-1);
                    DatosUsuario.setPuntosDeVida(50);
                    JOptionPane.showMessageDialog(null, "La vida del Granjero se ha restablecido");
                    Producto1.setText("Chipilin: "+ventana3.chipilin.getCantidad());
                }else if(ventana3.vegetales.getCantidad()>0){
                    Ventana3.vegetales.setCantidad(Ventana3.vegetales.getCantidad()-1);
                    DatosUsuario.setPuntosDeVida(50);
                    JOptionPane.showMessageDialog(null, "La vida del Granjero se ha restablecido");
                    Producto3.setText("Vegetales: "+ventana3.vegetales.getCantidad());
                }else if(ventana3.nueces.getCantidad()>0){
                    Ventana3.nueces.setCantidad(Ventana3.nueces.getCantidad()-1);
                    DatosUsuario.setPuntosDeVida(50);
                    JOptionPane.showMessageDialog(null, "La vida del Granjero se ha restablecido");
                    Producto11.setText("Nueces: "+ventana3.nueces.getCantidad());
                }else if(ventana3.frutas.getCantidad()>0){
                    Ventana3.frutas.setCantidad(Ventana3.frutas.getCantidad()-1);
                    DatosUsuario.setPuntosDeVida(50);
                    JOptionPane.showMessageDialog(null, "La vida del Granjero se ha restablecido");
                    Producto22.setText("Frutas: "+ventana3.frutas.getCantidad());
                }else if(ventana3.carne.getCantidad()>0){
                    Ventana3.carne.setCantidad(Ventana3.carne.getCantidad()-1);
                    DatosUsuario.setPuntosDeVida(50);
                    JOptionPane.showMessageDialog(null, "La vida del Granjero se ha restablecido");
                    Cantidad2.setText("Carne: "+ventana3.carne.getCantidad());
                }else if(ventana3.huevos.getCantidad()>0){
                    Ventana3.huevos.setCantidad(Ventana3.huevos.getCantidad()-1);
                    DatosUsuario.setPuntosDeVida(50);
                    JOptionPane.showMessageDialog(null, "La vida del Granjero se ha restablecido");
                    Cantidad3.setText("Huevos: "+ventana3.huevos.getCantidad());
                }else{
                    JOptionPane.showMessageDialog(null, "Comida Insuficiente");
                }
            }
        });

        // finalmente pintar todo

        frame.add(panel);
        frame.pack();
        frame.setAlwaysOnTop(true);
        frame.setSize(550, 250);
        frame.setVisible(true);


        JMenuBar mb = new JMenuBar();
        //Agrego mis categorias del menu
        JMenu m1 = new JMenu("TIPOS DE JUEGO");
        JMenu m2 = new JMenu("AYUDA");
        mb.add(m1);
        mb.add(m2);
        gbl.setConstraints(mb, gbc);
        panel.add(mb);

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
        JMenuItem m21 = new JMenuItem("MANUAL DE USUARIO");
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
}
