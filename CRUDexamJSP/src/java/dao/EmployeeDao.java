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
import model.Employee;
import util.DbUtil;

/**
 *
 * @author MY COMPUTER
 */
public class EmployeeDao {
    
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    
    
    
    
    public static int saveEmployee(Employee e){
    int status=0;
    sql="insert into employee(name,department,address) values(?,?,?)";
        try {
            ps=DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getDepartment());
            ps.setString(3, e.getAddress());
           
            
           status= ps.executeUpdate();
            
            ps.close();
            DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return status;
    }
    
    
    
    public static List<Employee> getAllEmployee(){
    
        List<Employee> emp=new ArrayList<>();
        
        sql="select * from employee";
        try {
            ps=DbUtil.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
            
                Employee e=new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getString("address")
                );
                emp.add(e);
            
            }
            
            rs.close();
            ps.close();
            DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return emp;
    }
    
    
    
     public static void deleteEmployee(int id){
    sql="delete from employee where id=?";
    
        try {
            ps=DbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
     
     
     
     
      public static Employee getById(int id){
    
        Employee e = null;
        
        sql="select * from employee where id = ?";
        
        try {
            ps=DbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, id);
           rs=ps.executeQuery();
           
           while(rs.next()){
                e=new Employee(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getString("address")
                );
           }
           rs.close();
           ps.close();
           DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    return e;
    
    }
      
      
       public static int updateEmployee(Employee e){
    int status=0;
    sql="update employee set name=?, department=?, address=? where id=?";
    
        try {
            ps=DbUtil.getCon().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getDepartment());
            ps.setString(3, e.getAddress());
            ps.setInt(4, e.getId());
            
            
            status = ps.executeUpdate();
            
            ps.close();
            DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return status;
    }
    
    
}
