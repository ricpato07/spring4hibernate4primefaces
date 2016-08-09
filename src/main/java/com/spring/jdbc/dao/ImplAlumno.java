package com.spring.jdbc.dao;

import com.spring.jhs.persistence.Alumnos;
import com.spring.jsf.bean.BeanAlumno;
import java.util.Date;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author SergioRios
 */
public class ImplAlumno extends HibernateDaoSupport implements IfaceAlumno {
    @Override
    @Transactional
    public void insert(Alumnos obj) {
        getHibernateTemplate().save(obj);
    }

    @Override
    @Transactional
    public void delete(Alumnos obj) {
        getHibernateTemplate().delete(obj);
    }

    @Override
    @Transactional
    public void update(Alumnos obj) {
        getHibernateTemplate().merge(obj);
    }

    @Override
    @Transactional
    public List getAll() {
        return getHibernateTemplate().find("from Alumnos");
    }
    
    private java.sql.Date convertFecha(Date fecha) {
        return new java.sql.Date(fecha.getTime());
    }

    @Override
    @Transactional
    public List getAllByFechas(BeanAlumno bean) {
        String query = "from Alumnos al where al.fechaRegistro between '"+
        convertFecha(bean.getFecha1())+"' and '"+convertFecha(bean.getFecha2())+"'";
        System.out.println("Query by fechas : "+query);
        return getHibernateTemplate().find(query);
    }

    @Override
    @Transactional
    public List getAllByNombre(BeanAlumno bean) {
        String query = "from Alumnos al where al.nombre = '"+bean.getNombre()+"'";
        System.out.println("Query by Nombre : "+query);
        return getHibernateTemplate().find(query);
    }
    
    @Override
    @Transactional
    public List buscarByCriterio(BeanAlumno bean) {
        String query = "from Alumnos al where al." +bean.getCampo()+" "+bean.getCriterio()+" '"+bean.getValue()+"'";
        System.out.println("Query by "+bean.getNombre()+" : "+query);
        return getHibernateTemplate().find(query);
    }
}
