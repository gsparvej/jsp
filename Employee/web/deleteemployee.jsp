<%-- 
    Document   : deleteemployee
    Created on : Jun 15, 2025, 9:21:49 PM
    Author     : MY COMPUTER
--%>


<jsp:useBean class="model.Employee" id="p" />
<%@page import="dao.EmployeeDao" %>
<jsp:setProperty name="p" property="*" />


<%
    EmployeeDao.deleteEmployee(p.getEmpId());
    
    response.sendRedirect("index.jsp");
    
%>


