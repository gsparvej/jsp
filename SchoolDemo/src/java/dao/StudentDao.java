
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;
import util.SchUtil;


public class StudentDao {
    
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    
    
    
    public static int saveStudent(Student s) {

        int status = 0;
        sql = "insert into students(stuName, stuClass, stuGroup, stuAddress, stuContact) values(?,?,?,?,?)";

        try {
            ps = SchUtil.getCon().prepareStatement(sql);
            ps.setString(1, s.getStuName());
            ps.setString(2, s.getStuClass());
            ps.setString(3, s.getStuGroup());
            ps.setString(4, s.getStuAddress());
            ps.setString(5, s.getStuContact());
            
             status=ps.executeUpdate();
            
            ps.close();
            SchUtil.getCon().close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
       return status;
       
}
    
    
    
    public static List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();
        
        sql = "select * from students";
       
        try {
            ps = SchUtil.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
            
               Student s=new Student(rs.getInt("stuId"),
                       rs.getString("stuName"),
                       rs.getString("stuClass"),
                       rs.getString("stuGroup"), 
                       rs.getString("stuAddress"),
                       rs.getString("stuContact")
               
               );
               
            students.add(s);
            
            }
            rs.close();
            ps.close();
            SchUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return students;
    }
}


