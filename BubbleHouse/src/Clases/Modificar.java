package Clases;

import java.lang.reflect.Array;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Modificar {

    public void modificarEmpleado(int id, String nombre, String apellidos, String calleNumero, String colonia, String puesto) {

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
                agregadoPuesto = 1; //VARIABLE PARA DECIR QUE SE AGREGÓ
            } else {
                java.sql.CallableStatement modificar;
                modificar = ConexionSql.conectar.prepareCall("{call ModificarEmpleados(?,?,?,?,?,?)}");
                modificar.setInt(1, id);
                modificar.setString(2, nombre);
                modificar.setString(3, apellidos);
                modificar.setString(4, calleNumero);
                modificar.setInt(5, idPuesto);
                modificar.setInt(6, idCol);
                modificar.execute();
                JOptionPane.showMessageDialog(null, "EMPLEADO MODIFICADO");

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
                java.sql.CallableStatement modificar;
                modificar = ConexionSql.conectar.prepareCall("{call ModificarEmpleados(?,?,?,?,?,?)}");
                modificar.setInt(1, id);
                modificar.setString(2, nombre);
                modificar.setString(3, apellidos);
                modificar.setString(4, calleNumero);
                modificar.setInt(5, idPuesto);
                modificar.setInt(6, idCol);
                modificar.execute();
                JOptionPane.showMessageDialog(null, "EMPLEADO MODIFICADO");
            }

            if (agregado == 0 && agregadoPuesto == 1) { //SE ENCONTRO LA COLONIA Y SE AGREGO EL PUESTO

                java.sql.CallableStatement verificacionnNuevaPuesto;
                verificacionnNuevaPuesto = ConexionSql.conectar.prepareCall("{call BuscarPuesto(?, ?)}");
                verificacionnNuevaPuesto.setString(1, puesto);
                verificacionnNuevaPuesto.registerOutParameter(2, Types.INTEGER);
                verificacionnNuevaPuesto.execute();
                idPuesto = verificacionnNuevaPuesto.getInt(2);

                // Se hace el agregado del empleado
                java.sql.CallableStatement modificar;
                modificar = ConexionSql.conectar.prepareCall("{call ModificarEmpleados(?,?,?,?,?,?)}");
                modificar.setInt(1, id);
                modificar.setString(2, nombre);
                modificar.setString(3, apellidos);
                modificar.setString(4, calleNumero);
                modificar.setInt(5, idPuesto);
                modificar.setInt(6, idCol);
                modificar.execute();
                JOptionPane.showMessageDialog(null, "EMPLEADO MODIFICADO");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hay un error: " + ex);
        }

    }

    public void modificarIngrediente(int id, String nombre, String marca, String tipounidadmedida, String tipoingrediente, String proveedores) {

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

                java.sql.CallableStatement modificar;
                modificar = ConexionSql.conectar.prepareCall("{call ModificarIngrediente(?,?,?,?,?,?)}");
                modificar.setInt(1, id);
                modificar.setString(2, nombre);
                modificar.setString(3, marca);
                modificar.setString(4, tipounidadmedida);
                modificar.setString(5, tipoingrediente);
                modificar.setInt(6, idPro);
                modificar.execute();
                JOptionPane.showMessageDialog(null, "INGREDIENTE MODIFICADO");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public void modificarProovedores(int id, String nombre, String apellidos, String calleNumero, String colonia, String empresa) {
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

                java.sql.CallableStatement modificar;
                modificar = ConexionSql.conectar.prepareCall("{call ModificarProveedores (?,?,?,?,?,?)}");
                modificar.setInt(1, id);
                modificar.setString(2, nombre);
                modificar.setString(3, apellidos);
                modificar.setString(4, empresa);
                modificar.setString(5, calleNumero);
                modificar.setInt(6, idCol);
                modificar.execute();
                JOptionPane.showMessageDialog(null, "PROVEEDOR MODIFICADO");

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
                java.sql.CallableStatement modificar;
                modificar = ConexionSql.conectar.prepareCall("{call ModificarProveedores (?,?,?,?,?,?)}");
                modificar.setInt(1, id);
                modificar.setString(2, nombre);
                modificar.setString(3, apellidos);
                modificar.setString(4, empresa);
                modificar.setString(5, calleNumero);
                modificar.setInt(6, idCol);
                modificar.execute();
                JOptionPane.showMessageDialog(null, "PROVEEDOR MODIFICADO");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex);
        }
    }

    public void modificarCorreoPro(int idcorreo, int idpro, String correo, String departamento) {
        try {
            java.sql.CallableStatement modificar;
            modificar = ConexionSql.conectar.prepareCall("call ModificarCorreoPro (?,?,?,?)");

            modificar.setInt(4, idcorreo);
            modificar.setInt(1, idpro);
            modificar.setString(2, correo);
            modificar.setString(3, departamento);

            modificar.execute();
            JOptionPane.showMessageDialog(null, "CORREO MODIFICADO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex);
        }
    }

    public void modificarLote(int idLote, String lote, String fechaCaducidad, int existencia, String ingrediente, String fechaEntrada, int valorUnitario) {

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

            if (idIngrediente == 0) {

                JOptionPane.showMessageDialog(null, "NO EXISTE EL INGREDIENTE");

            } else {

                try {
                    //CONVERTIR STRINGS A FECHAS SQL
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                    java.util.Date utilDate1 = dateFormat.parse(fechaCaducidad);
                    java.util.Date utilDate2 = dateFormat.parse(fechaEntrada);

                    Date fechaCaducidadSql = new Date(utilDate1.getTime());
                    Date fechaEntradaSql = new Date(utilDate2.getTime());
                    //
                    java.sql.CallableStatement modificar;
                    modificar = ConexionSql.conectar.prepareCall("{call ModificarLote(?,?,?,?,?,?,?,?)}");
                    modificar.setInt(1, idLote);
                    modificar.setString(2, lote);
                    modificar.setDate(3, fechaCaducidadSql);
                    modificar.setInt(4, existencia);
                    modificar.setInt(5, valorUnitario);
                    modificar.setInt(6, equivalenciaExistencia);
                    modificar.setDate(7, fechaEntradaSql);
                    modificar.setInt(8, idIngrediente);
                    modificar.execute();
                    JOptionPane.showMessageDialog(null, "INGREDIENTE MODIFICADO");

                } catch (ParseException ex) {
                    Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void ModificarTelefonoEmpleado(int idNumero, int id, String telefono) {

        int respuestaId = 0;

        try {

            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call BuscarIdEmpleado(?, ?)}");
            verificacion.setInt(1, id);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            respuestaId = verificacion.getInt(2);

            if (respuestaId == 0) {

                JOptionPane.showMessageDialog(null, "EMPLEADO INEXISTENTE");

            } else {
                
                try {

                    java.sql.CallableStatement modificar;
                    modificar = ConexionSql.conectar.prepareCall("{call ModificarTelefonoEmpl(?,?,?)}");
                    modificar.setInt(1, idNumero);
                    modificar.setInt(2, id);
                    modificar.setString(3, telefono);
                    modificar.execute();
                    JOptionPane.showMessageDialog(null, "TELÉFONO MODIFICADO");

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, "Error: " + ex);

                }
                
            }

        } catch (SQLException ex) {

            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
    public void ModificarTelefonoProovedor(int idNumero, int id, String telefono) {

        int respuestaId = 0;

        try {

            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call BuscarIdProovedor(?, ?)}");
            verificacion.setInt(1, id);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            respuestaId = verificacion.getInt(2);

            if (respuestaId == 0) {

                JOptionPane.showMessageDialog(null, "PROOVEDOR INEXISTENTE");

            } else {

                try {

                    java.sql.CallableStatement modificar;
                    modificar = ConexionSql.conectar.prepareCall("{call ModificarTelefonoPro(?,?,?)}");
                    modificar.setInt(1, idNumero);
                    modificar.setInt(2, id);
                    modificar.setString(3, telefono);
                    modificar.execute();
                    JOptionPane.showMessageDialog(null, "TELÉFONO MODIFICADO");

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, "Error: " + ex);

                }

            }

        } catch (SQLException ex) {

            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
}
