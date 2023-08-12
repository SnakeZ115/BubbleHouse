package Clases;

import Ventanas.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
                agregadoPuesto = 1; //VARIABLE PARA DECIR QUE SE AGREGÓ
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

            }

            else {

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

    public void agregarLote(String lote, String fechacaducidad, String existencia, String equivaleciaexistencia, String ingrediente, String fechaentrada) {

        int idIngre = 0;
        int agregado = 0;
        try {

            //BUSCA SI EL INGREDIENTES YA EXISTE
            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call BuscarIngredientes(?, ?)}");
            verificacion.setString(1, ingrediente);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            idIngre = verificacion.getInt(2);


            if (idIngre == 0) { //NO ENCONTRO INGREDIENTE, SE AGREGA
                java.sql.CallableStatement agregarIngrediente;
                agregarIngrediente = ConexionSql.conectar.prepareCall("{call AltaIngredientes(?)}");
                agregarIngrediente.setString(1, ingrediente);
                agregarIngrediente.execute();
                agregado = 1; //VARIABLE PARA DECIR QUE SE AGREGÓ EL NUEVO INGREDIENTE
            } else {

                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaLote(?,?,?,?,?)}");
                agregar.setString(1, lote);
                agregar.setString(2, fechacaducidad);
                agregar.setString(3, existencia);
                agregar.setString(4, equivaleciaexistencia);
                agregar.setInt(5, idIngre);
                agregar.setString(6, fechaentrada);
                agregar.execute();
                JOptionPane.showMessageDialog(null, "LOTE AGREGADO");

            }
            if (agregado == 1) {

                // Vuelve a buscar el ingrediente ya agregado
                java.sql.CallableStatement verificacionNueva;
                verificacionNueva = ConexionSql.conectar.prepareCall("{call BuscarIngredientes(?, ?)}");
                verificacionNueva.setString(1, ingrediente);
                verificacionNueva.registerOutParameter(2, Types.INTEGER);
                verificacionNueva.execute();
                idIngre = verificacionNueva.getInt(2);

                // Se hace el agregado del lote
                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaLote(?,?,?,?,?)}");
                agregar.setString(1, lote);
                agregar.setString(2, fechacaducidad);
                agregar.setString(3, existencia);
                agregar.setString(4, equivaleciaexistencia);
                agregar.setInt(5, idIngre);
                agregar.setString(6, fechaentrada);
                agregar.execute();
                JOptionPane.showMessageDialog(null, "LOTE AGREGADO");
            }


        } catch (SQLException ex) {
        }

    }

    public void agregarBebida(String fechasalida, String empleado) {

        int idEmple = 0;
        int agregado = 0;
        try {

            //BUSCA SI EL EMPLEADO YA EXISTE
            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call BuscarEmpleados(?, ?)}");
            verificacion.setString(1, empleado);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            idEmple = verificacion.getInt(2);


            if (idEmple == 0) { //NO ENCONTRO EMPLEADO, SE AGREGA
                java.sql.CallableStatement agregarIngrediente;
                agregarIngrediente = ConexionSql.conectar.prepareCall("{call AltaEmpleados(?)}");
                agregarIngrediente.setString(1, empleado);
                agregarIngrediente.execute();
                agregado = 1; //VARIABLE PARA DECIR QUE SE AGREGÓ EL NUEVO 
            } else {

                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaBebida(?,?,?,?,?)}");
                agregar.setString(1, fechasalida);
                agregar.setInt(2, idEmple);
                agregar.execute();
                JOptionPane.showMessageDialog(null, "BEBIDA AGREGADA");

            }
            if (agregado == 1) {

                // Vuelve a buscar el ingrediente ya agregado
                java.sql.CallableStatement verificacionNueva;
                verificacionNueva = ConexionSql.conectar.prepareCall("{call BuscarEmpleado(?, ?)}");
                verificacionNueva.setString(1, empleado);
                verificacionNueva.registerOutParameter(2, Types.INTEGER);
                verificacionNueva.execute();
                idEmple = verificacionNueva.getInt(2);

                // Se hace el agregado del lote
                java.sql.CallableStatement agregar;
                agregar = ConexionSql.conectar.prepareCall("{call AltaBebida(?,?,?,?,?)}");
                agregar.setString(1, fechasalida);
                agregar.setInt(2, idEmple);

                agregar.execute();
                JOptionPane.showMessageDialog(null, "BEBIDA AGREGADA");
            }


        } catch (SQLException ex) {
        }

    }
}
