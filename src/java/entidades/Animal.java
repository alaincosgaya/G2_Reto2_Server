package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Jonathan Camacho
 */
@Entity
//@Table(name = "animal", schema = "G2Lauserri")
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAnimal;
    @Column
    private String nombreAnimel;
    @Column
    private TipoAnimal tipo;
    @Column
    private EstadoAnimal estado;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Column
    private SexoAnimal sexo;
 //   @Column
 //   @ManyToOne
 //   private Zona zona;

    //constructor publico vacio
    public Animal() {
    }

    //constructor con parametros
    public Animal(Long idAnimal, String nombreAnimel, TipoAnimal tipo, EstadoAnimal estado, Date fechaNacimiento, SexoAnimal sexo) {
        this.idAnimal = idAnimal;
        this.nombreAnimel = nombreAnimel;
        this.tipo = tipo;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
//        this.zona = zona;
    }

    //getters and setters
    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNombreAnimel() {
        return nombreAnimel;
    }

    public void setNombreAnimel(String nombreAnimel) {
        this.nombreAnimel = nombreAnimel;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

//    public Zona getZona() {
 //       return zona;
 //   }

  //  public void setZona(Zona zona) {
 //       this.zona = zona;
 //   }

    //metodos
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idAnimal);
        hash = 67 * hash + Objects.hashCode(this.nombreAnimel);
        hash = 67 * hash + Objects.hashCode(this.tipo);
        hash = 67 * hash + Objects.hashCode(this.estado);
        hash = 67 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 67 * hash + Objects.hashCode(this.sexo);
//        hash = 67 * hash + Objects.hashCode(this.zona);
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.nombreAnimel, other.nombreAnimel)) {
            return false;
        }
        if (!Objects.equals(this.idAnimal, other.idAnimal)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
//        if (!Objects.equals(this.zona, other.zona)) {
 //           return false;
 //       }
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" + "idAnimal=" + idAnimal + ", nombreAnimel=" + nombreAnimel + ", tipo=" + tipo + ", estado=" + estado + ", fechaNacimiento=" + fechaNacimiento + ", sexoAnimal=" + sexo + ", zona=" + '}';
    }

}
