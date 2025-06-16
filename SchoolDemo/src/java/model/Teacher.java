/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MY COMPUTER
 */
public class Teacher {
    
    private int tId;
    private String tName;
    private String tDepartment;
    private float tSalary;
    private String tAddress;
    private String tContact;

    public Teacher() {
    }

    public Teacher(int tId, String tName, String tDepartment, float tSalary, String tAddress, String tContact) {
        this.tId = tId;
        this.tName = tName;
        this.tDepartment = tDepartment;
        this.tSalary = tSalary;
        this.tAddress = tAddress;
        this.tContact = tContact;
    }

    public Teacher(String tName, String tDepartment, float tSalary, String tAddress, String tContact) {
        this.tName = tName;
        this.tDepartment = tDepartment;
        this.tSalary = tSalary;
        this.tAddress = tAddress;
        this.tContact = tContact;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettDepartment() {
        return tDepartment;
    }

    public void settDepartment(String tDepartment) {
        this.tDepartment = tDepartment;
    }

    public float gettSalary() {
        return tSalary;
    }

    public void settSalary(float tSalary) {
        this.tSalary = tSalary;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public String gettContact() {
        return tContact;
    }

    public void settContact(String tContact) {
        this.tContact = tContact;
    }
    
    
}
