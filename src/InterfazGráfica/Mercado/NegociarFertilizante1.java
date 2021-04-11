package InterfazGráfica.Mercado;

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

public class NegociarFertilizante1 extends JFrame{
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

    public NegociarFertilizante1() {
        // Crear el gridbag layout y su constraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        // crear un panel y ponerle ese layout
        JPanel panel = new JPanel();
        panel.setLayout(gbl);
        //Declaro un margen estético a mi ventana
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "COMPRAR Fertilizante Bajo");
        panel.setBorder(bordejpanel);

        // crear las partes del formulario
        int a = 50;
        JLabel Fertilizante1 =                     new JLabel("COMPRAR EN EL MERCADO");
        JLabel CantidadActual =              new JLabel("Unidades actuales: "+ventana3.basica.getCantidad());
        JLabel Cantidad =                    new JLabel("Unidades deseadas a un costo de: "+ventana3.basica.getPrecio()+" c/u");
        JLabel Oro =                         new JLabel("Oro:  "+datosUsuario.getOro());
        JTextField introducir=               new JTextField(new Integer(3));
        JButton comprar =                    new JButton("COMPRAR");
        JButton vender =                    new JButton("VENDER");


        // Creando MenuBar y agregando componentes
        gbc.gridx = 0;
        gbc.gridy = 0;

        //Muestra el Titulo
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbl.setConstraints(Fertilizante1, gbc);
        panel.add(Fertilizante1);
        //Muestra el Cantidad
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbl.setConstraints(CantidadActual, gbc);
        panel.add(CantidadActual);
        //Muestra el Oro
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbl.setConstraints(Oro, gbc);
        panel.add(Oro);
        //Muestra Cantidad
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbl.setConstraints(Cantidad, gbc);
        panel.add(Cantidad);


        //Muestra el Textflied
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbl.setConstraints(introducir, gbc);
        introducir.setBounds(new Rectangle(25, 15, 250, 21));
        introducir.setEditable(true);
        introducir.setHorizontalAlignment(JTextField.LEFT);
        panel.add(introducir);
        //Muestra el Boton
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbl.setConstraints(comprar, gbc);
        panel.add(comprar);
        //Muestra el Vender
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbl.setConstraints(vender, gbc);
        panel.add(vender);

        //Acciones del Boton
        comprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x= Integer.parseInt(introducir.getText());
                int Total= x*ventana3.basica.getPrecio();
                if(datosUsuario.getOro()>=Total){
                    JOptionPane.showMessageDialog(null, "COMPRA REALIZADA CON EXITO, GASTO "+Total+" DE ORO");
                    datosUsuario.setOro(datosUsuario.getOro()-Total);
                    Ventana3.basica.setCantidad(ventana3.basica.getCantidad()+x);
                    CantidadActual.setText("Unidades actuales: "+ventana3.basica.getCantidad());
                    Oro.setText("Oro:"+datosUsuario.getOro());
                    introducir.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Cantidad de Oro insuficiente");
                    introducir.setText("");
                }
            }
        });
        vender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x= Integer.parseInt(introducir.getText());
                int Total= x*ventana3.basica.getPrecio();
                if(x>ventana3.basica.getCantidad()){
                    JOptionPane.showMessageDialog(null, "Cantidad de Producto insuficiente");
                    introducir.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "VENTA REALIZADA CON EXITO, GANO "+Total+" DE ORO");
                    datosUsuario.setOro(datosUsuario.getOro()+Total);
                    Ventana3.alta.setCantidad(ventana3.basica.getCantidad()-x);
                    CantidadActual.setText("Unidades actuales: "+ventana3.basica.getCantidad());
                    Oro.setText("Oro:"+datosUsuario.getOro());
                    introducir.setText("");

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
                Granja aux = new Granja();//Creamos una nueva                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(false);

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
                ventana11.setSize(500, 400);
                ventana11.setLocationRelativeTo(null);
                ventana11.setLayout(new BorderLayout());
                ConsumirAlimento aux = new ConsumirAlimento();//Creamos una nueva
                ventana11.add(aux, BorderLayout.NORTH);
                ventana11.setVisible(true);
                vidaUsuarioHilo.start();
            }
        });
    }
}
