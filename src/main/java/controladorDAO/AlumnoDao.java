/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controladorDAO;

import entidades.Alumno;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author juudi
 */
public interface AlumnoDao {
    int add(Alumno a) throws SQLException;
    
    Alumno getById(int id) throws SQLException;
        
    List<Alumno> getAll()  throws SQLException;
    
    int update(Alumno a)  throws SQLException;
    
    void delete(int id)  throws SQLException;
}
