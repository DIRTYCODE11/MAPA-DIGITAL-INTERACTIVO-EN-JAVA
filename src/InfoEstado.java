
import javax.media.Manager;
import javax.media.Player;
import java.net.URL;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jpanel4
 */
public class InfoEstado extends javax.swing.JFrame {

    URL trailer;
    Player reproductor;
    /**
     * Creates new form InfoEUA
     */
    static int WIDTH = 930, HEIGHT = 780; //Si quieres cambiar el tamaño del frame
    Icon icons[] = {
        new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/1.jpg")).getImage()),
        new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/2.jpg")).getImage()),
        new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/3.jpg")).getImage()),
        new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/4.jpg")).getImage())
    };

    public InfoEstado() {
        initComponents();
        setSize(WIDTH, HEIGHT);
        this.dispose();
        setResizable(false);
        this.setLayout(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/mapa.jpg")).getImage());
        this.setLocation(500, 100);

        // JLabel Redimensionable mapa del estado
        ImageIcon mapaO = new ImageIcon(getClass().getResource("/Imagenes/OaxacaEstadoMapa.png"));
        ImageIcon iconoO = new ImageIcon(mapaO.getImage().getScaledInstance(mapachico.getWidth(), mapachico.getHeight(), Image.SCALE_DEFAULT));
        mapachico.setIcon(iconoO);
        // JLabel Redimensionable escudo del estado
        ImageIcon escO = new ImageIcon(getClass().getResource("/Imagenes/escudo-oaxaca.png"));
        ImageIcon iconoEO = new ImageIcon(escO.getImage().getScaledInstance(escudo.getWidth(), escudo.getHeight(), Image.SCALE_DEFAULT));
        escudo.setIcon(iconoEO);

        JPanel pFondo = new JPanel();
        pFondo.setBackground(Color.WHITE);
        pFondo.setBounds(0, 0, WIDTH, HEIGHT);
        this.add(pFondo);

        setSize(920, 720);
        //GalleryModule gm = new GalleryModule(icons);

        //jTabbedPane2.addTab("MI ÁLBUM DE FOTOS", gm);
        //Musica
        try {
            //aca nadamas cambien el nombre de la cancion por el estado ejemplo
            //himnosonora.wav , la canciones se pondran en una carpeta aparte en el disco loca c la carpeta se llama MapaAudio
            trailer = new URL("file:/C:/MapaAudio/himnooax.wav");
            reproductor = Manager.createRealizedPlayer(trailer);
        } catch (Exception e) {

            // System para que lo vean en codigo
            System.out.println("No se encontro audio");

        }

        repro.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/play.png")).getImage()));

        repro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                reproductor.start();
            }
        });
        pausa.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/pausa.png")).getImage()));

        pausa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                reproductor.stop();
            }
        });

        // Apaga el hilo del audio              
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                reproductor.close();
            }
        });

    }

    public void setImagenes(Icon[] iconos) {
        GalleryModule gm = new GalleryModule(iconos);
        JButton b = new JButton("Regresar");
        b.setBounds(600, 150, 100, 30);
        gm.add(b);

        jTabbedPane2.addTab("MI ÁLBUM DE FOTOS", gm);
    }

    public void setNomEstado(String nomEstado) {
        this.nomEstado.setText(nomEstado);
        this.nomEstado.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    public void setNomcapital(String nomcapital) {
        this.nomcapital.setText(nomcapital);
        //  municipios.setBounds(0,0,20,120);
    }

    public void setPersonaje1(String p1) {
        this.personaje1.setText(p1);
    }

    public void setPersonaje2(String p2) {
        this.personaje2.setText(p2);
    }

    public void setPersonaje3(String p3) {
        this.personaje3.setText(p3);
    }

    public void setPersonaje4(String p4) {
        this.personaje4.setText(p4);
    }

    public void setMapa(String ruta) {
        //"/Imagenes/OaxacaEstadoMapa.png
        ImageIcon mapaO = new ImageIcon(getClass().getResource(ruta));
        ImageIcon iconoO = new ImageIcon(mapaO.getImage().getScaledInstance(mapachico.getWidth(), mapachico.getHeight(), Image.SCALE_DEFAULT));
        mapachico.setIcon(iconoO); // NOI18N
    }

    public void setLargo(int x,int y, int width,int hight) {
        mapachico.setBounds(x, y, width, hight);
    }

    public void setEscudo(String ruta) {
        //"/Imagenes/OaxacaEstadoMapa.png
        ImageIcon escO = new ImageIcon(getClass().getResource(ruta));
        ImageIcon iconoEO = new ImageIcon(escO.getImage().getScaledInstance(escudo.getWidth(), escudo.getHeight(), Image.SCALE_DEFAULT));
        escudo.setIcon(iconoEO);
    }

    public void setRxtension(String extension) {
        EXTENSION.setText(extension);
    }

    public void setHabitantes(String habitantes) {
        Habitantes.setText(habitantes);
    }

    public void setMusica(String ruta) {
        try {
            trailer = new URL(ruta);
            reproductor = Manager.createRealizedPlayer(trailer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontro audio");
        }
    }

    public void setRegiones(String[] regiones) {
        R1.setText(regiones[0]);
        R2.setText(regiones[1]);
        R3.setText(regiones[2]);
        R4.setText(regiones[3]);
        R5.setText(regiones[4]);
        R6.setText(regiones[5]);
        R7.setText(regiones[6]);
        R8.setText(regiones[7]);
        R9.setText(regiones[8]);
        R10.setText(regiones[9]);
        R11.setText(regiones[10]);
        R12.setText(regiones[11]);
        R13.setText(regiones[12]);
        R14.setText(regiones[13]);
        R15.setText(regiones[14]);
        R16.setText(regiones[15]);

    }

    public void setTradiciones(String[] tradiciones) {
        T1.setText(tradiciones[0]);
        T2.setText(tradiciones[1]);
        T3.setText(tradiciones[2]);
        T4.setText(tradiciones[3]);
    }

    public void setComida(String comida) {
        COMIDA1.setText(comida);
    }

    public void setMunicipios(String num) {
        municipios.setText(num);
    }

    public void setIndex(int index) {
        jTabbedPane2.setSelectedIndex(index);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        nomEstado = new javax.swing.JLabel();
        Habitantes = new javax.swing.JLabel();
        pausa = new javax.swing.JButton();
        YUCATAN = new javax.swing.JButton();
        YUCATAN1 = new javax.swing.JButton();
        repro = new javax.swing.JButton();
        EXTENSION = new javax.swing.JLabel();
        COMIDA1 = new javax.swing.JLabel();
        COMIDA = new javax.swing.JLabel();
        T2 = new javax.swing.JLabel();
        R9 = new javax.swing.JLabel();
        EXTENSION1 = new javax.swing.JLabel();
        R8 = new javax.swing.JLabel();
        Habitantes1 = new javax.swing.JLabel();
        R7 = new javax.swing.JLabel();
        R3 = new javax.swing.JLabel();
        T1 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        R10 = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        R16 = new javax.swing.JLabel();
        R12 = new javax.swing.JLabel();
        R13 = new javax.swing.JLabel();
        R14 = new javax.swing.JLabel();
        R15 = new javax.swing.JLabel();
        R11 = new javax.swing.JLabel();
        R4 = new javax.swing.JLabel();
        lblmunicipios = new javax.swing.JLabel();
        municipios = new javax.swing.JLabel();
        R5 = new javax.swing.JLabel();
        personaje4 = new javax.swing.JLabel();
        T3 = new javax.swing.JLabel();
        T4 = new javax.swing.JLabel();
        R6 = new javax.swing.JLabel();
        Regiones1 = new javax.swing.JLabel();
        personaje2 = new javax.swing.JLabel();
        personaje3 = new javax.swing.JLabel();
        Regiones = new javax.swing.JLabel();
        personaje1 = new javax.swing.JLabel();
        capital2 = new javax.swing.JLabel();
        escudo = new javax.swing.JLabel();
        nomcapital = new javax.swing.JLabel();
        capital = new javax.swing.JLabel();
        mapachico = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(910, 730));

        jPanel3.setLayout(null);

        nomEstado.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nomEstado.setText("OAXACA");
        jPanel3.add(nomEstado);
        nomEstado.setBounds(160, 90, 540, 40);

        Habitantes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Habitantes.setText("3.968 millones");
        jPanel3.add(Habitantes);
        Habitantes.setBounds(620, 550, 240, 14);

        pausa.setBackground(Color.decode("#e3c682"));
        pausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pausa.png"))); // NOI18N
        jPanel3.add(pausa);
        pausa.setBounds(520, 590, 50, 50);

        YUCATAN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        YUCATAN.setText("X");
        YUCATAN.setContentAreaFilled(false);
        YUCATAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YUCATANActionPerformed(evt);
            }
        });
        jPanel3.add(YUCATAN);
        YUCATAN.setBounds(840, 0, 70, 50);

        YUCATAN1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        YUCATAN1.setText("Ver Fotos");
        YUCATAN1.setContentAreaFilled(false);
        YUCATAN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YUCATAN1ActionPerformed(evt);
            }
        });
        jPanel3.add(YUCATAN1);
        YUCATAN1.setBounds(730, 80, 120, 50);

        repro.setBackground(Color.decode("#e3c682"));
        repro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        repro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reproActionPerformed(evt);
            }
        });
        jPanel3.add(repro);
        repro.setBounds(470, 590, 50, 50);

        EXTENSION.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EXTENSION.setText("93,952 km²");
        jPanel3.add(EXTENSION);
        EXTENSION.setBounds(620, 520, 80, 14);

        COMIDA1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        COMIDA1.setText("7 MOLES, CHAPULINES, TLAYUDAS, TEJATE , MEZCAL , PAN DE YEMA");
        jPanel3.add(COMIDA1);
        COMIDA1.setBounds(470, 490, 430, 20);

        COMIDA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        COMIDA.setForeground(new java.awt.Color(153, 0, 0));
        COMIDA.setText("COMIDA TÍPICA:");
        jPanel3.add(COMIDA);
        COMIDA.setBounds(470, 470, 240, 14);

        T2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T2.setText("GUELAGUETZA");
        jPanel3.add(T2);
        T2.setBounds(470, 450, 190, 14);

        R9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R9.setText("8. CAÑADA");
        jPanel3.add(R9);
        R9.setBounds(600, 370, 130, 14);

        EXTENSION1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EXTENSION1.setForeground(new java.awt.Color(153, 0, 0));
        EXTENSION1.setText("EXTENSIÓN TERRITORIAL:");
        jPanel3.add(EXTENSION1);
        EXTENSION1.setBounds(470, 520, 150, 14);

        R8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R8.setText("7. COSTA");
        jPanel3.add(R8);
        R8.setBounds(600, 350, 120, 14);

        Habitantes1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Habitantes1.setForeground(new java.awt.Color(153, 0, 0));
        Habitantes1.setText("NÚMERO DE HABITANTES:");
        jPanel3.add(Habitantes1);
        Habitantes1.setBounds(470, 550, 150, 14);

        R7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R7.setText("6. MIXTECA");
        jPanel3.add(R7);
        R7.setBounds(600, 330, 120, 14);

        R3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R3.setText("3. SIERRA NORTE");
        jPanel3.add(R3);
        R3.setBounds(470, 350, 220, 14);

        T1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T1.setText("NOCHE DE RÁBANOS");
        jPanel3.add(T1);
        T1.setBounds(470, 430, 200, 14);

        R2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R2.setText("2. ISTMO");
        jPanel3.add(R2);
        R2.setBounds(470, 330, 240, 14);

        R10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R10.setText("1. VALLES CENTRALES");
        jPanel3.add(R10);
        R10.setBounds(600, 390, 130, 14);

        R1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R1.setText("1. VALLES CENTRALES");
        jPanel3.add(R1);
        R1.setBounds(470, 310, 120, 14);

        R16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R16.setText("5. PAPALOAPAN ");
        jPanel3.add(R16);
        R16.setBounds(740, 290, 110, 14);

        R12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R12.setText("6. MIXTECA");
        jPanel3.add(R12);
        R12.setBounds(740, 330, 100, 14);

        R13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R13.setText("7. COSTA");
        jPanel3.add(R13);
        R13.setBounds(740, 350, 100, 14);

        R14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R14.setText("8. CAÑADA");
        jPanel3.add(R14);
        R14.setBounds(740, 370, 140, 14);

        R15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R15.setText("1. VALLES CENTRALES");
        jPanel3.add(R15);
        R15.setBounds(740, 390, 160, 14);

        R11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R11.setText("5. PAPALOAPAN ");
        jPanel3.add(R11);
        R11.setBounds(740, 310, 100, 14);

        R4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R4.setText("4. SIERRA SUR");
        jPanel3.add(R4);
        R4.setBounds(470, 370, 230, 14);

        lblmunicipios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblmunicipios.setForeground(new java.awt.Color(153, 0, 0));
        lblmunicipios.setText("NUM. MUNICIPIOS: ");
        jPanel3.add(lblmunicipios);
        lblmunicipios.setBounds(470, 170, 120, 14);

        municipios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        municipios.setText("570");
        jPanel3.add(municipios);
        municipios.setBounds(580, 170, 190, 14);

        R5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R5.setText("5. Papaloapan");
        jPanel3.add(R5);
        R5.setBounds(470, 390, 200, 14);

        personaje4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        personaje4.setText("4. JOSÉ VASCONCELOS");
        jPanel3.add(personaje4);
        personaje4.setBounds(470, 270, 370, 14);

        T3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T3.setText("NOCHE DE RÁBANOS");
        jPanel3.add(T3);
        T3.setBounds(670, 430, 220, 14);

        T4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T4.setText("GUELAGUETZA");
        jPanel3.add(T4);
        T4.setBounds(670, 450, 220, 14);

        R6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R6.setText("5. PAPALOAPAN ");
        jPanel3.add(R6);
        R6.setBounds(600, 310, 130, 14);

        Regiones1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Regiones1.setForeground(new java.awt.Color(153, 0, 0));
        Regiones1.setText("TRADICIONES MÁS RELEVANTES:");
        jPanel3.add(Regiones1);
        Regiones1.setBounds(470, 410, 240, 14);

        personaje2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        personaje2.setText("2. RICARDO FLORES MAGÓN");
        jPanel3.add(personaje2);
        personaje2.setBounds(470, 230, 380, 14);

        personaje3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        personaje3.setText("3. PORFIRIO DÍAZ");
        jPanel3.add(personaje3);
        personaje3.setBounds(470, 250, 370, 14);

        Regiones.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Regiones.setForeground(new java.awt.Color(153, 0, 0));
        Regiones.setText("REGIONES DEL ESTADO:");
        jPanel3.add(Regiones);
        Regiones.setBounds(470, 290, 240, 14);

        personaje1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        personaje1.setText("1. BENITO JUÁREZ   ");
        jPanel3.add(personaje1);
        personaje1.setBounds(470, 210, 370, 14);

        capital2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        capital2.setForeground(new java.awt.Color(153, 0, 0));
        capital2.setText("PERSONAJES HISTÓRICOS IMPORTANTES:");
        jPanel3.add(capital2);
        capital2.setBounds(470, 190, 240, 14);

        escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escudo-oaxaca.png"))); // NOI18N
        jPanel3.add(escudo);
        escudo.setBounds(170, 150, 150, 210);

        nomcapital.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomcapital.setText("OAXACA DE JUÁREZ");
        jPanel3.add(nomcapital);
        nomcapital.setBounds(530, 150, 330, 14);

        capital.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        capital.setForeground(new java.awt.Color(153, 0, 0));
        capital.setText("CAPITAL:");
        jPanel3.add(capital);
        capital.setBounds(470, 150, 60, 14);

        mapachico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OaxacaEstadoMapa.png"))); // NOI18N
        jPanel3.add(mapachico);
        mapachico.setBounds(80, 380, 380, 260);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoEstados.jpg"))); // NOI18N
        jPanel3.add(fondo);
        fondo.setBounds(0, 0, 910, 710);

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoEstados.jpg"))); // NOI18N
        jPanel3.add(fondo1);
        fondo1.setBounds(0, 0, 910, 710);

        jTabbedPane2.addTab("INFORMACIÓN", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void YUCATANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YUCATANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YUCATANActionPerformed

    private void YUCATAN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YUCATAN1ActionPerformed
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_YUCATAN1ActionPerformed

    private void reproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reproActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new InfoEstado().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COMIDA;
    private javax.swing.JLabel COMIDA1;
    private javax.swing.JLabel EXTENSION;
    private javax.swing.JLabel EXTENSION1;
    private javax.swing.JLabel Habitantes;
    private javax.swing.JLabel Habitantes1;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R10;
    private javax.swing.JLabel R11;
    private javax.swing.JLabel R12;
    private javax.swing.JLabel R13;
    private javax.swing.JLabel R14;
    private javax.swing.JLabel R15;
    private javax.swing.JLabel R16;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R3;
    private javax.swing.JLabel R4;
    private javax.swing.JLabel R5;
    private javax.swing.JLabel R6;
    private javax.swing.JLabel R7;
    private javax.swing.JLabel R8;
    private javax.swing.JLabel R9;
    private javax.swing.JLabel Regiones;
    private javax.swing.JLabel Regiones1;
    private javax.swing.JLabel T1;
    private javax.swing.JLabel T2;
    private javax.swing.JLabel T3;
    private javax.swing.JLabel T4;
    private javax.swing.JButton YUCATAN;
    private javax.swing.JButton YUCATAN1;
    private javax.swing.JLabel capital;
    private javax.swing.JLabel capital2;
    private javax.swing.JLabel escudo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblmunicipios;
    private javax.swing.JLabel mapachico;
    private javax.swing.JLabel municipios;
    private javax.swing.JLabel nomEstado;
    private javax.swing.JLabel nomcapital;
    private javax.swing.JButton pausa;
    private javax.swing.JLabel personaje1;
    private javax.swing.JLabel personaje2;
    private javax.swing.JLabel personaje3;
    private javax.swing.JLabel personaje4;
    private javax.swing.JButton repro;
    // End of variables declaration//GEN-END:variables
}
