/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorDAO;

import BD.MyDataSource;
import entidades.Curso;
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
public class UnidadDaoImp implements UnidadDao{

    private static UnidadDaoImp instance;
    
    static{
        instance=new UnidadDaoImp();
    }
    
    private UnidadDaoImp(){ }
    
    public static UnidadDaoImp getInstance(){
        return instance;
    }
    
    @Override
    public int add(Unidad u) throws SQLException {
        
      String sql="""
                  insert into unidad(codigo,nombre,observaciones,idcurso,idtutor,idaula)
                  values (?,?,?,?,?,?)
                  """;
      int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setString(1, u.getCodigo());
            pstm.setString(2, u.getNombre());
            pstm.setString(3, u.getObservaciones());
            pstm.setInt(4, u.getIdcurso());
            pstm.setInt(5, u.getIdtutor());
            pstm.setInt(6, u.getIdaula());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;
    }

    @Override
    public Unidad getById(int id) throws SQLException {
        Unidad uni=null;
        String sql="select * from unidad where id=?";

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setInt(1, id);
            
            ResultSet rs=pstm.executeQuery();
            
            if (rs.next()){
                uni=new Unidad();
                
                uni.setId(rs.getInt("id"));
                uni.setCodigo(rs.getString("codigo"));
                uni.setNombre(rs.getString("nombre"));
                uni.setObservaciones(rs.getString("observaciones"));
                uni.setIdcurso(rs.getInt("idcurso"));
                uni.setIdtutor(rs.getInt("idtutor"));
                uni.setIdaula(rs.getInt("idaula"));
            }
            
        }
        
        return uni;
    
    }

    @Override
    public List<Unidad> getAll() throws SQLException {
        
        Unidad uni=null;
        String sql="select * from unidad";
        
        List<Unidad> result=new ArrayList();

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            ResultSet rs=pstm.executeQuery();
            
            while (rs.next()){
                uni=new Unidad();
                
                uni.setId(rs.getInt("id"));
                uni.setCodigo(rs.getString("codigo"));
                uni.setNombre(rs.getString("nombre"));
                uni.setObservaciones(rs.getString("observaciones"));
                uni.setIdcurso(rs.getInt("idcurso"));
                uni.setIdtutor(rs.getInt("idtutor"));
                uni.setIdaula(rs.getInt("idaula"));
                result.add(uni);
            }
            
        }
        
        return result; 
    }

    @Override
    public int update(Unidad u) throws SQLException {
      String sql="""
                  update unidad
                  set codigo=?, nombre=?, Observaciones=?, idcurso=?, idtutor=?, idaula=?
                  where id=?
                  """;
        int result=0;
       
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
            
            pstm.setString(1, u.getCodigo());
            pstm.setString(2, u.getNombre());
            pstm.setString(3, u.getObservaciones());
            pstm.setInt(4, u.getIdcurso());
            pstm.setInt(5, u.getIdtutor());
            pstm.setInt(5, u.getIdaula());
            pstm.setInt(5, u.getId());
            
            result=pstm.executeUpdate();
            
        }
        
        return result;  
    
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int Existe(String id){
        String sql="select count(*) from unidad where id=?";
        int count=0;
        
        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
         
            pstm.setInt(1, Integer.parseInt(id));
            ResultSet rs=pstm.executeQuery();
            
            //LEO EL VALOR DEL COUNT EN LA PRIMERA COLUMNA DEL RESULTSET
            rs.next();
            count=rs.getInt(1);
            
        }catch (Exception ex) {
            
        }
        return count;
    }
    
}
