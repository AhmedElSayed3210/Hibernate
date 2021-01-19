/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateproject;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Noah
 */
public class CRUD_User {

    User u = new User();

    public void addUser(String name, String email, String address) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();
            // Books b1 = new Books();
            // Books b2 = new Books();

            u.setName(name);
            u.setEmail(email);
            u.setAdress(address);
//            b1.setBookName("ddddd");
//            b2.setBookName("ee");
//            u.getBok().add(b1);
//            u.getBok().add(b2);

            ses.save(u);
            ses.getTransaction().commit();

        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }

    }

    public void Login(String name, String email) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {

            Criteria q = ses.createCriteria(User.class);

            // q.add(Restrictions.eq("name", "Ahmed"));
            Criterion n = Restrictions.eq("name", name);
            Criterion p = Restrictions.eq("email", email);
            LogicalExpression and = Restrictions.and(n, p);
            q.add(and);

            List<User> us = q.list();
            if (!us.isEmpty()) {
                System.out.println("Find");
            } else {

                System.out.println(" jcjccccccccccccccccc");
            }

            for (User u1 : us) {
                System.out.println("name is  " + u1.getName());
                System.out.println("adress is  " + u1.getAdress());
            }

        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }

    }

    public void addBook(int user_id, String bookName) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();
            u = (User) ses.get(User.class, user_id);
            Books b = new Books();

            b.setBookName(bookName);

            u.getBok().add(b);

            ses.save(u);
            ses.getTransaction().commit();

        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }

    }

    public void getBooks(int user_id) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();
            u = (User) ses.get(User.class, user_id);
            Books b = new Books();
            System.out.println("user name : " + u.getName());
            for (Books bo : u.getBok()) {
                System.out.println("book name : " + bo.getBookName());
            }

        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();

        }
    }

    public void deletebook(int user_id) {
        Session ses = NewHibernateUtil.getSessionFactory().openSession();

        try {
            ses.beginTransaction();
            User u = new User();
            // u = (User) ses.get(User.class, 2);
            Books b = new Books();
            b = (Books) ses.get(Books.class, 1);
            ses.delete(b);                  
            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();

        } finally {
            ses.close();
        }

    }

}
