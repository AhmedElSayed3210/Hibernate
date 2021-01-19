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
private EmployeeDetails employeedetails;

    public EmployeeDetails getEmployeedetails() {
        return employeedetails;
    }

    public void setEmployeedetails(EmployeeDetails employeedetails) {
        this.employeedetails = employeedetails;
    }

    public Employee() {

    }
    public Employee(String name) {
        this.name = name;
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
