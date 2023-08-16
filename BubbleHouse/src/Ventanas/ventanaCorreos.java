
package Ventanas;

import Clases.*;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ventanaCorreos extends javax.swing.JFrame {

 
    public ventanaCorreos() {
        initComponents();
        Mostrar.mostrarDatosProveedoresCorreos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblModificar = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableCorreos = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdPro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblProovedores = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblEmpleados = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lblIngredientes = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblLotes = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lblCorreos = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lblTelefonos = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        txtIdCorreo.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtIdCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCorreoActionPerformed(evt);
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
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 170, 110));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel6.setText("Buscar:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setText("Departamento");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel4.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 280, 30));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel4.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 190, 30));

        jPanel8.setBackground(new java.awt.Color(245, 191, 174));

        lblAgregar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setText("Agregar");
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 180, -1));

        jPanel9.setBackground(new java.awt.Color(245, 191, 174));

        lblModificar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificar.setText("Modificar");
        lblModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 180, -1));

        jPanel10.setBackground(new java.awt.Color(245, 191, 174));

        lblEliminar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("Eliminar");
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, -1));

        jtableCorreos.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jtableCorreos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtableCorreos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableCorreosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableCorreos);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 480, 390));

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel16.setText("Codigo Proveedor");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });
        txtDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartamentoKeyTyped(evt);
            }
        });
        jPanel4.add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 190, 30));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel8.setText("Correo");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        txtIdPro.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtIdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProActionPerformed(evt);
            }
        });
        txtIdPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdProKeyTyped(evt);
            }
        });
        jPanel4.add(txtIdPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 190, 30));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(lblProovedores, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblProovedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, -1));

        jPanel13.setBackground(new java.awt.Color(233, 203, 193));

        lblEmpleados.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpleados.setText("Empleados");
        lblEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmpleadosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 190, -1));

        jPanel14.setBackground(new java.awt.Color(233, 203, 193));

        lblIngredientes.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblIngredientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngredientes.setText("Ingredientes");
        lblIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngredientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(lblIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 190, -1));

        jPanel15.setBackground(new java.awt.Color(233, 203, 193));

        lblLotes.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblLotes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLotes.setText("Lotes");
        lblLotes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLotesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(lblLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 190, -1));

        jPanel16.setBackground(new java.awt.Color(233, 203, 193));

        lblCorreos.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblCorreos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreos.setText("Correos");
        lblCorreos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCorreos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCorreosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(lblCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 190, -1));

        jPanel17.setBackground(new java.awt.Color(233, 203, 193));

        lblTelefonos.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblTelefonos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefonos.setText("Teléfonos");
        lblTelefonos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTelefonosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(lblTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 190, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 190, -1));

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

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtIdCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCorreoActionPerformed

    private void lblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpleadosMouseClicked

        ventanaEmpleados newframe = new ventanaEmpleados();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblEmpleadosMouseClicked

    private void lblIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngredientesMouseClicked

        ventanaIngrediente newframe = new ventanaIngrediente();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblIngredientesMouseClicked

    private void lblTelefonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelefonosMouseClicked

        
        ventanaTelefonos newframe = new ventanaTelefonos();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblTelefonosMouseClicked

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked


        int id = Integer.parseInt(txtIdPro.getText());
        String correo = txtCorreo.getText();
        String departamento = txtDepartamento.getText();

        try {
            
            Agregar agregar = new Agregar();
            agregar.agregarCorreo(id, correo, departamento);
            Mostrar.mostrarDatosProveedoresCorreos();
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Error: "+e);
            
        }


    }//GEN-LAST:event_lblAgregarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        Buscar.BuscarProveedoresCorreos(txtBuscar.getText());

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void lblLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLotesMouseClicked
        // TODO add your handling code here:
        ventanaLote newframe = new ventanaLote();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLotesMouseClicked

    private void lblCorreosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCorreosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCorreosMouseClicked

    private void lblProovedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProovedoresMouseClicked
        ventanaProovedores newframe = new ventanaProovedores();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProovedoresMouseClicked

    private void jtableCorreosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableCorreosMouseClicked
        int FilaSeleccionada = jtableCorreos.rowAtPoint(evt.getPoint());
        txtIdCorreo.setText((String) jtableCorreos.getValueAt(FilaSeleccionada, 0));
        txtIdPro.setText((String) jtableCorreos.getValueAt(FilaSeleccionada, 1));
        txtCorreo.setText((String) jtableCorreos.getValueAt(FilaSeleccionada, 4));
        txtDepartamento.setText((String) jtableCorreos.getValueAt(FilaSeleccionada, 6));
    }//GEN-LAST:event_jtableCorreosMouseClicked

    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartamentoActionPerformed

    private void lblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseClicked

        int id = Integer.parseInt(txtIdCorreo.getText());
        int idpro = Integer.parseInt(txtIdPro.getText());
        String correo = txtCorreo.getText();
        String departamento = txtDepartamento.getText();
        try{
            
            Modificar modificar = new Modificar();
             modificar.modificarCorreoPro(id,idpro, correo, departamento);
             Mostrar.mostrarDatosProveedoresCorreos(); 
             
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: " +e);
        }
        
    }//GEN-LAST:event_lblModificarMouseClicked

    private void txtIdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProActionPerformed

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        
        try {
            
            int id = Integer.parseInt(txtIdCorreo.getText());
            Eliminar eliminar = new Eliminar();
            eliminar.eliminarCorreoProveedor(id);
            Mostrar.mostrarDatosProveedoresCorreos();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "REGISTRO NO DETECTADO" +e);
        }

    }//GEN-LAST:event_lblEliminarMouseClicked

    private void txtIdProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProKeyTyped
        
        char validar = evt.getKeyChar();
        if(!Character.isDigit(validar)&& validar != KeyEvent.VK_BACK_SPACE){
            getToolkit().beep();
            evt.consume();
            
        }
    }//GEN-LAST:event_txtIdProKeyTyped

    private void txtDepartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartamentoKeyTyped
        
    }//GEN-LAST:event_txtDepartamentoKeyTyped

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
            java.util.logging.Logger.getLogger(ventanaCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaCorreos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jtableCorreos;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblCorreos;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblLotes;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblProovedores;
    private javax.swing.JLabel lblTelefonos;
    private javax.swing.JTextField txtBuscar;
    public static javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtDepartamento;
    public static javax.swing.JTextField txtIdCorreo;
    public static javax.swing.JTextField txtIdPro;
    // End of variables declaration//GEN-END:variables
}
