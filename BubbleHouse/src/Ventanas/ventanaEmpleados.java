package Ventanas;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Clases.*;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author Evelyn Ximena
 */
public class ventanaEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form ventanaIngrediente
     */
    public ventanaEmpleados() {
        initComponents();
        Mostrar.mostrarDatosEmpleados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarEmpleado = new javax.swing.JTextField();
        txtApellidosEmpleado = new javax.swing.JTextField();
        txtPuestoEmpleado = new javax.swing.JTextField();
        txtCalleNumEmpleado = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        lblAgregar = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblModificar = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblEliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablempleados = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtColoniaEmpleado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombresEmpleado = new javax.swing.JTextField();
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

        txtId.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel3.setText("Caducidad");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel7.setText("Apellidos");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel8.setText("Puesto");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel9.setText("Calle y número");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        txtBuscarEmpleado.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtBuscarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarEmpleadoMouseClicked(evt);
            }
        });
        txtBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarEmpleadoActionPerformed(evt);
            }
        });
        txtBuscarEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEmpleadoKeyReleased(evt);
            }
        });
        jPanel4.add(txtBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 280, 30));

        txtApellidosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosEmpleadoActionPerformed(evt);
            }
        });
        txtApellidosEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosEmpleadoKeyTyped(evt);
            }
        });
        jPanel4.add(txtApellidosEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 190, 30));

        txtPuestoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuestoEmpleadoActionPerformed(evt);
            }
        });
        jPanel4.add(txtPuestoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 190, 30));

        txtCalleNumEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleNumEmpleadoActionPerformed(evt);
            }
        });
        jPanel4.add(txtCalleNumEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 190, 30));

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
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 180, -1));

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
            .addComponent(lblModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 180, -1));

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

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jTablempleados.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jTablempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablempleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablempleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablempleados);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 440, 390));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel11.setText("Colonia");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        txtColoniaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaEmpleadoActionPerformed(evt);
            }
        });
        jPanel4.add(txtColoniaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 190, 30));

        jLabel17.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel17.setText("Nombres");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel18.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel18.setText("Nombres");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        txtNombresEmpleado.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txtNombresEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresEmpleadoActionPerformed(evt);
            }
        });
        txtNombresEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresEmpleadoKeyTyped(evt);
            }
        });
        jPanel4.add(txtNombresEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 190, 30));

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblProovedores, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblProovedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, 40));

        jPanel13.setBackground(new java.awt.Color(233, 203, 193));

        lblEmpleados.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lblEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpleados.setText("Empleados");
        lblEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 190, 40));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 190, 40));

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
                .addComponent(lblLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(lblLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 190, 40));

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
                .addComponent(lblCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCorreos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 190, 40));

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

        jPanel3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 190, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 190, -1));

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

    private void txtBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarEmpleadoActionPerformed

    private void txtApellidosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosEmpleadoActionPerformed

    private void txtPuestoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuestoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuestoEmpleadoActionPerformed

    private void txtCalleNumEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleNumEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleNumEmpleadoActionPerformed

    private void txtColoniaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColoniaEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColoniaEmpleadoActionPerformed

    private void lblProovedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProovedoresMouseClicked

        ventanaProovedores newframe = new ventanaProovedores();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblProovedoresMouseClicked

    private void lblIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngredientesMouseClicked

        ventanaIngrediente newframe = new ventanaIngrediente();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblIngredientesMouseClicked

    private void lblCorreosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCorreosMouseClicked

        ventanaCorreos newframe = new ventanaCorreos();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblCorreosMouseClicked

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        // TODO add your handling code here:
        String nombre = txtNombresEmpleado.getText();
        String apellidos = txtApellidosEmpleado.getText();
        String puesto = txtPuestoEmpleado.getText().toUpperCase();
        String calleNumero = txtCalleNumEmpleado.getText();
        String colonia = txtColoniaEmpleado.getText().toUpperCase();

        if (nombre.isEmpty() || apellidos.isEmpty() || calleNumero.isEmpty() || puesto.isEmpty() || colonia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Agregar agregar = new Agregar();
                agregar.agregarEmpleado(nombre, apellidos, calleNumero, colonia, puesto);
                Mostrar.mostrarDatosEmpleados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }


    }//GEN-LAST:event_lblAgregarMouseClicked

    private void txtBuscarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarEmpleadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarEmpleadoMouseClicked

    private void txtBuscarEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEmpleadoKeyReleased

        Buscar.buscarEmpleados(txtBuscarEmpleado.getText());

    }//GEN-LAST:event_txtBuscarEmpleadoKeyReleased

    private void lblTelefonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTelefonosMouseClicked
        // TODO add your handling code here:
        ventanaTelefonos newframe = new ventanaTelefonos();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblTelefonosMouseClicked

    private void lblLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLotesMouseClicked
        // TODO add your handling code here:
        ventanaLote newframe = new ventanaLote();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLotesMouseClicked

    private void jTablempleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablempleadosMouseClicked

        int filaSeleccionada = jTablempleados.rowAtPoint(evt.getPoint());

        txtId.setText((String) jTablempleados.getValueAt(filaSeleccionada, 0));
        txtNombresEmpleado.setText(jTablempleados.getValueAt(filaSeleccionada, 1).toString());
        txtApellidosEmpleado.setText(jTablempleados.getValueAt(filaSeleccionada, 2).toString());
        txtPuestoEmpleado.setText(jTablempleados.getValueAt(filaSeleccionada, 4).toString());
        txtCalleNumEmpleado.setText(jTablempleados.getValueAt(filaSeleccionada, 3).toString());
        txtColoniaEmpleado.setText(jTablempleados.getValueAt(filaSeleccionada, 5).toString());

    }//GEN-LAST:event_jTablempleadosMouseClicked

    private void lblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModificarMouseClicked

        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombresEmpleado.getText();
        String apellidos = txtApellidosEmpleado.getText();
        String puesto = txtPuestoEmpleado.getText().toUpperCase();
        String calleNumero = txtCalleNumEmpleado.getText();
        String colonia = txtColoniaEmpleado.getText().toUpperCase();

        if (nombre.isEmpty() || apellidos.isEmpty() || calleNumero.isEmpty() || puesto.isEmpty() || colonia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Modificar modificar = new Modificar();
                modificar.modificarEmpleado(id, nombre, apellidos, calleNumero, colonia, puesto);
                Mostrar.mostrarDatosEmpleados();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e);
            }
        }


    }//GEN-LAST:event_lblModificarMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombresEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresEmpleadoActionPerformed

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        // TODO add your handling code here:
        try {

            int id = Integer.parseInt(txtId.getText());
            Eliminar eliminar = new Eliminar();
            eliminar.eliminarEmpleado(id);
            Mostrar.mostrarDatosEmpleados();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "REGISTRO NO DETECTADO");
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void txtNombresEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresEmpleadoKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

    }//GEN-LAST:event_txtNombresEmpleadoKeyTyped

    private void txtApellidosEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosEmpleadoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
    }//GEN-LAST:event_txtApellidosEmpleadoKeyTyped

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        VentanaLogin newframe = new VentanaLogin();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaEmpleados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    public static javax.swing.JTable jTablempleados;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblCorreos;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEmpleados;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblLotes;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblProovedores;
    private javax.swing.JLabel lblTelefonos;
    public static javax.swing.JTextField txtApellidosEmpleado;
    private javax.swing.JTextField txtBuscarEmpleado;
    public static javax.swing.JTextField txtCalleNumEmpleado;
    public static javax.swing.JTextField txtColoniaEmpleado;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNombresEmpleado;
    public static javax.swing.JTextField txtPuestoEmpleado;
    // End of variables declaration//GEN-END:variables
}
