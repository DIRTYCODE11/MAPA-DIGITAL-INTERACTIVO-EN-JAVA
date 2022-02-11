/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lito_
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class GalleryModule extends JPanel {

    //Distribucion que ayudara a crear la galeria
    private CardLayout Imagenes;
    private int LARGO = 930;
    //Panel donde se colocan los labels (y en los labels van las imagenes)
    private JPanel ap[];
    private JLabel la[];

    private Icon icons[] = {
        new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/1.jpg")).getImage()),
        new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/2.jpg")).getImage()),
        new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/3.jpg")).getImage()),
        new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/4.jpg")).getImage())
    };
    //Inicializacion de nuestro arreglo de imagenes
    int contar = 0;
    JLabel cabecera;

    GalleryModule(Icon[] icons) {
        this.icons = icons;

        //Construccion del entorno grafico
        cabecera = new JLabel("GALERIA DE FOTOS DEL ESTADO");
        cabecera.setBackground(null);
        cabecera.setBounds(40, 0, LARGO, 136);
        Font fuente = new Font("Arial", Font.BOLD, 50);
        cabecera.setFont(fuente);
        cabecera.setForeground(Color.BLACK);
        setSize(1366, 768);
        setLayout(null);

        JPanel botonAtras = new JPanel();
        botonAtras.setLayout(null);
        botonAtras.setBackground(Color.decode("#e3c682"));
        botonAtras.setBounds(39, 370, 51, 87);

        JPanel botonAdelante = new JPanel();
        botonAdelante.setLayout(null);
        botonAdelante.setBackground(Color.decode("#e3c682"));
        botonAdelante.setBounds(820, 370, 51, 87);

        Font fuente1 = new Font("Arial", Font.BOLD, 82);
        JButton atras = new JButton();
        atras.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/atras.png")).getImage()));
        atras.setBackground(Color.decode("#e3c682"));
        atras.setFont(fuente1);
        atras.setForeground(Color.decode("#75a738"));
        //atras.setBounds(1, 1, 1, 1);
        atras.setSize(51, 87);
        atras.setBorder(null);
        botonAtras.add(atras);

        JButton adelante = new JButton();
        adelante.setBackground(Color.decode("#e3c682"));
        adelante.setFont(fuente1);
        adelante.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/adelante.png")).getImage()));

        //adelante.setBounds(1, 1, 1, 1);
        adelante.setForeground(Color.decode("#75a738"));
        adelante.setSize(51, 87);
        adelante.setBorder(null); 
        botonAdelante.add(adelante);

        Imagenes = new CardLayout();
        final JPanel ImagenPanel = new JPanel();
        ImagenPanel.setBackground(Color.decode("#e3c682"));
        ImagenPanel.setLayout(null);
        ImagenPanel.setForeground(Color.decode("#e3c682"));
        ImagenPanel.setBounds(90, 200, LARGO - 200, 420);

        la = new JLabel[this.icons.length];
        ap = new JPanel[icons.length];
        ImagenPanel.setLayout(Imagenes);
        //algoritmo que añade paneles y etiquetas al arreglo	
        for (int z = 0; z < this.icons.length; z++) {
           
            la[z] = new JLabel(icons[z]);
            ap[z] = new JPanel();
          
            ap[z].add(la[z]);
            ap[z].setBackground(Color.decode("#e3c682"));
            ImagenPanel.add(ap[z], String.valueOf(z));
        }
        //añadiendo la funcion a lo botones que recorre el arreglo nImagenes
       //añadiendo la funcion a lo botones que recorre el arreglo nImagenes
        adelante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                if (contar < icons.length) {
                    contar += 1;
                    if (contar == icons.length) {
                        contar = 0;
                    }
                    Imagenes.show(ImagenPanel, "" + (contar));

                }
            }
        });

        atras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (contar > 0) {
                    contar -= 1;
                    Imagenes.show(ImagenPanel, "" + (contar));
                } else {
                    contar = icons.length;
                }
            }

        });

        ImageIcon background_imagen = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/fondoEstados.jpg")).getImage());
        Image fondo = background_imagen.getImage();
        Image temp_img = fondo.getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        background_imagen = new ImageIcon(temp_img);
        JLabel background = new JLabel("", background_imagen, JLabel.CENTER);

        
        
        //Añadiendo los componentes 
        background.add(cabecera);
        background.add(botonAtras);
        background.add(botonAdelante);
        background.add(ImagenPanel);
        background.setBounds(0, 0, LARGO, 768);
        add(background);
        setVisible(true);

    }

    public void setLarge(int size) {
        LARGO = size;
        repaint();
    }

    public static void main(String[] args) {
        Icon icons[] = {
            new ImageIcon("src\\imagenes\\1.jpg"),
            new ImageIcon("src\\imagenes\\2.jpg"),
            new ImageIcon("src\\imagenes\\3.jpg"),
            new ImageIcon("src\\imagenes\\4.jpg")
        };
        GalleryModule gm = new GalleryModule(icons);
        JFrame frame = new JFrame();
        frame.setSize(930, 700);
        frame.setLayout(null);
        gm.setBounds(0, 0, 930, 730);
        frame.add(gm);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
