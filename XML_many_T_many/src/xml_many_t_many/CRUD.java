/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml_many_t_many;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Noah
 */
public class CRUD {
     public void insertCenter(){
    
     Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            Courses cor=new Courses();
            
            cor.setName("dddddd");

            ses.save(cor);
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        }finally{
        ses.close();
        }
    }
     
     
      public void insertManyToManyCenter() {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();
            Center cen1=new Center();
            Center cen2=new Center();
            
            cen1.setName("IBM");
            cen2.setName("Facebbok");
           
            Courses cor1=new Courses();
            Courses cor2=new Courses();
            
            cor1.setName("Java");
            cor2.setName("Python");
            
            cen1.getCors().add(cor1);
            cen2.getCors().add(cor2);

            cor1.getCent().add(cen2);
            cor2.getCent().add(cen1);
            
            ses.save(cen1);
            ses.save(cen2);
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }

    }

}
