/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author INFORMATICA CRIS
 */
public interface IPersonaDao {
    
    public List<PersonaDTO> seleccionar() throws SQLException;
    
    public int  insertar(PersonaDTO persona) throws SQLException;
    
     public int  actualizar(PersonaDTO persona) throws SQLException;
     
      public int  eliminar(PersonaDTO persona) throws SQLException;
}
