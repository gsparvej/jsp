

<%@taglib prefix="con" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Employee"%>
<%@page import="dao.EmployeeDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<% 
List<Employee> list =EmployeeDao.getAllEmployees();
request.setAttribute("list",list);

%>

<div class="container border border-danger my-3">
    
    <h1 class="text-center bg-danger" > All Employee </h1>
    <table class="table table-striped">
        
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Designation</th>
                <th>Salary</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <con:forEach items="${list}" var="e">
                <tr>
                    <td>${e.getEmpId()}</td>
                    <td>${e.getName()}</td>
                    <td>${e.getDesignation()}</td>
                    <td>${e.getSalary()}</td>
                    
                    <td>
                        <a href="editemployeeform.jsp?empId=${e.empId}" class="btn btn-primary"> Edit </a>
                        <a href="deleteemployee.jsp?empId=${e.empId}" class="btn btn-danger" 
                           onclick="return confirm('Are you sure ! Want to delete this Employee?');"> Delete </a>
                    </td>
                    
                </tr>
                
                
                
            </con:forEach>
        </tbody>
    </table>
</div>

<%--<%@include file="footer.jsp" %>--%>