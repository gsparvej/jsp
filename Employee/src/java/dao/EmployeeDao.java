package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
import model.Employee;
import util.DbUtil;

public class EmployeeDao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();
        sql = "select * from employees";
        ps = DbUtil.getCon().
       
    
    
    
    
    
    
        return employees;
    }
}
