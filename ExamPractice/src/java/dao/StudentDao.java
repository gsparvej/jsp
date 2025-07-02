/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;
import util.DbUtil;

/**
 *
 * @author Admin
 */
public class StudentDao {
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    
    
    public static int saveStudent(Student s) {

        int status = 0;
        
        sql = "insert into student(stuName, stuClass, stuContact)values(?,?,?)";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, s.getStuName());
            ps.setString(2, s.getStuClass());
            ps.setString(3, s.getStuContact());

            status = ps.executeUpdate();

            ps.close();
            DbUtil.getCon().close();

            System.out.println(status);

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;

    }
    
    
     public static List<Student> getAllStudents() {

        List<Student> students = new ArrayList<>();

        sql = "select * from student";

        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Student s = new Student(rs.getInt("stuId"),
                        rs.getString("stuName"),
                        rs.getString("stuClass"),
                        rs.getString("stuContact")
                );

                students.add(s);

            }
            rs.close();
            ps.close();
            DbUtil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return students;
    }
    
}
