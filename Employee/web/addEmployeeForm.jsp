
<%@include file="header.jsp" %>

<div class="container my-3">
    <div class="bg-success text-center">
        <h1 class="jumborton"> Add Employee </h1>
        
    </div>
<!--    start form-->

<<form action="addEmployee.jsp" method="post">
    <div  class="row">
        <div class="col-md-6">  
            <label for="" class="form-label"> Name </label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter Your Full Name">
        </div>
        
         <div class="col-md-6">  
            <label for="" class="form-label"> Email </label>
            <input type="text" class="form-control" id="email" name="email" placeholder="example@gmail.com">
        </div>
        
    </div>
<!--    2nd row-->

<div class="row mt-3">
    <div class="col-md-6">
    <label class="form-label"> Salary </label>
    <input type="text" class="form-control" id="salary" name="salary" >
</div>
</div>
    
    
</form>
    
    
    
    
    
    
    
</div>



<%@include file="footer.jsp" %>