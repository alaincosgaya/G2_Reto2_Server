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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    @ManyToOne
    private GranjeroEntity granjero;
    @Column
    @OneToMany
    private List<ZonaEntity> zonas;
    @Column
    @OneToMany
    private List<ContratoEntity> contratos;

    public GranjaEntity() {
    }

    public GranjaEntity(Long idGranja, String nombreGranja, Date fechaCreacion, GranjeroEntity granjero, List<ZonaEntity> zonas, List<ContratoEntity> contratos) {
        this.idGranja = idGranja;
        this.nombreGranja = nombreGranja;
        this.fechaCreacion = fechaCreacion;
        this.granjero = granjero;
        this.zonas = zonas;
        this.contratos = contratos;
    }
    /**
     * 
     * @return idGranja
     */
    public Long getIdGranja() {
        return idGranja;
    }
    /**
     * 
     * @param idGranja 
     */
    public void setIdGranja(Long idGranja) {
        this.idGranja = idGranja;
    }
    /**
     * 
     * @return nombreGranja
     */
    public String getNombreGranja() {
        return nombreGranja;
    }
    
    /**
     * 
     * @param nombreGranja 
     */
    public void setNombreGranja(String nombreGranja) {
        this.nombreGranja = nombreGranja;
    }
    
    /**
     * 
     * @return fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    /**
     * 
     * @param fechaCreacion 
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    /**
     * 
     * @return granjero
     */
    public GranjeroEntity getGranjero() {
        return granjero;
    }
    
    /**
     * 
     * @param granjero 
     */
    public void setGranjero(GranjeroEntity granjero) {
        this.granjero = granjero;
    }
    
    /**
     * 
     * @return zonas
     */
    public List<ZonaEntity> getZonas() {
        return zonas;
    }
    
    /**
     * 
     * @param zonas 
     */
    public void setZonas(List<ZonaEntity> zonas) {
        this.zonas = zonas;
    }
    /**
     * 
     * @return contratos
     */
    public List<ContratoEntity> getContratos() {
        return contratos;
    }
    
    /**
     * 
     * @param contratos 
     */
    public void setContratos(List<ContratoEntity> contratos) {
        this.contratos = contratos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idGranja);
        hash = 79 * hash + Objects.hashCode(this.nombreGranja);
        hash = 79 * hash + Objects.hashCode(this.fechaCreacion);
        hash = 79 * hash + Objects.hashCode(this.granjero);
        hash = 79 * hash + Objects.hashCode(this.zonas);
        hash = 79 * hash + Objects.hashCode(this.contratos);
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
        if (!Objects.equals(this.contratos, other.contratos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Granja{" + "idGranja=" + idGranja + ", nombreGranja=" + nombreGranja + ", fechaCreacion=" + fechaCreacion + ", granjero=" + granjero + ", zonas=" + zonas + ", contratos=" + contratos + '}';
    }
    
    
}
