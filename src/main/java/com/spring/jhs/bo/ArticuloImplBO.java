package com.spring.jhs.bo;

import com.spring.jdbc.dao.IfaceArticulo;
import com.spring.jhs.persistence.Articulos;
import com.spring.jsf.bean.BeanArticulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public class ArticuloImplBO implements ArticuloBO {
    private IfaceArticulo articuloDAO;
    
    @Override
    public void insert(BeanArticulo obj) {
        Articulos articulo = new Articulos();
        articulo.setIdArticulo(obj.getIdArticulo());
        articulo.setNombre(obj.getNombre());
        articulo.setDescripcion(obj.getDescripcion());
        articulo.setCosto(obj.getCosto());
        articulo.setPrecio(obj.getPrecio());
        getArticuloDAO().insert(articulo);
    }

    @Override
    public void delete(BeanArticulo obj) {
        Articulos articulo = new Articulos();
        articulo.setIdArticulo(obj.getIdArticulo());
        articulo.setNombre(obj.getNombre());
        articulo.setDescripcion(obj.getDescripcion());
        articulo.setCosto(obj.getCosto());
        articulo.setPrecio(obj.getPrecio());
        getArticuloDAO().delete(articulo);
    }

    @Override
    public void update(BeanArticulo obj) {
        Articulos articulo = new Articulos();
        articulo.setIdArticulo(obj.getIdArticulo());
        articulo.setNombre(obj.getNombre());
        articulo.setDescripcion(obj.getDescripcion());
        articulo.setCosto(obj.getCosto());
        articulo.setPrecio(obj.getPrecio());
        getArticuloDAO().update(articulo);
    }

    @Override
    public List<BeanArticulo> getAll() {
        List<BeanArticulo> lista = new ArrayList();
        List<Articulos> nuevaLista = articuloDAO.getAll();
        for(Articulos obj: nuevaLista) {
            BeanArticulo bean = new BeanArticulo();
            bean.setIdArticulo(obj.getIdArticulo());
            bean.setNombre(obj.getNombre());
            bean.setDescripcion(obj.getDescripcion());
            bean.setCosto(obj.getCosto());
            bean.setPrecio(obj.getPrecio());
            lista.add(bean);
        }
        return lista;
    }

    /**
     * @return the articuloDAO
     */
    public IfaceArticulo getArticuloDAO() {
        return articuloDAO;
    }

    /**
     * @param articuloDAO the articuloDAO to set
     */
    public void setArticuloDAO(IfaceArticulo articuloDAO) {
        this.articuloDAO = articuloDAO;
    }
}
