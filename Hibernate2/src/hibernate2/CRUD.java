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
import java.util.List;
import org.apache.derby.vti.Restriction;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Noah
 */
public class CRUD {
    
    public void insert(String name,int age,Date date){
        Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            
            Person p=new Person();
            
            p.setName(name);
            p.setAge(age);
            p.setDate(date);
             p.setPosition("java dev");
             
             p.setDescrip("devloper");
            
            ses.save(p);
            ses.getTransaction().commit();
            
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
            
        }finally{
        ses.close();
        }
        
    }
    
    public void selectPerson(){
        Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
          Person d=new Person();
           // Query q=ses.createQuery("from Person where id=:n");
           // q.setInteger("n", 2);
           
            Criteria q=ses.createCriteria(Person.class);

            
           // q.add(Restrictions.gt("id",(long)2));
          // q.add(Restrictions.like("name", "A", MatchMode.ANYWHERE));
           q.add(Restrictions.ilike("name", "A", MatchMode.ANYWHERE));
            
          
           
            List <Person> per=q.list();
            
            for (Person person : per) {
                System.out.println("Id : "+person.getId());
                System.out.println("Name : "+person.getName());
                System.out.println("Age : "+person.getAge());
                System.out.println("data : "+person.getDate());
                System.out.println("Position : "+person.getPosition());
            }
            Query c=ses.createQuery("select max(age) from Person");
            System.out.println(" max Age is :"+c.list().toString());
            
             Criteria count=q.setProjection(Projections.count("name"));
            System.out.println("name count is  :"+count.list().toString());
           
           
            
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
            
        }finally{
        ses.close();
        }
        
    }
    
    
    
    
    
    
    
    
    public void insertEmployee(){
        Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            
            Employee em=new Employee();
            em.setName("xxxx");
            Adress ad=new Adress();
            ad.setCity("cairoxx");
            ad.setState("egyptxx");
            ad.setStreet("ddddx");
            
            Adress adhom=new Adress();
            adhom.setCity("zaga xx");
            adhom.setState("zddffdxx");
            adhom.setStreet("12 st xx");
            
            em.setAd(ad);
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
    
    public void select(long id){
        Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
           // ses.beginTransaction();
            
            Person p=new Person();
            
            p=(Person) ses.get(Person.class, id);
            
            System.out.println("name is "+p.getName());
            System.out.println("Age is "+p.getAge());
            System.out.println("Date is "+p.getDate());
           // ses.save(p);
           // ses.getTransaction().commit();
            
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
            
        }finally{
        ses.close();
        }
        
    }
    
    
    
    public void update(){
        Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            
            Person p=new Person();   
            p=(Person) ses.get(Person.class, (long)1);

            p.setName("ssssssssssss");
            
            ses.update(p);
            ses.getTransaction().commit();
            
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
            
        }finally{
        ses.close();
        }
        
    }
    public void delete(long id){
        Session ses=NewHibernateUtil.getSessionFactory().openSession();
        
        try {
            ses.beginTransaction();
            
            Person p=new Person();   
            p=(Person) ses.get(Person.class, id);

            
            ses.delete(p);
            ses.getTransaction().commit();
            
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
            
        }finally{
        ses.close();
        }
        
    }
    
    
    
}
