
package servlet;

import dao.TeacherDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Teacher;

@WebServlet("/teaServlet")
public class TeacherServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if("add".equals(action)){
        
            Teacher teach=new Teacher();
            teach.settName(request.getParameter("tName"));
            teach.settDepartment(request.getParameter("tDepartment"));
            teach.settSalary(Float.parseFloat(request.getParameter("tSalary")));
            teach.settAddress(request.getParameter("tAddress"));
            teach.settContact(request.getParameter("tContact"));
            
            TeacherDao.saveTeacher(teach);
            
            response.sendRedirect("allteacher.jsp");
        
        }
        
        else if("update".equals(action)){
        
            Teacher teach=new Teacher();
            teach.settName(request.getParameter("tName"));
            teach.settDepartment(request.getParameter("tDepartment"));
            teach.settSalary(Float.parseFloat(request.getParameter("tSalary")));
            teach.settAddress(request.getParameter("tAddress"));
            teach.settContact(request.getParameter("tContact"));
            teach.settId(Integer.parseInt(request.getParameter("tId")));
            
            TeacherDao.updateTeacher(teach);
            
            response.sendRedirect("allteacher.jsp");
        
        
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if("delete".equals(action)){
        
            
           int id = Integer.parseInt(request.getParameter("tId"));
            TeacherDao.deleteTeacher(id);
            
            response.sendRedirect("allteacher.jsp");
        
        }
        
        else if("edit".equals(action)){
        
            Teacher t= TeacherDao.getById(Integer.parseInt(request.getParameter("tId")));
            request.setAttribute("teac", t);
            
            request.getRequestDispatcher("editteacher.jsp").forward(request, response);
        
        }
    }
    
    
    
}
