/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controladorDAO;

import entidades.Autorizaciones;
import entidades.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author juudi
 */
public interface AutorizacionesDao {
    int add(Autorizaciones a) throws SQLException;
    
    Autorizaciones getById(int id) throws SQLException;
        
    List<Usuario> getAll()  throws SQLException;
    
    int update(Autorizaciones a)  throws SQLException;
    
    void delete(int id)  throws SQLException;
}
