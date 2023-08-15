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

    public void eliminarCorreoProveedor(int id) {

        String confirmacion;
        try {

            java.sql.CallableStatement eliminarCorreo;
            eliminarCorreo = ConexionSql.conectar.prepareCall("{call EliminarCorreoPro(?)}");
            eliminarCorreo.setInt(1, id);
            confirmacion = JOptionPane.showInputDialog(null, "Desea eliminar el registro? Escribir 'SI' para proceder").toUpperCase();
            if (confirmacion.equals("SI") || confirmacion.equals("SMN")) {
                eliminarCorreo.execute();
                JOptionPane.showMessageDialog(null, "CORREO ELIMINADO");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void EliminarTelefonoEmpleado(int id) {

        String confirmacion;
        try {

            java.sql.CallableStatement eliminarTelefonoEmpl;
            eliminarTelefonoEmpl = ConexionSql.conectar.prepareCall("{call EliminarTelefonoEmpl(?)}");
            eliminarTelefonoEmpl.setInt(1, id);
            confirmacion = JOptionPane.showInputDialog(null, "Desea eliminar el registro? Escribir 'SI' para proceder").toUpperCase();
            if (confirmacion.equals("SI") || confirmacion.equals("SMN")) {
                eliminarTelefonoEmpl.execute();
                JOptionPane.showMessageDialog(null, "TELEFONO ELIMINADO");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void EliminarTelefonoProveedor(int id) {

        String confirmacion;
        try {

            java.sql.CallableStatement eliminarTelefonoPro;
            eliminarTelefonoPro = ConexionSql.conectar.prepareCall("{call EliminarTelefonoPro(?)}");
            eliminarTelefonoPro.setInt(1, id);
            confirmacion = JOptionPane.showInputDialog(null, "Desea eliminar el registro? Escribir 'SI' para proceder").toUpperCase();
            if (confirmacion.equals("SI") || confirmacion.equals("SMN")) {
                eliminarTelefonoPro.execute();
                JOptionPane.showMessageDialog(null, "TELEFONO ELIMINADO");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
    }
}
