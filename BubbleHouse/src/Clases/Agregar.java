package Clases;

import Ventanas.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class Agregar {

    public void agregarProovedores(String nombre, String apellidos, String calleNumero, String colonia, String empresa) {
        int idCol = 0;
        int agregado = 0;
        try {
            //BUSCA SI LA COLONIA YA EXISTE
            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call BuscarColonia(?, ?)}");
            verificacion.setString(1, colonia);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            idCol = verificacion.getInt(2);

            if (idCol == 0) { //NO ENCONTRO COLONIA, SE AGREGA
                
                java.sql.CallableStatement agregarColonia;
                agregarColonia = ConexionSql.conectar.prepareCall("{call AltaColonias(?)}");
                agregarColonia.setString(1, colonia);
                agregarColonia.execute();
                agregado = 1; //VARIABLE PARA DECIR QUE SE AGREGÓ LA NUEVA COLONIA
                
            } else {

                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaProveedores(?,?,?,?,?)}");
                agregar.setString(1, nombre);
                agregar.setString(2, apellidos);
                agregar.setString(3, empresa);
                agregar.setString(4, calleNumero);
                agregar.setInt(5, idCol);
                agregar.execute();
                JOptionPane.showMessageDialog(null, "PROVEEDOR AGREGADO");

            }

            if (agregado == 1) {

                // Vuelve a buscar la colonia ya agregada
                java.sql.CallableStatement verificacionNueva;
                verificacionNueva = ConexionSql.conectar.prepareCall("{call BuscarColonia(?, ?)}");
                verificacionNueva.setString(1, colonia);
                verificacionNueva.registerOutParameter(2, Types.INTEGER);
                verificacionNueva.execute();
                idCol = verificacionNueva.getInt(2);

                // Se hace el agregado del proveedor
                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaProveedores(?,?,?,?,?)}");
                agregar.setString(1, nombre);
                agregar.setString(2, apellidos);
                agregar.setString(3, empresa);
                agregar.setString(4, calleNumero);
                agregar.setInt(5, idCol);
                agregar.execute();
                JOptionPane.showMessageDialog(null, "PROVEEDOR AGREGADO");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void agregarEmpleado(String nombre, String apellidos, String calleNumero, String colonia, String puesto) {

        int idCol = 0;
        int idPuesto = 0;
        int agregado = 0;
        int agregadoPuesto = 0;

        try {

            //BUSCA SI LA COLONIA YA EXISTE
            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call BuscarColonia(?, ?)}");
            verificacion.setString(1, colonia);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            idCol = verificacion.getInt(2);

            //BUSCA SI EL PUESTO YA EXISTE
            java.sql.CallableStatement verificacionPuesto;
            verificacionPuesto = ConexionSql.conectar.prepareCall("{call BuscarPuesto(?, ?)}");
            verificacionPuesto.setString(1, puesto);
            verificacionPuesto.registerOutParameter(2, Types.INTEGER);
            verificacionPuesto.execute();
            idPuesto = verificacionPuesto.getInt(2);

            if (idCol == 0) { //NO ENCONTRO COLONIA, SE AGREGA
                
                java.sql.CallableStatement agregarColonia;
                agregarColonia = ConexionSql.conectar.prepareCall("{call AltaColonias(?)}");
                agregarColonia.setString(1, colonia);
                agregarColonia.execute();
                agregado = 1; //VARIABLE PARA DECIR QUE SE AGREGÓ LA NUEVA COLONIA
                
            } else if (idPuesto == 0) { //NO ENCONTRO EL PUESTO, LO AGREGA
                
                java.sql.CallableStatement agregarPuesto;
                agregarPuesto = ConexionSql.conectar.prepareCall("{call AltaPuesto(?)}");
                agregarPuesto.setString(1, puesto);
                agregarPuesto.execute();
                agregadoPuesto = 1;//VARIABLE PARA DECIR QUE SE AGREGÓ
                
            } else {

                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaEmpleados(?,?,?,?,?)}");
                agregar.setString(1, nombre);
                agregar.setString(2, apellidos);
                agregar.setString(3, calleNumero);
                agregar.setInt(4, idPuesto);
                agregar.setInt(5, idCol);
                agregar.execute();
                JOptionPane.showMessageDialog(null, "EMPLEADO AGREGADO");

            }

            if (agregado == 1 && agregadoPuesto == 0) { //SE AGREGO LA COLONIA Y SE ENCONTRÓ EL PUESTO

                // Vuelve a buscar la colonia ya agregada
                java.sql.CallableStatement verificacionNueva;
                verificacionNueva = ConexionSql.conectar.prepareCall("{call BuscarColonia(?, ?)}");
                verificacionNueva.setString(1, colonia);
                verificacionNueva.registerOutParameter(2, Types.INTEGER);
                verificacionNueva.execute();
                idCol = verificacionNueva.getInt(2);

                // Se hace el agregado del empleado
                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaEmpleados(?,?,?,?,?)}");
                agregar.setString(1, nombre);
                agregar.setString(2, apellidos);
                agregar.setString(3, calleNumero);
                agregar.setInt(4, idPuesto);
                agregar.setInt(5, idCol);
                agregar.execute();
                JOptionPane.showMessageDialog(null, "EMPLEADO AGREGADO");
            }

            if (agregado == 0 && agregadoPuesto == 1) { //SE ENCONTRO LA COLONIA Y SE AGREGO EL PUESTO

                java.sql.CallableStatement verificacionnNuevaPuesto;
                verificacionnNuevaPuesto = ConexionSql.conectar.prepareCall("{call BuscarPuesto(?, ?)}");
                verificacionnNuevaPuesto.setString(1, puesto);
                verificacionnNuevaPuesto.registerOutParameter(2, Types.INTEGER);
                verificacionnNuevaPuesto.execute();
                idPuesto = verificacionnNuevaPuesto.getInt(2);

                // Se hace el agregado del empleado
                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaEmpleados(?,?,?,?,?)}");
                agregar.setString(1, nombre);
                agregar.setString(2, apellidos);
                agregar.setString(3, calleNumero);
                agregar.setInt(4, idPuesto);
                agregar.setInt(5, idCol);
                agregar.execute();
                JOptionPane.showMessageDialog(null, "EMPLEADO AGREGADO");

            }

        } catch (SQLException ex) {
        }

    }

    public void agregarIngrediente(String nombre, String marca, String tipounidadmedida, String tipoingrediente, String proveedores) {

        int idPro = 0;

        try {

            //BUSCA SI LA PROVEEDOR YA EXISTE
            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call BuscarProveedores(?, ?)}");
            verificacion.setString(1, proveedores);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            idPro = verificacion.getInt(2);

            if (idPro == 0) { //NO ENCONTRO PROVEEDORES

                JOptionPane.showMessageDialog(null, "NO EXISTE EL PROVEEDOR");

            } else {

                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaIngrediente(?,?,?,?,?)}");
                agregar.setString(1, nombre);
                agregar.setString(2, marca);
                agregar.setString(3, tipounidadmedida);
                agregar.setString(4, tipoingrediente);
                agregar.setInt(5, idPro);
                agregar.execute();
                JOptionPane.showMessageDialog(null, "INGREDIENTE AGREGADO");

            }
        } catch (SQLException ex) {

        }
    }

    public void agregarLote(String lote, String fechaCaducidad, int existencia, String ingrediente, String fechaEntrada, int valorUnitario) {
        
        int idIngrediente = 0;
        int equivalenciaExistencia = (existencia * valorUnitario) * 1000;
        
        //BUSCA SI LA PROVEEDOR YA EXISTE
        try {
            
            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call BuscarIdIngrediente(?, ?)}");
            verificacion.setString(1, ingrediente);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            idIngrediente = verificacion.getInt(2);
            
            if(idIngrediente == 0) {
                
                JOptionPane.showMessageDialog(null, "NO EXISTE EL INGREDIENTE");
                
            }
            else {
 
                try {
                     //CONVERTIR STRINGS A FECHAS SQL
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    java.util.Date utilDate1 = dateFormat.parse(fechaCaducidad);
                    java.util.Date utilDate2 = dateFormat.parse(fechaEntrada);

                    Date fechaCaducidadSql = new Date(utilDate1.getTime());
                    Date fechaEntradaSql = new Date(utilDate2.getTime());
                    //
                    java.sql.CallableStatement agregar;
                    agregar = ConexionSql.conectar.prepareCall("{call AltaLote(?,?,?,?,?,?,?)}");
                    agregar.setString(1, lote);
                    agregar.setDate(2, fechaCaducidadSql);
                    agregar.setInt(3, existencia);
                    agregar.setInt(4, valorUnitario);
                    agregar.setInt(5, equivalenciaExistencia);
                    agregar.setDate(6, fechaEntradaSql);
                    agregar.setInt(7, idIngrediente);
                    agregar.execute();
                    JOptionPane.showMessageDialog(null, "INGREDIENTE AGREGADO");
                    
                } catch (ParseException ex) {
                    Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void agregarBebida(String fechasalida, String empleado) {

    }

    public void agregarCorreo(int idpro, String correo, String depar) {
        
        try{
           
            java.sql.CallableStatement agregar;
            agregar = ConexionSql.conectar.prepareCall("{call AltaCorreoPro(?,?,?)}");
            agregar.setInt(1, idpro);
            agregar.setString(2, correo);
            agregar.setString(3, depar);
            agregar.execute();
            JOptionPane.showMessageDialog(null, "CORREO AGREGADO");
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

}
