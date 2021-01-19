/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Noah
 */
@Entity
public class Book {
 private Student st;

 @OneToOne(cascade = CascadeType.ALL,mappedBy = "bok")
    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }
    private int id;
    private String bookName;
    

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}
