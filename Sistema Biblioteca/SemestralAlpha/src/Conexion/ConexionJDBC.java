package Conexion;

import java.sql.*;

public class  ConexionJDBC {
    private static final String JDBC_URL ="jdbc:mysql://localhost:3306/sistemabiblioteca?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER= "root";
    private static final String JDBC_PASSWORD= "DeepBase";
    

    public Connection getConnection()throws SQLException{
              return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    }
    
     public void close(ResultSet rs)throws SQLException{
        rs.close();
    }
     public  void close(Statement smtm)throws SQLException{
        smtm.close();
    }
      public  void close(PreparedStatement smtm)throws SQLException{
        smtm.close();
    }
      public  void close(Connection conn)throws SQLException{
        conn.close();
    }
}
