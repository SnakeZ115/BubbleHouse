package Ventanas;

import Clases.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ventanaTelefonos extends javax.swing.JFrame {

    public ventanaTelefonos() {
        initComponents();
        Mostrar.mostrarDatosTelefonosEmpleados();
        Mostrar.mostrarDatosTelefonosProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtidTelEmp = new javax.swing.JTextField();
        txtIdTelPro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtTelefonoProovedores = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTelefonoEmpleados = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        lblModificar = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        spinnerIdEmpleado = new javax.swing.JSpinner();
        spinnerIdProovedores = new javax.swing.JSpinner();
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

        txtidTelEmp.setText("jTextField1");

        txtIdTelPro.setText("jTextField1");

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
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setText("Teléfono");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

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
        jPanel4.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 280, 30));

        txtTelefonoProovedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoProovedoresActionPerformed(evt);
            }
        });
        txtTelefonoProovedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProovedoresKeyTyped(evt);
            }
        });
        jPanel4.add(txtTelefonoProovedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 190, 30));

        jTableProveedores.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProveedores);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 480, 250));

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel16.setText("ID");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        jTableEmpleados.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEmpleados);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 480, 250));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel8.setText("Proovedores");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

        txtBuscar1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscar1ActionPerformed(evt);
            }
        });
        txtBuscar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscar1KeyReleased(evt);
            }
        });
        jPanel4.add(txtBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 280, 30));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel9.setText("Buscar:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel10.setText("Empleados");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel17.setText("ID");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel11.setText("Teléfono");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        txtTelefonoEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEmpleadosActionPerformed(evt);
            }
        });
        txtTelefonoEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpleadosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpleadosKeyTyped(evt);
            }
        });
        jPanel4.add(txtTelefonoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 190, 30));

        jPanel12.setBackground(new java.awt.Color(245, 191, 174));

        lblAgregar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregar.setText("Agregar");
        lblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 180, -1));

        jPanel21.setBackground(new java.awt.Color(245, 191, 174));

        lblModificar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModificar.setText("Modificar");
        lblModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, -1, -1));

        jPanel22.setBackground(new java.awt.Color(245, 191, 174));

        lblEliminar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEliminar.setText("Eliminar");
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, -1, -1));
        jPanel4.add(spinnerIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));
        jPanel4.add(spinnerIdProovedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 1280, 530));

        jPanel3.setBackground(new java.awt.Color(255, 230, 231));
        jPanel3.setPreferredSize(new java.awt.Dimension(1380, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(233, 203, 193));

        lblProovedores.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblProovedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProovedores.setText("Proovedores");
        lblProovedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        lblEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        lblIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        lblLotes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        lblCorreos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        lblTelefonos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 60, 190, 20));

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

    private void txtTelefonoProovedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoProovedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoProovedoresActionPerformed

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

        ventanaLote newframe = new ventanaLote();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblTelefonosMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        Buscar.BuscarTelefonosProveedor(txtBuscar.getText());

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void lblLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLotesMouseClicked
        // TODO add your handling code here:
        ventanaLote newframe = new ventanaLote();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLotesMouseClicked

    private void lblCorreosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCorreosMouseClicked

        ventanaCorreos newframe = new ventanaCorreos();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblCorreosMouseClicked

    private void txtBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscar1ActionPerformed

    private void txtBuscar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar1KeyReleased

        Buscar.BuscarTelefonosEmpleados(txtBuscar1.getText());

    }//GEN-LAST:event_txtBuscar1KeyReleased

    private void txtTelefonoEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEmpleadosActionPerformed

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked

        int idProovedores = 0;
        int idEmpleados = 0;

        String telefonoProovedores;
        String telefonoEmpleados;

        idProovedores = (int) spinnerIdProovedores.getValue();
        idEmpleados = (int) spinnerIdEmpleado.getValue();

        telefonoProovedores = txtTelefonoProovedores.getText();
        telefonoEmpleados = txtTelefonoEmpleados.getText();

        Agregar agregar = new Agregar();

        if (telefonoProovedores.isEmpty() && idProovedores == 0) { //AGREGAR TELEFONO EMPLEADOS 

            agregar.agregarTelefonoEmpleado(idEmpleados, telefonoEmpleados);

        } else if (telefonoEmpleados.isEmpty() && idEmpleados == 0) { //AGREGAR TELEFONO PROOVEDORES

            agregar.agregarTelefonoProovedor(idProovedores, telefonoProovedores);

        } else { //AGREGAR TELEFONO PROOVEDORES Y EMPLEADOS

            agregar.agregarTelefonoProovedor(idProovedores, telefonoProovedores);
            agregar.agregarTelefonoEmpleado(idEmpleados, telefonoEmpleados);

        }
        Mostrar.mostrarDatosTelefonosEmpleados();
        Mostrar.mostrarDatosTelefonosProveedor();
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void jTableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadosMouseClicked

        int filaSeleccionada = jTableEmpleados.rowAtPoint(evt.getPoint());
        int id = Integer.parseInt((String) jTableEmpleados.getValueAt(filaSeleccionada, 1));

        txtTelefonoEmpleados.setText(jTableEmpleados.getValueAt(filaSeleccionada, 4).toString());
        spinnerIdEmpleado.setValue(id);
        txtidTelEmp.setText(jTableEmpleados.getValueAt(filaSeleccionada, 0).toString());


    }//GEN-LAST:event_jTableEmpleadosMouseClicked

    private void jTableProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProveedoresMouseClicked
        int filaSeleccionada = jTableProveedores.rowAtPoint(evt.getPoint());
        int id = Integer.parseInt((String) jTableProveedores.getValueAt(filaSeleccionada, 1));

        txtTelefonoProovedores.setText(jTableProveedores.getValueAt(filaSeleccionada, 4).toString());
        spinnerIdProovedores.setValue(id);
        txtIdTelPro.setText(jTableProveedores.getValueAt(filaSeleccionada, 0).toString());

    }//GEN-LAST:event_jTableProveedoresMouseClicked

    private void lblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseClicked

        int idProovedores = 0;
        int idEmpleados = 0;
        int idTelEmp = 0;
        int idTelPro = 0;

        String telefonoProovedores;
        String telefonoEmpleados;

        idProovedores = (int) spinnerIdProovedores.getValue();
        idEmpleados = (int) spinnerIdEmpleado.getValue();

        telefonoProovedores = txtTelefonoProovedores.getText();
        telefonoEmpleados = txtTelefonoEmpleados.getText();

        Modificar modificar = new Modificar();

        if (telefonoProovedores.isEmpty() && idProovedores == 0) { //AGREGAR TELEFONO EMPLEADOS 
            idTelEmp = Integer.parseInt(txtidTelEmp.getText());
            modificar.ModificarTelefonoEmpleado(idTelEmp, idEmpleados, telefonoEmpleados);

        } else if (telefonoEmpleados.isEmpty() && idEmpleados == 0) { //AGREGAR TELEFONO PROOVEDORES
            idTelPro = Integer.parseInt(txtIdTelPro.getText());
            modificar.ModificarTelefonoProovedor(idTelPro, idProovedores, telefonoProovedores);
        } else { //AGREGAR TELEFONO PROOVEDORES Y EMPLEADOS

            idTelEmp = Integer.parseInt(txtidTelEmp.getText());
            idTelPro = Integer.parseInt(txtIdTelPro.getText());

            modificar.ModificarTelefonoProovedor(idTelPro, idProovedores, telefonoProovedores);
            modificar.ModificarTelefonoEmpleado(idTelEmp, idEmpleados, telefonoEmpleados);

        }
        Mostrar.mostrarDatosTelefonosEmpleados();
        Mostrar.mostrarDatosTelefonosProveedor();
    }//GEN-LAST:event_lblModificarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked

        try {
            int idProovedores = 0;
            int idEmpleados = 0;
            int idTelEmp = 0;
            int idTelPro = 0;

            String telefonoProovedores;
            String telefonoEmpleados;

            idProovedores = (int) spinnerIdProovedores.getValue();
            idEmpleados = (int) spinnerIdEmpleado.getValue();

            telefonoProovedores = txtTelefonoProovedores.getText();
            telefonoEmpleados = txtTelefonoEmpleados.getText();

            Eliminar eliminar = new Eliminar();

            if (telefonoProovedores.isEmpty() && idProovedores == 0) { //AGREGAR TELEFONO EMPLEADOS 
                idTelEmp = Integer.parseInt(txtidTelEmp.getText());
                eliminar.EliminarTelefonoEmpleado(idTelEmp);

            } else if (telefonoEmpleados.isEmpty() && idEmpleados == 0) { //AGREGAR TELEFONO PROOVEDORES
                idTelPro = Integer.parseInt(txtIdTelPro.getText());
                eliminar.EliminarTelefonoProveedor(idTelPro);
            } else { //AGREGAR TELEFONO PROOVEDORES Y EMPLEADOS

                idTelEmp = Integer.parseInt(txtidTelEmp.getText());
                idTelPro = Integer.parseInt(txtIdTelPro.getText());

                eliminar.EliminarTelefonoEmpleado(idTelEmp);
                eliminar.EliminarTelefonoProveedor(idTelPro);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "REGISTRO NO DETECTADO");
        }
        Mostrar.mostrarDatosTelefonosEmpleados();
        Mostrar.mostrarDatosTelefonosProveedor();
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void txtTelefonoEmpleadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadosKeyReleased


    }//GEN-LAST:event_txtTelefonoEmpleadosKeyReleased

    private void txtTelefonoEmpleadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadosKeyTyped

        char validar = evt.getKeyChar();
        if (!Character.isDigit(validar) && validar != KeyEvent.VK_BACK_SPACE) {
            getToolkit().beep();
            evt.consume();

        }

    }//GEN-LAST:event_txtTelefonoEmpleadosKeyTyped

    private void txtTelefonoProovedoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProovedoresKeyTyped

        char validar = evt.getKeyChar();
        if (!Character.isDigit(validar) && validar != KeyEvent.VK_BACK_SPACE) {
            getToolkit().beep();
            evt.consume();

        }

    }//GEN-LAST:event_txtTelefonoProovedoresKeyTyped

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        VentanaLogin newframe = new VentanaLogin();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void lblProovedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProovedoresMouseClicked
        ventanaProovedores newframe = new ventanaProovedores();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProovedoresMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaTelefonos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTableEmpleados;
    public static javax.swing.JTable jTableProveedores;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblCorreos;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblLotes;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblProovedores;
    private javax.swing.JLabel lblTelefonos;
    private javax.swing.JSpinner spinnerIdEmpleado;
    private javax.swing.JSpinner spinnerIdProovedores;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtIdTelPro;
    public static javax.swing.JTextField txtTelefonoEmpleados;
    public static javax.swing.JTextField txtTelefonoProovedores;
    private javax.swing.JTextField txtidTelEmp;
    // End of variables declaration//GEN-END:variables
}
