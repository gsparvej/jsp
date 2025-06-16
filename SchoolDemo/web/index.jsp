<%@taglib prefix="con" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Student"%>
<%@page import="dao.StudentDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<% 
    
 List<Student> list = StudentDao.getAllStudents();
request.setAttribute("list", list);

%>










<%@include file="footer.jsp" %>
