package seguridad.modelo;

import java.sql.*;

public class clsConexion {
//    private static final String JDBC_URL = "jdbc:mysql://localhost/proyectob222022?'useSSL=false&serverTimezone=UTC";
    private static final String JDBC_URL = "jdbc:mysql://localhost/proyectobd122022?useSSL=false&serverTimezone=UTC";    
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "admin123";
   
   
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
    
}
