package InterfazGráfica;
import Granja.Animales.Gallina;
import Granja.Animales.Peces;
import Granja.Animales.Vaca;
import Granja.Enum.*;
import Granja.Fertilizantes.Alta;
import Granja.Fertilizantes.Basica;
import Granja.Fertilizantes.Media;
import Granja.Plantas.Maiz;
import Granja.Plantas.Manzano;
import Granja.ProductosAnimales.Carne;
import Granja.ProductosAnimales.Cuero;
import Granja.ProductosAnimales.Huevos;
import Granja.ProductosAnimales.Lana;
import Granja.TiposDeAlimento.Herviboros.Chipilin;
import Granja.TiposDeAlimento.Herviboros.Pasto;
import Granja.TiposDeAlimento.Herviboros.Vegetales;
import Granja.TiposDeAlimento.Omnivoros.Frutas;
import Granja.TiposDeAlimento.Omnivoros.Insectos;
import Granja.TiposDeAlimento.Omnivoros.Nueces;
import Granja.TiposDeCelda.Agua;
import Granja.TiposDeCelda.Grama;
import Hilos.VidaUsuarioHilos;
import InterfazGráfica.Mercado.NegociarMercado;
import Usuario.Ventanas.DatosUsuario;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana3 extends JFrame {
    //Declaro mis JDialog
    private JDialog ventana11;
    private JDialog ventana12;
    private JDialog ventana13;
    private JDialog ventana14;
    private JDialog ventana21;
    private JDialog comprar;
    private JDialog vender;

    //Declaro mis ventanas
    private Ventana1 ventana1;
    private Ventana2 ventana2;
    private Ventana3 ventana3;
    private Ventana4 ventana4;
    private Ventana5 ventana5;
    private NegociarMercado negociarMercado;

    //CeldaGrama
    public static Grama grama=                  new Grama("Grama","Siembra",40,25, EstadoGrama.DISPONIBLE,FertibilidadSuelo.BASICA);
    public static Agua agua=                    new Agua("Agua","Pesca",35,25, EstadoAgua.CONPECES);

    //PlantasHerviboros
    public static Chipilin chipilin=          new Chipilin("Herviboro","Chipilin",5,5);
    public static Pasto pasto=                new Pasto("Herviboro","Pasto",5,2);
    public static Vegetales vegetales=        new Vegetales("Herviboro","Vegetales",5,5);

    //PlantasOmnivoros
    public static Nueces nueces=              new Nueces("Omnivoro","Nueces",5,3);
    public static Frutas frutas=              new Frutas("Omnivoro","Frutas",5,5);
    public static Insectos insectos=          new Insectos("Omnivoro","Insectos",5,3);

    //ProductosAnimales
    public static Carne carne =               new Carne("Carne",5,15);
    public static Cuero cuero =               new Cuero("Cuero",5,15);
    public static Huevos huevos =             new Huevos("Huevos",5,15);
    public static Lana lana =                 new Lana("Lana",5,15);

    //Animales
    public static Gallina gallina =           new Gallina("Galiina",10,"Omnivoro",0.5,3,25,50,"Carne",false,EstadoAnimal.VIVO);
    public static Vaca vaca =                 new Vaca("Vaca",10,"Hervibvoro",2,2,50,50,"Carne y Leche",true, EstadoAnimal.VIVO);
    public static Peces peces =               new Peces("Peces",10,"herviboro",0.5,0,25,"Carne",50,false,EstadoAnimal.VIVO);

    //Fertilizantes
    public static Basica basica = new Basica(FertibilidadSuelo.BASICA,1,2, 15);
    public static Media media = new Media(FertibilidadSuelo.MEDIA,2,2, 30);
    public static Alta alta = new Alta(FertibilidadSuelo.ALTA,3,2, 45);

    //Plantación
    public static Maiz maiz= new Maiz("Maiz",2,"Granos",5, EstadoPlanta.JOVEN);
    public static Manzano manzano= new Manzano("Manzano",2,"Frutos",15, EstadoPlanta.JOVEN);


    public Ventana3() {
        // Crear el gridbag layout y su constraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        // crear un panel y ponerle ese layout
        JPanel panel = new JPanel();
        panel.setLayout(gbl);
        //Declaro un margen estético a mi ventana
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "MERCADO");
        panel.setBorder(bordejpanel);

        // crear las partes del formulario
        JLabel Oro =            new JLabel("Oro: "+ DatosUsuario.getOro());
        JLabel Productos =          new JLabel("Productos");
        JLabel Alimento1 =          new JLabel("Alimento Herviboros ");
        JLabel Producto1 =          new JLabel("Chipilin: "+chipilin.getCantidad());
        JLabel Producto2 =          new JLabel("Pasto: "+pasto.getCantidad());
        JLabel Producto3 =          new JLabel("Vegetales: "+vegetales.getCantidad());
        JLabel Alimento2 =          new JLabel("Alimento Omnivoros");
        JLabel Producto11 =         new JLabel("Nueces: "+nueces.getCantidad());
        JLabel Producto22 =         new JLabel("Frutas: "+frutas.getCantidad());
        JLabel Producto33 =         new JLabel("Insectos: "+insectos.getCantidad());
        JLabel Cantidad =           new JLabel("Producto Animal");
        JLabel Cantidad1 =          new JLabel("Cuero: "+cuero.getCantidad());
        JLabel Cantidad2 =          new JLabel("Carne: "+carne.getCantidad());
        JLabel Cantidad3 =          new JLabel("Huevos: "+huevos.getCantidad());
        JLabel Cantidad4 =          new JLabel("Lana: "+lana.getCantidad());
        JLabel Fertilizante =       new JLabel("Fertilizantes");
        JLabel Fertilizante1 =      new JLabel("Básico: "+basica.getCantidad());
        JLabel Fertilizante2 =      new JLabel("Medio: "+media.getCantidad());
        JLabel Fertilizante3 =      new JLabel("Alto: "+alta.getCantidad());
        JLabel Animales =           new JLabel("Animales");
        JLabel Vaca =               new JLabel("Vaca: "+vaca.getCantidad());
        JLabel Galiina =            new JLabel("Gallina: "+gallina.getCantidad());
        JLabel Plantas =            new JLabel("Plantas");
        JLabel planta1 =            new JLabel("Maiz: "+ventana3.maiz.getCantidadDeSemillas());
        JLabel planta2 =            new JLabel("Manzano: "+ventana3.manzano.getCantidadDeSemillas());
        JButton Negociar =          new JButton("Negociar");

        //Muestra el Producto
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbl.setConstraints(Productos, gbc);
        panel.add(Productos);
        //Muestra el Oro
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbl.setConstraints(Oro, gbc);
        panel.add(Oro);
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
        //Muestra Producto 2
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbl.setConstraints(Producto2, gbc);
        panel.add(Producto2);
        //Muestra Producto 3
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbl.setConstraints(Producto3, gbc);
        panel.add(Producto3);

        //Muestra Boton Compra
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbl.setConstraints(Negociar, gbc);
        panel.add(Negociar);
        //Muestra el Omnivoros
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbl.setConstraints(Alimento2, gbc);
        panel.add(Alimento2);
        //Muestra Producto 11
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbl.setConstraints(Producto11, gbc);
        panel.add(Producto11);
        //Muestra Producto 22
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbl.setConstraints(Producto22, gbc);
        panel.add(Producto22);
        //Muestra Producto 33
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbl.setConstraints(Producto33, gbc);
        panel.add(Producto33);

        //Muestra el Cantidad
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbl.setConstraints(Cantidad, gbc);
        panel.add(Cantidad);
        //Muestra el Cantidad1
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbl.setConstraints(Cantidad1, gbc);
        panel.add(Cantidad1);
        //Muestra el Cantidad2
        gbc.gridx = 3;
        gbc.gridy = 7;
        gbl.setConstraints(Cantidad2, gbc);
        panel.add(Cantidad2);
        //Muestra el Cantidad3
        gbc.gridx = 4;
        gbc.gridy = 7;
        gbl.setConstraints(Cantidad3, gbc);
        panel.add(Cantidad3);
        //Muestra el Cantidad4
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbl.setConstraints(Cantidad4, gbc);
        panel.add(Cantidad4);

        //Muestra el Fertilizante
        gbc.gridx = 3;
        gbc.gridy = 8;
        gbl.setConstraints(Fertilizante, gbc);
        panel.add(Fertilizante);
        //Muestra el Fertilizante1
        gbc.gridx = 2;
        gbc.gridy = 9;
        gbl.setConstraints(Fertilizante1, gbc);
        panel.add(Fertilizante1);
        //Muestra el Fertilizante2
        gbc.gridx = 3;
        gbc.gridy = 9;
        gbl.setConstraints(Fertilizante2, gbc);
        panel.add(Fertilizante2);
        //Muestra el Fertilizante3
        gbc.gridx = 4;
        gbc.gridy = 9;
        gbl.setConstraints(Fertilizante3, gbc);
        panel.add(Fertilizante3);

        //Muestra los animales
        gbc.gridx = 3;
        gbc.gridy = 10;
        gbl.setConstraints(Animales, gbc);
        panel.add(Animales);
        //Muestra la Vaca
        gbc.gridx = 2;
        gbc.gridy = 11;
        gbl.setConstraints(Vaca, gbc);
        panel.add(Vaca);
        //Muestra la Gallina
        gbc.gridx = 3;
        gbc.gridy = 11;
        gbl.setConstraints(Galiina, gbc);
        panel.add(Galiina);

        //Muestra Las Plantas
        gbc.gridx = 3;
        gbc.gridy = 12;
        gbl.setConstraints(Plantas, gbc);
        panel.add(Plantas);
        //Muestra el Cantidad1
        gbc.gridx = 2;
        gbc.gridy = 13;
        gbl.setConstraints(planta1, gbc);
        panel.add(planta1);
        //Muestra el Cantidad2
        gbc.gridx = 4;
        gbc.gridy = 13;
        gbl.setConstraints(planta2, gbc);
        panel.add(planta2);

        //Declaro las funciones de los botones
        Negociar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                comprar = new JDialog();
                comprar.setSize(300, 350);
                comprar.setLocationRelativeTo(null);
                comprar.setLayout(new BorderLayout());
                NegociarMercado aux = new NegociarMercado();//Creamos una nueva
                comprar.add(aux, BorderLayout.NORTH);
                comprar.setVisible(true);
            }
        });

        // finalmente pintar todo
        frame.add( panel );
        frame.pack();
        frame.setSize(700,350);
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
        Ventana3 ventana3= new Ventana3();
    }
}
