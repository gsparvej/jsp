/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MY COMPUTER
 */
public class Employee {
    
    private int id;
    private String name;
    private String department;
    private String address;

    public Employee(int id, String name, String department, String address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    public Employee(String name, String department, String address) {
        this.name = name;
        this.department = department;
        this.address = address;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
   
    
}
