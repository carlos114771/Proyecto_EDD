package proyecto_edd;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        extras();
        setLocationRelativeTo(null);
    }

    public void extras() {
        jl_empleado.setModel(modelo);
        jlb_empleado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_arboles = new javax.swing.JDialog();
        jd_grafos = new javax.swing.JDialog();
        jd_compresor_texto = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tf_texto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_texto_final = new javax.swing.JTextField();
        boton_comprimir = new javax.swing.JButton();
        jd_evaluacion = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();
        tf_area = new javax.swing.JTextField();
        tf_valor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bt_agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_empleado = new javax.swing.JList<>();
        jlb_empleado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_nombre_mod = new javax.swing.JTextField();
        tf_area_mod = new javax.swing.JTextField();
        tf_valor_mod = new javax.swing.JTextField();
        bt_modificar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_empleado_mod = new javax.swing.JList<>();
        bt_eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_arbol = new javax.swing.JTextArea();
<<<<<<< HEAD
        jd_grafo_bi = new javax.swing.JDialog();
        tp_grafos_bi = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        tf_color = new javax.swing.JTextField();
        bt_crear_nodo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cb_nodo1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cb_nodo2 = new javax.swing.JComboBox<>();
        bt_crear_arista = new javax.swing.JButton();
=======
        jd_expreson = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_expresion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_total = new javax.swing.JTextField();
        boton_calcular = new javax.swing.JButton();
>>>>>>> 29438a295b06b2e4ff31495bb92a2d2918c2cd2a
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_evaluacion = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mi_grafo_bi = new javax.swing.JMenuItem();
        compresor_texto = new javax.swing.JMenuItem();
        menu_expresion = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jd_arbolesLayout = new javax.swing.GroupLayout(jd_arboles.getContentPane());
        jd_arboles.getContentPane().setLayout(jd_arbolesLayout);
        jd_arbolesLayout.setHorizontalGroup(
            jd_arbolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_arbolesLayout.setVerticalGroup(
            jd_arbolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_grafosLayout = new javax.swing.GroupLayout(jd_grafos.getContentPane());
        jd_grafos.getContentPane().setLayout(jd_grafosLayout);
        jd_grafosLayout.setHorizontalGroup(
            jd_grafosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_grafosLayout.setVerticalGroup(
            jd_grafosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setText("Ingrese Texto:");

        jLabel2.setText("Texto Comprimido");

        boton_comprimir.setText("Comprimir");
        boton_comprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_comprimirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_compresor_textoLayout = new javax.swing.GroupLayout(jd_compresor_texto.getContentPane());
        jd_compresor_texto.getContentPane().setLayout(jd_compresor_textoLayout);
        jd_compresor_textoLayout.setHorizontalGroup(
            jd_compresor_textoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_compresor_textoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jd_compresor_textoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jd_compresor_textoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(tf_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addComponent(tf_texto_final, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_compresor_textoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_comprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jd_compresor_textoLayout.setVerticalGroup(
            jd_compresor_textoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_compresor_textoLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jd_compresor_textoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(boton_comprimir)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tf_texto_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("                 Cálculo de Evaluación por Desempeño");

        jLabel4.setText("Nombre:");

        jLabel6.setText("ID:");

        jLabel7.setText("Área:");

        jLabel8.setText("Valor:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Nuevo Empleado");

        bt_agregar.setText("Agregar");
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jl_empleado);

        jlb_empleado.setText("Seleccione un Empleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre)
                            .addComponent(tf_id)
                            .addComponent(tf_area)
                            .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlb_empleado)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jlb_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(bt_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", jPanel2);

        jLabel9.setText("Nombre:");

        jLabel10.setText("Área:");

        jLabel11.setText("Valor:");

        bt_modificar.setText("Modificar");
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Modificación  y/o Eliminación de Empleados");

        jl_empleado_mod.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jl_empleado_modValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jl_empleado_mod);

        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel12)
                .addContainerGap(309, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(bt_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre_mod)
                            .addComponent(tf_area_mod)
                            .addComponent(tf_valor_mod, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_nombre_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_area_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tf_valor_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(bt_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(bt_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar / Eliminar", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        ta_arbol.setColumns(20);
        ta_arbol.setRows(5);
        jScrollPane2.setViewportView(ta_arbol);

        javax.swing.GroupLayout jd_evaluacionLayout = new javax.swing.GroupLayout(jd_evaluacion.getContentPane());
        jd_evaluacion.getContentPane().setLayout(jd_evaluacionLayout);
        jd_evaluacionLayout.setHorizontalGroup(
            jd_evaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_evaluacionLayout.createSequentialGroup()
                .addGroup(jd_evaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_evaluacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jd_evaluacionLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jd_evaluacionLayout.setVerticalGroup(
            jd_evaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_evaluacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_evaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );

<<<<<<< HEAD
        tp_grafos_bi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tp_grafos_biStateChanged(evt);
            }
        });

        jLabel15.setText("Color:");

        bt_crear_nodo.setText("Crear Nodo");
        bt_crear_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crear_nodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_crear_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(bt_crear_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        tp_grafos_bi.addTab("Nodo", jPanel5);

        jLabel13.setText("Nodo 1:");

        jLabel14.setText("Nodo 2:");

        bt_crear_arista.setText("Crear Arista");
        bt_crear_arista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crear_aristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_nodo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_nodo2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(bt_crear_arista, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_nodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_nodo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(bt_crear_arista, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        tp_grafos_bi.addTab("Arista", jPanel4);

        javax.swing.GroupLayout jd_grafo_biLayout = new javax.swing.GroupLayout(jd_grafo_bi.getContentPane());
        jd_grafo_bi.getContentPane().setLayout(jd_grafo_biLayout);
        jd_grafo_biLayout.setHorizontalGroup(
            jd_grafo_biLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_grafos_bi)
        );
        jd_grafo_biLayout.setVerticalGroup(
            jd_grafo_biLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp_grafos_bi, javax.swing.GroupLayout.Alignment.TRAILING)
=======
        jLabel13.setText("Ingrese Expresion: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Expresión Matematicas");

        jLabel15.setText("Total:");

        boton_calcular.setText("Calcular");
        boton_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_calcularMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_expresonLayout = new javax.swing.GroupLayout(jd_expreson.getContentPane());
        jd_expreson.getContentPane().setLayout(jd_expresonLayout);
        jd_expresonLayout.setHorizontalGroup(
            jd_expresonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_expresonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(105, 105, 105))
            .addGroup(jd_expresonLayout.createSequentialGroup()
                .addGroup(jd_expresonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_expresonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_expresonLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_expresonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_expresion, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(tf_total)
                    .addGroup(jd_expresonLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(boton_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jd_expresonLayout.setVerticalGroup(
            jd_expresonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_expresonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addGroup(jd_expresonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_expresion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(boton_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jd_expresonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_total, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(81, 81, 81))
>>>>>>> 29438a295b06b2e4ff31495bb92a2d2918c2cd2a
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Opciones");

        mi_evaluacion.setText("Cálculo de Evaluación por Desempeño");
        mi_evaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_evaluacionActionPerformed(evt);
            }
        });
        jMenu1.add(mi_evaluacion);

        jMenuItem2.setText("Grafos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mi_grafo_bi.setText("Grafo Bicoloreable");
        mi_grafo_bi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_grafo_biActionPerformed(evt);
            }
        });
        jMenu1.add(mi_grafo_bi);

        compresor_texto.setText("Compresor de Texto");
        compresor_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compresor_textoActionPerformed(evt);
            }
        });
        jMenu1.add(compresor_texto);

        menu_expresion.setText("Expresion Matematicas");
        menu_expresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_expresionActionPerformed(evt);
            }
        });
        jMenu1.add(menu_expresion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compresor_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compresor_textoActionPerformed
        this.jd_compresor_texto.setModal(true);
        this.jd_compresor_texto.pack();
        this.jd_compresor_texto.setLocationRelativeTo(this);
        this.jd_compresor_texto.setVisible(true);
    }//GEN-LAST:event_compresor_textoActionPerformed

    private void boton_comprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_comprimirMouseClicked
        Comprension huffman;
        String l = tf_texto.getText();
        huffman = new Comprension(l);
        String m = huffman.hC.binario_final;
        tf_texto_final.setText(m);
    }//GEN-LAST:event_boton_comprimirMouseClicked

    private void mi_evaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_evaluacionActionPerformed
        this.jd_evaluacion.setModal(true);
        this.jd_evaluacion.pack();
        this.jd_evaluacion.setLocationRelativeTo(this);
        this.jd_evaluacion.setVisible(true);
    }//GEN-LAST:event_mi_evaluacionActionPerformed

    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
        String nombre, area;
        int id, valor;
        nombre = tf_nombre.getText();
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre.");
            return;
        }
        area = tf_area.getText();
        if (area.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un área de trabajo.");
            return;
        }
        try {
            valor = Integer.parseInt(tf_valor.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor no válido");
            return;
        }
        try {
            id = Integer.parseInt(tf_id.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID no válido");
            return;
        }
        if (arbol != null && !arbol.isEmpty() && arbol.exists(id)) {
            JOptionPane.showMessageDialog(this, "ID ya existente");
            return;
        }
        if (arbol == null) {
            arbol = new Arbol_Evaluacion(new Empleado(nombre, id, area, valor));
            modelo.addElement(arbol.getRaiz());
            jlb_empleado.setVisible(true);
        } else {
            if (jl_empleado.getSelectedIndex() > -1) {
                int pos = jl_empleado.getSelectedIndex();
                Empleado jefe = (Empleado) modelo.get(pos);
                arbol.hoja(jefe, new Empleado(nombre, id, area, valor));
                modelo.addElement(new Empleado(nombre, id, area, valor));
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un Empleado");
                return;
            }
        }
        if (arbol.getRaiz() == null) {
            arbol.raiz(new Empleado(nombre, id, area, valor));
            modelo.addElement(arbol.getRaiz());
        }
        arbol.Evaluaciones();
        ta_arbol.setText(arbol.print());
        tf_nombre.setText("");
        tf_id.setText("");
        tf_area.setText("");
        tf_valor.setText("");
        JOptionPane.showMessageDialog(this, "Empleado agregado exitosamente");
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void bt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarActionPerformed
        if (jl_empleado_mod.getSelectedIndex() > -1) {
            int pos = jl_empleado_mod.getSelectedIndex();
            String nombre, area;
            int valor, id;
            nombre = tf_nombre_mod.getText();
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(this, "¡Ingrese un nombre!");
                return;
            }
            area = tf_area_mod.getText();
            if (area.equals("")) {
                JOptionPane.showMessageDialog(this, "¡Ingrese un área de trabajo!");
                return;
            }
            try {
                valor = Integer.parseInt(tf_valor_mod.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "¡Ingrese un valor!");
                return;
            }
            if (valor < 0) {
                JOptionPane.showMessageDialog(this, "¡Ingrese un valor positivo!");
                return;
            }
            arbol.CambiarEmpleado(nombre, area, valor, (Empleado) modelo.get(pos));
            arbol.Evaluaciones();
            ta_arbol.setText(arbol.print());
            jl_empleado_mod.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "¡Seleccione un empleado!");
        }
    }//GEN-LAST:event_bt_modificarActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        if (jl_empleado_mod.getSelectedIndex() > -1) {
            Empleado empleado = (Empleado) modelo.get(jl_empleado_mod.getSelectedIndex());
            modelo.remove(jl_empleado_mod.getSelectedIndex());
            arbol.remove(empleado);
            if (arbol.getRaiz() != null) {
                ta_arbol.setText(arbol.print());
            } else {
                ta_arbol.setText("");
                tf_nombre_mod.setText("");
                tf_area_mod.setText("");
                tf_valor_mod.setText("");
            }
            JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "¡Seleccione un empleado!");
        }
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void jl_empleado_modValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jl_empleado_modValueChanged
        if (jl_empleado_mod.getSelectedIndex() > -1) {
            Empleado empleado = (Empleado) modelo.get(jl_empleado_mod.getSelectedIndex());
            tf_nombre_mod.setText(empleado.getNombre());
            tf_area_mod.setText(empleado.getArea());
            tf_valor_mod.setText("" + empleado.getEvaluacion());
        }
    }//GEN-LAST:event_jl_empleado_modValueChanged

