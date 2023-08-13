
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Ventanas.*;
import java.sql.SQLException;


public class Eliminar {
    
    public void eliminarProveedor(int idProveedor) {
        String confirmacion;
        try {
                        
            java.sql.CallableStatement eliminarProveedor;
            eliminarProveedor = ConexionSql.conectar.prepareCall("{call EliminarProveedores(?)}");
            eliminarProveedor.setInt(1, idProveedor);
            confirmacion = JOptionPane.showInputDialog(null, "Desea eliminar el registro? Escribir 'SI' para proceder").toUpperCase();
            if (confirmacion.equals("SI")) {
                eliminarProveedor.execute();
                JOptionPane.showMessageDialog(null, "PROVEEDOR ELIMINADO");
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
            
    }
    
    public void eliminarEmpleado(int idEmpleado) {
        
        String confirmacion;
        try {
                        
            java.sql.CallableStatement eliminarProveedor;
            eliminarProveedor = ConexionSql.conectar.prepareCall("{call EliminarEmpleados(?)}");
            eliminarProveedor.setInt(1, idEmpleado);
            confirmacion = JOptionPane.showInputDialog(null, "Desea eliminar el registro? Escribir 'SI' para proceder").toUpperCase();
            if (confirmacion.equals("SI")) {
                eliminarProveedor.execute();
                JOptionPane.showMessageDialog(null, "EMPLEADO ELIMINADO");
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
    
    public void eliminarIngrediente(int idIngrediente) {
        
                String confirmacion;
        try {
                        
            java.sql.CallableStatement eliminarProveedor;
            eliminarProveedor = ConexionSql.conectar.prepareCall("{call EliminarIngrediente(?)}");
            eliminarProveedor.setInt(1, idIngrediente);
            confirmacion = JOptionPane.showInputDialog(null, "Desea eliminar el registro? Escribir 'SI' para proceder").toUpperCase();
            if (confirmacion.equals("SI")) {
                eliminarProveedor.execute();
                JOptionPane.showMessageDialog(null, "INGREDIENTE ELIMINADO");
            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
    
}
