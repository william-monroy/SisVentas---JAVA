
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class connSQL {
    Connection conectar = null;
    
        public Connection conexion(){
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sisventas?characterEncoding=latin1", "root", "12345678");
                //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error de Conexion: "+e.getMessage());
            }
            return conectar;
        }
        
        public ResultSet consulta(String sql){
            connSQL cc = new connSQL();
            Connection con = cc.conexion();
            
            ResultSet res = null;
            try{
                PreparedStatement pstm = con.prepareStatement(sql);
                res = pstm.executeQuery();
            }catch(SQLException e){
                System.out.println("Error: "+e.getMessage());
            }
            return res;
        }
        
        public DefaultComboBoxModel cmbmodel(String sql, String txt,String columna){
            DefaultComboBoxModel lista = new DefaultComboBoxModel();
            lista.addElement(txt);
            ResultSet res = this.consulta(sql);
            try{
                while(res.next()){
                    lista.addElement(res.getString(columna));
                }                        
                res.close();
            }catch(SQLException e){
                System.out.println("Error: "+e.getMessage());
            }
            return lista;
        }
        
}


