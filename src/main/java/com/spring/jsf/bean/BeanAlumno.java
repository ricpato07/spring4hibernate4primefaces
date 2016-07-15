package com.spring.jsf.bean;

import com.spring.jhs.bo.AlumnoBO;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
/**
 *
 * @author SergioRios
 */
public class BeanAlumno {
    private int matricula;
    private String usuario;
    private String nombre;
    private String app;
    private String apm;
    private int edad;
    private String sexo;
    private Date fechaRegistro;
    private Date fecha1 = new Date();
    private Date fecha2 = new Date();
    private String campo;
    private String criterio;
    private String value;
    private AlumnoBO alumnoBO;
    private List<BeanAlumno> lista;
    
    public BeanAlumno() {
    }
            
    public String insert() {
        getAlumnoBO().insert(this);
        getAll();
        return "";
    }
    
    public String delete() {
        getAlumnoBO().delete(this);
        getAll();
        return "";
    }
    
    public String update() {
        getAlumnoBO().update(this);
        getAll();
        return "";
    }
    
    @PostConstruct
    public void getAll() {
        setLista(getAlumnoBO().getAll());
    }
    
    public void buscarByCriterio() {
        if(getCriterio().equals("begin")) {
            setCriterio("like");
            setValue(getValue()+"%");
        } else if(getCriterio().equals("end")) {
            setCriterio("like");
            setValue("%"+getValue());
        } else if(getCriterio().equals("content")) {
            setCriterio("like");
            setValue("%"+getValue()+"%");
        }
        setLista(getAlumnoBO().getAllByCriterio(this));
    }
    
    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the app
     */
    public String getApp() {
        return app;
    }

    /**
     * @param app the app to set
     */
    public void setApp(String app) {
        this.app = app;
    }

    /**
     * @return the apm
     */
    public String getApm() {
        return apm;
    }

    /**
     * @param apm the apm to set
     */
    public void setApm(String apm) {
        this.apm = apm;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the fecha1
     */
    public Date getFecha1() {
        return fecha1;
    }

    /**
     * @param fecha1 the fecha1 to set
     */
    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }

    /**
     * @return the fecha2
     */
    public Date getFecha2() {
        return fecha2;
    }

    /**
     * @param fecha2 the fecha2 to set
     */
    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    /**
     * @return the lista
     */
    public List<BeanAlumno> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<BeanAlumno> lista) {
        this.lista = lista;
    }

    /**
     * @return the campo
     */
    public String getCampo() {
        return campo;
    }

    /**
     * @param campo the campo to set
     */
    public void setCampo(String campo) {
        this.campo = campo;
    }

    /**
     * @return the criterio
     */
    public String getCriterio() {
        return criterio;
    }

    /**
     * @param criterio the criterio to set
     */
    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the alumnoBO
     */
    public AlumnoBO getAlumnoBO() {
        return alumnoBO;
    }

    /**
     * @param alumnoBO the alumnoBO to set
     */
    public void setAlumnoBO(AlumnoBO alumnoBO) {
        this.alumnoBO = alumnoBO;
    }
}
