
package model;


public class Student {
    
    private int stuId;
    private String stuName;
    private String stuClass;
    private String stuGroup;
    private String stuAddress;
    private String stuContact;

    public Student() {
    }

    public Student(int stuId, String stuName, String stuClass, String stuGroup, String stuAddress, String stuContact) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.stuGroup = stuGroup;
        this.stuAddress = stuAddress;
        this.stuContact = stuContact;
    }

    public Student(String stuName, String stuClass, String stuGroup, String stuAddress, String stuContact) {
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.stuGroup = stuGroup;
        this.stuAddress = stuAddress;
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

    public String getStuGroup() {
        return stuGroup;
    }

    public void setStuGroup(String stuGroup) {
        this.stuGroup = stuGroup;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuContact() {
        return stuContact;
    }

    public void setStuContact(String stuContact) {
        this.stuContact = stuContact;
    }
    
    
    
    
}
