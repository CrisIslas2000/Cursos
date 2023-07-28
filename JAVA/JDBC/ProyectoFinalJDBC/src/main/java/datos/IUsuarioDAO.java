package datos;

import domain.Usuario;
import java.util.*;

/**
 * @author INFORMATICA CRIS
 */
public interface IUsuarioDAO {
    List<Usuario> seleccionar();
    
    int insertar(Usuario usuario);
    
    int actualizar(Usuario usuario);
    
    int eliminar(Usuario usuario);
    
}
