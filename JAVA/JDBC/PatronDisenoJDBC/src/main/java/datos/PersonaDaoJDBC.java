package datos;

import static datos.Conexion.*;
import java.sql.*;
import java.util.*;
/**
 * @author INFORMATICA CRIS
 */
// ------------------  DAO = DATA ACCESS OBJECT --------------------
public class PersonaDaoJDBC implements IPersonaDao{

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona (nombre, apellido, email, telefono) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    public PersonaDaoJDBC() {
    }

    public PersonaDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<domain.PersonaDTO> seleccionar() throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        domain.PersonaDTO persona = null;
        List<domain.PersonaDTO> personas = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConecction();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new domain.PersonaDTO(idPersona, nombre, apellido, email, telefono);

                personas.add(persona);
            }
            
        } finally {

            close(rs);
            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }

        return personas;
    }

    public int insertar(domain.PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConecction();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());

            System.out.println("Ejecutando query:" + SQL_INSERT);
            registros = stmt.executeUpdate();
            System.out.println("Registro insertado:" + registros);

        } finally {

            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

    public int actualizar(domain.PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConecction();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());

            System.out.println("Ejecutando query:" + SQL_UPDATE);
            registros = stmt.executeUpdate();
            System.out.println("Registro actualizado:" + registros);

        } finally {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
        }
        return registros;
    }

    public int eliminar(domain.PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConecction();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());

            System.out.println("Ejecutando query: " + SQL_DELETE);
            registros = stmt.executeUpdate();
            System.out.println("Registro eliminado:" + registros);

        } finally {
                close(stmt);
                if (this.conexionTransaccional == null) {
                    close(conn);
                }
        }
        return registros;
    }
}
