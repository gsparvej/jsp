<%-- 
    Document   : index
    Created on : Jun 16, 2025, 12:12:46 AM
    Author     : MY COMPUTER
--%>


<%@taglib prefix="con" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Student"%>
<%@page import="dao.StudentDao"%>
<%@page import="java.util.*"%>



<% 
List<Student> list =StudentDao.getAllStudents();
request.setAttribute("list",list);

%>




<%@include file="header.jsp" %>


<%@include file="footer.jsp" %>
