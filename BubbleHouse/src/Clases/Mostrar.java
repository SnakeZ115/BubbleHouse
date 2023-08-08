
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Ventanas.*;

public class Mostrar {
    
    public static void mostrarDatosEmplpeados (){
        String[] titulos = {"Codigo", "Nombres", "Apellidos", "Calle y Numero", "Puesto", "Colonia"};
        String[] registros = new String[6];
        
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "call MostrarEmpleado";
        try{
            
            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            while (rs.next()){
                
                registros[0]=rs.getString("idEmpleados");
                registros[1]=rs.getString("NombreEmp");
                registros[2]=rs.getString("ApellidosEmp");
                registros[3]=rs.getString("CalleNumero");
                registros[4]=rs.getString("Puesto_idPuesto");
                registros[5]=rs.getString("COlonias_idCOlonia");
                
                modelo.addRow(registros);
            }
            ventanaEmpleados.jTablempleados.setModel(modelo);
        }
        catch(Exception e){
               
            JOptionPane.showMessageDialog(null,"ERROR "+e);

        }
    }
    
    public static void mostrarDatosLotes (){
        String[] titulos = {"Codigo", "Lote", "Caducidad", "Existencia", "Equivalencia", "Ingredeintes", "Entrada"};
        String[] registros = new String[7];
        
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "select * from lotes"; //Agregar procedimiento almacenado
        try{
            
            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            while (rs.next()){
                
                registros[0]=rs.getString("Idlote");
                registros[1]=rs.getString("Lotes");
                registros[2]=rs.getString("FechaCaducidad");
                registros[3]=rs.getString("Existencia");
                registros[4]=rs.getString("EquivalenciaExistencia");
                registros[5]=rs.getString("Ingredientes_idIngredientes");
                registros[6]=rs.getString("FechaEntrada");
                
                modelo.addRow(registros);
            }
            ventanaLote.jTableLotes.setModel(modelo);
        }
        catch(Exception e){
               
            JOptionPane.showMessageDialog(null,"ERROR "+e);

        }
    }
    public static void mostrarDatosIngredientes(){
        String[] titulos = {"Codigo", "Ingrediente", "Marca", "UnidadMedida", "TipoIngrediente", "Proveedor"};
        String[] registros = new String[6];
        
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "select * from ingredientes"; //Agregar procedimiento almacenado
        try{
            
            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            while (rs.next()){
                
                registros[0]=rs.getString("IdIngrediente");
                registros[1]=rs.getString("NombreIngrediente");
                registros[2]=rs.getString("Marca");
                registros[3]=rs.getString("TipoUnidadMedida");
                registros[4]=rs.getString("TipoIngrediente");
                registros[5]=rs.getString("Proveedor_idProveedores");                
                modelo.addRow(registros);
            }
            ventanaIngrediente.jTableIngredientes.setModel(modelo);
        }
        catch(Exception e){
               
            JOptionPane.showMessageDialog(null,"ERROR "+e);

        }
    }
    
        public static void mostrarDatosProveedores(){
        String[] titulos = {"Codigo", "Nombre", "Apellidos", "Empresa", "Direccion", "Colonia"};
        String[] registros = new String[6];
        
        DefaultTableModel modelo=new DefaultTableModel(null, titulos);
        String SQL = "select * from proveedores"; //Agregar procedimiento almacenado
        try{
            
            Statement st = ConexionSql.conectar.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            
            while (rs.next()){
                
                registros[0]=rs.getString("IdProveedores");
                registros[1]=rs.getString("NombrePro");
                registros[2]=rs.getString("ApellidosPro");
                registros[3]=rs.getString("NombreEmpresa");
                registros[4]=rs.getString("CalleNumero");
                registros[5]=rs.getString("Colonias_idColonia");                
                modelo.addRow(registros);
            }
            ventanaProovedores.jTableProveedores.setModel(modelo);
        }
        catch(Exception e){
               
            JOptionPane.showMessageDialog(null,"ERROR "+e);

        }
    }
}
