/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate2;

import Pojo.Book;
import Pojo.NewHibernateUtil;
import Pojo.Student;
import manyToMany.Centers;
import manyToMany.Courses;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Noah
 */
public class CRUD {

    public void insertStudent() {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();
            Student s = new Student();
            Book b = new Book();

            s.setName("Ahmed Ali");

            b.setBookName("java ee");
            s.setBok(b);

            ses.save(s);
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }

    }

    public void selectStudent() {

        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();

            Student s = new Student();

            s = (Student) ses.get(Student.class, 1);

            System.out.println("Student name is " + s.getName());
            System.out.println("Book Student name is " + s.getBok().getBookName());

        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            ses.close();
        }

    }
    
     public void selectBook() {

        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();

         Book b=new Book();

         b=(Book) ses.get(Book.class, 1);
            System.out.println("Book Student name is " + b.getBookName());
            System.out.println(" Student name is " + b.getSt().getName());
            System.out.println(" Student Id is " + b.getSt().getId());

        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            ses.close();
        }

    }
     
     
     public void updateStudent(){
     Session ses=NewHibernateUtil.getSessionFactory().openSession();
     
         try {
             ses.beginTransaction();
             Student s=new Student();
             Book b=new Book();
             
             s=(Student) ses.get(Student.class, 1);
             s.setName("ffff");
             b=(Book) ses.get(Book.class, 1);
             b.setBookName("aaaa");
             
             s.setBok(b);
             
             ses.update(s);
             
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
            Centers cen1=new Centers();
            Centers cen2=new Centers();
            
            cen1.setCenterName("IBM");
            cen2.setCenterName("Facebbok");
           
            Courses cor1=new Courses();
            Courses cor2=new Courses();
            
            cor1.setCourseName("Java");
            cor2.setCourseName("Python");
            
            cen1.getCours().add(cor1);
            cen2.getCours().add(cor2);

            cor1.getCenter().add(cen2);
            cor2.getCenter().add(cen1);
            
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
