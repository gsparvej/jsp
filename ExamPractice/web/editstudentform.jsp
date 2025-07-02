

<%@page import="model.Student" %>
<%@page import="dao.StudentDao" %>

<%

    String id = request.getParameter("stuId");
    Student e = StudentDao.getById(Integer.parseInt(id));
%>


<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton"> Update Student </h1>

    </div>
    <!--    start form-->

    <form action="editstudent.jsp" method="post">
        <input type="hidden" name="empId" value="<%=e.getStuId()%>"/>

        <div  class="row">
            <div class="col-md-6">  
                <label for="" class="form-label"> Name </label>
                <input type="text" class="form-control" id="stuName" name="stuName" value="<%=e.getStuName()%>" placeholder="Update Your Full Name">
            </div>

            <div class="col-md-6">  
                <label for="" class="form-label"> Class </label>
                <input type="text" class="form-control" id="stuClass" name="stuClass" value="<%=e.getStuClass()%>">
            </div>

        </div>
        <!--    2nd row-->

        <div class="row mt-3">
            <div class="col-md-6">
                <label class="form-label"> Contact </label>
                <input type="text" class="form-control" id="stuContact" name="stuContact" value="<%=e.getStuContact()%>" >

            </div>


        </div>

        <div class="col-md-4">  
            <button type="submit" class="btn btn-success text-center" > Update </button>
        </div>

    </form>

</div>

<%@include file="footer.jsp" %>
