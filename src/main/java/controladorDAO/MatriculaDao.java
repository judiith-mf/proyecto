/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controladorDAO;

import entidades.Matricula;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author juudi
 */
public interface MatriculaDao {
     int add(Matricula m) throws SQLException;
    
    Matricula getById(int id) throws SQLException;
        
    List<Matricula> getAll()  throws SQLException;
    
    int update(Matricula m)  throws SQLException;
    
    void delete(int id)  throws SQLException;
}
