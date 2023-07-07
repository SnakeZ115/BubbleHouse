package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionSql {

    Connection conectar = null;
    
    String URL = "jdbc:mysql://localhost:3306/bubblehouse?characterEncoding=latin1";
    String USER = "root";
    String PSWD = "paxxword";
    String CE = "CONEXION ESTABLECIDA";
    String CD = "ERROR DE CONEXION: ";
    
    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(URL, USER, PSWD);
            JOptionPane.showMessageDialog(null, CE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, CD + e.getMessage());

        }
        return conectar;
    }
    
    public static void main(String[] args) throws SQLException {
        ConexionSql bd =new ConexionSql();
        bd.conexion();
    }
}
