package com.spring.jdbc.dao;


import com.spring.jhs.persistence.Articulos;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author SergioRios
 */
public class ImplArticulo extends HibernateDaoSupport implements IfaceArticulo {

    @Override
    @Transactional
    public void insert(Articulos obj) {
        getHibernateTemplate().save(obj);
    }

    @Override
    @Transactional
    public void delete(Articulos obj) {
        getHibernateTemplate().delete(obj);
    }

    @Override
    @Transactional
    public void update(Articulos obj) {
        getHibernateTemplate().merge(obj);
    }

    @Override
    @Transactional
    public List getAll() {
        return getHibernateTemplate().find("from Articulos");
    }
}
