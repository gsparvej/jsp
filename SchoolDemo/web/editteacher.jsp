<%-- 
    Document   : editteacher
    Created on : Jun 17, 2025, 10:54:14 AM
    Author     : MY COMPUTER
--%>

<%@page import="model.Teacher" %>

<%@include file="header.jsp" %>


<%
    Teacher t= (Teacher) request.getAttribute("teac");

%>


<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton">Edit Teacher's Info</h1>
    </div>
    <!--    start form-->
    <form action="teaServlet"  method="post">
        <input type="hidden" name="action" value="update">

        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label"> Teacher's Name</label>
                <input type="text" class="form-control" id="tName" name="tName" value="<%= t.gettName() %>" required>
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Department</label>
                <select class="form-select" name="tDepartment"  aria-label="Default select example">
                    <option selected>Select Anyone</option>

                    <option value="Bangla" <%= t.gettDepartment().eguals("Bangla") ? "selected" : "" %>>Bangla</option>
                    <option value="English" <%= t.gettDepartment().eguals("English") ? "selected" : "" %>>English</option>
                    <option value="Mathematics" <%= t.gettDepartment().eguals("Mathematics") ? "selected" : "" %>>Mathematics</option>
                    <option value="Physics" <%= t.gettDepartment().eguals("Physics") ? "selected" : "" %>>Physics</option>
                    <option value="Psychology" <%= t.gettDepartment().eguals("Psychology") ? "selected" : "" %>>Psychology</option>

                </select>
            </div>        
        </div>
        <!-- start 2nd row-->
        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Salary</label>
                <input type="number" class="form-control" id="tSalary" name="tSalary" value="<%= t.gettSalary() %>" required>
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Address</label>
                <input type="text" class="form-control" id="tAddress" name="tAddress" value="<%= t.gettAddress() %>" required>
            </div>        
        </div>

        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Contact Number</label>
                <input type="text" class="form-control" id="tContact" name="tContact" value="<%= t.gettContact() %>" required>
            </div>

        </div>

        <div class="row mt-3 text-center">
            <div class="col-md-6">
                <button type="submit" class="btn btn-success text-center" >Update</button>

            </div>

            <div class="col-md-6">
                <a href="allstudent.jsp"><button type="reset" class="btn btn-danger text-center" >Reset</button></a>



            </div>
        </div>
    </form>

    <!--end form    -->
</div>




<%@include file="footer.jsp" %>