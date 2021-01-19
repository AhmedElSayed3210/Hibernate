/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlhibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Noah
 */
public class XMLHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        try {
            ses.beginTransaction();
            Person p = new Person();
            p.setFname("Ahmed");
            p.setLname("ElSayed");
            p.setAdmin(true);
            ses.save(p);

            ses.getTransaction().commit();
        } catch (HibernateException e) {
            ses.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            ses.close();
        }
    }

}
