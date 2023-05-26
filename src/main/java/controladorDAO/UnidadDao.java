/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controladorDAO;

import entidades.Unidad;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author juudi
 */
public interface UnidadDao {
    int add(Unidad u) throws SQLException;
    
    Unidad getById(int id) throws SQLException;
        
    List<Unidad> getAll()  throws SQLException;
    
    int update(Unidad u)  throws SQLException;
    
    void delete(int id)  throws SQLException;
}
