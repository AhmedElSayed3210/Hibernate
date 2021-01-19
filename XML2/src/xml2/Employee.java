/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml2;

/**
 *
 * @author Noah
 */
public class Employee {
    private int id;
    private String name;
private Adress ad;
private Adress adHome;

    public Adress getAdHome() {
        return adHome;
    }

    public void setAdHome(Adress adHome) {
        this.adHome = adHome;
    }


    public Adress getAd() {
        return ad;
    }

    public void setAd(Adress ad) {
        this.ad = ad;
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
