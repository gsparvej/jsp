

<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton">Add Employee's Info</h1>
    </div>
    <!--    start form-->
    <form action="teaServlet"  method="post">
        <input type="hidden" name="action" value="add">
        
        <div class="row">
            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label"> Employee's Name</label>
                <input type="text" class="form-control" id="tName" name="tName" placeholder="Write Your Name">
            </div>

            <div class="col-md-6">
                <label for="exampleInputEmail1" class="form-label">Department</label>
                <select class="form-select" name="tDepartment" aria-label="Default select example">
                    <option selected>Select Anyone</option>
                    <option value="Bangla">Bangla</option>
                    <option value="English">English</option>
                    <option value="Mathematics">Mathematics</option>
                    <option value="Physics">Physics</option>
                    <option value="Psychology">Psychology</option>
                    
                </select>
            </div>        
        </div>
        <!-- start 2nd row-->
        <div class="row mt-3">
            <div class="col-md-6">
               <label for="exampleInputEmail1" class="form-label">Address</label>
                <input type="text" class="form-control" id="address" name="address" placeholder="Dhaka">
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