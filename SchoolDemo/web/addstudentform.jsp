<%-- 
    Document   : addstudentform
    Created on : Jun 16, 2025, 2:46:44 AM
    Author     : MY COMPUTER
--%>

<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton">Add Student Info</h1>
    </div>
    <!--    start form-->
    <form action="addstudent.jsp"  method="post">
        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label"> Student Name</label>
                <input type="text" class="form-control" id="stuName" name="stuName" placeholder="Write Your Name">
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Student Class</label>
                <select class="form-select" name="stuClass" aria-label="Default select example">
                    <option selected>Select Anyone</option>
                    <option value="Six">Six</option>
                    <option value="Seven">Seven</option>
                    <option value="Eight">Eight</option>
                    <option value="Nine">Nine</option>
                    <option value="Ten">Ten</option>
                    
                </select>
            </div>        
        </div>
        <!-- start 2nd row-->
        <div class="row mt-3">
            <div class="col-md-6">
                <label  class="form-label">Student Group</label>
                <select class="form-select" name="stuGroup" aria-label="Default select example">
                    <option selected>Select Anyone</option>
                    <option value="Science">Science</option>
                    <option value="Commerce">Commerce</option>
                    <option value="Arts">Arts</option>
                    
                </select>
            </div>

            <div class="col-md-6">
               <label for="exampleInputEmail1" class="form-label">Address</label>
                <input type="text" class="form-control" id="contactNo" name="stuAddress" placeholder="Dhaka">
            </div>        
        </div>

        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Contact Number</label>
                <input type="text" class="form-control" id="contactNo" name="stuContact" placeholder="+880173*******">
            </div>

        </div>

        <div class="row mt-3 text-center">
            <div class="col-md-6">
                <button type="submit" class="btn btn-success text-center" >Save</button>

            </div>

            <div class="col-md-6">
                <button type="reset" class="btn btn-danger text-center" >Reset</button>

            </div>
        </div>
    </form>

    <!--end form    -->
</div>


<%@include file="footer.jsp" %>
