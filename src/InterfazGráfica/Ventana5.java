package InterfazGráfica;

import Hilos.VidaUsuarioHilos;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana5 extends JFrame {
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

//Declaro mis variables
    private static final int NUMERO_COLUMNAS = 80;
    private static final int NUMERO_FILAS = 25;
    private final JFrame ventana;
    private final JTextArea textArea;
    private final JScrollPane scrollPane;

    public Ventana5() {
        // Crear el gridbag layout y su constraints
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        // crear un panel y ponerle ese layout
        JPanel panel = new JPanel();
        panel.setLayout(gbl);
        //Declaro un margen estético a mi ventana
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "MANUAL DE USUARIO");
        panel.setBorder(bordejpanel);
        //Creamos el contenedor JScrollPane
        JScrollPane panelDeslizable = new JScrollPane();


//Declaro el nombre de mi ventana, y la relacion de texto, con las columnas y filas
        ventana = new JFrame("AYUDA, MANUAL DE USUARIO");
        textArea = new JTextArea("VIDEOJUEGO MYFARM\n" +
                "En todas las ventanas en la parte superior se ubica un menú el cual nos facilita la movilización entre las distintas ventanas haciendo que el usuario pueda acceder a ellas de una manera sencilla y funcional, imagen (1.0), (1.1) y (1.2).\n" +
                "Imagen (1.0)\n" +
                "Vemos que en el menú tenemos las opciones de los tipos de juego y las ventanas del mismo.\n" +
                "Imagen (1.1)\n" +
                "En el de ayuda, tendremos el manual de usuario el cual nos servirá para brindarle al usuario las instrucciones del juego y así ampliar su conocimiento del funcionamiento de la Granja.\n" +
                "Imagen (1.2)\n" +
                "Y Ya que el usuario pierde vida con el tiempo y es necesario que se alimente para poder seguir estando activo, se implementó un menú en todas las ventanas las cuales nos ofrecen un acceso directo a la ventana de ConsumirAlimento para que el usuario pueda acceder a ella y alimentarse de una manera fácil, sin perder tiempo.\n" +
                "En la ventana Principal, se muestra una interfaz en la cual tenemos textos informativos que nos indican información primordial para el usuario, seguido de dos botones El de Granja, nos llevará a la imagen 1.3.\n" +
                "Imagen 1.3 (Granja)\n" +
                "En el Botón ALIMENTAR, Se muestra un inventario con los alimentos disponibles para el usuario junto a la información de la vida actual que tiene el granjero, En el Botón de ALIMENTARSE se hará una resta automatizada al inventario y el usuario podrá ver en tiempo real su inventario actualizado y a su vez se actualizará y reestablecerá la vida del granjero, imagen 1.4\n" +
                "En la pestaña de GRANJA, vemos que tenemos una distribución de manera aleatoria de los tipos de suelo que se muestran de manera de imagen para que sea entendible de una mejor manera para el usuario, también se muestran 6 Botones, los cuales cada uno tiene una función, si presionamos el botón de SEMBRAR, este nos lanzará un aviso mostrándonos la cantidad de celdas disponibles para la siembra.\n" +
                "Se abrirá una pestaña especial para la siembra, en la cual el usuario podrá ver la cantidad que posee de cada producto para su siembra y cual elegirá en base a la cantidad de semillas y la cantidad de celdas disponibles, y por lo consiguiente mostrará a nuestras celdas de las granjas como ocupadas. Imagen 1.5\n" +
                " \n" +
                "Si presionamos el botón de COSECHAR, este nos lanzará una alerta indicándonos si hay una cosecha disponible y si la hay se encargará se hacer los cálculos de cuanto producto generará y sobrescribir la cantidad antes obtenida indicándonos un nuevo total.\n" +
                "Si presionamos el botón de COMPRAR CELDAS, este nos lanzará un aviso mostrándonos el precio de cada celda y si es posible comprar basados en nuestro oro. Se actualizará nuestra granja mostrando el espacio ampliado a la hora de su compra\n" +
                "Si presionamos el botón de PESCA, este nos lanzará un aviso mostrándonos la cantidad de celdas disponibles para la pesca. Se abrirá una pestaña especial para la pesca, en esta tendremos tres botones, el usuario podrá verificar si ya tiene un barco comprado y si no es el caso comprar uno y ponerse a pescar, eso hará que el agua se quede sin peces y para que se vuelva a llenar el usuario deberá presionar el botón llenar y todo volverá a la normalidad, para volver a pescar el usuario deberá comprar otro barco. Imagen 1.6\n" +
                " \n" +
                "Menú Pesca imagen 1.6\n" +
                "Si Presionamos el Botón LIMPIAR, el sistema nos mostrará si es posible limpiar por si en dado caso alguna cosecha se pudrió, y si es posible limpiar limpiará las celdas haciendo que sea posible tener una actividad más en curso.}\n" +
                "Si presionamos el botón CRIANZA este nos lanzará un aviso mostrándonos la cantidad de celdas disponibles para la crianza. Se abrirá una pestaña especial para la crianza, en la cual el usuario podrá ver la cantidad que posee de cada producto para su crianza y cual elegirá en base a la cantidad de crías y la cantidad de celdas disponibles, y por lo consiguiente mostrará a nuestras celdas de las granjas como ocupadas. Imagen 1.7\n" +
                " \n" +
                "Regresando al menú principal de la imagen (1.0), al Presionar el botón de BODEGA, se abrirá una ventana en la cual se obtendrá un resumen del inventario de nuestros productos así el usuario tiene mayor control de su materia prima y el oro.\n" +
                " \n" +
                "Al Presionar el botón de MERCADO, se abrirá una ventana en la cual se obtendrá un resumen del inventario de nuestros productos así el usuario tiene mayor control de su materia prima y el oro y un botón de negociar en el cual lo enviará a la ventana especial de compra de producto.\n" +
                " \n" +
                "Al presionar el botón de Negociar, nos enviará a una pestaña en la cual están todos los productos de manera de botón haciendo que podamos escoger el producto que se desea negociar.\n" +
                " \n" +
                "Al presionar el botón del producto que deseamos negociar nos enviará a una pestaña en la que veremos la cantidad de Oro que tenemos, la cantidad de producto que deseamos negociar, la cantidad de producto y los botones de comprar y vender y su precio. Al ingresar la cantidad y presionar el botón de comprar o vender el sistema hará el procedimiento necesario según la decisión tomada, se actualizará la cantidad de producto y la cantidad de Oro en General.\n" +
                " \n" +
                "Ahora en el menú de REPORTES, obtendremos un resumen de las actividades más importantes realizadas durante el tiempo de juego haciendo qué el usuario pueda ver todo lo que se ha hecho.\n" +
                " \n" +
                "En la pestaña de AYUDA, Se muestra la opción de manual de usuario en la cual se muestra el texto del manual para que el usuario tenga acceso a la información de manera rápida.\n",NUMERO_FILAS, NUMERO_COLUMNAS);
        scrollPane = new JScrollPane(textArea);
        ventana.getContentPane().add(scrollPane);
        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setVisible(true);

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
        Ventana5 ventana5= new Ventana5();
    }

}
