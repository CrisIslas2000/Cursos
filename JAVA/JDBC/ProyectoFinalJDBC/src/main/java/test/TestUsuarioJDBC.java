package test;

import datos.UsuarioDAOImpl;
import domain.Usuario;
import java.util.List;

/**
 * @author INFORMATICA CRIS
 */
public class TestUsuarioJDBC {
    public static void main(String[] args) {
        UsuarioDAOImpl usuarioDao = new UsuarioDAOImpl();
    
    // ------------ insertando un nuevo objeto de tipo usuario ------------ 
        //Usuario usuarioNuevo = new Usuario("crism","9876521");
        //usuarioDao.insertar(usuarioNuevo);
        
        // ------------ Modificar registro ------------ 
        //Usuario usuarioNuevo = new Usuario(1,"cislas","7712983883");
        //usuarioDao.actualizar(usuarioNuevo);
        
        // ------------ Eliminando un registro ------------ 
//        Usuario usuarioEliminar = new Usuario(2);
//        usuarioDao.eliminar(usuarioEliminar);
        
        List<Usuario> usuarios = usuarioDao.seleccionar();
        
        usuarios.forEach(usuario -> {
            System.out.println("Usuario = " + usuario);
        });
    }
    
}
