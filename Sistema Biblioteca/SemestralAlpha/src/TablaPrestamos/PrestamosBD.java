/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package TablaPrestamos;

import Conexion.ConexionJDBC;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PrestamosBD {
        ConexionJDBC conexion = new ConexionJDBC();
        Connection cnnt;
        PreparedStatement st;
        ResultSet rs;
    
    public  List Listar() {
        List<Prestamos> lista = new ArrayList();
        String sql = "SELECT * FROM prestamos";
        try {
            cnnt = conexion.getConnection();

            st = cnnt.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Prestamos pre = new Prestamos();
                pre.setIdPrestamo(rs.getInt("idprestamo"));
                pre.setIdLibro(rs.getInt("idLibro"));
                pre.setIdUsuario(rs.getInt("idUsuario"));
                pre.setFechaPrestamo(rs.getString("fechaPrestamo"));
                pre.setFechaDevolucion(rs.getString("fechaDevolucion"));
                pre.setDevuelto(rs.getInt("estadoDeDevolucion"));
                lista.add(pre);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return lista;
    }
    
     public boolean registrarPrestamo(Prestamos pre) {
        String sql = "INSERT INTO prestamos (idLibro, idUsuario, fechaPrestamo, fechaDevolucion,estadoDeDevolucion) VALUES (?,?,?,?,?)";
       
        try {
             cnnt = conexion.getConnection();
            st = cnnt.prepareStatement(sql);
            st.setInt(1, pre.getIdUsuario());
            st.setInt(2, pre.getIdLibro());
            st.setString(3, pre.getFechaPrestamo());
            st.setString(4, pre.getFechaDevolucion());
            st.setInt(5, pre.getDevuelto());
            st.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }
    
     public boolean actualizarLibro(int id) {
        boolean res;
        String sql = "UPDATE prestamos SET estadoDeDevolucion=? WHERE id = ?";
    
        try {
            cnnt = conexion.getConnection();
            st = cnnt.prepareStatement(sql);
            st.setInt(1, 0);
            st.setInt(2, id);
            st.execute();
            res = true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            res = false;
        }
        return res;
    }
    
    
}
