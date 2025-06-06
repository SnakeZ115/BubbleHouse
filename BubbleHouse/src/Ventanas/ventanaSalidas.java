package Ventanas;

import Clases.*;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ventanaSalidas extends javax.swing.JFrame {

    

    public ventanaSalidas() {
        initComponents();
        Mostrar mostrar = new Mostrar();
        mostrar.mostrarCajeros();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblTerminado1 = new javax.swing.JLabel();
        cmbCajeros = new javax.swing.JComboBox<>();
        cmbTamaño = new javax.swing.JComboBox<>();
        cmbBase = new javax.swing.JComboBox<>();
        cmbLeche = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbPerlas = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lblReporte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel3.setText("Caducidad");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1380, 820));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 152, 152));
        jPanel1.setPreferredSize(new java.awt.Dimension(1380, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoCircular.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 170, 110));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel7.setText("Base");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel9.setText("Leche");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel10.setText("Cajero");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel16.setText("Tamaño");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jPanel12.setBackground(new java.awt.Color(245, 191, 174));

        lblTerminado1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblTerminado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTerminado1.setText("Terminado");
        lblTerminado1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblTerminado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTerminado1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTerminado1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTerminado1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 460, -1, -1));

        cmbCajeros.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jPanel4.add(cmbCajeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 110, 40));

        cmbTamaño.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cmbTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chico", "Mediano", "Grande", " " }));
        jPanel4.add(cmbTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 110, 40));

        cmbBase.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cmbBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coco", "Taro", "Tchai", "Blueberry", "Fresa", "Kiwi", "Matcha", "Vainilla", " ", " " }));
        jPanel4.add(cmbBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 110, 40));

        cmbLeche.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cmbLeche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entera", "Light", "Deslactosada", " ", " " }));
        jPanel4.add(cmbLeche, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoPanda.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel11.setText("Perlas");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        cmbPerlas.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        cmbPerlas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Original", "Fresa", "Kiwi", "Taro" }));
        jPanel4.add(cmbPerlas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 110, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 1280, 530));

        jPanel3.setBackground(new java.awt.Color(255, 230, 231));
        jPanel3.setPreferredSize(new java.awt.Dimension(1380, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(245, 191, 174));

        lblReporte.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReporte.setText("Reporte");
        lblReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReporteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblTerminado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerminado1MouseClicked

     
        int idTamaño = 0;
        int idBase = 0;
        int idLeche = 0;
        int idPerlas = 0;
        int idLoteBase = 0;
        int idLoteLeche = 0;
        int idLotePerlas = 0;

        String tamaño = (String) cmbTamaño.getSelectedItem();
        String base = (String) cmbBase.getSelectedItem();
        String leche = (String) cmbLeche.getSelectedItem();
        String perlas = (String) cmbPerlas.getSelectedItem();
        String cajero = (String) cmbCajeros.getSelectedItem();

        Bebidas comprobacion = new Bebidas();

        // COMPROBACION DE INGREDIENTES
        idBase = comprobacion.comprobarIngrediente(base);
        idLeche = comprobacion.comprobarIngrediente(leche);
        idPerlas = comprobacion.comprobarIngrediente(perlas);

        // COMPROBACION DE LOTE DE UN INGREDIENTE
        idLoteBase = comprobacion.comprobarLote(idBase);
        idLoteLeche = comprobacion.comprobarLote(idLeche);
        idLotePerlas = comprobacion.comprobarLote(idPerlas);

        if (idBase != 0 && idLeche != 0 && idPerlas != 0) {
            if (idLoteBase != 0 && idLoteLeche != 0 && idLotePerlas != 0) {
                if (tamaño.equals("Chico")) {
                    idTamaño = 1;
                    comprobacion.tamaño(idTamaño, idLoteBase, idLoteLeche, idLotePerlas, cajero);
                    comprobacion.registrarBebida(idBase, idLeche, idPerlas, cajero, 1);
                } else if (tamaño.equals("Mediano")) {
                    idTamaño = 2;
                    comprobacion.tamaño(idTamaño, idLoteBase, idLoteLeche, idLotePerlas, cajero);
                    comprobacion.registrarBebida(idBase, idLeche, idPerlas, cajero, 2);
                } else {
                    idTamaño = 3;
                    comprobacion.tamaño(idTamaño, idLoteBase, idLoteLeche, idLotePerlas, cajero);
                    comprobacion.registrarBebida(idBase, idLeche, idPerlas, cajero, 3);
                }
            } else {
                JOptionPane.showMessageDialog(null, "ALGUNO DE LOS LOTES NO EXISTE");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ALGUNO DE LOS INGREDIENTES NO EXISTE");
        }


    }//GEN-LAST:event_lblTerminado1MouseClicked

    private void lblReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReporteMouseClicked

        ventanaReporte newframe = new ventanaReporte();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblReporteMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        VentanaLogin newframe = new VentanaLogin();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaSalidas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbBase;
    public static javax.swing.JComboBox<String> cmbCajeros;
    private javax.swing.JComboBox<String> cmbLeche;
    private javax.swing.JComboBox<String> cmbPerlas;
    private javax.swing.JComboBox<String> cmbTamaño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblReporte;
    private javax.swing.JLabel lblTerminado1;
    // End of variables declaration//GEN-END:variables
}
