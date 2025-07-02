
<jsp:useBean class="model.Student" id="stu" />
<%@page import="dao.StudentDao" %>
<jsp:setProperty name="stu" property="*" />

<%

 int result = StudentDao.saveStudent(stu);
    
    if(result > 0){
    
    response.sendRedirect("index.jsp");
    }
    else{
    response.sendRedirect("error.jsp");
    
    }
%>