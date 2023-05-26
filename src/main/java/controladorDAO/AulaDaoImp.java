/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorDAO;

import BD.MyDataSource;
import entidades.Aula;
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
public class AulaDaoImp implements AulaDao{
    private static AulaDaoImp instance;
    
    static{
        instance=new AulaDaoImp();
    }
    
    public AulaDaoImp(){ }
    
    public static AulaDaoImp getInstance(){
        return instance;
    }
    
    @Override
    public int add(Aula a) throws SQLException {
    
        String sql="""
                  insert into aula(codigo,descripcion)
                  values (?,?)
                  """;
      int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setString(1, a.getCodigo());
            pstm.setString(2, a.getDescripcion());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;
    
    }

    @Override
    public Aula getById(int id) throws SQLException {
        
        Aula aul=null;
        String sql="select * from aula where id=?";

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setInt(1, id);
            
            ResultSet rs=pstm.executeQuery();
            
            if (rs.next()){
                aul=new Aula();
                
                aul.setId(rs.getInt("id"));
                aul.setCodigo(rs.getString("codigo"));
                aul.setDescripcion(rs.getString("descripcion"));
                
            }
            
        }
        
        return aul;
    
    }
    
     public int getByNom(String nomAula) throws SQLException {
        int id=0;
        String sql="select id from aula where nombre=?";

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setString(1, nomAula);
            
            ResultSet rs=pstm.executeQuery();
            
            if (rs.next()){
                 id = rs.getInt("id");
                
            }
            
        }
        
        return id;
    
    }

    @Override
    public List<Aula> getAll() throws SQLException {
    
        Aula aul=null;
        String sql="select * from aula";
        
        List<Aula> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                aul=new Aula();
                
                aul.setId(rs.getInt("id"));
                aul.setCodigo(rs.getString("codigo"));
                aul.setDescripcion(rs.getString("descripcion"));
                result.add(aul);
            }
            
        }
        
        return result; 
    
    }

    @Override
    public int update(Aula a) throws SQLException {
        
     String sql="""
                  update aula
                  set codigo=?,descripcion=?
                   where id=?
                   """;
        int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
            
            pstm.setString(1, a.getCodigo());
            pstm.setString(2, a.getDescripcion());
            pstm.setInt(3, a.getId());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;
      
    
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
