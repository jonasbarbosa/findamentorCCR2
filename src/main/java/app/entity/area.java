package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela AREA
* @generated
*/
@Entity
@Table(name = "\"AREA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.area")
public class area implements Serializable {

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
    @Column(name = "aname", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String aname;

    /**
    * @generated
    */
    @Column(name = "pts", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String pts;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_grandeArea", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private grandeArea grandeArea;

    /**
    * Construtor
    * @generated
    */
    public area(){
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
    public area setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém aname
    * return aname
    * @generated
    */
    
    public java.lang.String getAname(){
        return this.aname;
    }

    /**
    * Define aname
    * @param aname aname
    * @generated
    */
    public area setAname(java.lang.String aname){
        this.aname = aname;
        return this;
    }
    /**
    * Obtém pts
    * return pts
    * @generated
    */
    
    public java.lang.String getPts(){
        return this.pts;
    }

    /**
    * Define pts
    * @param pts pts
    * @generated
    */
    public area setPts(java.lang.String pts){
        this.pts = pts;
        return this;
    }
    /**
    * Obtém grandeArea
    * return grandeArea
    * @generated
    */
    
    public grandeArea getGrandeArea(){
        return this.grandeArea;
    }

    /**
    * Define grandeArea
    * @param grandeArea grandeArea
    * @generated
    */
    public area setGrandeArea(grandeArea grandeArea){
        this.grandeArea = grandeArea;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
area object = (area)obj;
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