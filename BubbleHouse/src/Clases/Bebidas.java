
package Clases;

import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;

public class Bebidas {
        
        public void altaDetallesBebidas(int idIngrediente, int idTamaño, int idBebida) {
            try {
                java.sql.CallableStatement alta;
                alta = ConexionSql.conectar.prepareCall("{call AltaDetalleBebidas(?,?,?)}");
                alta.setInt(1, idBebida);
                alta.setInt(2, idIngrediente);
                alta.setInt(3, idTamaño);
                alta.execute();
            } catch (SQLException ex) {
                Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        public void registrarBebida(int idBase, int idLeche, int idPerlas, String cajero, int idTamanio) {
            try {
                
                java.sql.CallableStatement buscar;
                buscar = ConexionSql.conectar.prepareCall("{call BuscarIdEmpleado(?,?)}");
                buscar.setString(1, cajero);
                buscar.registerOutParameter(2, Types.INTEGER);
                buscar.execute();
                int id = buscar.getInt(2);
                
                Date fecha = new Date();
                java.sql.Date fechaDB = new java.sql.Date(fecha.getTime());
                java.sql.CallableStatement registrar;
                registrar = ConexionSql.conectar.prepareCall("{call AltaBebidas(?,?)}");
                registrar.setDate(1, fechaDB);
                registrar.setInt(2, id);
                registrar.execute();
                
                buscar = ConexionSql.conectar.prepareCall("{call BuscarIdBebida(?)}");
                buscar.registerOutParameter(1, Types.INTEGER);
                buscar.execute();
                int idBebida = buscar.getInt(1);
                
                altaDetallesBebidas(idBase, idTamanio, idBebida);
                altaDetallesBebidas(idLeche, idTamanio, idBebida);
                altaDetallesBebidas(idPerlas, idTamanio, idBebida);
               
                JOptionPane.showConfirmDialog(null, "BEBIDA REGISTRADA");
                
            } catch (SQLException ex) {
                Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public double obtenerValor(int idLote) {
            
            try {
                java.sql.CallableStatement obtener;
                obtener = ConexionSql.conectar.prepareCall("{call ObtenerValor(?,?)}");
                obtener.setInt(1, idLote);
                obtener.registerOutParameter(2, Types.INTEGER);
                obtener.execute();
                int valorUnitario = obtener.getInt(2);
                
                return valorUnitario;
            } catch (SQLException ex) {
                Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return 0;
        }
        
        public void eliminarLote(int idLote){
            try {
                java.sql.CallableStatement eliminar;
                eliminar = ConexionSql.conectar.prepareCall("{call EliminarLote(?)}");
                eliminar.setInt(1, idLote);
                eliminar.execute();
            } catch (SQLException ex) {
                Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        public double obtenerExistencia(int idLote){
            try {
                java.sql.CallableStatement obtener;
                obtener = ConexionSql.conectar.prepareCall("{call obtenerExistencia(?, ?)}");
                obtener.setInt(1, idLote);
                obtener.registerOutParameter(2, Types.DOUBLE);
                obtener.execute();
                double equivalencia = obtener.getDouble(2);
                if(equivalencia != 0.0){
                    return equivalencia;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return 0;
        }
        
        public void restarExistencia(int idLoteAntiguo, double existencia) {
            try {
                
                java.sql.CallableStatement restar;
                /*
                restar = ConexionSql.conectar.prepareCall("{call restarEquivalenciaIngrediente(?, ?)}");
                restar.setInt(1, idLoteAntiguo);
                restar.setInt(2, cantidad);
                restar.execute();
                */
                
                
                restar = ConexionSql.conectar.prepareCall("{call restarEnExistencia(?, ?)}");
                restar.setDouble(1, existencia);
                restar.setInt(2, idLoteAntiguo);
                restar.execute();
                
            } catch (SQLException ex) {
                Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public int loteAntiguo(int idIngrediente) {
            try {
                java.sql.CallableStatement verificacion;
                verificacion = ConexionSql.conectar.prepareCall("{call loteMasAntiguo(?, ?)}");
                verificacion.setInt(1, idIngrediente);
                verificacion.registerOutParameter(2, Types.INTEGER);
                verificacion.execute();
                int idLote = verificacion.getInt(2);
                
                if(idLote != 0){
                   
                    return idLote;
                }
                else{
                    return 0;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
            }
            return 0;
        }
        
        public int comprobarLote(int idIngrediente) {
        try {
            
            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call comprobarLote(?, ?)}");
            verificacion.setInt(1, idIngrediente);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            int idLote = verificacion.getInt(2);
            if(idLote != 0){
                return idIngrediente;
            }
            else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public int comprobarIngrediente(String ingrediente) {
        try {
            java.sql.CallableStatement verificacion;
            verificacion = ConexionSql.conectar.prepareCall("{call BuscarIdIngrediente(?, ?)}");
            verificacion.setString(1, ingrediente);
            verificacion.registerOutParameter(2, Types.INTEGER);
            verificacion.execute();
            int idIngrediente = verificacion.getInt(2);
            if(idIngrediente != 0){
                return idIngrediente;
            }
            else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Bebidas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public void tamaño(int idTamaño, int idLoteBase, int idLoteLeche, int idLotePerlas, String cajero){
        
        double gBase = 0;
        double gPerlas = 0;
        double mlLeche = 0;
        
        
        try {
            java.sql.CallableStatement tamaño;
            tamaño = ConexionSql.conectar.prepareCall("{call extraerDatos(?,?,?,?)}");
            tamaño.setInt(1, idTamaño);
            tamaño.registerOutParameter(2, Types.INTEGER);
            tamaño.registerOutParameter(3, Types.INTEGER);
            tamaño.registerOutParameter(4, Types.INTEGER);
            tamaño.execute();
            
            gBase = tamaño.getInt(2);  
            gPerlas = tamaño.getInt(3);
            mlLeche = tamaño.getInt(4);
            
            int idLoteAntiguoBase = loteAntiguo(idLoteBase);
            int idLoteAntiguoLeche = loteAntiguo(idLoteLeche);
            int idLoteAntiguoPerlas = loteAntiguo(idLotePerlas);
            
            JOptionPane.showConfirmDialog(null, idLoteAntiguoLeche);
            JOptionPane.showConfirmDialog(null, idLoteAntiguoBase);
            JOptionPane.showConfirmDialog(null, idLoteAntiguoPerlas);
            
            double restaExistenciaBase = (gBase / obtenerValor(idLoteAntiguoBase));
            double restaExistenciaLeche = (mlLeche / obtenerValor(idLoteAntiguoLeche)); 
            double restaExistenciaPerlas = (gPerlas / obtenerValor(idLoteAntiguoPerlas));
            
            double existenciaBase = obtenerExistencia(idLoteAntiguoBase);
            double existenciaLeche = obtenerExistencia(idLoteAntiguoLeche);
            
            double restanteLeche;
            double restanteBase;
            
            JOptionPane.showConfirmDialog(null, existenciaLeche + "  " + restaExistenciaLeche);
            
            if(existenciaBase < restaExistenciaBase && existenciaLeche < restaExistenciaLeche){
 
                restanteBase = restaExistenciaBase - existenciaBase;
                restanteBase = restanteBase * obtenerValor(idLoteAntiguoBase);
                eliminarLote(idLoteAntiguoBase);
                
                idLoteAntiguoBase = loteAntiguo(idLoteBase);
                
                restaExistenciaBase = (restanteBase / obtenerValor(idLoteAntiguoBase));
                
                restanteLeche = restaExistenciaLeche - existenciaLeche;
                restanteLeche = restanteLeche * obtenerValor(idLoteAntiguoLeche);
                eliminarLote(idLoteAntiguoLeche);
                
                idLoteAntiguoLeche = loteAntiguo(idLoteLeche);
                
                restaExistenciaLeche = (restanteLeche / obtenerValor(idLoteAntiguoLeche));
                
                restarExistencia(idLoteAntiguoLeche, restaExistenciaLeche);
                restarExistencia(idLoteAntiguoBase, restaExistenciaBase);
                restarExistencia(idLoteAntiguoPerlas, restaExistenciaPerlas);
                
            }
            else if(existenciaBase < restaExistenciaBase){
                
                restanteBase = restaExistenciaBase - existenciaBase;
                restanteBase = restanteBase * obtenerValor(idLoteAntiguoBase);
                eliminarLote(idLoteAntiguoBase);
                
                idLoteAntiguoBase = loteAntiguo(idLoteBase);
                
                restaExistenciaBase = (restanteBase / obtenerValor(idLoteAntiguoBase));
                
                restarExistencia(idLoteAntiguoLeche, restaExistenciaLeche);
                restarExistencia(idLoteAntiguoBase, restaExistenciaBase);
                restarExistencia(idLoteAntiguoPerlas, restaExistenciaPerlas);
                
            }
            else if(existenciaLeche < restaExistenciaLeche){
                
                restanteLeche = restaExistenciaLeche - existenciaLeche;
                restanteLeche = restanteLeche * obtenerValor(idLoteAntiguoLeche);
                eliminarLote(idLoteAntiguoLeche);
                
                idLoteAntiguoLeche = loteAntiguo(idLoteLeche);
                
                restaExistenciaLeche = (restanteLeche / obtenerValor(idLoteAntiguoLeche));
                
                restarExistencia(idLoteAntiguoLeche, restaExistenciaLeche);
                restarExistencia(idLoteAntiguoBase, restaExistenciaBase);
                restarExistencia(idLoteAntiguoPerlas, restaExistenciaPerlas);
                
            }
            else {
                restarExistencia(idLoteAntiguoBase, restaExistenciaBase);
                restarExistencia(idLoteAntiguoLeche, restaExistenciaLeche);
                restarExistencia(idLoteAntiguoPerlas, restaExistenciaPerlas);                
            }
     
             JOptionPane.showMessageDialog(null, "BEBIDA HECHA");
            
             
        } catch (Exception e) {
            
            JOptionPane.showConfirmDialog(null, "Error" + e);
        }

        
    }
    
}
