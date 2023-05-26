/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorDAO;

import BD.MyDataSource;
import entidades.Autorizado;
import entidades.Parentesco;
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
public class AutorizadoDaoImp implements AutorizadoDao{
    private static AutorizadoDaoImp instance;
    
    static{
        instance=new AutorizadoDaoImp();
    }
    
    public AutorizadoDaoImp(){ }
    
    public static AutorizadoDaoImp getInstance(){
        return instance;
    }
    
    @Override
    public int add(Autorizado aut) throws SQLException {
        String sql="""
                  insert into autorizado(dni,nombre,apellido1,apellido2,parentesco)
                  values (?,?,?,?,?)
                  """;
      int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setString(1, aut.getDni());
            pstm.setString(2, aut.getNombre());
            pstm.setString(3, aut.getApellido1());
            pstm.setString(4, aut.getApellido2());
            pstm.setString(5,aut.getParentesco().name()); //user.getParentesco().name() para obtener el nombre del enumerado y guardarlo en la base de datos.
            
            result=pstm.executeUpdate();
            
        }
        
        return result;    
    
    }

    @Override
    public Autorizado getById(int id) throws SQLException {
        Autorizado aut=null;
        String sql="select * from autorizado where id=?";

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setInt(1, id);
            
            ResultSet rs=pstm.executeQuery();
            
            if (rs.next()){
                aut=new Autorizado();
                
                aut.setId(rs.getInt("id"));
                aut.setDni(rs.getString("dni"));
                aut.setNombre(rs.getString("nombre"));
                aut.setApellido1(rs.getString("apellido1"));
                aut.setApellido2(rs.getString("apellido2"));
                String parent = rs.getString("parentesco");
                aut.setParentesco(Parentesco.valueOf(parent));//Parentesco.valueOf(parentescoName) para obtener el valor del enumerado Parentesco a partir del nombre almacenado en la base de datos.
            }
            System.out.println(""+aut.toString());
          
        }
        
        return aut;    
    
    }

    @Override
    public List<Autorizado> getAll() throws SQLException {
        Autorizado aut=null;
        String sql="select * from autorizado";
        
        List<Autorizado> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                aut=new Autorizado();
                
                aut.setId(rs.getInt("id"));
                aut.setDni(rs.getString("dni"));
                aut.setNombre(rs.getString("nombre"));
                aut.setApellido1(rs.getString("apellido1"));
                aut.setApellido2(rs.getString("apellido2"));
                aut.setParentesco(Parentesco.valueOf(rs.getString("parentesco")));

                result.add(aut);
            }
            
        }
        
        return result;     
    }

    @Override
    public int update(Autorizado aut) throws SQLException {
     String sql="""
                  update autorizado
                  set dni=?, nombre=?, apellido1=?, apellido2=?, parentesco=?
                  where id=?
                   """;
        int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
            
            
            pstm.setString(1, aut.getDni());
            pstm.setString(2, aut.getNombre());
            pstm.setString(3, aut.getApellido1());
            pstm.setString(4, aut.getApellido2());
            System.out.println(aut.getParentesco().toString());
            pstm.setString(5, aut.getParentesco().toString());
            pstm.setInt(6, aut.getId());
            System.out.println(""+aut.getId());
            result=pstm.executeUpdate();
            
        }
        
        return result;    
    
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int Existe(String dniAut){
        String sql="select count(*) from autorizado where dni=?";
        int count=0;
        
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            pstm.setString(1, dniAut);
            ResultSet rs=pstm.executeQuery();
            
            //LEO EL VALOR DEL COUNT EN LA PRIMERA COLUMNA DEL RESULTSET
            rs.next();
            count=rs.getInt(1);
            
        }catch (Exception ex) {
            
        }
        return count;
    }
    
}