<<<<<<< HEAD
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.jd_grafos.setModal(true);
        this.jd_grafos.pack();
        this.jd_grafos.setLocationRelativeTo(this);
        this.jd_grafos.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mi_grafo_biActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_grafo_biActionPerformed
        this.jd_grafo_bi.setModal(true);
        this.jd_grafo_bi.pack();
        this.jd_grafo_bi.setLocationRelativeTo(this);
        this.jd_grafo_bi.setVisible(true);
    }//GEN-LAST:event_mi_grafo_biActionPerformed

    private void tp_grafos_biStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tp_grafos_biStateChanged
        if (tp_grafos_bi.getSelectedIndex() == 0){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Nodo_Grafo temp : lista_nodos){
                modelo.addElement(temp);
            }
            cb_nodo1.setModel(modelo);
        }
        if (tp_grafos_bi.getSelectedIndex() == 0){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Nodo_Grafo temp : lista_nodos){
                modelo.addElement(temp);
            }
            cb_nodo2.setModel(modelo);
        }
    }//GEN-LAST:event_tp_grafos_biStateChanged

    private void bt_crear_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crear_nodoActionPerformed
        try {
            String color;
            color = tf_color.getText();
            lista_nodos.add(new Nodo_Grafo(color));
            tf_color.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese un color");
        }
    }//GEN-LAST:event_bt_crear_nodoActionPerformed

    private void bt_crear_aristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crear_aristaActionPerformed
        try {
            String nodo1, nodo2;
            nodo1 = cb_nodo1.getSelectedItem().toString();
            nodo2 = cb_nodo2.getSelectedItem().toString();
            if (nodo1.equals(nodo2)) {
                JOptionPane.showMessageDialog(null, "¡El grafo no será bicoloreable!");
            } else {
                JOptionPane.showMessageDialog(null, "¡El grafo será bicoloreable!");
            }
            lista_aristas.add(new Arista(nodo1, nodo2));
            cb_nodo1.setSelectedIndex(0);
            cb_nodo2.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione un nodo");
        }
    }//GEN-LAST:event_bt_crear_aristaActionPerformed
