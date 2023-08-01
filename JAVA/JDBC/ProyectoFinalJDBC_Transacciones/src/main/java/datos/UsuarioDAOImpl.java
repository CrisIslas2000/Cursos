/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;

/**
 *
 * @author INFORMATICA CRIS
 */
public class UsuarioDAOImpl implements IUsuarioDAO {

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT * FROM usuarioo";
    private static final String SQL_INSERT = "INSERT INTO usuarioo VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE usuarioo SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuarioo WHERE id_usuario = ?";

    public UsuarioDAOImpl() {
    }

    public UsuarioDAOImpl(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<Usuario> seleccionar() throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String user = rs.getString("usuario");
                String password = rs.getString("password");
                usuario = new Usuario(idUsuario, user, password);

                usuarios.add(usuario);
            }
        } finally {
            close(rs);
            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }

        return usuarios;
    }

    @Override
    public int insertar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());

            System.out.println("Ejecutnado query: " + SQL_INSERT);
            registros = stmt.executeUpdate();
            System.out.println("Registros afectados: " + registros);

        } finally {
            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }

        return registros;

    }

    @Override
    public int actualizar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());

            System.out.println("Ejecutnado query: " + SQL_UPDATE);
            registros = stmt.executeUpdate();
            System.out.println("Registros afectados: " + registros);
        
        } finally {
            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

    @Override
    public int eliminar(Usuario usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsuario());

            System.out.println("Ejecutnado query: " + SQL_DELETE);
            registros = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + registros);
        
        } finally {
            close(stmt);
            if (this.conexionTransaccional == null) {
                close(conn);
            }
        }
        return registros;
    }

}
