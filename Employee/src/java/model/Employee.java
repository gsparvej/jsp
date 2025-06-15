
package model;


public class Employee {
    
    private int empId;
    private String name;
    private String email;
    private float salary;

    public Employee() {
    }

    public Employee(int empId, String name, String email, float salary) {
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public Employee(String name, String email, float salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}

