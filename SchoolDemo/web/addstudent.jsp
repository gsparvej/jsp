<%-- 
    Document   : addstudent
    Created on : Jun 16, 2025, 2:46:28 AM
    Author     : MY COMPUTER
--%>

<jsp:useBean class="model.Student" id="s" />
<%@page import="dao.StudentDao" %>
<jsp:setProperty name="s" property="*" />

<%
    int result=StudentDao.saveStudent(s);
    if(result > 0){
    
    response.sendRedirect("index.jsp");
    }
    else{
    response.sendRedirect("error.jsp");
    
    }


%>