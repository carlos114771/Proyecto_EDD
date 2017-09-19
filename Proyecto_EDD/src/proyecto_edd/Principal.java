package proyecto_edd;

import java.util.Scanner;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        compresor_texto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Opciones");

        jMenuItem2.setText("Grafos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        compresor_texto.setText("Compresor de Texto");
        compresor_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compresor_textoActionPerformed(evt);
            }
        });
        jMenu1.add(compresor_texto);

        jMenuItem1.setText("Expresion Matematicas");
        jMenu1.add(jMenuItem1);

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.jd_grafos.setModal(true);
        this.jd_grafos.pack();
        this.jd_grafos.setLocationRelativeTo(this);
        this.jd_grafos.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void compresor_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compresor_textoActionPerformed
         this.jd_compresor_texto.setModal(true);
        this.jd_compresor_texto.pack();
        this.jd_compresor_texto.setLocationRelativeTo(this);
        this.jd_compresor_texto.setVisible(true);
    }//GEN-LAST:event_compresor_textoActionPerformed

    private void boton_comprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_comprimirMouseClicked

        Comprension huffman;
        String l=tf_texto.getText();
        huffman = new Comprension(l);
        String m=huffman.hC.binario_final;
        tf_texto_final.setText(m);
    }//GEN-LAST:event_boton_comprimirMouseClicked
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_comprimir;
    private javax.swing.JMenuItem compresor_texto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDialog jd_arboles;
    private javax.swing.JDialog jd_compresor_texto;
    private javax.swing.JDialog jd_grafos;
    private javax.swing.JTextField tf_texto;
    private javax.swing.JTextField tf_texto_final;
    // End of variables declaration//GEN-END:variables
    //static Codificador h;
}