=======
    private void menu_expresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_expresionActionPerformed
        this.jd_expreson.setModal(true);
        this.jd_expreson.pack();
        this.jd_expreson.setLocationRelativeTo(this);
        this.jd_expreson.setVisible(true);
    }//GEN-LAST:event_menu_expresionActionPerformed

    private void boton_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_calcularMouseClicked

        try {
            Evaluar();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_boton_calcularMouseClicked
>>>>>>> 29438a295b06b2e4ff31495bb92a2d2918c2cd2a
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void Evaluar() throws Exception {
        Calculadora calc = new Calculadora();
        String exp = tf_expresion.getText();
        tf_total.setText(String.valueOf(calc.calcular(exp)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_calcular;
    private javax.swing.JButton boton_comprimir;
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_crear_arista;
    private javax.swing.JButton bt_crear_nodo;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JComboBox<String> cb_nodo1;
    private javax.swing.JComboBox<String> cb_nodo2;
    private javax.swing.JMenuItem compresor_texto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_arboles;
    private javax.swing.JDialog jd_compresor_texto;
    private javax.swing.JDialog jd_evaluacion;
<<<<<<< HEAD
    private javax.swing.JDialog jd_grafo_bi;
=======
    private javax.swing.JDialog jd_expreson;
>>>>>>> 29438a295b06b2e4ff31495bb92a2d2918c2cd2a
    private javax.swing.JDialog jd_grafos;
    private javax.swing.JList<String> jl_empleado;
    private javax.swing.JList<String> jl_empleado_mod;
    private javax.swing.JLabel jlb_empleado;
    private javax.swing.JMenuItem menu_expresion;
    private javax.swing.JMenuItem mi_evaluacion;
    private javax.swing.JMenuItem mi_grafo_bi;
    private javax.swing.JTextArea ta_arbol;
    private javax.swing.JTextField tf_area;
    private javax.swing.JTextField tf_area_mod;
<<<<<<< HEAD
    private javax.swing.JTextField tf_color;
=======
    private javax.swing.JTextField tf_expresion;
>>>>>>> 29438a295b06b2e4ff31495bb92a2d2918c2cd2a
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre_mod;
    private javax.swing.JTextField tf_texto;
    private javax.swing.JTextField tf_texto_final;
    private javax.swing.JTextField tf_total;
    private javax.swing.JTextField tf_valor;
    private javax.swing.JTextField tf_valor_mod;
    private javax.swing.JTabbedPane tp_grafos_bi;
    // End of variables declaration//GEN-END:variables
    //static Codificador h;
    private Arbol_Evaluacion arbol;
    private final DefaultListModel modelo = new DefaultListModel();
<<<<<<< HEAD
    ArrayList<Nodo_Grafo> lista_nodos = new ArrayList();
    ArrayList<Arista> lista_aristas = new ArrayList();
}
=======

}
>>>>>>> 29438a295b06b2e4ff31495bb92a2d2918c2cd2a
