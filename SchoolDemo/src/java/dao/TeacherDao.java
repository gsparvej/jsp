
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Teacher;
import util.SchUtil;


public class TeacherDao {
    
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    public static int saveTeacher(Teacher t){
    int status=0;
    sql="insert into teachers(tName,tDepartment,tSalary,tAddress,tContact) values(?,?,?,?,?)";
        try {
            ps=SchUtil.getCon().prepareStatement(sql);
            ps.setString(1, t.gettName());
            ps.setString(2, t.gettDepartment());
            ps.setFloat(3, t.gettSalary());
            ps.setString(4, t.gettAddress());
            ps.setString(5, t.gettContact());
            
           status= ps.executeUpdate();
            
            ps.close();
            SchUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return status;
    }
    
    
    public static List<Teacher> getAllTeacher(){
    
        List<Teacher> tea=new ArrayList<>();
        
        sql="select * from teachers";
        try {
            ps=SchUtil.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
            
                Teacher t=new Teacher(rs.getInt("tId"),
                        rs.getString("tName"),
                        rs.getString("tDepartment"),
                        rs.getFloat("tSalary"),
                        rs.getString("tAddress"),
                        rs.getString("tContact")
                
                );
                tea.add(t);
            
            }
            
            rs.close();
            ps.close();
            SchUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return tea;
    }
    
    
    public static void deleteTeacher(int tId){
    sql="delete from teachers where tId=?";
    
        try {
            ps=SchUtil.getCon().prepareStatement(sql);
            ps.setInt(1, tId);
            
            ps.executeUpdate();
            
            ps.close();
            SchUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public static Teacher getById(int tId){
    
        Teacher t=null;
        
        sql="select * from teachers where tId=?";
        
        try {
            ps=SchUtil.getCon().prepareStatement(sql);
            ps.setInt(1, tId);
           rs=ps.executeQuery();
           
           while(rs.next()){
                 t=new Teacher(rs.getInt("tId"),
                        rs.getString("tName"),
                        rs.getString("tDepartment"),
                        rs.getFloat("tSalary"),
                        rs.getString("tAddress"),
                        rs.getString("tContact")
                
                );
           }
           rs.close();
           ps.close();
           SchUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    return t;
    
    }
    
    
    public static int updateTeacher(Teacher t){
    int status=0;
    sql="update teachers set tName=?, tDepartment=?, tSalary=?, tAddress=?, tContact=? where tId=?";
    
        try {
            ps=SchUtil.getCon().prepareStatement(sql);
            ps.setString(1, t.gettName());
            ps.setString(2, t.gettDepartment());
            ps.setFloat(3, t.gettSalary());
            ps.setString(4, t.gettAddress());
            ps.setString(5, t.gettContact());
            ps.setInt(6, t.gettId());
            
            
            status = ps.executeUpdate();
            
            ps.close();
            SchUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return status;
    }
}
