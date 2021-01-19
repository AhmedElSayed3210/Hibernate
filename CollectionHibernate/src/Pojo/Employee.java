/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Noah
 */
@Entity
public class Employee {
   private int id;
   private String name;
 private List<Adress> ad=new ArrayList<>();

 
 @ElementCollection
 @JoinTable(name = "ad_em",joinColumns = @JoinColumn(name = "ad_em_id"))
 @GenericGenerator(name = "increment",strategy = "increment")
 @CollectionId(columns = {@Column(name = "id")},generator = "increment",type = @Type(type = "int"))
    public List<Adress> getAd() {
        return ad;
    }

    public void setAd(List<Adress> ad) {
        this.ad = ad;
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
