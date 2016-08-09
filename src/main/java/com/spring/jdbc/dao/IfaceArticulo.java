package com.spring.jdbc.dao;

import com.spring.jhs.persistence.Articulos;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface IfaceArticulo {
    void insert(Articulos obj);
    void delete(Articulos obj);
    void update(Articulos obj);
    List<Articulos> getAll();
}
