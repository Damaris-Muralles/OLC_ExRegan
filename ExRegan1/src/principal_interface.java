
import Analizadores.Sintactico;
import Analizadores.Lexico;
import Errores.Excepcion;
import arbol_afd.Arbol;
import arbol_afd.TablaSiguientes;
import arbol_afd.TablaTransiciones;
import arbol_afd.nodo;
import arbol_afd.transiciones;
import java.io.BufferedReader;
import java.io.StringReader;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class principal_interface extends javax.swing.JFrame {
   java.io.File archivo;
   javax.swing.ImageIcon[] img;
   int visualizar = 0;
   int mayor;
   Icon icon;
   String mconsola="";
   int eventg=0;
   public List<String> conjuntos = new ArrayList<String>();
   public List<String> expresion = new ArrayList<String>();
   public List automata = new ArrayList();
   public List filalex = new ArrayList();
   public List<String> lexema = new ArrayList<String>();
   public ArrayList<Excepcion> Erroreslex = new ArrayList();
   public int filaer=0;
   
   int xmouse, ymouse;

    public principal_interface() {
        initComponents();
        this.setLocationRelativeTo(null);
        carpetas();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Bot_guardar_c = new javax.swing.JLabel();
        Bot_nuevo = new javax.swing.JLabel();
        Bot_abrir = new javax.swing.JLabel();
        Bot_guardar = new javax.swing.JLabel();
        T_cerrar = new javax.swing.JLabel();
        T_min = new javax.swing.JLabel();
        Panel_text = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Text_area = new javax.swing.JTextArea();
        Panel_consola = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_consola = new javax.swing.JTextArea();
        Panel_archivos = new javax.swing.JPanel();
        Label_arbol = new javax.swing.JLabel();
        Label_siguiente = new javax.swing.JLabel();
        Label_automata = new javax.swing.JLabel();
        Label_transicion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        a_automata = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        a_siguiente = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        a_transacc = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        a_arboles = new javax.swing.JTextArea();
        Panel_visualizador = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lab_img = new javax.swing.JTextPane();
        Box_opciones = new javax.swing.JComboBox<>();
        Bot_analizar = new javax.swing.JLabel();
        Bot_generar = new javax.swing.JLabel();
        Bot_siguiente = new javax.swing.JLabel();
        Bot_anterior = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(65, 54, 88));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(23, 9, 32));
        Menu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenuMouseDragged(evt);
            }
        });
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMousePressed(evt);
            }
        });
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bot_guardar_c.setBackground(new java.awt.Color(23, 9, 32));
        Bot_guardar_c.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        Bot_guardar_c.setForeground(new java.awt.Color(255, 255, 255));
        Bot_guardar_c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bot_guardar_c.setText(" Guardar Como");
        Bot_guardar_c.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bot_guardar_c.setOpaque(true);
        Bot_guardar_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bot_guardar_cMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bot_guardar_cMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bot_guardar_cMouseExited(evt);
            }
        });
        Menu.add(Bot_guardar_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 170, 40));

        Bot_nuevo.setBackground(new java.awt.Color(23, 9, 32));
        Bot_nuevo.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        Bot_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Bot_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bot_nuevo.setText("Nuevo");
        Bot_nuevo.setOpaque(true);
        Bot_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bot_nuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bot_nuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bot_nuevoMouseExited(evt);
            }
        });
        Menu.add(Bot_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        Bot_abrir.setBackground(new java.awt.Color(23, 9, 32));
        Bot_abrir.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        Bot_abrir.setForeground(new java.awt.Color(255, 255, 255));
        Bot_abrir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bot_abrir.setText("Abrir");
        Bot_abrir.setOpaque(true);
        Bot_abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bot_abrirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bot_abrirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bot_abrirMouseExited(evt);
            }
        });
        Menu.add(Bot_abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 100, 40));

        Bot_guardar.setBackground(new java.awt.Color(23, 9, 32));
        Bot_guardar.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        Bot_guardar.setForeground(new java.awt.Color(255, 255, 255));
        Bot_guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bot_guardar.setText("Guardar");
        Bot_guardar.setOpaque(true);
        Bot_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bot_guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bot_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bot_guardarMouseExited(evt);
            }
        });
        Menu.add(Bot_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 100, 40));

        T_cerrar.setBackground(new java.awt.Color(23, 9, 32));
        T_cerrar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        T_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        T_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_cerrar.setText("X");
        T_cerrar.setOpaque(true);
        T_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                T_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                T_cerrarMouseExited(evt);
            }
        });
        Menu.add(T_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 40, 40));

        T_min.setBackground(new java.awt.Color(23, 9, 32));
        T_min.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        T_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar.png"))); // NOI18N
        T_min.setText("jLabel2");
        T_min.setOpaque(true);
        T_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                T_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                T_minMouseExited(evt);
            }
        });
        Menu.add(T_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 0, 40, 40));

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 990, 40));

        Text_area.setBackground(new java.awt.Color(23, 9, 32));
        Text_area.setColumns(20);
        Text_area.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Text_area.setForeground(new java.awt.Color(94, 231, 205));
        Text_area.setLineWrap(true);
        Text_area.setRows(5);
        Text_area.setBorder(null);
        Text_area.setCaretColor(new java.awt.Color(94, 209, 211));
        Text_area.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Text_area.setDisabledTextColor(new java.awt.Color(51, 255, 102));
        jScrollPane5.setViewportView(Text_area);

        javax.swing.GroupLayout Panel_textLayout = new javax.swing.GroupLayout(Panel_text);
        Panel_text.setLayout(Panel_textLayout);
        Panel_textLayout.setHorizontalGroup(
            Panel_textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        Panel_textLayout.setVerticalGroup(
            Panel_textLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        jPanel1.add(Panel_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 370, 430));

        Panel_consola.setBackground(new java.awt.Color(23, 9, 32));
        Panel_consola.setAutoscrolls(true);
        Panel_consola.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_consola.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_consola.setEditable(false);
        text_consola.setBackground(new java.awt.Color(23, 9, 32));
        text_consola.setColumns(20);
        text_consola.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        text_consola.setForeground(new java.awt.Color(94, 231, 205));
        text_consola.setLineWrap(true);
        text_consola.setRows(5);
        text_consola.setBorder(null);
        jScrollPane1.setViewportView(text_consola);

        Panel_consola.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 110));

        jPanel1.add(Panel_consola, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 990, 110));

        Panel_archivos.setBackground(new java.awt.Color(23, 9, 32));
        Panel_archivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_arbol.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        Label_arbol.setForeground(new java.awt.Color(94, 231, 205));
        Label_arbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_arbol.setText("Árboles");
        Panel_archivos.add(Label_arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        Label_siguiente.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        Label_siguiente.setForeground(new java.awt.Color(94, 231, 205));
        Label_siguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_siguiente.setText("Tabla de siguientes");
        Panel_archivos.add(Label_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 30));

        Label_automata.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        Label_automata.setForeground(new java.awt.Color(94, 231, 205));
        Label_automata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_automata.setText("Automatas");
        Panel_archivos.add(Label_automata, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 180, 30));

        Label_transicion.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        Label_transicion.setForeground(new java.awt.Color(94, 231, 205));
        Label_transicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_transicion.setText("Tabla de transiciones");
        Panel_archivos.add(Label_transicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 180, 30));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        a_automata.setEditable(false);
        a_automata.setBackground(new java.awt.Color(100, 91, 110));
        a_automata.setColumns(14);
        a_automata.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        a_automata.setForeground(new java.awt.Color(255, 255, 255));
        a_automata.setRows(4);
        a_automata.setCaretColor(new java.awt.Color(100, 91, 110));
        jScrollPane2.setViewportView(a_automata);

        Panel_archivos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 180, 90));

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane9.setOpaque(false);

        a_siguiente.setEditable(false);
        a_siguiente.setBackground(new java.awt.Color(100, 91, 110));
        a_siguiente.setColumns(14);
        a_siguiente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        a_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        a_siguiente.setRows(4);
        a_siguiente.setCaretColor(new java.awt.Color(100, 91, 110));
        jScrollPane9.setViewportView(a_siguiente);

        Panel_archivos.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 90));

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane10.setOpaque(false);

        a_transacc.setEditable(false);
        a_transacc.setBackground(new java.awt.Color(100, 91, 110));
        a_transacc.setColumns(14);
        a_transacc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        a_transacc.setForeground(new java.awt.Color(255, 255, 255));
        a_transacc.setRows(4);
        a_transacc.setCaretColor(new java.awt.Color(100, 91, 110));
        jScrollPane10.setViewportView(a_transacc);

        Panel_archivos.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 180, 90));

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane11.setOpaque(false);

        a_arboles.setEditable(false);
        a_arboles.setBackground(new java.awt.Color(100, 91, 110));
        a_arboles.setColumns(14);
        a_arboles.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        a_arboles.setForeground(new java.awt.Color(255, 255, 255));
        a_arboles.setRows(4);
        a_arboles.setCaretColor(new java.awt.Color(100, 91, 110));
        jScrollPane11.setViewportView(a_arboles);

        Panel_archivos.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 90));

        jPanel1.add(Panel_archivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 180, 480));

        Panel_visualizador.setBackground(new java.awt.Color(23, 9, 32));
        Panel_visualizador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setFocusable(false);
        jScrollPane3.setOpaque(false);

        lab_img.setEditable(false);
        lab_img.setBackground(new java.awt.Color(23, 9, 32));
        lab_img.setBorder(null);
        lab_img.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(lab_img);

        Panel_visualizador.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 410));

        jPanel1.add(Panel_visualizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 380, 410));

        Box_opciones.setBackground(new java.awt.Color(0, 153, 153));
        Box_opciones.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        Box_opciones.setForeground(new java.awt.Color(19, 11, 28));
        Box_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver imagenes", "Árboles", "Siguientes", "Transiciones", "Automatas AFD", "Automatas AFND" }));
        Box_opciones.setBorder(null);
        Box_opciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Box_opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_opcionesActionPerformed(evt);
            }
        });
        jPanel1.add(Box_opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 380, 30));

        Bot_analizar.setBackground(new java.awt.Color(94, 231, 205));
        Bot_analizar.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        Bot_analizar.setForeground(new java.awt.Color(19, 11, 28));
        Bot_analizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bot_analizar.setText("Analizar Entrada");
        Bot_analizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Bot_analizar.setOpaque(true);
        Bot_analizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bot_analizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bot_analizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bot_analizarMouseExited(evt);
            }
        });
        jPanel1.add(Bot_analizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 170, 30));

        Bot_generar.setBackground(new java.awt.Color(94, 231, 205));
        Bot_generar.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        Bot_generar.setForeground(new java.awt.Color(19, 11, 28));
        Bot_generar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bot_generar.setText("Generar Automata");
        Bot_generar.setOpaque(true);
        Bot_generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bot_generarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bot_generarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bot_generarMouseExited(evt);
            }
        });
        jPanel1.add(Bot_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 170, 30));

        Bot_siguiente.setBackground(new java.awt.Color(94, 231, 205));
        Bot_siguiente.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        Bot_siguiente.setForeground(new java.awt.Color(19, 11, 28));
        Bot_siguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bot_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_sig.png"))); // NOI18N
        Bot_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bot_siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bot_siguienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bot_siguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bot_siguienteMouseExited(evt);
            }
        });
        jPanel1.add(Bot_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 40, 30));

        Bot_anterior.setBackground(new java.awt.Color(94, 231, 205));
        Bot_anterior.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        Bot_anterior.setForeground(new java.awt.Color(19, 11, 28));
        Bot_anterior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bot_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_anterior.png"))); // NOI18N
        Bot_anterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bot_anterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bot_anteriorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bot_anteriorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bot_anteriorMouseExited(evt);
            }
        });
        jPanel1.add(Bot_anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 40, 30));

        Title.setFont(new java.awt.Font("Roboto Medium", 3, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("ExRegan   Usac");
        Title.setToolTipText("");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 990, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void carpetas(){
        a_arboles.setText("");
        a_siguiente.setText("");
        a_transacc.setText("");
        a_automata.setText("");
        a_arboles.setText(mostrararchivos("./REPORTES/ARBOLES_202100953"));
        a_siguiente.setText(mostrararchivos("./REPORTES/SIGUIENTES_202100953"));
        a_transacc.setText(mostrararchivos("./REPORTES/TRANSICIONES_202100953"));
        String automata = mostrararchivos("./REPORTES/AFD_202100953")+ mostrararchivos("./REPORTES/AFND_202100953");
        a_automata.setText(automata);
    }
   
    public  String mostrararchivos(String ruta){
        String[] contenido = new File(ruta).list();
        Arrays.sort(contenido);
        String archivos = "";
        for (String archivo:contenido){
            archivos+=archivo+"\n";
        }
       return archivos;
    }
    
    private void T_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_cerrarMouseClicked
        System.exit(0); 
    }//GEN-LAST:event_T_cerrarMouseClicked

    private void T_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_cerrarMouseEntered
        T_cerrar.setBackground(Color.red);
    }//GEN-LAST:event_T_cerrarMouseEntered

    private void T_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_cerrarMouseExited
        T_cerrar.setBackground(new java.awt.Color(23,9,32));
    }//GEN-LAST:event_T_cerrarMouseExited

    private void T_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_T_minMouseClicked

    private void T_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minMouseEntered
        T_min.setBackground(Color.orange);
    }//GEN-LAST:event_T_minMouseEntered

    private void T_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_minMouseExited
        T_min.setBackground(new java.awt.Color(23,9,32));
    }//GEN-LAST:event_T_minMouseExited

    private void MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMousePressed
        xmouse =evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_MenuMousePressed

    private void MenuMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x -xmouse, y - ymouse);
    }//GEN-LAST:event_MenuMouseDragged

    private void Bot_nuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_nuevoMouseEntered
        Bot_nuevo.setBackground(new java.awt.Color(94,209,211));
        Bot_nuevo.setForeground(new java.awt.Color(19,11,28));
    }//GEN-LAST:event_Bot_nuevoMouseEntered

    private void Bot_nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_nuevoMouseClicked
        Text_area.setText("");
        archivo=null;
    }//GEN-LAST:event_Bot_nuevoMouseClicked

    private void Bot_nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_nuevoMouseExited
        Bot_nuevo.setBackground(new java.awt.Color(23,9,32));
        Bot_nuevo.setForeground(Color.white);
    }//GEN-LAST:event_Bot_nuevoMouseExited

    private void Bot_abrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_abrirMouseClicked
       
        javax.swing.JFileChooser nav = new javax.swing.JFileChooser();
        javax.swing.filechooser.FileNameExtensionFilter extencion =new javax.swing.filechooser.FileNameExtensionFilter("Archivos OLC","olc");
        
        nav.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);
        nav.setFileFilter(extencion);
        
        int seleccion = nav.showOpenDialog(this);
        if (seleccion == javax.swing.JFileChooser.APPROVE_OPTION){
            archivo =nav.getSelectedFile();
            try {
                java.util.Scanner leer_archivo = new java.util.Scanner(archivo);
                while(leer_archivo.hasNext()){
                Text_area.insert(leer_archivo.nextLine() +"\n",Text_area.getText().length());
                }
            } catch (java.io.FileNotFoundException ex) {
                Logger.getLogger(principal_interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_Bot_abrirMouseClicked

    private void Bot_abrirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_abrirMouseEntered
        Bot_abrir.setBackground(new java.awt.Color(94,209,211));
        Bot_abrir.setForeground(new java.awt.Color(19,11,28));
    }//GEN-LAST:event_Bot_abrirMouseEntered

    private void Bot_abrirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_abrirMouseExited
        Bot_abrir.setBackground(new java.awt.Color(23,9,32));
        Bot_abrir.setForeground(Color.white);
    }//GEN-LAST:event_Bot_abrirMouseExited

    private void Bot_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_guardarMouseClicked
       
       try {
           String contenido = Text_area.getText();
           
            if (archivo==null){
                int opcion =javax.swing.JOptionPane.showConfirmDialog(null,"El archivo no existe, ¿desea crear uno nuevo?","Guardar",javax.swing.JOptionPane.YES_NO_OPTION);
                    if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                        this.Bot_guardar_cMouseClicked(evt);
                    } 
            }else{
                java.io.File archivo_guardar = new java.io.File(archivo.getAbsolutePath());
                java.io.FileWriter cambios =new java.io.FileWriter(archivo_guardar);
                java.io.BufferedWriter b = new java.io.BufferedWriter(cambios);
                b.write(contenido);
                b.close();
                javax.swing.JOptionPane.showMessageDialog(null,"Se guardaron los cambios correctamente",
                         "Guardar",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                 }
          
       } catch (Exception e) {
           e.printStackTrace();
           javax.swing.JOptionPane.showMessageDialog(null,"No se ha podido guardar los cambios",
                    "Guardar",javax.swing.JOptionPane.ERROR_MESSAGE);
       }
       
    }//GEN-LAST:event_Bot_guardarMouseClicked

    private void Bot_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_guardarMouseEntered
        Bot_guardar.setBackground(new java.awt.Color(94,209,211));
        Bot_guardar.setForeground(new java.awt.Color(19,11,28));
    }//GEN-LAST:event_Bot_guardarMouseEntered

    private void Bot_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_guardarMouseExited
        Bot_guardar.setBackground(new java.awt.Color(23,9,32));
        Bot_guardar.setForeground(Color.white);
    }//GEN-LAST:event_Bot_guardarMouseExited

    private void Bot_guardar_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_guardar_cMouseClicked
        javax.swing.JFileChooser nav = new javax.swing.JFileChooser();
        javax.swing.filechooser.FileNameExtensionFilter extencion =new javax.swing.filechooser.FileNameExtensionFilter("Archivos OLC","olc");
        nav.setFileFilter(extencion);
        nav.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        
        int seleccion = nav.showSaveDialog(this);
        if (seleccion == javax.swing.JFileChooser.APPROVE_OPTION){
            try {
                archivo =nav.getSelectedFile();
                String contenido = Text_area.getText();
                java.io.File archivo_guardar = new java.io.File(archivo.getAbsolutePath());
                if (!archivo_guardar.exists()){
                    archivo_guardar.createNewFile();
                    java.io.FileWriter cambios =new java.io.FileWriter(archivo_guardar);
                    java.io.BufferedWriter b = new java.io.BufferedWriter(cambios);
                    b.write(contenido);
                    b.close();
                    
                    if(!archivo.getAbsolutePath().endsWith(".olc")){
                        javax.swing.JOptionPane.showMessageDialog(null,"No se ha podido guardar el archivo,\nPorfavor, coloque la extension del archivo y vuelva a intentarlo",
                         "Guardar como",javax.swing.JOptionPane.WARNING_MESSAGE);
                        this.Bot_guardar_cMouseClicked(evt);
                        
                    }else{
                          javax.swing.JOptionPane.showMessageDialog(null,"Se guardo el archivo correctamente",
                             "Guardar como",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    }
                   
                   
                }else{
                    int opcion =javax.swing.JOptionPane.showConfirmDialog(null,"El archivo ya existe.\n¿desea guardar los cambios en el archivo existente?","Guardar como",javax.swing.JOptionPane.YES_NO_OPTION);
                    if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                        this.Bot_guardarMouseClicked(evt);
                    } 
                }
               
            } catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(null,"No se ha podido guardar el archivo",
                         "Guardar como",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Bot_guardar_cMouseClicked

    private void Bot_guardar_cMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_guardar_cMouseEntered
        Bot_guardar_c.setBackground(new java.awt.Color(94,209,211));
        Bot_guardar_c.setForeground(new java.awt.Color(19,11,28));
    }//GEN-LAST:event_Bot_guardar_cMouseEntered

    private void Bot_guardar_cMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_guardar_cMouseExited
        Bot_guardar_c.setBackground(new java.awt.Color(23,9,32));
        Bot_guardar_c.setForeground(Color.white);
    }//GEN-LAST:event_Bot_guardar_cMouseExited

    private void Bot_analizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_analizarMouseClicked
        
    if (eventg==1){    
        String contenido="";
        String valido="Cadena Válida";
        System.out.println("%%%%%%%%%%%%%%%%%%%% ANALISIS DE CADENA %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for(int i=0; i<lexema.size()-1;i+=2){
            ArrayList afda =new ArrayList();
            ArrayList conj =new ArrayList();
            System.out.println("");
            System.out.println(lexema.get(i));
            int cont=0;
            for(int j=0; j<automata.size()-1;j+=2){ 
                if(lexema.get(i).equals(automata.get(j))){
                    cont+=1;
                   afda=(ArrayList) automata.get(j+1);
                }
            }    
                for(int ex=0; ex<expresion.size()-1;ex+=2){
                    if(lexema.get(i).equals(expresion.get(ex))){
                        for(int k=0; k<conjuntos.size()-1;k+=2){
                            Pattern pattern = Pattern.compile(conjuntos.get(k));
                            Matcher matcher = pattern.matcher(expresion.get(ex+1));
                            boolean matchFound = matcher.find();
                            if(matchFound) {
                               conj.add(conjuntos.get(k));
                               conj.add(conjuntos.get(k+1));
                            } 
                        }
                       
                     }       
                }
                
            
            if(cont==0){
                int opcion =javax.swing.JOptionPane.showConfirmDialog(null,"El automata para "+lexema.get(i)+" no ha sido creado.\n¿Desea continuar con el analisis?",
                         "ExRegan",javax.swing.JOptionPane.YES_NO_OPTION);
                
                if (opcion == javax.swing.JOptionPane.NO_OPTION) {
                        break;
                } 
            }else{
                //Analisislex(lexema.get(i+1),conj, lexema.get(i));
                AnalisisSin(lexema.get(i+1),afda,conj,lexema.get(i));
                if (!Erroreslex.isEmpty()){
                     valido="Cadena No Válida";
                    try { 
                        generarHTML(Erroreslex, 0,lexema.get(i) );
                    } catch (IOException ex) {
                        Logger.getLogger(principal_interface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    mconsola+="La expresión: \""+lexema.get(i+1)+"\" es válida con la expresión Regular "+lexema.get(i)+".\n";
                    this.text_consola.setText("");
                    this.text_consola.setText(mconsola);
                }
                contenido+="   {\n"+
"   \"Valor\":\""+lexema.get(i+1)+"\",\n"+
"   \"ExpresionRegular\":\""+lexema.get(i)+"\",\n"+
"   \"Resultado\":\""+valido+"\"\n"+
"   }";
                if (i<lexema.size()-2){
                    contenido+=",\n";
                }    
            }
        }
        GenerarJson(contenido);
        eventg=0;
    }
    
    }//GEN-LAST:event_Bot_analizarMouseClicked

    private void Bot_analizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_analizarMouseEntered
        Bot_analizar.setBackground(new java.awt.Color(13,183,205));
        Bot_analizar.setForeground(Color.WHITE);
        carpetas();
    }//GEN-LAST:event_Bot_analizarMouseEntered

    private void Bot_analizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_analizarMouseExited
        Bot_analizar.setBackground(new java.awt.Color(94,231,205));
        Bot_analizar.setForeground(new java.awt.Color(19,11,28));
        carpetas();
    }//GEN-LAST:event_Bot_analizarMouseExited

    private void Bot_generarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_generarMouseClicked
        
        if (archivo.getAbsolutePath()!=null){
            Analizadores.Lexico scanner;
            Analizadores.Sintactico parse;
            ArrayList<Excepcion> errores = new ArrayList();

            try {

                    scanner = new Lexico(new BufferedReader(new StringReader(Text_area.getText())));
                    parse = new Sintactico(scanner);
                    parse.parse();
                    errores.addAll(scanner.Errores);
                    errores.addAll(parse.getErrores());

                    //se llaman metodos para generar errores, arboles, tabla siguientes
                    //transisiones, afd, afnd y recargar carpetas

                    if (errores.size()!=0){
                       generarHTML(errores, 1, null); 

                    }else{
                        conjuntos = parse.conjuntos;
                        expresion = parse.expresion;
                        lexema = parse.lexema;
                        filalex = parse.filas;
                        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                        System.out.println(parse.expresion.get(1));
                        for(int k=0; k<expresion.size()-1;k+=2){
                            gen_arbol(expresion.get(k),expresion.get(k+1));
                        }
                    }

                    carpetas();
                    /*
                    String result = "";
                    for (int i = 0; i < parse.conjuntos.size(); i++) {
                       result += parse.conjuntos.get(i) + "\n";
                    }
                      for (int i = 0; i < parse.expresion.size(); i++) {
                       result += parse.expresion.get(i) + "\n";
                     }
                     for (int i = 0; i < parse.lexema.size(); i++) {
                       result += parse.lexema.get(i) + "\n";
                     }
                    this.text_consola.setText(result);*/

                eventg=1;
            } catch (Exception ex) {
               Logger.getLogger(principal_interface.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Error fatal en compilación de entrada.");
            } 
            
        }else{
            javax.swing.JOptionPane.showMessageDialog(null,"No se ha guardado el archivo",
                         "ExRegan",javax.swing.JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_Bot_generarMouseClicked

    private void Bot_generarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_generarMouseExited
        Bot_generar.setBackground(new java.awt.Color(94,231,205));
        Bot_generar.setForeground(new java.awt.Color(19,11,28));
         carpetas();
       
    }//GEN-LAST:event_Bot_generarMouseExited

    private void Bot_generarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_generarMouseEntered
        Bot_generar.setBackground(new java.awt.Color(13,183,205));
        Bot_generar.setForeground(Color.WHITE);
        carpetas();
    }//GEN-LAST:event_Bot_generarMouseEntered

    private void Bot_anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_anteriorMouseClicked
        
        if (visualizar>0){
            visualizar-=1;
        }
        if (img !=null){
        icon = new ImageIcon(img[visualizar].getImage());
        lab_img.setText("");
        lab_img.insertIcon(icon);
        
        lab_img.repaint();
        }
    }//GEN-LAST:event_Bot_anteriorMouseClicked

    private void Bot_anteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_anteriorMouseEntered
        Bot_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_ant_press.png"))); 
    }//GEN-LAST:event_Bot_anteriorMouseEntered

    private void Bot_anteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_anteriorMouseExited
         Bot_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_anterior.png")));
    }//GEN-LAST:event_Bot_anteriorMouseExited

    private void Bot_siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_siguienteMouseClicked
        
        if (visualizar<mayor-1){
            
            visualizar+=1;
        }
        if (img !=null){
        icon = new ImageIcon(img[visualizar].getImage());
        lab_img.setText("");
        lab_img.insertIcon(icon);
        lab_img.repaint();
        }
    }//GEN-LAST:event_Bot_siguienteMouseClicked

    private void Bot_siguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_siguienteMouseEntered
        Bot_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_sig_press.png"))); 
    }//GEN-LAST:event_Bot_siguienteMouseEntered

    private void Bot_siguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_siguienteMouseExited
        Bot_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_sig.png")));
    }//GEN-LAST:event_Bot_siguienteMouseExited

    private void Box_opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_opcionesActionPerformed
        File carpeta;
        File[] lista;
        java.io.FileFilter archivosFilter = new java.io.FileFilter() {
            //Sobreescribimos el método
            public boolean accept(File file) {
                if (file.getName().endsWith(".png")) {
                    return true;
                }
                return false;
            }
        };
        if (Box_opciones.getSelectedIndex()>0){
            if (Box_opciones.getSelectedIndex()==1){
                carpeta = new File("./REPORTES/ARBOLES_202100953");
                 visualizar=0;
                lista = carpeta.listFiles(archivosFilter);
                mayor = lista.length;
                
                if (lista.length>0){
                    img= new javax.swing.ImageIcon[lista.length];
                    cargarimagen(lista); 
                    icon = new ImageIcon(img[visualizar].getImage());
                    lab_img.setText("");
                    lab_img.insertIcon(icon);
                    lab_img.repaint();
                }else{
                    lab_img.setText("");
                     borrarimagen();
                }
            }
             if (Box_opciones.getSelectedIndex()==2){
                carpeta = new File("./REPORTES/SIGUIENTES_202100953");
               
                lista = carpeta.listFiles(archivosFilter);
                 mayor = lista.length;
                 visualizar=0;
                if (lista.length>0){
                    img= new javax.swing.ImageIcon[lista.length];
                    cargarimagen(lista); 
                    icon = new ImageIcon(img[visualizar].getImage());
                    lab_img.setText("");
                    lab_img.insertIcon(icon);
                    lab_img.repaint();
                }else{
                    lab_img.setText("");
                     borrarimagen();
                }
            }
              if (Box_opciones.getSelectedIndex()==3){
                carpeta = new File("./REPORTES/TRANSICIONES_202100953");
                visualizar=0;
                lista = carpeta.listFiles(archivosFilter);
                 mayor = lista.length;
                if (lista.length>0){
                    img= new javax.swing.ImageIcon[lista.length];
                    cargarimagen(lista); 
                    icon = new ImageIcon(img[visualizar].getImage());
                     lab_img.setText("");
                    lab_img.insertIcon(icon);
                    lab_img.repaint();
                }else{
                    lab_img.setText("");
                     borrarimagen();
                }
            }
               if (Box_opciones.getSelectedIndex()==4){
                carpeta = new File("./REPORTES/AFD_202100953");
                visualizar=0;
                lista = carpeta.listFiles(archivosFilter);
                 mayor = lista.length;
                if (lista.length>0){
                    img= new javax.swing.ImageIcon[lista.length];
                    cargarimagen(lista); 
                    icon = new ImageIcon(img[visualizar].getImage());
                     lab_img.setText("");
                    lab_img.insertIcon(icon);
                    lab_img.repaint();
                }else{
                    lab_img.setText("");
                     borrarimagen();
                }
            }
               if (Box_opciones.getSelectedIndex()==5){
                carpeta = new File("./REPORTES/AFND_202100953");
                visualizar=0;
                lista = carpeta.listFiles(archivosFilter);
                mayor = lista.length;
                if (lista.length>0){
                    img= new javax.swing.ImageIcon[lista.length];
                    cargarimagen(lista); 
                    icon = new ImageIcon(img[visualizar].getImage());
                     lab_img.setText("");
                    lab_img.insertIcon(icon);
                    lab_img.repaint();
                }else{
                    lab_img.setText("");
                     borrarimagen();
                }
            }
        }else{
              
              lab_img.setText("");
              borrarimagen();
        }
    }//GEN-LAST:event_Box_opcionesActionPerformed

    public void borrarimagen(){

        try{
            if (img !=null){
            for (int i=0;i<img.length;i++){
            img[i]= new javax.swing.ImageIcon("");
             }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
    }
    
    public void cargarimagen(File[] listaimag){
        int cont=0;
        try{
            if (img !=null){
            for (File imagen:listaimag){
            img[cont]= new javax.swing.ImageIcon(imagen.getAbsolutePath());
            cont+=1;
             }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
       
        
    }
   
    public  void gen_arbol(String id, String er){
        //String er = "+|ab"; 
        System.out.println("");
        System.out.println("");
        System.out.println("");
        ArrayList<nodo> listhojas = new ArrayList();
        ArrayList<ArrayList> tablas = new ArrayList();
        er = "." + er + "#";
        System.out.println(er);
        Arbol arbol = new Arbol(er,id, listhojas, tablas); 
        nodo raiz = arbol.getRoot();
        
       
        raiz.follow();
        
        
        System.out.println("==============================TABLA SIGUIENTES==============================");
        TablaSiguientes ft = new TablaSiguientes();
        ft.printTable(tablas,id);
        TablaTransiciones tran = new TablaTransiciones(raiz, tablas, listhojas); // bug
        System.out.println("=============================TABLA TRANSICIONES=============================");
        tran.impTable(id);
        System.out.println("============================= GRAPHVIZ===============================================");
        automata.add(id);
        automata.add(tran.impAFD(id));
    }
    
    public void Analisislex(String exp,ArrayList conj,String idex){
        String cadenaev="";
        for(int i=0; i<conj.size()-1;i+=2){
            String conj1 =(String) conj.get(i+1);
            System.out.println(conj1);
            conj1 = conj1.replace("~","-").replace(",","|");
            
            if (i==conj.size()-2){
                cadenaev+=conj1;
                System.out.println(cadenaev);
            }else{
                cadenaev+=conj1+"|";
            }
            
        }
        
        for (int i=0; i<filalex.size()-1;i+=2){
            if (filalex.get(i).equals(idex)){
                filaer=(int) filalex.get(i+1);
            }
        }
        
        String[] lisexp = exp.split("");
        
        //String tipo, String descripcion, String linea, String columna
        int colum =0;
        try {
           String ex ="^["+cadenaev+"]+$";
           
           System.out.println("entra "+cadenaev);
           for (String item:lisexp){
               colum+=1;
               System.out.println("entra "+item);
               boolean foundMatch =item.matches(ex);
               System.out.println("entra");
               System.out.println(exp+" -> "+foundMatch +"-> "+ ex);
               if (!foundMatch){
                   Erroreslex.add(new Excepcion("Lexico", "Error de lexico detectado. Se detectó: " + item, filaer + "", colum + ""));
               }
           }
           
        } catch (PatternSyntaxException ex) {
               System.out.println("error");         
        }
    }
    
    public void AnalisisSin(String exp,ArrayList afdc,ArrayList conj, String idex){
        
        Erroreslex.clear();
        String estado_actual="X0";
        transiciones tr = (transiciones) afdc.get(afdc.size()-1);
        String estado_final= tr.finalS;
        
        for (int i=0; i<filalex.size()-1;i+=2){
            if (filalex.get(i).equals(idex)){
                filaer=(int) filalex.get(i+1);
            }
        }
        
        String[] lisexp = exp.split("");
        int colum =0;
        
        //do{
        try { 
            for (String item:lisexp){
                colum+=1;
                int cont=0;
                String temp=estado_actual;
                System.out.println("");
                System.out.println("item: "+item);
                for(int i=0; i<afdc.size();i++){
                    String conjev="";
                    transiciones t = (transiciones) afdc.get(i);
                    if (t.initial.equals(estado_actual)){
                        System.out.println("transicion g:"+t.transition);
                        System.out.println("trans inical: "+t.initial +" actual: "+estado_actual);
                        for(int j=0; j<conj.size()-1;j+=2){
                             if (t.transition.equals(conj.get(j))){
                                 String conj1 =(String) conj.get(j+1);
                                 System.out.println("conjunto: "+conj1);
                                 conjev+=conj1.replace("~","-").replace(",","|");
                             }
                        }
                        
                        if (("".equals(conjev))){
                        conjev=t.transition;
                        }
                        System.out.println("conjunto def : "+conjev);
                        String ex ="^["+conjev+"]+$";
                        boolean foundMatch =item.matches(ex);
                        System.out.println("RESULTADO MAT: "+item+" -> "+foundMatch +"-> "+ ex);
                        if (foundMatch){
                            estado_actual=t.finalS;
                            System.out.println("ENCONTRADO: "+t.initial+" -> "+ t.transition+"-> "+ t.finalS);
                            cont=0;
                            break;
                        }else{
                            cont+=1;
                        } 
                        
                    } 
                }
                if (cont>0){
                    System.out.println("se ingreso un error");
                    Erroreslex.add(new Excepcion("Sintactico", "Error de sintactico detectado. Se detectó: " + item, filaer + "", colum + ""));
                }
            }
        }catch (PatternSyntaxException ex) {
            System.out.println("error");         
        }
         //}while(estado_actual.equals(estado_final));
        
    
        
    }
    
    public void GenerarJson(String cadena){
        String contenido="[\n"+cadena+"\n]";
        FileWriter fichero = null;
        PrintWriter escritor = null;
        String archname = archivo.getName();
        archname =archname.replace(".olc","");
        try{
            fichero = new FileWriter("./REPORTES/SALIDAS_202100953/"+archname+".json");
            escritor = new PrintWriter(fichero);
            escritor.println(contenido);
            escritor.close();
            fichero.close();
            System.out.println("");
            System.out.println("JSON generado");
        } catch (Exception e) {
            System.out.println("error en generar json");
            e.printStackTrace();
        }
    }
    
    public static void generarHTML(ArrayList<Excepcion> errores, Integer opcion,String name) throws IOException {
        FileWriter fichero = null;
        PrintWriter pw = null;
        String report ="";
        if (opcion == 1){
            report ="lenguaje";
        }else{
            report ="lexema_"+name;
        }
        try {
            
            String path = "./REPORTES/ERRORES_202100953/Reporte_errores_"+report+".html";
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);
            
            //Comenzamos a escribir el html
            String contenido ="<!doctype html>\n" +
"<html lang=\"es\">\n" +
"\n" +
"<head>\n" +
"\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <title> REPORTE DE ERRORES </title>\n" +
"  \n" +
"  <style>\n" +
"    * {\n" +
"      margin: 0;\n" +
"      padding: 0;\n" +
"      box-sizing: border-box;\n" +
"      }\n" +
"\n" +
"      body{\n" +
"      font-family: Arial;\n" +
"      background: #f2f2f2;\n" +
"      }\n" +
"\n" +
"      .contenedor{\n" +
"      padding: 60px 0;\n" +
"      width: 95%\n" +
"      max-width: 1000px\n" +
"      margin: auto;\n" +
"      overflow: hidden;\n" +
"      }    \n" +
"\n" +
"      .titulo{\n" +
"      color: #191654;\n" +
"      font-size: 50px;\n" +
"      text-align: center;\n" +
"      margin-bottom: 50px;\n" +
"      } \n" +
"  \n" +
"      header{\n" +
"      width:100%;\n" +
"      height: 250px;\n" +
"      background: hsla(168,53%,51%); \n" +
"      background: -webkit-linear-gradient(to right, hsla(242,58%,20%), hsla(168,53%,51%));  /* Chrome 10      -25, Safari 5.1-6 */\n" +
"      background: linear-gradient(to right, hsla(242,58%,20%),hsla(168,53%,51%)), url(imagen/portada.jpg); /* W3C, IE 10+/ Edge,Firefox 16+, Chrome 26+,                      Opera 12+, Safari 7+ */\n" +
"      background-size: cover;\n" +
"      background-attachment: fixed;\n" +
"      position: relative;\n" +
"      }  \n" +
"     \n" +
"      header .textos-header{\n" +
"      display: flex;\n" +
"      height: 430px;\n" +
"      width: 100%;\n" +
"      align-items: center;\n" +
"      flex-direction: column;\n" +
"      text-align: center;\n" +
"      }\n" +
"      \n" +
"      .textos-header h1 {\n" +
"         font-size: 50px;\n" +
"         color: white;\n" +
"      }\n" +
"\n" +
"      .textos-header h2 {\n" +
"         font-size: 30px;\n" +
"         font-weight:300;\n" +
"         color: white;\n" +
"      }\n" +
"\n" +
"      .wave{\n" +
"      position: absolute;\n" +
"      bottom: 0;\n" +
"      width: 100%;\n" +
"      }\n" +
"\n" +
"      #main-container{\n" +
"      margin:60px auto;\n" +
"      width:900px;\n" +
"      } \n" +
"  \n" +
"      table{\n" +
"      background-color: white;\n" +
"      border-collapse: collapse;\n" +
"      width: 100%;\n" +
"      }\n" +
"      \n" +
"      th, td{\n" +
"      padding: 15px;\n" +
"      }\n" +
"\n" +
"      thead{\n" +
"      background-color: #001b48;\n" +
"      border-bottom: solid 5px #f2f2f2;\n" +
"      color: white;\n" +
"      }\n" +
"     \n" +
"     tr:nth-child(even){\n" +
"     background-color: #dde8f0;\n" +
"     }\n" +
" \n" +
"     tr:hover td{\n" +
"     background-color: #004581;\n" +
"     color: white;\n" +
"     }  \n" +
"\n" +
"  </style>\n" +
"\n" +
"</head>\n" +
"\n" +
"<body> \n" +
"\n" +
" <header>\n" +
"    <section class=\"textos-header\">\n" +
"       <br>\n" +
"       <br>\n" +
"       <h1> REPORTE DE ERRORES </h1>\n" +
"       <div class=\"wave\" style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\"><path            d=\"M-11.00,130.77 C207.38,132.73 264.95,80.44 499.15,126.81 L500.00,150.00 L0.00,150.00 Z\" style=\"stroke: none; fill: #f2f2f2;\"></path></svg></div>\n" +
"    </section>\n" +
"  </header>\n" +
"<br>\n" +
"  <main>\n" +
"    <section>\n" +
"      <div class=\"contenedor errores\">\n" +
"                  <h2 class=\"titulo\"> Errores de "+report+"</h2>\n" +
"        <div class=\"errores\" id=\"main-container\">\n" +
"          <table>\n" +
"            <thead>\n" +
"               <tr>\n" +
"                  <th>Error</th><th>Descripción</th><th>Fila</th><th>Columna</th>\n" +
"               </tr>\n" +
"            </thead>";
            
           

            for (Excepcion err : errores) {
                
                contenido+="            <tr>   \n" +
"                  <td><b>" + err.tipo + "</b></td><td>" + err.descripcion + "</td><td>" + err.linea + "</td><td>" + err.columna + "</td>\n" +
"            </tr>";
                
            }
            
            contenido +="          </table>\n" +
"        </div>\n" +
"      </div>\n" +
"    </section>\n" +
"  </main>\n" +
"\n" +
"</body>\n" +
"\n" +
"</html>";


            pw.println(contenido);
            //if (opcion==1){
                Desktop.getDesktop().open(new File(path));
            //}
            
            
            
        } catch (Exception e) {
        } finally {
            if (null != fichero) {
                fichero.close();
            }
        }
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(principal_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(principal_interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(principal_interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(principal_interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(principal_interface.class.getName()).log(Level.SEVERE, null, ex);
                }
                new principal_interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bot_abrir;
    private javax.swing.JLabel Bot_analizar;
    private javax.swing.JLabel Bot_anterior;
    private javax.swing.JLabel Bot_generar;
    private javax.swing.JLabel Bot_guardar;
    private javax.swing.JLabel Bot_guardar_c;
    private javax.swing.JLabel Bot_nuevo;
    private javax.swing.JLabel Bot_siguiente;
    private javax.swing.JComboBox<String> Box_opciones;
    private javax.swing.JLabel Label_arbol;
    private javax.swing.JLabel Label_automata;
    private javax.swing.JLabel Label_siguiente;
    private javax.swing.JLabel Label_transicion;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Panel_archivos;
    private javax.swing.JPanel Panel_consola;
    private javax.swing.JPanel Panel_text;
    private javax.swing.JPanel Panel_visualizador;
    private javax.swing.JLabel T_cerrar;
    private javax.swing.JLabel T_min;
    private javax.swing.JTextArea Text_area;
    private javax.swing.JLabel Title;
    private javax.swing.JTextArea a_arboles;
    private javax.swing.JTextArea a_automata;
    private javax.swing.JTextArea a_siguiente;
    private javax.swing.JTextArea a_transacc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane lab_img;
    private javax.swing.JTextArea text_consola;
    // End of variables declaration//GEN-END:variables
}
