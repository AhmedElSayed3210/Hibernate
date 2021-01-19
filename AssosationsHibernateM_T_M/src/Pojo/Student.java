/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Noah
 */
@Entity
public class Student {
    private int id;
    private String name;
    private Book bok;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public Book getBok() {
        return bok;
    }

    public void setBok(Book bok) {
        this.bok = bok;
    }
    
 @Id
 @GeneratedValue
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
