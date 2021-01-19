



import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noah
 */
public class CRUD {
  
    
      public boolean insert(Employee em) {
          boolean flag=false;
        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();

            ses.save(em);
            ses.getTransaction().commit();
            flag=true;
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }
return flag;
    }
    
       public Employee Search(int id) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        Employee em=new Employee();
        try {
            ses.beginTransaction();

            em = (Employee) ses.get(Employee.class, id);
            
         
            // ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }
        return em;
    }
    
        public  ArrayList<Employee> Select() {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
         ArrayList<Employee> arrlis = new ArrayList<Employee>();
         List<Employee> lis = new ArrayList<Employee>();
        try {
            ses.beginTransaction();
            Criteria q=ses.createCriteria(Employee.class);

           lis=q.list();
           
            for (Employee li : lis) {
                Employee em =new Employee();
                em.setId(li.getId());
                em.setName(li.getName());
                em.setPosition(li.getPosition());
                em.setSalary(li.getSalary());
                
                arrlis.add(em);
            }
            
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }
        return arrlis;
    }

    
}
