<%-- 
    Document   : editemployee
    Created on : Jun 15, 2025, 10:40:08 PM
    Author     : MY COMPUTER
--%>

<jsp:useBean class="model.Employee" id="pa" />
<%@page import="dao.EmployeeDao" %>
<jsp:setProperty name="pa" property="*" />


<%

    int result=EmployeeDao.updateEmployee(pa);

    if(result > 0){
    
    response.sendRedirect("index.jsp");
    }
    else{
    response.sendRedirect("error.jsp");
    
    }


%>
