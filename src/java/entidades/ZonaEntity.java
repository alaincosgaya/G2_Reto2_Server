package entidades;

import clases.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Idoia Ormaetxea
 */
@Entity
public class ZonaEntity implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idZona;
    @Column
    private String nombreZona;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCreacionZona;
    @Column
    private GranjaEntity granja;
    @Column
    @OneToMany
    private List<Animal> animales;
    @Column
    @ManyToMany
    @JoinTable
    private List<TrabajadorEntity> trabajadores;
    
    public ZonaEntity(){
        
    }

    public Long getIdZona() {
        return idZona;
    }

    public void setIdZona(Long idZona) {
        this.idZona = idZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public Date getFechaCreacionZona() {
        return fechaCreacionZona;
    }

    public void setFechaCreacionZona(Date fechaCreacionZona) {
        this.fechaCreacionZona = fechaCreacionZona;
    }

    public Granja getGranja() {
        return granja;
    }

    public void setGranja(Granja granja) {
        this.granja = granja;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idZona);
        hash = 29 * hash + Objects.hashCode(this.nombreZona);
        hash = 29 * hash + Objects.hashCode(this.fechaCreacionZona);
        hash = 29 * hash + Objects.hashCode(this.granja);
        hash = 29 * hash + Objects.hashCode(this.animales);
        hash = 29 * hash + Objects.hashCode(this.trabajadores);
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
        final ZonaEntity other = (ZonaEntity) obj;
        if (!Objects.equals(this.nombreZona, other.nombreZona)) {
            return false;
        }
        if (!Objects.equals(this.idZona, other.idZona)) {
            return false;
        }
        if (!Objects.equals(this.fechaCreacionZona, other.fechaCreacionZona)) {
            return false;
        }
        if (!Objects.equals(this.granja, other.granja)) {
            return false;
        }
        if (!Objects.equals(this.animales, other.animales)) {
            return false;
        }
        if (!Objects.equals(this.trabajadores, other.trabajadores)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Zona{" + "idZona=" + idZona + ", nombreZona=" + nombreZona + ", fechaCreacionZona=" + fechaCreacionZona + ", granja=" + granja + ", animales=" + animales + ", trabajadores=" + trabajadores + '}';
    }
    
    
}
