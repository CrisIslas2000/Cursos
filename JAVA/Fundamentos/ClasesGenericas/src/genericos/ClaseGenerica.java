package genericos;
/**
 * @author INFORMATICA CRIS
 */
public class ClaseGenerica<T> {
    T objeto;
    
    public ClaseGenerica(T objecto){
        this.objeto = objecto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " +objeto.getClass().getSimpleName());
    }
}
