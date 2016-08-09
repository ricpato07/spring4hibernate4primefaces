package com.spring.jdbc.dao;

import com.spring.jhs.persistence.Bancos;
import java.util.List;

public interface BancosDAO {
    public void insert(Bancos obj);
    public void update(Bancos obj);
    public void delete(Bancos obj);
    public Bancos getObject(Bancos obj);
    public List<Bancos> getList(Bancos obj);
}
