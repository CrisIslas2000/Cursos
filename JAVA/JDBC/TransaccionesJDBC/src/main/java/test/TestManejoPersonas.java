package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConecction();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDAO personaDao = new PersonaDAO(conexion);
            
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(3);
            cambioPersona.setNombre("Memo");
            cambioPersona.setApellido("Guzman");
            cambioPersona.setEmail("mguzma@mail.com");
            cambioPersona.setTelefono("7715571365");
            personaDao.actualizar(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Emma");
          //  nuevaPersona.setApellido("Islasggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg");
            nuevaPersona.setEmail("eislas@mail.com");
            nuevaPersona.setTelefono("7715331365");
            personaDao.insertar(nuevaPersona);
            
            conexion.commit();
            System.out.println("Se ha hecho el commit de la transaccion");

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
