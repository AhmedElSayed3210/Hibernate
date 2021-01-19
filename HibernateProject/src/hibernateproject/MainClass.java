/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateproject;

/**
 *
 * @author Noahs
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CRUD_User cu=new CRUD_User();
       // cu.addUser("Ahmed", "jhvuhj@.com", "Zagazig");
        //cu.Login("Ahmed", "jhvuhj@.com");
       // cu.addBook(1,"java");
       //cu.getBooks(1);
       cu.deletebook(0);
    }
    
}
