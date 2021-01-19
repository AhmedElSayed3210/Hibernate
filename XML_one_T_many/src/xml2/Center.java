/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Noah
 */
public class Center {
    private int id;
    private String centername;
    private Set<Courses> cours=new HashSet<Courses>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCentername() {
        return centername;
    }

    public void setCentername(String centername) {
        this.centername = centername;
    }

    public Set<Courses> getCours() {
        return cours;
    }

    public void setCours(Set<Courses> cours) {
        this.cours = cours;
    }
    
    
}
