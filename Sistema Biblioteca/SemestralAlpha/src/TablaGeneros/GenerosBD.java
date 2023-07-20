

package TablaGeneros;

import Conexion.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class GenerosBD {
 
    Connection conexion ;
    ConexionJDBC cn= new ConexionJDBC();
    PreparedStatement ps;
     ResultSet rs;
     
     
     public void listarGeneros(String tabla, JTable visor){
     
        String sql = "Select * from " + tabla;
        
   
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id_Genero");
        model.addColumn("Genero");
         visor.setModel(model);
        String [] dato = new String[2];
         try{
               conexion = cn.getConnection();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while(rs.next())
            {      
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
              model.addRow(dato);
            }
        
     }catch(SQLException e){
            e.printStackTrace();
     }}
    
    
}
