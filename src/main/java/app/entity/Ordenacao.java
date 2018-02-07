package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ORDENACAO
 * @generated
 */
@Entity
@Table(name = "\"ORDENACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Ordenacao")
public class Ordenacao implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "lugar", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String lugar;

  /**
   * Construtor
   * @generated
   */
  public Ordenacao(){
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
  public Ordenacao setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Ordenacao setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém lugar
   * return lugar
   * @generated
   */
  
  public java.lang.String getLugar(){
    return this.lugar;
  }

  /**
   * Define lugar
   * @param lugar lugar
   * @generated
   */
  public Ordenacao setLugar(java.lang.String lugar){
    this.lugar = lugar;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Ordenacao object = (Ordenacao)obj;
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
