package com.spring.jdbc.dao;

import com.spring.jhs.persistence.Bancos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class BancosDAOImpl extends HibernateDaoSupport implements BancosDAO {

    @Override
    @Transactional
    public void insert(Bancos obj) {
        this.getHibernateTemplate().save(obj);
    }

    @Override
    @Transactional
    public void update(Bancos obj) {
        this.getHibernateTemplate().merge(obj);
    }

    @Override
    @Transactional
    public void delete(Bancos obj) {
        this.getHibernateTemplate().delete(obj);
    }

    @Override
    @Transactional
    public Bancos getObject(Bancos obj) {
        List<Bancos> lista = (List<Bancos>) getHibernateTemplate().find("from Bancos where sbanco = ?", obj.getSbanco());
        if (lista.size() > 0) {
            return lista.get(0);
        }
        return null;
    }

    @Override
    @Transactional
    public List<Bancos> getList(Bancos obj) {
        String sbanco = null;
        List<Bancos> lista = new ArrayList();
        if (obj.getSbanco() != null && !obj.getSbanco().equals("")) {
            sbanco = "%" + obj.getSbanco() + "%";
            System.out.println("sbanco:" + sbanco);
            lista = (List<Bancos>) getHibernateTemplate().find("from Bancos where sbanco like ?", sbanco);
        } else {
            lista = (List<Bancos>) getHibernateTemplate().find("from Bancos");
        }
        return lista;
    }
}
