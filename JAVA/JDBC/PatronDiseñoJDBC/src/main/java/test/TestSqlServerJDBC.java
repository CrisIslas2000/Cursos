package test;

/**
 * @author INFORMATICA CRIS
 */
import java.sql.*;

public class TestSqlServerJDBC {

    // Coneccion a Sql Server
    public static void main(String[] args) {

        var Url = "jdbc:sqlserver://localhost:1433;"
                + "database=test;"
                + "user=cris;"
                + "password=1234;"
                + "loginTimeout=30;"
                + "TrustServerCertificate=True;";
        try {
            Connection conexion = DriverManager.getConnection(Url);
            Statement instrucion = conexion.createStatement();
            var sql = "SELECT * FROM persona";
            ResultSet resultado = instrucion.executeQuery(sql);
            while (resultado.next()) {
                System.out.print("Id_persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Apellido: " + resultado.getString("apellido"));
                System.out.print(" Correo:" + resultado.getString("email"));
                System.out.print(" Telefono:" + resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instrucion.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
