
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lito_
 */
public class prueba extends javax.swing.JFrame {

    /**
     * Creates new form prueba
     */
    public prueba() {     
        initComponents();
        setSize(905, 720);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/mapa.jpg")).getImage());
        setTitle("Estados del centro del pais");
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DF = new javax.swing.JButton();
        QUERETARO = new javax.swing.JButton();
        GUANAJUATO = new javax.swing.JButton();
        HIDALGO = new javax.swing.JButton();
        PUEBLA1 = new javax.swing.JButton();
        PUEBLA = new javax.swing.JButton();
        MICHOACAN = new javax.swing.JButton();
        MORELOS = new javax.swing.JButton();
        TLAXCALA = new javax.swing.JButton();
        ESTADODEMEX = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        DF.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        DF.setText("DISTRITO FEDERAL");
        DF.setContentAreaFilled(false);
        DF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DFActionPerformed(evt);
            }
        });
        getContentPane().add(DF);
        DF.setBounds(470, 470, 120, 40);

        QUERETARO.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        QUERETARO.setForeground(new java.awt.Color(255, 255, 255));
        QUERETARO.setText("QUERÉTARO");
        QUERETARO.setContentAreaFilled(false);
        QUERETARO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUERETAROActionPerformed(evt);
            }
        });
        getContentPane().add(QUERETARO);
        QUERETARO.setBounds(200, 0, 140, 140);

        GUANAJUATO.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        GUANAJUATO.setForeground(new java.awt.Color(255, 255, 255));
        GUANAJUATO.setText("GUANAJUATO");
        GUANAJUATO.setContentAreaFilled(false);
        GUANAJUATO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUANAJUATOActionPerformed(evt);
            }
        });
        getContentPane().add(GUANAJUATO);
        GUANAJUATO.setBounds(10, 50, 140, 140);

        HIDALGO.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        HIDALGO.setText("HIDALGO");
        HIDALGO.setContentAreaFilled(false);
        HIDALGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HIDALGOActionPerformed(evt);
            }
        });
        getContentPane().add(HIDALGO);
        HIDALGO.setBounds(390, 50, 280, 150);

        PUEBLA1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        PUEBLA1.setText("PUEBLA");
        PUEBLA1.setContentAreaFilled(false);
        PUEBLA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PUEBLA1ActionPerformed(evt);
            }
        });
        getContentPane().add(PUEBLA1);
        PUEBLA1.setBounds(800, 210, 120, 100);

        PUEBLA.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        PUEBLA.setText("PUEBLA");
        PUEBLA.setContentAreaFilled(false);
        PUEBLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PUEBLAActionPerformed(evt);
            }
        });
        getContentPane().add(PUEBLA);
        PUEBLA.setBounds(680, 540, 240, 190);

        MICHOACAN.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        MICHOACAN.setText("MICHOACÁN");
        MICHOACAN.setContentAreaFilled(false);
        MICHOACAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MICHOACANActionPerformed(evt);
            }
        });
        getContentPane().add(MICHOACAN);
        MICHOACAN.setBounds(10, 270, 190, 220);

        MORELOS.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        MORELOS.setText("MORELOS");
        MORELOS.setContentAreaFilled(false);
        MORELOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MORELOSActionPerformed(evt);
            }
        });
        getContentPane().add(MORELOS);
        MORELOS.setBounds(470, 600, 160, 130);

        TLAXCALA.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        TLAXCALA.setText("TLAXCALA");
        TLAXCALA.setContentAreaFilled(false);
        TLAXCALA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TLAXCALAActionPerformed(evt);
            }
        });
        getContentPane().add(TLAXCALA);
        TLAXCALA.setBounds(710, 380, 160, 100);

        ESTADODEMEX.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ESTADODEMEX.setText("ESTADO DE MÉXICO");
        ESTADODEMEX.setContentAreaFilled(false);
        ESTADODEMEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESTADODEMEXActionPerformed(evt);
            }
        });
        getContentPane().add(ESTADODEMEX);
        ESTADODEMEX.setBounds(257, 310, 210, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ZOOM.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 930, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ESTADODEMEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESTADODEMEXActionPerformed

        InfoEstado i = new InfoEstado();
            i.setNomEstado("ESTADO DE MÉXICO");
            i.setTitle("ESTADO DE MÉXICO(TOLUCA DE LERDO)");
            i.setNomcapital("Toluca de Lerdo");
            i.setComida("Queso Fundido con Chorizo, Pancita, Tacos de Papa con chorizo.");
            ///yucatan.wav
//            i.setMusica("file:/C:/MapaAudio/edomex.wav");
            i.setPersonaje1("La princesa azteca Isabel Moctezuma tecuichpo");
            i.setPersonaje2("Miguel Hidalgo y Costilla");
            i.setPersonaje3("Martín Chimaltecatl y María Quauhtototl");
            i.setPersonaje4("Adolfo Villa González (escultor)");
            i.setRxtension("22,499 km²");
            i.setMunicipios("125");
            i.setHabitantes("16.19 millones de personas");
            i.setLargo(50, 350, 400, 300);//320
            i.setEscudo("/Imagenes/escudoedomex.png");
            i.setMapa("/Imagenes/mapaedomex.png");

            String[] regiones = {"Amecameca", "Atlacomulco",
                "Chimalhuacán", "Cuautitlán Izcalli", "Ecatepec",
                "Ixtapan de la Sal", "Lerma",
                "Naucalpan", "Nezahualcoyotl", "Tejupilco",
                "Texcoco", "Tlalnepantla",
                "Toluca", "Tultitlán", " Valle de Bravo", "Zumpango"};
            i.setRegiones(regiones);

            String[] tradiciones = {"Festival de las Almas",
                "Festival del Quinto Sol", "Fiesta de Santiago Apostol",
                "la Feria de la Nuez."
            };
            i.setTradiciones(tradiciones);

            Icon icons[] = {
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesedomex6.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesedomex.jpeg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesedomex2.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesedomex3.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesedomex4.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesedomex5.jpg")).getImage())
            };
            i.setImagenes(icons);
            i.setVisible(true);

    }//GEN-LAST:event_ESTADODEMEXActionPerformed

    private void TLAXCALAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TLAXCALAActionPerformed

 InfoEstado i = new InfoEstado();
            i.setNomEstado("TLAXCALA");
            i.setTitle("TLAXCALA(TLAXCALA DE XICOHTÉNCATL)");
            i.setNomcapital("Tlaxcala de Xicohténcatl");
            i.setComida("Alegrías, Mole prieto, Pollo a la Tocatlán, Pipián de venas, "
                    + "Tortillas rosas");
            ///yucatan.wav
            //i.setMusica("file:/C:/MapaAudio/tlax.wav");
            i.setPersonaje1("José María Córdova");
            i.setPersonaje2("Antonio Toríz, Patriota");
            i.setPersonaje3("Jesús Arriaga, Alias \"Chucho el Roto\"");
            i.setPersonaje4("Rafael Cuéllar, General Liberal Republicano");
            i.setRxtension("4,016 km²");
            i.setMunicipios("60");
            i.setHabitantes("1,273 millones de personas");
            i.setEscudo("/Imagenes/escudotlaxcala.png");
            i.setMapa("/Imagenes/mapatlaxcala2.png");

            String[] regiones = {"Norte (Tlaxco)", "Oriente (Huamantla)",
                "Poniente (Calpulalpan)", "Centro Norte (Apizaco)", "Centro Sur (Tlaxcala)",
                "Sur (Zacatelco)", "",
                "", "", "",
                "", "",
                "", "", "", ""};
            i.setRegiones(regiones);

            String[] tradiciones = {"La Huamantlada", "Carnaval de Tlaxcala",
                "La noche que nadie duerme", "La Bajada de la Virgen de Ocotlán"};
            i.setTradiciones(tradiciones);

            Icon icons[] = {
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/comidatlaxcala.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/comidatlaxcala2.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionestlaxcala.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionestlaxcala2.jpg")).getImage())
            };
            i.setImagenes(icons);
            i.setVisible(true);




    }//GEN-LAST:event_TLAXCALAActionPerformed

    private void MORELOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MORELOSActionPerformed
      
         InfoEstado i = new InfoEstado();
            i.setNomEstado("MORELOS");
            i.setTitle("MORELOS(CUERNAVACA)");
            i.setNomcapital("Cuernavaca");
            i.setComida("Tlacoyos, Huauzontle, Toritos, Itacates, Pipián Verde");
            ///yucatan.wav
            //i.setMusica("file:/C:/MapaAudio/more.wav");
            i.setPersonaje1("Ignacio Manuel Altamirano.");
            i.setPersonaje2("Pablo Neruda");
            i.setPersonaje3("Eduardo del Río (Rius)");
            i.setPersonaje4("Malcolm Lowry");
            i.setRxtension("378,239 km²");
            i.setMunicipios("36");
            i.setHabitantes("2,036,895 de habitantes");
            i.setLargo(50, 280, 400, 400);//320
            i.setEscudo("/Imagenes/escudomorelos.png");
            i.setMapa("/Imagenes/mapamorelos.png");

            String[] regiones = {"Region montañosa del Norte", "Valle intermontano",
                "Region montañosa del Sur", "", "",
                "", "",
                "", "", "",
                "", "",
                "", "", "", ""};
            i.setRegiones(regiones);

            String[] tradiciones = {"Reto al Tepozteco",
                "Portal de semillas",
                "Matacueros",
                "Chinelos",
                "Sayones"
            };
            i.setTradiciones(tradiciones);

            Icon icons[] = {
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesmorelos5.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesmorelos2.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesmorelos3.png")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesmorelos4.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesmorelos.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesmorelos6.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesmorelos7.jpg")).getImage())

            };
            i.setImagenes(icons);
            i.setVisible(true);
        
    }//GEN-LAST:event_MORELOSActionPerformed

    private void PUEBLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PUEBLAActionPerformed
      
        InfoEstado i = new InfoEstado();
            i.setNomEstado("PUEBLA");
            i.setTitle("PUEBLA(PUEBLA)");
            i.setNomcapital("PUEBLA");
            i.setComida("Chile en nogada,Cemitas,Mole poblano,Chalupas");
            ///yucatan.wav
            //i.setMusica("file:/C:/MapaAudio/puebla.wav");
            i.setPersonaje1("Don Juan de Palafox y Mendoza");
            i.setPersonaje2("Ignacio Zaragoza");
            i.setPersonaje3("Los hermanos Serdán");
            i.setPersonaje4("Elena Garro");
            i.setRxtension("34,251 km²");
            i.setMunicipios("217");
            i.setHabitantes("6,169,000 millones de personas");
            i.setEscudo("/Imagenes/escpue.png");
            i.setMapa("/Imagenes/pueblamap.png");

            String[] regiones = {"Huauchinango", "Teziutlán",
                "Ciudad Serdán", "San Pedro Cholula", "Puebla",
                "Izúcar De Matamoros", "Tehuacán Y Sierra Negra",
                "", "", "",
                "", "",
                "", "", "", ""};
            i.setRegiones(regiones);

            String[] tradiciones = {"Huauchinango Feria de la Flor", "Feria de la Manzana",
                "Matanza y el mole de caderas", "Carnaval Huejotzingo"};
            i.setTradiciones(tradiciones);

            Icon icons[] = {
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/manzana.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/china.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/cemita.png")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/zocalop.jpg")).getImage())
            };
            i.setImagenes(icons);
            i.setVisible(true);
        
        
    }//GEN-LAST:event_PUEBLAActionPerformed

    private void PUEBLA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PUEBLA1ActionPerformed

      InfoEstado i = new InfoEstado();
            i.setNomEstado("PUEBLA");
            i.setTitle("PUEBLA(PUEBLA)");
            i.setNomcapital("PUEBLA");
            i.setComida("Chile en nogada,Cemitas,Mole poblano,Chalupas");
            ///yucatan.wav
            //i.setMusica("file:/C:/MapaAudio/puebla.wav");
            i.setPersonaje1("Don Juan de Palafox y Mendoza");
            i.setPersonaje2("Ignacio Zaragoza");
            i.setPersonaje3("Los hermanos Serdán");
            i.setPersonaje4("Elena Garro");
            i.setRxtension("34,251 km²");
            i.setMunicipios("217");
            i.setHabitantes("6,169,000 millones de personas");
            i.setEscudo("/Imagenes/escpue.png");
            i.setMapa("/Imagenes/pueblamap.png");

            String[] regiones = {"Huauchinango", "Teziutlán",
                "Ciudad Serdán", "San Pedro Cholula", "Puebla",
                "Izúcar De Matamoros", "Tehuacán Y Sierra Negra",
                "", "", "",
                "", "",
                "", "", "", ""};
            i.setRegiones(regiones);

            String[] tradiciones = {"Huauchinango Feria de la Flor", "Feria de la Manzana",
                "Matanza y el mole de caderas", "Carnaval Huejotzingo"};
            i.setTradiciones(tradiciones);

            Icon icons[] = {
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/manzana.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/china.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/cemita.png")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/zocalop.jpg")).getImage())
            };
            i.setImagenes(icons);
            i.setVisible(true);

    }//GEN-LAST:event_PUEBLA1ActionPerformed

    private void DFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DFActionPerformed
        InfoEstado i = new InfoEstado();
            i.setNomEstado("CIUDAD DE MÉXICO");
            i.setTitle("CIUDAD DE MÉXICO");
            i.setNomcapital("Es la capital del pais");
            i.setComida("Guajolotas, Tacos al Pastor, Tamales, Elotes, Pozole, Huevos Rancheros ");
            ///yucatan.wav
            //i.setMusica("file:/C:/MapaAudio/df.wav");
            i.setPersonaje1("David Alfaro Siqueiros: Pintor muralista");
            i.setPersonaje2("Ignacio Manuel Altamirano: Politico y Escritor");
            i.setPersonaje3("Juan Álvarez Hurtado:  Presidente");
            i.setPersonaje4("Eligio Ancona: Gobernador y Escritor");
            i.setRxtension("1,485 km²");
            i.setMunicipios("16 pero son Delegaciones");
            i.setHabitantes("8,855 millones de personas");
            i.setEscudo("/Imagenes/escudocdmx.png");
            i.setLargo(80, 380, 250, 260); //250
            i.setMapa("/Imagenes/mapacdmx.png");

            String[] regiones = {"Alvaro Obregon", "Azcapotzalco",
                "Benito Juárez", "Coyoacan", "Cuajimalpa de Morelos",
                "Cuauhtemoc", "Gustavo A. Madero",
                "Iztacalco", "Iztapalapa", " Magdalena Contreras",
                "Miguel Hidalgo", "Milpa Alta",
                "Tlahuac", "Tlalpan", "Venustiano Carranza", "Xochimilco"};
            i.setRegiones(regiones);

            String[] tradiciones = {"Dia de la Indpendecia", "Dia de la Revolucion",
                "Navidad", "Semana Santa"};
            i.setTradiciones(tradiciones);

            Icon icons[] = {
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx0.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx6.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx7.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx8.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/comidacdmx.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/comidacdmx2.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx2.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx3.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx4.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx5.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionescdmx9.gif")).getImage())
            };
            i.setImagenes(icons);
            i.setVisible(true);
    }//GEN-LAST:event_DFActionPerformed

    private void HIDALGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HIDALGOActionPerformed
        
        
         InfoEstado i = new InfoEstado();
            i.setNomEstado("HIDALGO");
            i.setTitle("HIDALGO(PACHUCA DE SOTO)");
            i.setNomcapital("Pachuca de Soto");
            i.setComida("Barbacoa, Guajolote, Tlacoyos, Mixiotes, Escamoles");
            ///yucatan.wav
            //i.setMusica("file:/C:/MapaAudio/hidalgo.wav");
            i.setPersonaje1("Miguel Angel Granados");
            i.setPersonaje2("Elisa Acuña Rossetti");
            i.setPersonaje3("Rodolfo Guzmán Huerta (El santo)");
            i.setPersonaje4("Berta Zeron");
            i.setRxtension("20,813 km²");
            i.setMunicipios("84");
            i.setHabitantes("3 millones 86 mil 414 habitantes");
            // i.setLargo(50, 350, 400, 300);//320
            i.setEscudo("/Imagenes/escudohidalgo.png");
            i.setMapa("/Imagenes/mapahidalgo2.png");

            String[] regiones = {"La Huasteca  ", "Valle Del Mexquital",
                "Sierre Gorda", "Sierra Alta", "Sierra Baja",
                "Sierra De Tenango", "Valle De Tulancingo",
                "Altiplanicie Pulquera", "Comarca Minera", "Cuenca De Mexico",
                "", "",
                "", "", "", ""};
            i.setRegiones(regiones);

            String[] tradiciones = {"Feria del estado de Hidalgo",
                "La feria del Señor del Encino", "Feria regional del maíz",
                "La feria de la Asunción"
            };
            i.setTradiciones(tradiciones);

            Icon icons[] = {
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicioneshid0.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicioneshid2.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicioneshid3.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicioneshid4.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicioneshid5.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicioneshid6.jpg")).getImage())

            };
            i.setImagenes(icons);
            i.setVisible(true);
        
        
        
    }//GEN-LAST:event_HIDALGOActionPerformed

    private void GUANAJUATOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUANAJUATOActionPerformed
       
        
         InfoEstado i = new InfoEstado();
            i.setNomEstado("GUANAJUATO");
            i.setTitle("GUANAJUATO(GUANAJUATO)");
            i.setNomcapital("Guanajuato");
            i.setComida("las pacholas guanajuatenses, Pan de Acámbaro, Fiambre de San Miguel de Allende");
            ///yucatan.wav
            //i.setMusica("file:/C:/MapaAudio/guana.wav");
            i.setPersonaje1("Mariano Abasolo");
            i.setPersonaje2("El Pípila");
            i.setPersonaje3("Ignacio Allende");
            i.setPersonaje4("Ignacio Aldama");
            i.setRxtension("996,700 km²");
            i.setMunicipios("46");
            i.setHabitantes("184,239 mil personas");
            // i.setLargo(50, 350, 400, 300);//320
            i.setEscudo("/Imagenes/escudoguanajuato.png");
            i.setMapa("/Imagenes/mapaguanajuato.png");

            String[] regiones = {"Region 1 Noreste", "   Sierra Gorda",
                "   Chichimeca.", "Región 2 Norte", "   Sierras de Guanajuato",
                "   Bicentenario", "Región 3 Centro",
                "   León", "   Irapuato-Salamanca", "   Laja Bajío",
                "Región 4 Sur", "   Agave Azul",
                "   Lacustre", "   Sierra de los Agustinos", "", ""};
            i.setRegiones(regiones);

            String[] tradiciones = {"El Festival Cervantino",
                "Las callejonadas", "El vestido tradicional de La Galereña",
                "La comida guanajuatense"
            };
            i.setTradiciones(tradiciones);

            Icon icons[] = {
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato2.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato3.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato3.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato4.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato5.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato6.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato7.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato8.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesguanajuato9.jpg")).getImage())
            };
            i.setImagenes(icons);
            i.setVisible(true);
        
        
        
    }//GEN-LAST:event_GUANAJUATOActionPerformed

    private void QUERETAROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUERETAROActionPerformed
      
        InfoEstado i = new InfoEstado();
            i.setNomEstado("QUERÉTARO");
            i.setTitle("QUERÉTARO(QUERÉTARO)");
            i.setNomcapital("Santiago de Queretaro");
            i.setComida("Enchiladas queretanas, Barbacoa de borrego, Gorditas de migajas de chicharrón");
            ///yucatan.wav
            //i.setMusica("file:/C:/MapaAudio/quere.wav");
            i.setPersonaje1("Josefa Ortíz");
            i.setPersonaje2("Miguel Domínguez");
            i.setPersonaje3("José María Arteaga");
            i.setPersonaje4("Ignacio Pérez, El mensajero de la Libertad");
            i.setRxtension("363 km²");
            i.setMunicipios("18");
            i.setHabitantes("2 millones 239 mil de habitantes");
            // i.setLargo(50, 350, 400, 300);//320
            i.setEscudo("/Imagenes/escudoqueretaro.png");
            i.setMapa("/Imagenes/mapaqueretaro.png");

            String[] regiones = {"Querétaro",
                "Corregidora",
                "Huimilpan", "El Marqués", "",
                "", "",
                "", "", "",
                "", "",
                "", "", "", ""};
            i.setRegiones(regiones);

            String[] tradiciones = {"Arroyo Seco",
                "Fiesta de la Candelaria ",
                "Fiesta de San Isidro Labrador",
                "Festividad de San Miguel Arcángel",
                "Fiesta patronal de Santiago Apóstol"
            };
            i.setTradiciones(tradiciones);

            Icon icons[] = {
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesqueretaro3.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesqueretaro.jpeg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesqueretaro6.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesqueretaro4.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesqueretaro5.jpeg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesqueretaro2.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesqueretaro7.jpg")).getImage()),
                new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/tradicionesqueretaro8.jpg")).getImage())
            };
            i.setImagenes(icons);
            i.setVisible(true);
        
      
        
    }//GEN-LAST:event_QUERETAROActionPerformed

    private void MICHOACANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MICHOACANActionPerformed
       
         InfoEstado i = new InfoEstado();
        i.setNomEstado("MICHOACÁN");
        i.setTitle("MICHOACÁN(MORELIA)");
        i.setNomcapital("Morelia");
        i.setComida("Corundas,Charales,Morisqueta,"
                + "Carnitas");
        ///himnoyuc.wav
        //i.setMusica("file:/C:/MapaAudio/mich.wav");
        i.setPersonaje1("José María Morelos y Pavón");
        i.setPersonaje2("Ignacio López Rayón");
        i.setPersonaje3("Mariano Matamoros");
        i.setPersonaje4("Agustín de Iturbide");
        i.setRxtension("58,599 km²");
        i.setMunicipios("113");
        i.setHabitantes("4,584,000 millones de personas");
        i.setEscudo("/Imagenes/escudomich.png");
        i.setMapa("/Imagenes/micho.png");

        String[] regiones = {"Centro (Morelia)", "Lacustre (Pátzcuaro)",
            "Meseta Purépecha (Uruapan)", "Oriente (Zitácuaro)", "Occidente (Zamora)",
            " Costa(Lázaro Cárdenas)", "",
            "", "", "",
            "", "","",
            "", "", ""};
        i.setRegiones(regiones);
        String[] tradiciones = {"Epifanía", "Día de la candelaria",
            "Martes de carnaval", "Dia de muertos"};
        i.setTradiciones(tradiciones);

        Icon icons[] = {
            new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/diamuertos.jpg")).getImage()),
            new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/comidamicho.jpg")).getImage()),
            new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/michorop.jpg")).getImage()),
            new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/zocalomich.jpg")).getImage())
        };
        i.setImagenes(icons);
        i.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_MICHOACANActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DF;
    private javax.swing.JButton ESTADODEMEX;
    private javax.swing.JButton GUANAJUATO;
    private javax.swing.JButton HIDALGO;
    private javax.swing.JButton MICHOACAN;
    private javax.swing.JButton MORELOS;
    private javax.swing.JButton PUEBLA;
    private javax.swing.JButton PUEBLA1;
    private javax.swing.JButton QUERETARO;
    private javax.swing.JButton TLAXCALA;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}