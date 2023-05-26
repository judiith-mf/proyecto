/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author juudi
 */
public class Autorizaciones {
    private int idAlumno;
    private int idAutorizado;

    public Autorizaciones(int idAlumno, int idAutorizado) {
        this.idAlumno = idAlumno;
        this.idAutorizado = idAutorizado;
    }

    public Autorizaciones() {
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdAutorizado() {
        return idAutorizado;
    }

    public void setIdAutorizado(int idAutorizado) {
        this.idAutorizado = idAutorizado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idAlumno;
        hash = 59 * hash + this.idAutorizado;
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
        final Autorizaciones other = (Autorizaciones) obj;
        if (this.idAlumno != other.idAlumno) {
            return false;
        }
        return this.idAutorizado == other.idAutorizado;
    }

    @Override
    public String toString() {
        return "Autorizaciones{" + "idAlumno=" + idAlumno + ", idAutorizado=" + idAutorizado + '}';
    }
    
    
}
