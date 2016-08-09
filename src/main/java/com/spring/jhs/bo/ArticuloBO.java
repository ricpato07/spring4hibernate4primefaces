package com.spring.jhs.bo;


import com.spring.jsf.bean.BeanArticulo;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface ArticuloBO {
    void insert(BeanArticulo obj);
    void delete(BeanArticulo obj);
    void update(BeanArticulo obj);
    List<BeanArticulo> getAll();
}
