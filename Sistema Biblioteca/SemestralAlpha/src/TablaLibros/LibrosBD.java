

package TablaLibros;

import Conexion.ConexionJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class LibrosBD {

        Connection conexion ;
    ConexionJDBC cn= new ConexionJDBC();
    PreparedStatement ps;
     ResultSet rs;
     
     public void listarLibros(String tabla, JTable visor){
     
        String sql = "Select * from " + tabla;
        
   
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID_Titulo");
        model.addColumn("Titulo");
        model.addColumn("Autor");
        model.addColumn("Genero");
        model.addColumn("ISBN");
        model.addColumn("Fecha de Publicacion");
        model.addColumn("Editorial");
        model.addColumn("Disponibilidad");
  
         visor.setModel(model);
        String [] dato = new String[8];
         try{
               conexion = cn.getConnection();
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            while(rs.next())
            {      
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(7);
                dato[7] = rs.getString(8);
                model.addRow(dato);
            }
        
     }catch(SQLException e){
            e.printStackTrace();
     }}
    
    
    
    
}
