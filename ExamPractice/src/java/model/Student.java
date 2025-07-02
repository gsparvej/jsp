
package model;


public class Student {
    
    private int stuId;
    private String stuName;
    private String stuClass;
    private String stuContact;

    public Student() {
    }

    public Student(int stuId, String stuName, String stuClass, String stuContact) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.stuContact = stuContact;
    }

    public Student(String stuName, String stuClass, String stuContact) {
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.stuContact = stuContact;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuContact() {
        return stuContact;
    }

    public void setStuContact(String stuContact) {
        this.stuContact = stuContact;
    }
    
    
}
