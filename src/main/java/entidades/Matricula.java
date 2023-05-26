/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author juudi
 */
public class Matricula {
    private int idmatricula;
    private int idalumno;
    private int idunidad;
    private String descripcion;
    private Date fMatricula;
    private Date fBaja;

    public Matricula(int idmatricula, int idalumno, int idunidad) {
        this.idmatricula = idmatricula;
        this.idalumno = idalumno;
        this.idunidad = idunidad;
    }

    public Matricula() {
    }

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public int getIdunidad() {
        return idunidad;
    }

    public void setIdunidad(int idunidad) {
        this.idunidad = idunidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getfMatricula() {
        return fMatricula;
    }

    public void setfMatricula(Date fMatricula) {
        this.fMatricula = fMatricula;
    }

    public Date getfBaja() {
        return fBaja;
    }

    public void setfBaja(Date fBaja) {
        this.fBaja = fBaja;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idmatricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matricula other = (Matricula) obj;
        return this.idmatricula == other.idmatricula;
    }

    @Override
    public String toString() {
        return "Matricula{" + "idmatricula=" + idmatricula + ", idalumno=" + idalumno + ", idunidad=" + idunidad + ", descripcion=" + descripcion + ", fMatricula=" + fMatricula + ", fBaja=" + fBaja + '}';
    }
    
    
}
