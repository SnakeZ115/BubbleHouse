package Clases;

import Ventanas.*;
import static Ventanas.ventanaReporte.jTableReporte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;

public class Buscar {

    public static void buscarEmpleados(String nombre) {
        String[] titulos = {"Codigo", "Nombres", "Apellidos", "Calle y Numero", "Puesto", "Colonia"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "call buscarEmpleado('" + nombre + "')"; //reemplazar por procedimiento almacenado
        try {

            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("idEmpleados");
                registros[1] = rs.getString("NombreEmp");
                registros[2] = rs.getString("ApellidosEmp");
                registros[3] = rs.getString("CalleNumero");
                registros[4] = rs.getString("NombrePuesto");
                registros[5] = rs.getString("NombreCol");

                modelo.addRow(registros);
            }
            ventanaEmpleados.jTablempleados.setModel(modelo);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e);

        }
    }

    public static void buscarProovedores(String nombre) {

        String[] titulos = {"Codigo", "Nombre", "Apellidos", "Empresa", "Direccion", "Colonia"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "call FiltrarProveedor ('" + nombre + "')"; //Agregar procedimiento almacenado
        try {

            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("IdProveedores");
                registros[1] = rs.getString("NombrePro");
                registros[2] = rs.getString("ApellidosPro");
                registros[3] = rs.getString("NombreEmpresa");
                registros[4] = rs.getString("CalleNumero");
                registros[5] = rs.getString("NombreCol");
                modelo.addRow(registros);
            }
            ventanaProovedores.jTableProveedores.setModel(modelo);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e);

        }
    }

    public static void buscarIngredientes(String nombre) {
        String[] titulos = {"Codigo", "Ingrediente", "Marca", "UnidadMedida", "TipoIngrediente", "Proveedor"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "call BuscarIngrediente('" + nombre + "')";
        try {

            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("IdIngredientes");
                registros[1] = rs.getString("NombreIngrediente");
                registros[2] = rs.getString("Marca");
                registros[3] = rs.getString("TipoUnidadMedida");
                registros[4] = rs.getString("TipoIngredienteConversion(TipoIngrediente)");
                registros[5] = rs.getString("NombrePro");
                modelo.addRow(registros);
            }
            ventanaIngrediente.jTableIngredientes.setModel(modelo);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e);

        }
    }

    public static void buscarLotes(String nombre) {
        String[] titulos = {"Codigo", "Lote", "Caducidad", "Existencia", "Equivalencia", "Ingredeintes", "Entrada"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "call FiltrarLote('" + nombre + "')"; //Agregar procedimiento almacenado
        try {

            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("Idlote");
                registros[1] = rs.getString("Lotes");
                registros[2] = rs.getString("FechaCaducidad");
                registros[3] = rs.getString("Existencia");
                registros[4] = rs.getString("EquivalenciaExistencia");
                registros[5] = rs.getString("Ingredientes_idIngredientes");
                registros[6] = rs.getString("FechaEntrada");

                modelo.addRow(registros);
            }
            ventanaLote.jTableLotes.setModel(modelo);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e);

        }
    }

    public static void BuscarProveedoresCorreos(String nombre) {
        String[] titulos = {"CodigoCorreo,CodigoProveedor", "Nombre", "Apellidos", "Correo", "Empresa", "Departamento"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call FiltrarCorreoPro('" + nombre + "')}";
        try {

            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idCorreoPro");
                registros[1] = rs.getString("IdProveedores");
                registros[2] = rs.getString("NombrePro");
                registros[3] = rs.getString("ApellidosPro");
                registros[4] = rs.getString("CorreoProveedores");
                registros[5] = rs.getString("NombreEmpresa");
                registros[6] = rs.getString("DepartamentoProveedor");
                modelo.addRow(registros);
            }
            ventanaCorreos.jtableCorreos.setModel(modelo);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e);

        }
    }

    public static void BuscarTelefonosEmpleados(String nombre) {

        String[] titulos = {"Codigo", "CodigoEmp", "Nombre", "Apellido", "Numero"};
        String[] registros = new String[5];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call BuscarTelefonoEmp('" + nombre + "')}";
        try {

            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                registros[0] = rs.getString("idTelefonoEmp");
                registros[1] = rs.getString("idEmpleados");
                registros[2] = rs.getString("NombreEmp");
                registros[4] = rs.getString("NumeroEmpleado");
                registros[3] = rs.getString("ApellidosEmp");
                modelo.addRow(registros);

            }
            ventanaTelefonos.jTableEmpleados.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e);
        }
    }

    public static void BuscarTelefonosProveedor(String nombre) {

        String[] titulos = {"Codigo", "CodigoPro", "Nombre", "Apellido", "Numero"};
        String[] registros = new String[5];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call BuscarTelefonoPro('" + nombre + "')}";
        try {

            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                registros[0] = rs.getString("idTelefonoPro");
                registros[1] = rs.getString("idProveedores");
                registros[2] = rs.getString("NombrePro");
                registros[4] = rs.getString("NumeroProveedor");
                registros[3] = rs.getString("ApellidosPro");
                modelo.addRow(registros);

            }
            ventanaTelefonos.jTableProveedores.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e);
        }
    }

    public static void BuscarReporte(String nombre) {
        String[] titulos = {"Empleado", "CodigoBebida", "FechaSalida", "NombreIngrediente", "Tamaño", "Base", "Perlas", "Leche"};
        String[] registros = new String[8];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call FiltrarDetallesBebidas('" + nombre + "')}";
        try {

            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                registros[0] = rs.getString("NombreEmp");
                registros[1] = rs.getString("idBebidas");
                registros[2] = rs.getString("FechaSalida");
                registros[3] = rs.getString("NombreIngrediente");
                registros[4] = rs.getString("ConversionTamanio(idTamanioBebida)");
                registros[5] = rs.getString("GramosBase") + " gr";
                registros[6] = rs.getString("GramosPerlas") + " gr";
                registros[7] = rs.getString("MililitrosLeche") + " ml";

                modelo.addRow(registros);

            }
            ventanaReporte.jTableReporte.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e);
        }
    }

}
