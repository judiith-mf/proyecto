/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controladorDAO;

import entidades.Curso;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author juudi
 */
public interface CursoDao {
    int add(Curso cur) throws SQLException;
    
    Curso getById(int id) throws SQLException;
        
    List<Curso> getAll()  throws SQLException;
    
    int update(Curso cur)  throws SQLException;
    
    void delete(int id)  throws SQLException;
}
