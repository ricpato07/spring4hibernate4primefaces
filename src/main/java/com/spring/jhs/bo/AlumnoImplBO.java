package com.spring.jhs.bo;

import com.spring.jdbc.dao.IfaceAlumno;
import com.spring.jhs.persistence.Alumnos;
import com.spring.jhs.persistence.Login;
import com.spring.jsf.bean.BeanAlumno;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SergioRios
 */
public class AlumnoImplBO implements AlumnoBO {
    private IfaceAlumno alumnoDAO;
    
    @Override
    public void insert(BeanAlumno obj) {
        Alumnos alumno = new Alumnos();
        alumno.setMatricula(obj.getMatricula());
        alumno.setNombre(obj.getNombre());
        alumno.setApp(obj.getApp());
        alumno.setApm(obj.getApm());
        alumno.setEdad(obj.getEdad());
        alumno.setSexo(obj.getSexo());
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
        alumno.setLogin(login);
        alumno.setFechaRegistro(new Date());
        alumnoDAO.insert(alumno);
    }

    @Override
    public void delete(BeanAlumno obj) {
        Alumnos alumno = new Alumnos();
        alumno.setMatricula(obj.getMatricula());
        alumno.setNombre(obj.getNombre());
        alumno.setApp(obj.getApp());
        alumno.setApm(obj.getApm());
        alumno.setEdad(obj.getEdad());
        alumno.setSexo(obj.getSexo());
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
        alumno.setFechaRegistro(obj.getFechaRegistro());
        alumno.setLogin(login);
        alumnoDAO.delete(alumno);
    }

    @Override
    public void update(BeanAlumno obj) {
        Alumnos alumno = new Alumnos();
        alumno.setMatricula(obj.getMatricula());
        alumno.setNombre(obj.getNombre());
        alumno.setApp(obj.getApp());
        alumno.setApm(obj.getApm());
        alumno.setEdad(obj.getEdad());
        alumno.setSexo(obj.getSexo());
        Login login = new Login();
        login.setUsuario(obj.getUsuario());
        alumno.setLogin(login);
        alumno.setFechaRegistro(obj.getFechaRegistro());
        alumnoDAO.update(alumno);
    }

    @Override
    public List<BeanAlumno> getAll() {
        List<BeanAlumno> lista = new ArrayList();
        for(Alumnos obj: alumnoDAO.getAll()) {
            BeanAlumno bean = new BeanAlumno();
            bean.setMatricula(obj.getMatricula());
            bean.setNombre(obj.getNombre());
            bean.setApp(obj.getApp());
            bean.setApm(obj.getApm());
            bean.setSexo(obj.getSexo());
            bean.setEdad(obj.getEdad());
            bean.setUsuario(obj.getLogin().getUsuario());
            bean.setFechaRegistro(obj.getFechaRegistro());
            lista.add(bean);
        }
        return lista;
    }

    /**
     * @return the alumnoDAO
     */
    public IfaceAlumno getAlumnoDAO() {
        return alumnoDAO;
    }

    /**
     * @param alumnoDAO the alumnoDAO to set
     */
    public void setAlumnoDAO(IfaceAlumno alumnoDAO) {
        this.alumnoDAO = alumnoDAO;
    }

    @Override
    public List<BeanAlumno> getAllByFechas(BeanAlumno alumno) {
        List<BeanAlumno> lista = new ArrayList();
        for(Alumnos obj: alumnoDAO.getAllByFechas(alumno)) {
            BeanAlumno bean = new BeanAlumno();
            bean.setMatricula(obj.getMatricula());
            bean.setNombre(obj.getNombre());
            bean.setApp(obj.getApp());
            bean.setApm(obj.getApm());
            bean.setSexo(obj.getSexo());
            bean.setEdad(obj.getEdad());
            bean.setUsuario(obj.getLogin().getUsuario());
            bean.setFechaRegistro(obj.getFechaRegistro());
            lista.add(bean);
        }
        return lista;
    }
    
    @Override
    public List<BeanAlumno> getAllByCriterio(BeanAlumno alumno) {
        List<BeanAlumno> lista = new ArrayList();
        for(Alumnos obj: alumnoDAO.buscarByCriterio(alumno)) {
            BeanAlumno bean = new BeanAlumno();
            bean.setMatricula(obj.getMatricula());
            bean.setNombre(obj.getNombre());
            bean.setApp(obj.getApp());
            bean.setApm(obj.getApm());
            bean.setSexo(obj.getSexo());
            bean.setEdad(obj.getEdad());
            bean.setUsuario(obj.getLogin().getUsuario());
            bean.setFechaRegistro(obj.getFechaRegistro());
            lista.add(bean);
        }
        return lista;
    }
}
