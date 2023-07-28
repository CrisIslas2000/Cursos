package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
                
        // ------------ insertando un nuevo objeto de tipo persona ------------ 
        //Persona personaNueva = new Persona("Cristian", "Islas", "cislas@mail.com","5576870954");
        //personaDao.insertar(personaNueva);
        
        // ------------ Modificar persona ------------ 
        //Persona personaActulizar = new Persona(7,"Alan", "Morales", "cmorales@mail.com","7712983883");
        //personaDao.actualizar(personaActulizar);
        
        // ------------ Eliminando un registro ------------ 
        //Persona personaEliminar = new Persona(6);
        //personaDao.eliminar(personaEliminar);
        
        List<Persona> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
    
}
