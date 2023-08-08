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

    public static Connection conectar = null;
    
    String URL = "jdbc:mysql://localhost:3306/bubblehouse?characterEncoding=latin1";
    String CE = "CONEXION ESTABLECIDA";
    

    public boolean conexion(String usuario, String paxxword) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(URL,usuario,paxxword );
            JOptionPane.showMessageDialog(null, CE);
 
        } catch (Exception e) {
            return false;    
        }
        return true;
    }
}