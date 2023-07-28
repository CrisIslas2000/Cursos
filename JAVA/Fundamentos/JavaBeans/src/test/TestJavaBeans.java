package test;
/**
 * @author INFORMATICA CRIS
 */
import domain.*;

public class TestJavaBeans {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Cristian");
        persona.setApellido("Morales");
        
        System.out.println("persona = " + persona);
        
        System.out.println("persona nombre: " + persona.getNombre());
        System.out.println("persona apellido: " + persona.getApellido());
    }
}
