package datos;

import domain.Usuario;
import java.sql.SQLException;
import java.util.*;

/**
 * @author INFORMATICA CRIS
 */
public interface IUsuarioDAO {
    
    List<Usuario> seleccionar() throws SQLException;
    
    int insertar(Usuario usuario) throws SQLException;
    
    int actualizar(Usuario usuario) throws SQLException;
    
    int eliminar(Usuario usuario) throws SQLException;
    
}
