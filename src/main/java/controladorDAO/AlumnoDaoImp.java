/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorDAO;

import BD.MyDataSource;
import entidades.Alumno;
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
public class AlumnoDaoImp implements AlumnoDao{
    private static AlumnoDaoImp instance;
    
    static{
        instance=new AlumnoDaoImp();
    }
    
    public AlumnoDaoImp(){ }
    
    public static AlumnoDaoImp getInstance(){
        return instance;
    }
    
    
    @Override
    public int add(Alumno a) throws SQLException {
     String sql="""
                  insert into alumno(dni,nombre,apellido1,apellido2,fNacimiento,telefono,email,direccion,poblacion,provincia,cp)
                  values (?,?,?,?,?,?,?,?,?,?,?)
                  """;
      int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setString(1, a.getDni());
            pstm.setString(2, a.getNombre());
            pstm.setString(3, a.getApellido1());
            pstm.setString(4, a.getApellido2());
            pstm.setDate(5,a.getFnacimiento());
            pstm.setString(6, a.getTelefono());
            pstm.setString(7, a.getEmail());
            pstm.setString(8, a.getDireccion());
            pstm.setString(9, a.getPoblacion());
            pstm.setString(10, a.getProvincia());
            pstm.setString(11, a.getCp());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;    
    }

    @Override
    public Alumno getById(int id) throws SQLException {
        
        Alumno a=null;
        String sql="select * from alumno where id=?";

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setInt(1, id);
            
            ResultSet rs=pstm.executeQuery();
            
            if (rs.next()){
                a=new Alumno();
                
                a.setId(rs.getInt("id"));
                a.setDni(rs.getString("dni"));
                a.setNombre(rs.getString("nombre"));
                a.setApellido1(rs.getString("apellido1"));
                a.setApellido2(rs.getString("apellido2"));
                a.setFnacimiento(rs.getDate("fNacimiento"));
                a.setTelefono(rs.getString("telefono"));
                a.setEmail(rs.getString("email"));
                a.setDireccion(rs.getString("direccion"));
                a.setPoblacion(rs.getString("poblacion"));
                a.setProvincia(rs.getString("provincia"));
                a.setCp(rs.getString("cp"));
            }
          
            
        }
        
        return a;
    }
        
    
    public int Existe(String dniAlum){
        String sql="select count(*) from alumno where dni=?";
        int count=0;
        
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            pstm.setString(1, dniAlum);
            ResultSet rs=pstm.executeQuery();
            
            //LEO EL VALOR DEL COUNT EN LA PRIMERA COLUMNA DEL RESULTSET
            rs.next();
            count=rs.getInt(1);
            
        }catch (Exception ex) {
            
        }
        return count;
    }
    
@Override
    public List<Alumno> getAll() throws SQLException {
        Alumno alum=null;
        String sql="select * from alumno";
        
        List<Alumno> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                alum=new Alumno();
                
                alum.setId(rs.getInt("id"));
                alum.setDni(rs.getString("dni"));
                alum.setNombre(rs.getString("nombre"));
                alum.setApellido1(rs.getString("apellido1"));
                alum.setApellido2(rs.getString("apellido2"));
                alum.setFnacimiento(rs.getDate("fNacimiento"));
                alum.setTelefono(rs.getString("telefono"));
                alum.setEmail(rs.getString("email"));
                alum.setDireccion(rs.getString("direccion"));
                alum.setPoblacion(rs.getString("poblacion"));
                alum.setProvincia(rs.getString("provincia"));
                alum.setCp(rs.getString("cp"));
                
                result.add(alum);
            }
            
        }
        
        return result;     
    }

    @Override
    public int update(Alumno a) throws SQLException {
    
        String sql="""
                  update alumno
                  set dni=?, nombre=?, apellido1=?, apellido2=?, fNacimiento=?, telefono=?, email=?, direccion=?, poblacion=?,provincia=?,cp=?
                  where id=?
                   """;
        int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
            
            
            pstm.setString(1, a.getDni());
            pstm.setString(2, a.getNombre());
            pstm.setString(3, a.getApellido1());
            pstm.setString(4, a.getApellido2());
            pstm.setDate(5, a.getFnacimiento());
            pstm.setString(6, a.getTelefono());
            pstm.setString(7, a.getEmail());
            pstm.setString(8, a.getDireccion());
            pstm.setString(9, a.getPoblacion());
            pstm.setString(10, a.getProvincia());
            pstm.setString(11, a.getCp());
            pstm.setInt(12, a.getId());
            result=pstm.executeUpdate();
            
        }
        
        return result;
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM alumno WHERE id = ?";
        
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
            
            pstm.setInt(1, id);
            pstm.executeUpdate();
        }
    }
    

}
