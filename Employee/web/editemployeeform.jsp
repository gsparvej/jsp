<%@page import="model.Employee" %>
<%@page import="dao.EmployeeDao" %>

<%

    String id = request.getParameter("empId");
    Employee e = EmployeeDao.getById(Integer.parseInt(id));
%>


<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton"> Update Employee </h1>

    </div>
    <!--    start form-->

    <form action="editemployee.jsp" method="post">
        <input type="hidden" name="empId" value="<%=e.getEmpId()%>"/>

        <div  class="row">
            <div class="col-md-6">  
                <label for="" class="form-label"> Name </label>
                <input type="text" class="form-control" id="name" name="name" value="<%=e.getName()%>" placeholder="Update Your Full Name">
            </div>

            <div class="col-md-6">  
                <label for="" class="form-label"> Email </label>
                <input type="text" class="form-control" id="email" name="email" value="<%=e.getEmail()%>" placeholder=" Update example@gmail.com">
            </div>

        </div>
        <!--    2nd row-->

        <div class="row mt-3">
            <div class="col-md-6">
                <label class="form-label"> Salary </label>
                <input type="number" class="form-control" id="salary" name="salary" value="<%=e.getSalary()%>" >

            </div>


        </div>

        <div class="col-md-4">  
            <button type="submit" class="btn btn-success text-center" > Update </button>
        </div>

    </form>

</div>

<%@include file="footer.jsp" %>
