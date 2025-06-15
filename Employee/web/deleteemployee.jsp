<%-- 
    Document   : deleteemployee
    Created on : Jun 15, 2025, 9:21:49 PM
    Author     : MY COMPUTER
--%>


<jsp:useBean class="model.Employee" id="e" />
<%@page import="dao.EmployeeDao" %>
<jsp:setProperty name="e" property="*" />


<%
    EmployeeDao.deleteEmployee(e.getEmpId());
    
    response.sendRedirect("index.jsp");
    
%>


