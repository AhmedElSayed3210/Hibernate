/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manyToOne;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author Noah
 */
@Entity
public class Center {

    private int id;
    private String centerName;
    private List<Course> cours = new ArrayList<Course>();

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Course.class)
    //@JoinTable(name = "cen_cour",joinColumns = {@JoinColumn(name = "Ce_id")},inverseJoinColumns = {@JoinColumn(name = "Co_id")})
    @JoinColumn(name = "Ce_id")
    public List<Course> getCours() {
        return cours;
    }

    public void setCours(List<Course> cours) {
        this.cours = cours;
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

}
