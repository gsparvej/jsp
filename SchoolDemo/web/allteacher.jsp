<%-- 
    Document   : allteacher
    Created on : Jun 17, 2025, 10:54:04 AM
    Author     : MY COMPUTER
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Teacher"%>
<%@page import="dao.TeacherDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<% 
    

List<Teacher> list = TeacherDao.getAllTeacher();
request.setAttribute("list", list);

%>


    <div class="container border border-danger my-3">
    <h1 class="text-center bg-danger" > All Teacher </h1>
    
    <table class="table table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Department</th>
                <th>Salary</th>
                <th>Address</th>
                <th>Contact</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="s">
                <tr>
                    <td>${s.tId}</td>
                    <td>${s.tName}</td>
                    <td>${s.tDepartment}</td>
                    <td>${s.tSalary}</td>
                    <td>${s.tAddress}</td>
                    <td>${s.tContact}</td>
                     <td>
                        <a href="TeacherServlet?action=edit&tId=${s.tId}" class="btn btn-primary"> Edit </a>
                        <a href="TeacherServlet?action=delete&tId=${s.tId}" class="btn btn-danger" 
                           onclick="return confirm('Are you sure ! Want to delete this Teacher?');"> Delete </a>
                    </td>
                   
                    
                </tr>
                
            </c:forEach>
            
            
        </tbody>
            
        
    </table>
   
    </div>



<%@include file="footer.jsp" %>