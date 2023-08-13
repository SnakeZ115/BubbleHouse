package Ventanas;
import Clases.ConexionSql;
import javax.swing.JOptionPane;



public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin() {
        initComponents();
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LblAdministrador = new javax.swing.JLabel();
        JblCajero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1380, 820));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1380, 820));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1380, 820));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.PNG"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        LblAdministrador.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        LblAdministrador.setForeground(new java.awt.Color(238, 102, 71));
        LblAdministrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblAdministrador.setText("Administrador");
        LblAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblAdministrador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblAdministradorMouseClicked(evt);
            }
        });
        jPanel2.add(LblAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 250, 80));

        JblCajero.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        JblCajero.setForeground(new java.awt.Color(238, 102, 71));
        JblCajero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JblCajero.setText("Cajero");
        JblCajero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JblCajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JblCajeroMouseClicked(evt);
            }
        });
        jPanel2.add(JblCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 250, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RecuadroLogin.PNG"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JblCajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JblCajeroMouseClicked
        
        ventanaContraseniaiC newframe = new ventanaContraseniaiC();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_JblCajeroMouseClicked

    private void LblAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblAdministradorMouseClicked
        
        ventanaContraseniai newframe = new ventanaContraseniai();
        newframe.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_LblAdministradorMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JblCajero;
    private javax.swing.JLabel LblAdministrador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
