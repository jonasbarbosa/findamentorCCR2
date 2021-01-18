package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PERFIL
* @generated
*/
@Entity
@Table(name = "\"PERFIL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.perfil")
public class perfil implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "perfil", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String perfil;

    /**
    * Construtor
    * @generated
    */
    public perfil(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public perfil setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém perfil
    * return perfil
    * @generated
    */
    
    public java.lang.String getPerfil(){
        return this.perfil;
    }

    /**
    * Define perfil
    * @param perfil perfil
    * @generated
    */
    public perfil setPerfil(java.lang.String perfil){
        this.perfil = perfil;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
perfil object = (perfil)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}