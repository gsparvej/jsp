

<jsp:useBean class="model.Student" id="stu" />
<%@page import="dao.StudentDao" %>
<jsp:setProperty name="stu" property="*" />



<%
    StudentDao.deleteStudent(stu.getStuId());
    
    response.sendRedirect("index.jsp");
    
%>