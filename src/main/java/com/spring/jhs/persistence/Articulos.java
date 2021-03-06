package com.spring.jhs.persistence;
// Generated 13-jul-2016 18:51:10 by Hibernate Tools 3.6.0
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Articulos generated by hbm2java
 */
@Entity
@Table(name = "articulos")
public class Articulos  implements java.io.Serializable {

     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     private Integer idArticulo;
     private String nombre;
     private String descripcion;
     private Double costo;
     private Double precio;

    public Articulos() {
    }

    public Articulos(String nombre, String descripcion, Double costo, Double precio) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.costo = costo;
       this.precio = precio;
    }
   
    public Integer getIdArticulo() {
        return this.idArticulo;
    }
    
    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getCosto() {
        return this.costo;
    }
    
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    public Double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }




}


