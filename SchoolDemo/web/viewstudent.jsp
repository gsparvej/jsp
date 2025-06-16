<%-- 
    Document   : viewstudent
    Created on : Jun 16, 2025, 3:58:46 PM
    Author     : Admin
--%>

<%@taglib prefix="con" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Student"%>
<%@page import="dao.StudentDao"%>
<%@page import="java.util.*"%>


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
            <con:forEach items="${list}" var="s">
                <tr>
                    <td>${s.getStuId()}</td>
                    <td>${s.getStuName()}</td>
                    <td>${s.getStuClass()}</td>
                    <td>${s.getStuGroup()}</td>
                    <td>${s.getStuAddress()}</td>
                    <td>${s.getStuContact()}</td>
                     <td>
                        <a href="#" class="btn btn-primary"> Edit </a>
                        <a href="#" class="btn btn-danger" 
                           onclick="return confirm('Are you sure ! Want to delete this Employee?');"> Delete </a>
                    </td>
                   
                    
                </tr>
                
            </con:forEach>
            
            
        </tbody>
            
        
    </table>
   
    </div>

