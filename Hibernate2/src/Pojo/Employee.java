/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Noah
 */
@Entity
public class Employee {
   private int id;
   private String name;
   
   private Adress ad;
   private Adress adHome;

   @Embedded
   @AttributeOverrides({
   @AttributeOverride(name = "state",column = @Column(name = "HomeState")),
   @AttributeOverride(name = "city",column = @Column(name = "Homecity")),
   @AttributeOverride(name = "street",column = @Column(name = "Homestreet"))
   })
    public Adress getAdHome() {
        return adHome;
    }

    public void setAdHome(Adress adHome) {
        this.adHome = adHome;
    }
   

   @Embedded
    public Adress getAd() {
        return ad;
    }

    public void setAd(Adress ad) {
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
