/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorDAO;

import BD.MyDataSource;
import entidades.Alumno;
import entidades.Personal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juudi
 */
public class PersonalDaoImp implements PersonalDao{

    private static PersonalDaoImp instance;
    
    static{
        instance=new PersonalDaoImp();
    }
    
    public PersonalDaoImp(){ }
    
    public static PersonalDaoImp getInstance(){
        return instance;
    }
    
    @Override
    public int add(Personal p) throws SQLException {
        String sql="""
                  insert into personal(dni,nombre,apellido1,apellido2,telefono,email,direccion,poblacion,provincia,cp,tipo)
                  values (?,?,?,?,?,?,?,?,?,?,?)
                  """;
      int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setString(1, p.getDni());
            pstm.setString(2, p.getNombre());
            pstm.setString(3, p.getApellido1());
            pstm.setString(4, p.getApellido2());
            pstm.setString(5, p.getTelefono());
            pstm.setString(6, p.getEmail());
            pstm.setString(7, p.getDireccion());
            pstm.setString(8, p.getPoblacion());
            pstm.setString(9, p.getProvincia());
            pstm.setString(10, p.getCp());
            pstm.setInt(11, p.getTipo());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;    
    }

    

    @Override
    public Personal getById(int id) throws SQLException {
        Personal p=null;
        String sql="select * from personal where id=?";

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setInt(1, id);
            
            ResultSet rs=pstm.executeQuery();
            
            if (rs.next()){
                p=new Personal();
                
                p.setId(rs.getInt("id"));
                p.setDni(rs.getString("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido1(rs.getString("apellido1"));
                p.setApellido2(rs.getString("apellido2"));
                p.setTelefono(rs.getString("telefono"));
                p.setEmail(rs.getString("email"));
                p.setDireccion(rs.getString("direccion"));
                p.setPoblacion(rs.getString("poblacion"));
                p.setProvincia(rs.getString("provincia"));
                p.setCp(rs.getString("cp"));
                p.setTipo(rs.getInt("tipo"));
            }
          
            
        }
        
        return p;

    }

    @Override
    public List<Personal> getAll() throws SQLException {
        Personal per=null;
        String sql="select * from personal";
        
        List<Personal> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                per=new Personal();
                
                per.setId(rs.getInt("id"));
                per.setDni(rs.getString("dni"));
                per.setNombre(rs.getString("nombre"));
                per.setApellido1(rs.getString("apellido1"));
                per.setApellido2(rs.getString("apellido2"));
                per.setTelefono(rs.getString("telefono"));
                per.setEmail(rs.getString("email"));
                per.setDireccion(rs.getString("direccion"));
                per.setPoblacion(rs.getString("poblacion"));
                per.setProvincia(rs.getString("provincia"));
                per.setCp(rs.getString("cp"));
                per.setTipo(rs.getInt("tipo"));
                result.add(per);
            }
            
        }
        
        return result;     
    }

    
    @Override
    public int update(Personal p) throws SQLException {
        String sql="""
                  update personal
                  set dni=?, nombre=?, apellido1=?, apellido2=?, telefono=?, email=?, direccion=?, poblacion=?,provincia=?,cp=?,tipo=?
                  where id=?
                   """;
        int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
            
            
            pstm.setString(1, p.getDni());
            pstm.setString(2, p.getNombre());
            pstm.setString(3, p.getApellido1());
            pstm.setString(4, p.getApellido2());
            pstm.setString(5, p.getTelefono());
            pstm.setString(6, p.getEmail());
            pstm.setString(7, p.getDireccion());
            pstm.setString(8, p.getPoblacion());
            pstm.setString(9, p.getProvincia());
            pstm.setString(10, p.getCp());
            pstm.setInt(11, p.getTipo());
            pstm.setInt(12, p.getId());
            result=pstm.executeUpdate();
            
        }
        
        return result;
    
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM autorizado WHERE id = ?";
        
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
            
            pstm.setInt(1, id);
            pstm.executeUpdate();
        }
    }
    
    public int Existe(String dniPersonal){
        String sql="select count(*) from personal where dni=?";
        int count=0;
        
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            pstm.setString(1, dniPersonal);
            ResultSet rs=pstm.executeQuery();
            
            //LEO EL VALOR DEL COUNT EN LA PRIMERA COLUMNA DEL RESULTSET
            rs.next();
            count=rs.getInt(1);
            
        }catch (Exception ex) {
            
        }
        return count;
    }
    
}
