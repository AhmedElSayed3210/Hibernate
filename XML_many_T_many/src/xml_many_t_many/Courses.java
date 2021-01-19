/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml_many_t_many;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Noah
 */
public class Courses {
    private int id;
    private String name;
    
    private Set<Center> cent=new HashSet<Center>();

    public Set<Center> getCent() {
        return cent;
    }

    public void setCent(Set<Center> cent) {
        this.cent = cent;
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
    
}
