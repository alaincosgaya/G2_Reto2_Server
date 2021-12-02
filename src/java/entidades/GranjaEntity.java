/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Alejandro Gómez
 */
@Entity
public class GranjaEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGranja;
    @Column
    private String nombreGranja;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCreacion;
    @Column
    private Granjero granjero;
    @Column
    private List<Zona> zonas;
    @Column
    private List<Trabajador> trabajadores;

    public GranjaEntity() {
    }

    public GranjaEntity(Long idGranja, String nombreGranja, Date fechaCreacion, Granjero granjero, List<Zona> zonas, List<Trabajador> trabajadores) {
        this.idGranja = idGranja;
        this.nombreGranja = nombreGranja;
        this.fechaCreacion = fechaCreacion;
        this.granjero = granjero;
        this.zonas = zonas;
        this.trabajadores = trabajadores;
    }

    public Long getIdGranja() {
        return idGranja;
    }

    public void setIdGranja(Long idGranja) {
        this.idGranja = idGranja;
    }

    public String getNombreGranja() {
        return nombreGranja;
    }

    public void setNombreGranja(String nombreGranja) {
        this.nombreGranja = nombreGranja;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Granjero getGranjero() {
        return granjero;
    }

    public void setGranjero(Granjero granjero) {
        this.granjero = granjero;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idGranja);
        hash = 79 * hash + Objects.hashCode(this.nombreGranja);
        hash = 79 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 79 * hash + Objects.hashCode(this.granjero);
        hash = 79 * hash + Objects.hashCode(this.zonas);
        hash = 79 * hash + Objects.hashCode(this.trabajadores);
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
        final GranjaEntity other = (GranjaEntity) obj;
        if (!Objects.equals(this.nombreGranja, other.nombreGranja)) {
            return false;
        }
        if (!Objects.equals(this.idGranja, other.idGranja)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacion, other.fechaCreacion)) {
            return false;
        }
        if (!Objects.equals(this.granjero, other.granjero)) {
            return false;
        }
        if (!Objects.equals(this.zonas, other.zonas)) {
            return false;
        }
        if (!Objects.equals(this.trabajadores, other.trabajadores)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Granja{" + "idGranja=" + idGranja + ", nombreGranja=" + nombreGranja + ", fechaCreacion=" + fechaCreacion + ", granjero=" + granjero + ", zonas=" + zonas + ", trabajadores=" + trabajadores + '}';
    }
    
    
}
