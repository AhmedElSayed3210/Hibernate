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
public class Center {
    private int id;
    private String name;
    private Set<Courses> cors=new HashSet<Courses>();

    public Set<Courses> getCors() {
        return cors;
    }

    public void setCors(Set<Courses> cors) {
        this.cors = cors;
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
