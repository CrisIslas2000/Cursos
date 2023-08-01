package test;

import datos.Conexion;
import datos.UsuarioDAOImpl;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author INFORMATICA CRIS
 */
public class TestUsuarioJDBC {

    public static void main(String[] args) throws SQLException {
        //UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl() {};
        // ------------ insertando un nuevo objeto de tipo usuario ------------ 
        //Usuario usuarioNuevo = new Usuario("crism","9876521");
        //usuarioDao.insertar(usuarioNuevo);
        // ------------ Modificar registro ------------ 
        //Usuario usuarioNuevo = new Usuario(1,"cislas","7712983883");
        //usuarioDao.actualizar(usuarioNuevo);
        // ------------ Eliminando un registro ------------ 
//        Usuario usuarioEliminar = new Usuario(2);
//        usuarioDao.eliminar(usuarioEliminar);
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            var usuarioDao = new UsuarioDAOImpl(conexion);

            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsuario(1);
            cambioUsuario.setUsuario("Cristian");
            cambioUsuario.setPassword("4321");
            usuarioDao.actualizar(cambioUsuario);

            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsuario("Alan");
            nuevoUsuario.setPassword("12345");
            usuarioDao.insertar(nuevoUsuario);

            conexion.commit();
            System.out.println("Se ha hecho el commit de la transaccion");

            List<Usuario> usuarios = usuarioDao.seleccionar();

            usuarios.forEach(usuario -> {
                System.out.println("Usuario = " + usuario);
            });

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }

}
