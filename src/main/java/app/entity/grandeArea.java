package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela GRANDEAREA
* @generated
*/
@Entity
@Table(name = "\"GRANDEAREA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.grandeArea")
public class grandeArea implements Serializable {

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
    @Column(name = "gname", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String gname;

    /**
    * @generated
    */
    @Column(name = "refpts", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String refpts;

    /**
    * Construtor
    * @generated
    */
    public grandeArea(){
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
    public grandeArea setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém gname
    * return gname
    * @generated
    */
    
    public java.lang.String getGname(){
        return this.gname;
    }

    /**
    * Define gname
    * @param gname gname
    * @generated
    */
    public grandeArea setGname(java.lang.String gname){
        this.gname = gname;
        return this;
    }
    /**
    * Obtém refpts
    * return refpts
    * @generated
    */
    
    public java.lang.String getRefpts(){
        return this.refpts;
    }

    /**
    * Define refpts
    * @param refpts refpts
    * @generated
    */
    public grandeArea setRefpts(java.lang.String refpts){
        this.refpts = refpts;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
grandeArea object = (grandeArea)obj;
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