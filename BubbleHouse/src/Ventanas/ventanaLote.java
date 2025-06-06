/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.*;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

public class ventanaLote extends javax.swing.JFrame {

    public ventanaLote() {
        initComponents();
        Mostrar.mostrarDatosLotes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidLote = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarLote = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jAgregar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLotes = new javax.swing.JTable();
        spinnerValorUnitarioLote = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        txtIngredienteLote = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jdcCaducidad = new com.toedter.calendar.JDateChooser();
        jdcEntrada = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        spinnerExistenciaLote = new javax.swing.JSpinner();
        txtNombreLote = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabelModificar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblProovedores = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblEmpleados = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblIngredientes = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblLotes = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lblCorreos = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblTelefonos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        txtidLote.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtidLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidLoteActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel6.setText("Buscar:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setText("Fecha de entrada");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel8.setText("Existencia");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel9.setText("Valor Unitario");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        txtBuscarLote.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtBuscarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarLoteActionPerformed(evt);
            }
        });
        txtBuscarLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarLoteKeyReleased(evt);
            }
        });
        jPanel4.add(txtBuscarLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 280, 30));

        jPanel8.setBackground(new java.awt.Color(245, 191, 174));

        jAgregar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAgregar.setText("Agregar");
        jAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 180, -1));

        jTableLotes.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jTableLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLotesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLotes);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 640, 390));
        jPanel4.add(spinnerValorUnitarioLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 80, 30));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel10.setText("Nombre del lote");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        txtIngredienteLote.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtIngredienteLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngredienteLoteActionPerformed(evt);
            }
        });
        txtIngredienteLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngredienteLoteKeyTyped(evt);
            }
        });
        jPanel4.add(txtIngredienteLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 260, 30));

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel12.setText("Fecha de caducidad");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));
        jPanel4.add(jdcCaducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 210, 30));
        jPanel4.add(jdcEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 210, 30));

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel14.setText("Ingrediente");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));
        jPanel4.add(spinnerExistenciaLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 80, 30));

        txtNombreLote.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtNombreLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreLoteActionPerformed(evt);
            }
        });
        jPanel4.add(txtNombreLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 260, 30));

        jPanel9.setBackground(new java.awt.Color(245, 191, 174));

        jLabelModificar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabelModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModificar.setText("Modificar");
        jLabelModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 1280, 530));

        jPanel3.setBackground(new java.awt.Color(255, 230, 231));
        jPanel3.setPreferredSize(new java.awt.Dimension(1380, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(233, 203, 193));

        lblProovedores.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblProovedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProovedores.setText("Proovedores");
        lblProovedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblProovedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProovedoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblProovedores, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblProovedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, 40));

        jPanel11.setBackground(new java.awt.Color(233, 203, 193));

        lblEmpleados.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpleados.setText("Empleados");
        lblEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 190, 40));

        jPanel12.setBackground(new java.awt.Color(233, 203, 193));

        lblIngredientes.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblIngredientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngredientes.setText("Ingredientes");
        lblIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngredientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(lblIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 190, 40));

        jPanel13.setBackground(new java.awt.Color(233, 203, 193));

        lblLotes.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblLotes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLotes.setText("Lotes");
        lblLotes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lblLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 190, 40));

        jPanel14.setBackground(new java.awt.Color(233, 203, 193));

        lblCorreos.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblCorreos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreos.setText("Correos");
        lblCorreos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCorreos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCorreosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(lblCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 190, 40));

        jPanel15.setBackground(new java.awt.Color(233, 203, 193));

        lblTelefonos.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblTelefonos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonos.setText("Teléfonos");
        lblTelefonos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTelefonosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTelefonos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 190, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 190, 10));

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

    private void txtBuscarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarLoteActionPerformed

    private void txtIngredienteLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngredienteLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngredienteLoteActionPerformed

    private void lblIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngredientesMouseClicked

        ventanaIngrediente newframe = new ventanaIngrediente();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblIngredientesMouseClicked

    private void lblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseClicked

        ventanaEmpleados newframe = new ventanaEmpleados();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblEmpleadosMouseClicked

    private void lblProovedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProovedoresMouseClicked

        ventanaProovedores newframe = new ventanaProovedores();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblProovedoresMouseClicked

    private void txtBuscarLoteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarLoteKeyReleased

        Buscar.buscarLotes(txtBuscarLote.getText());

    }//GEN-LAST:event_txtBuscarLoteKeyReleased

    private void lblCorreosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCorreosMouseClicked
        ventanaCorreos newframe = new ventanaCorreos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCorreosMouseClicked

    private void jAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAgregarMouseClicked
        // TODO add your handling code here:

        try {
            String nombre = txtidLote.getText();
            // FECHA DE CADUCIDAD
            String diaCaducidad = Integer.toString(jdcCaducidad.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mesCaducidad = Integer.toString(jdcCaducidad.getCalendar().get(Calendar.MONTH));
            String anioCaducidad = Integer.toString(jdcCaducidad.getCalendar().get(Calendar.YEAR));
            String fechaCaducidad = (anioCaducidad + "-" + mesCaducidad + "-" + diaCaducidad);

            // FECHA DE ENTRADA
            String diaEntrada = Integer.toString(jdcEntrada.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mesEntrada = Integer.toString(jdcEntrada.getCalendar().get(Calendar.MONTH));
            String anioEntrada = Integer.toString(jdcEntrada.getCalendar().get(Calendar.YEAR));
            String fechaEntrada = (anioEntrada + "-" + mesEntrada + "-" + diaEntrada);

            int existencia = (int) spinnerExistenciaLote.getValue();
            int valorUnitario = (int) spinnerValorUnitarioLote.getValue();
            String ingrediente = txtIngredienteLote.getText();

            if (nombre.isEmpty() || ingrediente.isEmpty() || existencia == 0 || valorUnitario == 0) {
                JOptionPane.showMessageDialog(null, "NO PUEDE DEJAR CAMPOS VACIOS");

            } else {
                try {

                    Agregar agregar = new Agregar();
                    agregar.agregarLote(nombre, fechaCaducidad, existencia, ingrediente, fechaEntrada, valorUnitario);
                    Mostrar.mostrarDatosLotes();

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "ERROR: " + e);

                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "NO PUEDE DEJAR FECHAS VACIAS");

        }


    }//GEN-LAST:event_jAgregarMouseClicked

    private void txtidLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidLoteActionPerformed

    }//GEN-LAST:event_txtidLoteActionPerformed

    private void lblTelefonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelefonosMouseClicked
        // TODO add your handling code here:
        ventanaTelefonos newframe = new ventanaTelefonos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblTelefonosMouseClicked

    private void jTableLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLotesMouseClicked

        int filaSeleccionada = jTableLotes.rowAtPoint(evt.getPoint());

        txtidLote.setText((String) jTableLotes.getValueAt(filaSeleccionada, 0));
        txtNombreLote.setText(jTableLotes.getValueAt(filaSeleccionada, 1).toString());
        txtIngredienteLote.setText(jTableLotes.getValueAt(filaSeleccionada, 5).toString());

    }//GEN-LAST:event_jTableLotesMouseClicked

    private void txtNombreLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreLoteActionPerformed

    private void jLabelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelModificarMouseClicked
        try {
            int id = Integer.parseInt(txtidLote.getText());
            String nombre = txtNombreLote.getText();

            // FECHA DE CADUCIDAD
            String diaCaducidad = Integer.toString(jdcCaducidad.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mesCaducidad = Integer.toString(jdcCaducidad.getCalendar().get(Calendar.MONTH));
            String anioCaducidad = Integer.toString(jdcCaducidad.getCalendar().get(Calendar.YEAR));
            String fechaCaducidad = (anioCaducidad + "-" + mesCaducidad + "-" + diaCaducidad);

            int existencia = (int) spinnerExistenciaLote.getValue();
            int valorUnitario = (int) spinnerValorUnitarioLote.getValue();
            String ingrediente = txtIngredienteLote.getText();

            // FECHA DE ENTRADA
            String diaEntrada = Integer.toString(jdcEntrada.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mesEntrada = Integer.toString(jdcEntrada.getCalendar().get(Calendar.MONTH));
            String anioEntrada = Integer.toString(jdcEntrada.getCalendar().get(Calendar.YEAR));
            String fechaEntrada = (anioEntrada + "-" + mesEntrada + "-" + diaEntrada);

            if (nombre.isEmpty() || ingrediente.isEmpty() || existencia == 0 || valorUnitario == 0) {
                JOptionPane.showMessageDialog(null, "NO PUEDE DEJAR CAMPOS VACIOS");

            } else {
                try {
                    Modificar modificar = new Modificar();
                    JOptionPane.showMessageDialog(null, "IDLOTE" + id);
                    modificar.modificarLote(id, nombre, fechaCaducidad, existencia, ingrediente, fechaEntrada, valorUnitario);
                    Mostrar.mostrarDatosLotes();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR: " + e);

                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO PUEDE DEJAR FECHAS VACIAS");

        }
    }//GEN-LAST:event_jLabelModificarMouseClicked

    private void txtIngredienteLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngredienteLoteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
     }//GEN-LAST:event_txtIngredienteLoteKeyTyped

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        VentanaLogin newframe = new VentanaLogin();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaLote().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAgregar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTableLotes;
    private com.toedter.calendar.JDateChooser jdcCaducidad;
    private com.toedter.calendar.JDateChooser jdcEntrada;
    private javax.swing.JLabel lblCorreos;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblLotes;
    private javax.swing.JLabel lblProovedores;
    private javax.swing.JLabel lblTelefonos;
    private javax.swing.JSpinner spinnerExistenciaLote;
    private javax.swing.JSpinner spinnerValorUnitarioLote;
    private javax.swing.JTextField txtBuscarLote;
    private javax.swing.JTextField txtIngredienteLote;
    private javax.swing.JTextField txtNombreLote;
    private javax.swing.JTextField txtidLote;
    // End of variables declaration//GEN-END:variables
}
