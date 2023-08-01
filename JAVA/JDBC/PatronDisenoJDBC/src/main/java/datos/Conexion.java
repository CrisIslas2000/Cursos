package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

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

//Pool de conexiones    
    public static DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        //Definimos el tamaño inicial del pool de conexion
        ds.setInitialSize(5);
        return ds;
    }

    public static Connection getConecction() throws SQLException {
        return getDataSource().getConnection();
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
