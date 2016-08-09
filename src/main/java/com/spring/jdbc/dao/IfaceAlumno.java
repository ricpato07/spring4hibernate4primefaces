package com.spring.jdbc.dao;


import com.spring.jhs.persistence.Alumnos;
import com.spring.jsf.bean.BeanAlumno;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface IfaceAlumno {
    void insert(Alumnos obj);
    void delete(Alumnos obj);
    void update(Alumnos obj);
    List<Alumnos> getAll();
    List<Alumnos> getAllByFechas(BeanAlumno bean);
    List<Alumnos> getAllByNombre(BeanAlumno bean);
    List<Alumnos> buscarByCriterio(BeanAlumno bean);
}
