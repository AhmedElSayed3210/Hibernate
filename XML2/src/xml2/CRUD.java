/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml2;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Noah
 */
public class CRUD {
    
    public void insertemployeeAdrees(){
    
     Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            Employee em=new Employee();
            
            em.setName("zzzzzz");
            
            Adress ad=new Adress();
            ad.setCountry("egypt");
            ad.setCity("zagazig");
            ad.setStreet("12 st");
            em.setAd(ad);
            
            Adress adhom=new Adress();
            adhom.setCountry("Egypt");
            adhom.setCity("Cairo");
            adhom.setStreet("slah 15 st");
            em.setAdHome(adhom);
            
            ses.save(em);
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        }finally{
        ses.close();
        }
    }
    
    
    
}
