/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate2;

import java.util.Date;

/**
 *
 * @author Noah
 */
public class Hibernate2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CRUD c = new CRUD();
c.insertManyToManyCenter();

    }

}
