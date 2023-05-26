/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorDAO;

import BD.MyDataSource;
import entidades.Alumno;
import entidades.Matricula;
import entidades.Unidad;
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
public class MatriculaDaoImp implements MatriculaDao{

    private static MatriculaDaoImp instance;
    
    static{
        instance=new MatriculaDaoImp();
    }
    
    public MatriculaDaoImp(){ }
    
    public static MatriculaDaoImp getInstance(){
        return instance;
    }
    
    
    @Override
    public int add(Matricula m) throws SQLException {
        
        String sql="""
                  insert into matricula(idalumno,idunidad,descripcion,fMatricula,fBaja)
                  values (?,?,?,?,?)
                  """;
      int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setInt(1, m.getIdalumno());
            pstm.setInt(2, m.getIdunidad());
            pstm.setString(3, m.getDescripcion());
            pstm.setDate(4,m.getfMatricula());
            pstm.setDate(5,m.getfBaja());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;    
    
    }

    @Override
    public Matricula getById(int id) throws SQLException {
        Matricula m=null;
        String sql="select * from matricula where idmatricula=?";

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setInt(1, id);
            
            ResultSet rs=pstm.executeQuery();
            
            if (rs.next()){
                m=new Matricula();
                
                m.setIdmatricula(rs.getInt("id"));
                m.setIdalumno(rs.getInt("idalumno"));
                m.setIdunidad(rs.getInt("idunidad"));
                m.setDescripcion(rs.getString("descripcion"));
                m.setfMatricula(rs.getDate("fMatricula"));
                m.setfBaja(rs.getDate("fBaja"));
            }
          
            
        }
       return m;
    }

    @Override
    public List<Matricula> getAll() throws SQLException {
        
        Matricula m=null;
        String sql="select * from matricula";
        
        List<Matricula> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                m=new Matricula();
                
                m.setIdmatricula(rs.getInt("idmatricula"));
                m.setIdalumno(rs.getInt("idalumno"));
                m.setIdunidad(rs.getInt("idunidad"));
                m.setDescripcion(rs.getString("descripcion"));
                m.setfMatricula(rs.getDate("fMatricula"));
                m.setfBaja(rs.getDate("fBaja"));
                
                result.add(m);
            }
            
        }
        
        return result;     
    }
    
    

    @Override
    public int update(Matricula m) throws SQLException {
        String sql="""
                  update matricula
                  set idalumno=?, idunidad=?, descripcion=?, fMatricula=?, fBaja=?
                  where id=?
                   """;
        int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
          
            pstm.setInt(1, m.getIdalumno());
            pstm.setInt(2, m.getIdunidad());
            pstm.setString(3, m.getDescripcion());
            pstm.setDate(4,m.getfMatricula());
            pstm.setDate(5,m.getfBaja());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;
    
    }

       public List<Alumno> consultaAlumNMatricula() throws SQLException{
        
        Alumno a=null;
        String sql="select nombre,id from alumno where id not in(select idalumno from matricula)";
        
        List<Alumno> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                a=new Alumno();
                
                a.setId(rs.getInt("id"));
                a.setNombre(rs.getString("nombre"));
                
                result.add(a);
            }
            
        }
        
        return result;     
    }
       
    public List<Unidad> consultaUnidades() throws SQLException{
        
        Unidad u=null;
        String sql="select id,codigo from unidad";
        
        List<Unidad> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                u=new Unidad();
                
                u.setId(rs.getInt("id"));
                u.setCodigo(rs.getString("codigo"));
                
                result.add(u);
            }
            
        }
        
        return result;     
    }
       
    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
