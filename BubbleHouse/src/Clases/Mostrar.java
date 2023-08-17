package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Ventanas.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class Mostrar {

    public void mostrarCajeros() {
        try {
            String SQL = "{call MostrarCajeros}";
            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                ventanaSalidas.cmbCajeros.addItem(rs.getString("NombreEmp"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void mostrarDatosEmpleados() {
        String[] titulos = {"Codigo", "Nombres", "Apellidos", "Calle y Numero", "Puesto", "Colonia"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call MostrarEmpleado}";
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

    public static void mostrarDatosIngredientes() {
        String[] titulos = {"Codigo", "Ingrediente", "Marca", "UnidadMedida", "TipoIngrediente", "Proveedor"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{Call MostrarIngrediente}";
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

    public static void mostrarDatosProveedores() {
        String[] titulos = {"Codigo", "Nombre", "Apellidos", "Empresa", "Direccion", "Colonia"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call MostrarProveedores}";
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

    public static void mostrarDatosProveedoresCorreos() {
        String[] titulos = {"CodigoCorreo", "CodigoProveedor", "Nombre", "Apellidos", "Correo", "Empresa", "Departamento"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call MostrarCorreoPro}";
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

    public static void mostrarDatosLotes() {

        String[] titulos = {"Codigo", "Lote", "FechaCaducidad", "Existencia", "ValorUnitario", "Ingrediente", "FechaEntrada"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call MostrarLotes}";
        try {
            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("idLote");
                registros[1] = rs.getString("Lotes");
                registros[2] = rs.getString("FechaCaducidad");
                registros[3] = rs.getString("Existencia");
                registros[4] = rs.getString("ValorUnitario");
                registros[5] = rs.getString("NombreIngrediente");
                registros[6] = rs.getString("FechaEntrada");
                modelo.addRow(registros);
            }
            ventanaLote.jTableLotes.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e);
        }

    }

    public static void mostrarDatosTelefonosEmpleados() {

        String[] titulos = {"Codigo", "CodigoEmp", "Nombre", "Apellido", "Numero"};
        String[] registros = new String[5];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call mostrarTelefonosEmpleados}";
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

    public static void mostrarDatosTelefonosProveedor() {

        String[] titulos = {"Codigo", "CodigoPro", "Nombre", "Apellido", "Numero"};
        String[] registros = new String[5];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call mostrarTelefonosProovedor}";
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

    public static void mostrarReporte() {

        String[] titulos = {"Empleado", "CodigoBebida", "FechaSalida", "NombreIngrediente", "Tamaño", "Base", "Perlas", "Leche"};
        String[] registros = new String[8];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "{call mostrarDetallesBebidas}";
        try {

            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                registros[0] = rs.getString("NombreEmp");
                registros[1] = rs.getString("idBebidas");
                registros[2] = rs.getString("FechaSalida");
                registros[3] = rs.getString("NombreIngrediente");
                registros[4] = rs.getString("ConversionTamanio(idTamanioBebida)");
                registros[5] = rs.getString("GramosBase")+ " gr";
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
