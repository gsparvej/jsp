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

public class EmployeeDao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();
        
        sql = "select * from employees";
       
        try {
            ps = DbUtil.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
            
                Employee e=new Employee(rs.getInt("empId"),
                        rs.getString("name"),
                        rs.getString("designation"),
                        rs.getFloat("salary")
                
                );
            employees.add(e);
            
            }
            rs.close();
            ps.close();
            DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return employees;
    }
    
    public static int saveEmployee(Employee e){
    
        int status= 0;
        sql="insert into employees (name,designation,salary) values(?,?,?)";
        try {
            ps=DbUtil.getCon().prepareStatement(sql);
            
            ps.setString(1, e.getName());
            ps.setString(2, e.getDesignation());
            ps.setFloat(3, e.getSalary());
            
            status=ps.executeUpdate();
            
            ps.close();
            DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    return status;
    }
    
    
    public static void deleteEmployee(int empId){
    
        sql="delete from employees where empId = ? ";
        try {
            ps=DbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, empId);
            ps.executeUpdate();
            
            ps.close();
            DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
      
    
    public static int updateEmployee(Employee e){
    
        int status=0;
        sql="update employees set name=?,designation=?,salary=? where empId=?";
        try {
            ps=DbUtil.getCon().prepareStatement(sql);
            
            ps.setString(1,e.getName());
            ps.setString(2,e.getDesignation());
            ps.setFloat(3, e.getSalary());
            ps.setInt(4, e.getEmpId());
            
            
            status=ps.executeUpdate();
            
            ps.close();
            DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return status;
    }
    
    public static Employee getById(int empId){
    
        Employee em=null;
        sql="select * from employees where empId=?";
    
        try {
            ps=DbUtil.getCon().prepareStatement(sql);
            ps.setInt(1, empId);
            
           rs = ps.executeQuery();
            
            while(rs.next()){
            em=new Employee(rs.getInt("empId"),
                    rs.getString("name"),
                    rs.getString("designation"),
                    rs.getFloat("salary")
            );
            
            
            
            }
            rs.close();
            ps.close();
            DbUtil.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return em;
    }
}
