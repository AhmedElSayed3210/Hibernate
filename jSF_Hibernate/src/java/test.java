



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noah
 */
public class test {
    
    
    public static void main(String[] args) {
        Employee em =new Employee();
        CRUD c=new CRUD();
        
        em.setName("dfdd");
        em.setPosition("ffff");
        em.setSalary(262);
        
        c.insert(em);
        
    }
            
    
}
