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
    
    public void insertemployee(){
    
     Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            Employee em=new Employee("Ahmed");
            
            EmployeeDetails e=new EmployeeDetails("2625","jbvj@.com");
            
            
            em.setEmployeedetails(e);
            e.setEmployee(em);
            
            ses.save(em);
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        }finally{
        ses.close();
        }
    }
    
    
    public void selectemployee(){
    
     Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            Employee em=new Employee();
            em=(Employee) ses.get(Employee.class, 1);
            
            System.out.println("name is "+em.getName());
            System.out.println("phone is "+em.getEmployeedetails().getPhone());
            System.out.println("email is "+em.getEmployeedetails().getEmail());
            
           
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        }finally{
        ses.close();
        }
    }
    
    
    
}
