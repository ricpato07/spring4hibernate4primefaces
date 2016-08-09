package com.spring.jsf.bean;

import com.spring.jhs.bo.BancosBO;
import com.spring.jhs.persistence.Bancos;
import com.spring.util.Cifrador;
import java.util.List;

public class BancosController {

    private String sbanco;
    private String mensaje;
    private List<Bancos> bancoslist;
    private BancosBO bancosBO;

    public String guardar() {

        System.out.println("Banco : " + getSbanco());
        Bancos banco = new Bancos();
        banco.setIdbanco(2);
        banco.setSbanco(sbanco);
        bancosBO.insert(banco);
        mensaje = "Datos guardados correctamente";
        return "bancos";
    }

//    @PostConstruct
    public String buscar() {

        System.out.println("Buscar");
        Bancos banco = new Bancos();
        bancoslist = bancosBO.listBancos(banco);

        return null;
    }

    public String cancelar() {

        System.out.println("Cancelar:");
        Cifrador cifrador = new Cifrador();
        String encriptado = cifrador.encriptar("hola", sbanco);
        System.out.println("encriptado:" + encriptado);
        return null;
    }

    public String editar(int id) {

        System.out.println("Editar:" + id);
        return null;
    }

    /**
     * @return the sbanco
     */
    public String getSbanco() {
        return sbanco;
    }

    /**
     * @param sbanco the sbanco to set
     */
    public void setSbanco(String sbanco) {
        this.sbanco = sbanco;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the bancosBO
     */
    public BancosBO getBancosBO() {
        return bancosBO;
    }

    /**
     * @param bancosBO the bancosBO to set
     */
    public void setBancosBO(BancosBO bancosBO) {
        this.bancosBO = bancosBO;
    }

    /**
     * @return the bancoslist
     */
    public List<Bancos> getBancoslist() {
        return bancoslist;
    }

    /**
     * @param bancoslist the bancoslist to set
     */
    public void setBancoslist(List<Bancos> bancoslist) {
        this.bancoslist = bancoslist;
    }

}
