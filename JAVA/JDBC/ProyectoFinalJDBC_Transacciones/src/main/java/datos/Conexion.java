package datos;

import java.sql.*;

/**
 * @author INFORMATICA CRIS
 */
public class Conexion {
    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;"
            + "database=test;"
            + "user=cris;"
            + "password=1234;"
            + "loginTimeout=30;"
            + "TrustServerCertificate=True;";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL);
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(PreparedStatement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
