/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.jhs.bo;

import com.spring.jsf.bean.BeanAlumno;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public interface AlumnoBO {
    void insert(BeanAlumno obj);
    void delete(BeanAlumno obj);
    void update(BeanAlumno obj);
    List<BeanAlumno> getAll();
    List<BeanAlumno> getAllByFechas(BeanAlumno obj);
    List<BeanAlumno> getAllByCriterio(BeanAlumno alumno);
}
