
package TablaUsuario;

import Conexion.ConexionJDBC;

import java.sql.*;
public class UsuariosBD {

    Connection conexion;
    ConexionJDBC cn = new ConexionJDBC();
    PreparedStatement pst;
    ResultSet  rs;
    
    public boolean registrar(Usuarios usuario){
            String insertar = "INSERT INTO usuario (nombre,apellido ,direccion,telefono ,correoElectronico, contrasena) VALUES (?,?,?,?,?,?)";
          
            try{
                  conexion = cn.getConnection();
                pst = conexion.prepareStatement(insertar);
                pst.setString(1, usuario.getNombre());
                pst.setString(2, usuario.getApellido());
                pst.setString(3, usuario.getDireccion());
                pst.setString(4, usuario.getTelefono());
                pst.setString(5, usuario.getCorreoElectronico());
                pst.setString(6, usuario.getContrasena());
                pst.execute();
                return true;
                  
            }catch(SQLException e){
                e.getErrorCode();
                return false;
            }
    }
       public Usuarios iniciarSesion(String correo, String passwrd){
           String inicio = "SELECT * FROM usuario WHERE correoElectronico = ? AND contrasena = ?";
           Usuarios usuario = new Usuarios();
         try {
            conexion = cn.getConnection();
            pst = conexion.prepareStatement(inicio);
            pst.setString(1, correo);
            pst.setString(2, passwrd);
            rs = pst.executeQuery();

            if (rs.next()) {
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setCorreoElectronico(rs.getString("correoElectronico"));
                usuario.setContrasena(rs.getString("contrasena"));
  
            }

        } 
         
         catch (SQLException e) {
            System.out.println(e.toString());
            
        }  
            
         finally {

            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.getMessage();
            }
          
         }
       return usuario;
       
       }
     
    }
