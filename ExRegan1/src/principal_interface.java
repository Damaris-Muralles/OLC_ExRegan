
import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class principal_interface extends javax.swing.JFrame {
   java.io.File archivo;
   int xmouse, ymouse;
    public principal_interface() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        Label_consola = new javax.swing.JLabel();
        Panel_archivos = new javax.swing.JPanel();
        Panel_arbol = new javax.swing.JPanel();
        todos_arboles = new javax.swing.JLabel();
        Panel_sig = new javax.swing.JPanel();
        todos_siguiente = new javax.swing.JLabel();
        Panel_trans = new javax.swing.JPanel();
        todos_transicion = new javax.swing.JLabel();
        Panel_automata = new javax.swing.JPanel();
        todos_automatas = new javax.swing.JLabel();
        Label_arbol = new javax.swing.JLabel();
        Label_siguiente = new javax.swing.JLabel();
        Label_automata = new javax.swing.JLabel();
        Label_transicion = new javax.swing.JLabel();
        Panel_visualizador = new javax.swing.JPanel();
        Label_visualizador = new javax.swing.JLabel();
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
        Text_area.setText("Texto de prueba....");
        Text_area.setBorder(null);
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

        Label_consola.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        Label_consola.setForeground(new java.awt.Color(0, 204, 204));
        Label_consola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_consola.setText("La expresión: <lexema de entrada> es válida con la expresión Regular <Nombre de la Expresión Regular>");
        Label_consola.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_consola.setAutoscrolls(true);
        Panel_consola.add(Label_consola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 90));

        jPanel1.add(Panel_consola, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 990, 110));

        Panel_archivos.setBackground(new java.awt.Color(23, 9, 32));
        Panel_archivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_arbol.setBackground(new java.awt.Color(100, 91, 110));
        Panel_arbol.setAutoscrolls(true);
        Panel_arbol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_arbol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        todos_arboles.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        todos_arboles.setForeground(new java.awt.Color(255, 255, 255));
        todos_arboles.setText("Archivo 1");
        todos_arboles.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        todos_arboles.setAutoscrolls(true);
        Panel_arbol.add(todos_arboles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 70));

        Panel_archivos.add(Panel_arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 90));

        Panel_sig.setBackground(new java.awt.Color(100, 91, 110));
        Panel_sig.setAutoscrolls(true);
        Panel_sig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_sig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        todos_siguiente.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        todos_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        todos_siguiente.setText("Archivo 1");
        todos_siguiente.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        todos_siguiente.setAutoscrolls(true);
        Panel_sig.add(todos_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 70));

        Panel_archivos.add(Panel_sig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 90));

        Panel_trans.setBackground(new java.awt.Color(100, 91, 110));
        Panel_trans.setAutoscrolls(true);
        Panel_trans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_trans.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        todos_transicion.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        todos_transicion.setForeground(new java.awt.Color(255, 255, 255));
        todos_transicion.setText("Archivo 1");
        todos_transicion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        todos_transicion.setAutoscrolls(true);
        Panel_trans.add(todos_transicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 70));

        Panel_archivos.add(Panel_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 180, 90));

        Panel_automata.setBackground(new java.awt.Color(100, 91, 110));
        Panel_automata.setAutoscrolls(true);
        Panel_automata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_automata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        todos_automatas.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        todos_automatas.setForeground(new java.awt.Color(255, 255, 255));
        todos_automatas.setText("Archvo 1");
        todos_automatas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        todos_automatas.setAutoscrolls(true);
        Panel_automata.add(todos_automatas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 70));

        Panel_archivos.add(Panel_automata, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 180, 90));

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

        jPanel1.add(Panel_archivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 180, 480));

        Panel_visualizador.setBackground(new java.awt.Color(23, 9, 32));
        Panel_visualizador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_visualizador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Panel_visualizador.add(Label_visualizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 410));

        jPanel1.add(Panel_visualizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 380, 410));

        Box_opciones.setBackground(new java.awt.Color(0, 153, 153));
        Box_opciones.setFont(new java.awt.Font("Roboto Medium", 2, 12)); // NOI18N
        Box_opciones.setForeground(new java.awt.Color(19, 11, 28));
        Box_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver imagenes", "Árboles", "Siguientes", "Transiciones", "Automatas" }));
        Box_opciones.setBorder(null);
        Box_opciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        // TODO add your handling code here:
    }//GEN-LAST:event_Bot_analizarMouseClicked

    private void Bot_analizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_analizarMouseEntered
        Bot_analizar.setBackground(new java.awt.Color(13,183,205));
        Bot_analizar.setForeground(Color.WHITE);
    }//GEN-LAST:event_Bot_analizarMouseEntered

    private void Bot_analizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_analizarMouseExited
        Bot_analizar.setBackground(new java.awt.Color(94,231,205));
        Bot_analizar.setForeground(new java.awt.Color(19,11,28));
    }//GEN-LAST:event_Bot_analizarMouseExited

    private void Bot_generarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_generarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Bot_generarMouseClicked

    private void Bot_generarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_generarMouseExited
        Bot_generar.setBackground(new java.awt.Color(94,231,205));
        Bot_generar.setForeground(new java.awt.Color(19,11,28));
       
    }//GEN-LAST:event_Bot_generarMouseExited

    private void Bot_generarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_generarMouseEntered
        Bot_generar.setBackground(new java.awt.Color(13,183,205));
        Bot_generar.setForeground(Color.WHITE);
    }//GEN-LAST:event_Bot_generarMouseEntered

    private void Bot_anteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_anteriorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Bot_anteriorMouseClicked

    private void Bot_anteriorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_anteriorMouseEntered
        Bot_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_ant_press.png"))); 
    }//GEN-LAST:event_Bot_anteriorMouseEntered

    private void Bot_anteriorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_anteriorMouseExited
         Bot_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_anterior.png")));
    }//GEN-LAST:event_Bot_anteriorMouseExited

    private void Bot_siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_siguienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Bot_siguienteMouseClicked

    private void Bot_siguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_siguienteMouseEntered
        Bot_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_sig_press.png"))); 
    }//GEN-LAST:event_Bot_siguienteMouseEntered

    private void Bot_siguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bot_siguienteMouseExited
        Bot_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_sig.png")));
    }//GEN-LAST:event_Bot_siguienteMouseExited

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
    private javax.swing.JLabel Label_consola;
    private javax.swing.JLabel Label_siguiente;
    private javax.swing.JLabel Label_transicion;
    private javax.swing.JLabel Label_visualizador;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Panel_arbol;
    private javax.swing.JPanel Panel_archivos;
    private javax.swing.JPanel Panel_automata;
    private javax.swing.JPanel Panel_consola;
    private javax.swing.JPanel Panel_sig;
    private javax.swing.JPanel Panel_text;
    private javax.swing.JPanel Panel_trans;
    private javax.swing.JPanel Panel_visualizador;
    private javax.swing.JLabel T_cerrar;
    private javax.swing.JLabel T_min;
    private javax.swing.JTextArea Text_area;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel todos_arboles;
    private javax.swing.JLabel todos_automatas;
    private javax.swing.JLabel todos_siguiente;
    private javax.swing.JLabel todos_transicion;
    // End of variables declaration//GEN-END:variables
}
