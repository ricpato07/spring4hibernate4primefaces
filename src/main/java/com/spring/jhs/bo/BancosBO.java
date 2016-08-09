package com.spring.jhs.bo;

import com.spring.jhs.persistence.Bancos;
import java.util.List;


public interface BancosBO {
   public void insert(Bancos obj);
   public void update(Bancos obj);
   public void delete(Bancos obj);
   public Bancos getBanco(Bancos obj);
   public List<Bancos> listBancos(Bancos obj);
}
