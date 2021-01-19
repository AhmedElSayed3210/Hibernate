

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
/**
 *
 * @author Noah
 */
@ManagedBean
@Entity(name = "Employee_table")
public class Employee {
   private int id;
    private String name,position,msg;
    private double salary;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Transient
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    public void clear(){
    
    name="";
    position="";
    salary=0;
    }
    
    public void insert(){
        CRUD c=new CRUD();
    
     boolean flag=  c.insert(this);
        if (flag) {
            msg="Data Saved!"; 
            clear();
        }else{
        msg="Not Saved!";
        }
    
    }   
    
   
   
    public void search(){
     CRUD c=new CRUD();
        Employee em=new Employee();
        em=c.Search(id);
        name=em.getName();
        position=em.getPosition();
        salary=em.getSalary();
        
    }
    
    public ArrayList<Employee> getMembers(){
        
         CRUD c=new CRUD();
    ArrayList<Employee> emp=c.Select();

return emp;
    }
    
}
