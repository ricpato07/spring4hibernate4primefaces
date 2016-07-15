package com.spring.jsf.bean;

import com.spring.jhs.bo.ArticuloBO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;

/**
 *
 * @author SergioRios
 */
public class BeanArticulo {
    private int idArticulo;
    private String nombre;
    private String descripcion;
    private Double costo;
    private Double precio;
    private ArticuloBO articuloBO;
    private List<BeanArticulo> lista;
    private Map<String, Integer> mapa;

    /**
     * @return the idArticulo
     */
    public int getIdArticulo() {
        return idArticulo;
    }

    /**
     * @param idArticulo the idArticulo to set
     */
    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the costo
     */
    public Double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(Double costo) {
        this.costo = costo;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String insert() {
        articuloBO.insert(this);
        getAll();
        return "";
    }
    
    public String delete() {
        articuloBO.delete(this);
        getAll();
        return "";
    }
    
    public String update() {
        articuloBO.update(this);
        getAll();
        return "";
    }
    
    public void getAll() {
        setLista(articuloBO.getAll());
    }
    
    @PostConstruct
    public void llenaMapa() {
        getAll();
        mapa = new HashMap();
        for(BeanArticulo obj: getLista()) {
            mapa.put(obj.getDescripcion(), obj.getIdArticulo());
        }
    }

    /**
     * @return the lista
     */
    public List<BeanArticulo> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<BeanArticulo> lista) {
        this.lista = lista;
    }

    /**
     * @return the articuloBO
     */
    public ArticuloBO getArticuloBO() {
        return articuloBO;
    }

    /**
     * @param articuloBO the articuloBO to set
     */
    public void setArticuloBO(ArticuloBO articuloBO) {
        this.articuloBO = articuloBO;
    }

    /**
     * @return the mapa
     */
    public Map<String, Integer> getMapa() {
        return mapa;
    }

    /**
     * @param mapa the mapa to set
     */
    public void setMapa(Map<String, Integer> mapa) {
        this.mapa = mapa;
    }
}
