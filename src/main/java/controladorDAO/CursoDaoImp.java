/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorDAO;

import BD.MyDataSource;
import entidades.Curso;
import entidades.CursoAcademico;
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
public class CursoDaoImp implements CursoDao{
    
    private static CursoDaoImp instance;
    
    static{
        instance=new CursoDaoImp();
    }
    
    private CursoDaoImp(){ }
    
    public static CursoDaoImp getInstance(){
        return instance;
    }
    
    
    @Override
    public int add(Curso cur) throws SQLException {
            String sql="""
                  insert into curso(codigo,nombre,Observaciones,idcursoacademico)
                  values (?,?,?,?)
                  """;
        int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setString(1, cur.getCodigo());
            pstm.setString(2, cur.getNombre());
            pstm.setString(3, cur.getObservaciones());
            pstm.setInt(4, cur.getIdcursoacademico());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;
        
    }

    @Override
    public Curso getById(int id) throws SQLException {
        Curso curso=null;
        String sql="select * from curso where id=?";

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setInt(1, id);
            
            ResultSet rs=pstm.executeQuery();
            
            if (rs.next()){
                curso=new Curso();
                
                curso.setCodigo(rs.getString("codigo"));
                curso.setNombre(rs.getString("nombre"));
                curso.setObservaciones(rs.getString("Observaciones"));
                curso.setIdcursoacademico(rs.getInt("idcursoacademico"));
                
            }
            
        }
        
        return curso;
    }

     public List<Curso> getAllPorCurAca(String DescripCurAca) throws SQLException {
        Curso cur=null;
        String sql="select * from curso where id=(select id from cursoacademico where descripcion=?);";
        
        List<Curso> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            pstm.setString(1, DescripCurAca);
            
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                cur=new Curso();
                
                cur.setId(rs.getInt("id"));
                cur.setCodigo(rs.getString("codigo"));
                cur.setNombre(rs.getString("nombre"));
                cur.setObservaciones(rs.getString("Observaciones"));
                cur.setIdcursoacademico(rs.getInt("idcursoacademico"));
                result.add(cur);
            }
            
        }
        
        return result; 
     }
     
     
    @Override
    public List<Curso> getAll() throws SQLException {
        Curso cur=null;
        String sql="select * from curso";
        
        List<Curso> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                cur=new Curso();
                
                cur.setId(rs.getInt("id"));
                cur.setCodigo(rs.getString("codigo"));
                cur.setNombre(rs.getString("nombre"));
                cur.setObservaciones(rs.getString("Observaciones"));
                cur.setIdcursoacademico(rs.getInt("idcursoacademico"));
                result.add(cur);
            }
            
        }
        
        return result; 
    }

    @Override
    public int update(Curso cur) throws SQLException {
        String sql="""
                  update curso
                  set codigo=?, nombre=?, Observaciones=?, idcursoacademico=?
                  where id=?
                  """;
        int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
            
            pstm.setString(1, cur.getCodigo());
            pstm.setString(2, cur.getNombre());
            pstm.setString(3, cur.getObservaciones());
            pstm.setInt(4, cur.getIdcursoacademico());
            pstm.setInt(5, cur.getId());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
