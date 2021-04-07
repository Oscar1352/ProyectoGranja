package InterfazGráfica.Mercado;

import Granja.TiposDeAlimento.Herviboros.Chipilin;
import InterfazGráfica.Ventana1;
import InterfazGráfica.Ventana2;
import InterfazGráfica.Ventana4;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NegociarMercado extends JFrame {
        //Declaro mis JDialog
        private JDialog ventana11;
        private JDialog ventana12;
        private JDialog ventana13;
        private JDialog ventana14;
        private JDialog ventana21;
        private JDialog Boton1;

        //Declaro mis ventanas
        private Ventana1 ventana1;
        private Ventana2 ventana2;
        private Ventana3 ventana3;
        private Ventana4 ventana4;
        private InterfazGráfica.Ventana5 ventana5;
        public NegociarMercado() {
            // Crear el gridbag layout y su constraints
            GridBagLayout gbl = new GridBagLayout();
            GridBagConstraints gbc = new GridBagConstraints();
            JFrame frame = new JFrame();
            // crear un panel y ponerle ese layout
            JPanel panel = new JPanel();
            panel.setLayout(gbl);
            //Declaro un margen estético a mi ventana
            Border bordejpanel = new TitledBorder(new EtchedBorder(), "NEGOCIAR EN EL MERCADO");
            panel.setBorder(bordejpanel);

            // crear las partes del formulario
            int a = 50;
            JLabel NEGOCIAR =                      new JLabel("NEGOCIAR EN EL MERCADO");
            JButton ProductoChipilin =           new JButton("Chipilin");
            JButton ProductosPasto =             new JButton("Pasto");
            JButton ProductosVegetales =         new JButton("Vegetales");
            JButton ProductosNueces =            new JButton("Nueces");
            JButton ProductosFrutas =            new JButton("Frutas");
            JButton ProductosInsectos =          new JButton("Insectos");
            JButton ProductoFertilizante1 =      new JButton("Fertilizante Básico");
            JButton ProductoFertilizante2 =      new JButton("Fertilizante Medio");
            JButton ProductoFertilizante3 =      new JButton("Fertilizante Alto");
            JButton Vacas =                       new JButton("Vacas");
            JButton Gallinas =                   new JButton("Gallinas");


            // Creando MenuBar y agregando componentes
            gbc.gridx = 0;
            gbc.gridy = 0;

            //Muestra el Manual
            gbc.gridx = 3;
            gbc.gridy = 0;
            gbl.setConstraints(NEGOCIAR, gbc);
            panel.add(NEGOCIAR);

            //Muestra el Chipilin
            gbc.gridx = 1;
            gbc.gridy = 1;
            gbl.setConstraints(ProductoChipilin, gbc);
            panel.add(ProductoChipilin);
            //Muestra el Pasto
            gbc.gridx = 2;
            gbc.gridy = 1;
            gbl.setConstraints(ProductosPasto, gbc);
            panel.add(ProductosPasto);
            //Muestra el Vegetales
            gbc.gridx = 3;
            gbc.gridy = 1;
            gbl.setConstraints(ProductosVegetales, gbc);
            panel.add(ProductosVegetales);
            //Muestra las Nueces
            gbc.gridx = 4;
            gbc.gridy = 1;
            gbl.setConstraints(ProductosNueces, gbc);
            panel.add(ProductosNueces);
            //Muestra las Frutas
            gbc.gridx = 1;
            gbc.gridy = 2;
            gbl.setConstraints(ProductosFrutas, gbc);
            panel.add(ProductosFrutas);
            //Muestra los Insectos
            gbc.gridx = 2;
            gbc.gridy = 2;
            gbl.setConstraints(ProductosInsectos, gbc);
            panel.add(ProductosInsectos);
            //Muestra los Fertilizantes 1
            gbc.gridx = 3;
            gbc.gridy = 2;
            gbl.setConstraints(ProductoFertilizante1, gbc);
            panel.add(ProductoFertilizante1);
            //Muestra los Fertilizantes 2
            gbc.gridx = 4;
            gbc.gridy = 2;
            gbl.setConstraints(ProductoFertilizante2, gbc);
            panel.add(ProductoFertilizante2);
            //Muestra los Fertilizantes 3
            gbc.gridx = 1;
            gbc.gridy = 3;
            gbl.setConstraints(ProductoFertilizante3, gbc);
            panel.add(ProductoFertilizante3);
            //Muestra las Vacas
            gbc.gridx = 2;
            gbc.gridy = 3;
            gbl.setConstraints(Vacas, gbc);
            panel.add(Vacas);
            //Muestra las Gallinas
            gbc.gridx = 3;
            gbc.gridy = 3;
            gbl.setConstraints(Gallinas, gbc);
            panel.add(Gallinas);

            //Establezco mis acciones de los botones
            ProductoChipilin.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarChipilin aux = new NegociarChipilin();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            ProductosFrutas.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarFrutas aux = new NegociarFrutas();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            ProductosVegetales.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarVegetales aux = new NegociarVegetales();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            ProductosNueces.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarNueces aux = new NegociarNueces();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            ProductosPasto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarPasto aux = new NegociarPasto();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            ProductosInsectos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarInsectos aux = new NegociarInsectos();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            ProductoFertilizante1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarFertilizante1 aux = new NegociarFertilizante1();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            ProductoFertilizante2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarFertilizante2 aux = new NegociarFertilizante2();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            ProductoFertilizante3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarFertilizante3 aux = new NegociarFertilizante3();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            Vacas.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarVacas aux = new NegociarVacas();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });
            Gallinas.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton1 = new JDialog();
                    Boton1.setSize(300, 300);
                    Boton1.setLocationRelativeTo(null);
                    Boton1.setLayout(new BorderLayout());
                    NegociarGallinas aux = new NegociarGallinas();//Creamos una nueva
                    Boton1.add(aux, BorderLayout.NORTH);
                    Boton1.setVisible(true);
                }
            });


            // finalmente pintar todo
            frame.add( panel );
            frame.pack();
            frame.setSize(800,250);
            frame.setVisible( true );


            JMenuBar mb = new JMenuBar();
            //Agrego mis categorias del menu
            JMenu m1 = new JMenu("TIPOS DE JUEGO");
            JMenu m2 = new JMenu("AYUDA");
            mb.add(m1);
            mb.add(m2);
            gbl.setConstraints( mb, gbc );
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

    }
