package com.spring.jhs.bo;

import com.spring.jdbc.dao.ImplLogin;
import com.spring.jhs.persistence.Login;
import com.spring.jsf.bean.BeanLogin;


/**
 *
 * @author SergioRios
 */
public class LoginImplBO implements LoginBO {
        
    @Override
    public void validaLogin(BeanLogin obj) {
        Login login = new Login();
        login.setUsuario(obj.getUser());
        login.setPassword(obj.getPassword());
        login = getLoginDAO().validaLogin(login);
        if(login != null) {
            obj.setUrl(login.getUrl());
            obj.setStatus(true);
            obj.setMensaje("Usuario encontrado");
        } else {
            obj.setStatus(false);
            obj.setMensaje("El usuario no existe");
        }
    }
    
    private ImplLogin loginDAO;
    /**
     * @return the loginDAO
     */
    public ImplLogin getLoginDAO() {
        return loginDAO;
    }

    /**
     * @param loginDAO the loginDAO to set
     */
    public void setLoginDAO(ImplLogin loginDAO) {
        this.loginDAO = loginDAO;
    }
}
