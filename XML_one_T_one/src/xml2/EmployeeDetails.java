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
public class EmployeeDetails {
    private int id;
    private String phone;
    private String email;
    private Employee employee;

  

    public EmployeeDetails() {
    }

    
    public EmployeeDetails(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

      public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
