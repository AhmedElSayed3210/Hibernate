/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate2;

import Pojo.Adress;
import Pojo.Employee;
import Pojo.NewHibernateUtil;
import Pojo.Person;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Noah
 */
public class CRUD {
    
 
    public void insertEmployee(){
        Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            
            Employee em=new Employee();
            em.setName("Ahmed ElSayed");
            Adress ad1=new Adress();
            ad1.setCity("cairoxx");
            ad1.setState("egyptxx");
            ad1.setStreet("ddddx");
            
            Adress ad2=new Adress();
            ad2.setCity("zaga xx");
            ad2.setState("zddffdxx");
            ad2.setStreet("12 st xx");
            
            Adress ad3=new Adress();
            ad3.setCity("zaga xx");
            ad3.setState("zddffdxx");
            ad3.setStreet("12 st xx");
            
            em.getAd().add(ad1);
            em.getAd().add(ad2);
            em.getAd().add(ad3);
            
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
