package excepciones;
/**
 * @author INFORMATICA CRIS
 */
public class OperacionExcepcion extends RuntimeException{
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
