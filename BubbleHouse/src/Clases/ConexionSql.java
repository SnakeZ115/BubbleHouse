package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class ConexionSql {

    Connection conectar = null;
    String URL = "jdbc:mysql://localhost:3306/bubblehouse?characterEncoding=latin1";
    String USER = " ";
    String CE = "CONEXION ESTABLECIDA";
    String CD = "ERROR DE CONEXION: ";

    public Connection conexion() {
        try {
            JPasswordField passwordField = new JPasswordField();
            Class.forName("com.mysql.jdbc.Driver");
            USER = JOptionPane.showInputDialog("USUARIO: ");
            int option = JOptionPane.showConfirmDialog(null, passwordField, "Contraseña", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (option == JOptionPane.OK_OPTION) {
                char[] contrasenaChars = passwordField.getPassword();
                String PSWDD = new String(contrasenaChars);
                conectar = DriverManager.getConnection(URL, USER, PSWDD);
                JOptionPane.showMessageDialog(null, CE);
                Statement estado = conectar.createStatement();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, CD + e.getMessage());

        }
        return conectar;
    }

    public static void main(String[] args) throws SQLException {
        ConexionSql bd = new ConexionSql();
        bd.conexion();
        
    }
}