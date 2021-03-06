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
public class Centers {

    private int id;
    private String centerName;
    private List<Courses> cours=new ArrayList<Courses>();

    @ManyToMany(cascade = CascadeType.ALL,targetEntity = Courses.class)
@JoinTable(name = "cen_cor",joinColumns = {
        @JoinColumn(name = "cor_id")},inverseJoinColumns = {
        @JoinColumn(name = "cen_id")})
    public List<Courses> getCours() {
        return cours;
    }

    public void setCours(List<Courses> cours) {
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
