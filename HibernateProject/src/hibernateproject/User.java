/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateproject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Noah
 */
public class User {
    private int id;
    private String name;
    private String email;
    private String adress;
    
    Set<Books> bok=new HashSet<Books>();

    public Set<Books> getBok() {
        return bok;
    }

    public void setBok(Set<Books> bok) {
        this.bok = bok;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
}
