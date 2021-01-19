/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manyToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Noah
 */
@Entity
public class Courses {
    private int id;
    private String courseName;
    private List<Centers>center=new ArrayList<Centers>();
@ManyToMany(cascade = CascadeType.ALL,targetEntity = Centers.class)
@JoinTable(name = "cen_cor",joinColumns = {
        @JoinColumn(name = "cen_id")},inverseJoinColumns = {
        @JoinColumn(name = "cor_id")})
    public List<Centers> getCenter() {
        return center;
    }

    public void setCenter(List<Centers> center) {
        this.center = center;
    }
    
    
    
@Id
@GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
}
