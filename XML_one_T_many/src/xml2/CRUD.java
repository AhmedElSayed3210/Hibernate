/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml2;

import java.util.Set;
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
            Center c=new Center();
            c.setCentername("IBM");

            Courses cor1=new Courses();
            cor1.setCoursename("Java");
            
            Courses cor2=new Courses();
            cor2.setCoursename("Python");
            
            Courses cor3=new Courses();
            cor3.setCoursename("C++");
            
            c.getCours().add(cor1);
            c.getCours().add(cor2);
            c.getCours().add(cor3);

            ses.save(c);
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        }finally{
        ses.close();
        }
    }
    
    
    public void selectCenter(){
    
     Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            Center cen=new Center();
            cen=(Center) ses.get(Center.class, 1);
            
            System.out.println(cen.getCentername());


        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        }finally{
        ses.close();
        }
    }
    
    
    
}
