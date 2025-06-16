<%-- 
    Document   : viewstudent
    Created on : Jun 16, 2025, 3:58:46 PM
    Author     : Admin
--%>

<%@taglib prefix="con" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Student"%>
<%@page import="dao.StudentDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<% 
    
 List<Student> list = StudentDao.getAllStudents();
request.setAttribute("list", list);

%>


    <div class="container border border-danger my-3">
    <h1 class="text-center bg-danger" > All Student </h1>
    
    <table class="table table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Class</th>
                <th>Group</th>
                <th>Address</th>
                <th>Contact</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            
            
            
        </tbody>
            
        
    </table>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    </div>







<%@include file="footer.jsp" %>

