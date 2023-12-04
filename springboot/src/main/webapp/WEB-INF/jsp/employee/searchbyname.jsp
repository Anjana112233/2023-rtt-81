<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section>
 <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Employee Search</h1>
            </div>
        </div>
    </div>
</section>
<section class="bg-light1 pt-5 pb-5">
    <div class="container">
<h1 class="pb-1"> Employee Search by first name and last name</h1>
    <form action="/employee/searchbyname">
     <div class="row justify-content-center">
             <div class="col-3 col-sm-3 col-md-2 col-lg-2 text-end">
      <label for="First Name" class="col-3 col-sm-3 col-md-2 col-lg-2 text-end">First Name</label>
      </div>

      <div class="col-8 col-sm-9 col-md-6 col-lg-4">
         <input type="text" name="firstname" placeholder="Search by first Name" value="${firstname}">
         </div>

       <div class="row justify-content-center pt-3">
                  <div class="col-3 col-sm-3 col-md-2 col-lg-2 text-end">
         <label for="Last Name">Last Name</label>
         </div>

         <div class="col-8 col-sm-9 col-md-6 col-lg-4">
             <input type="text" name="lastname" placeholder="Search by last Name" value="${lastname}">
           </div>

            <div class="row justify-content-center pt-4">
              <div class="col-12 text-center">
          <input class="btn btn-primary" type="submit" value="Submit">
           </div>
            </div>
    </form>


<c:if test="${not empty employeesVar}">
<h1> Employee Found ${employeeVar.size()}</h1>
 <table class="table">
                <tr>
                    <td>Id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Department Name</td>
                    <td>Edit</td>

                </tr>
                <c:forEach items="${employeesVar}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.firstName}</td>
                        <td>${employee.lastName}</td>
                        <td>${employee.departmentName}</td>
                        <td><a href="/employee/edit/${employee.id}">Edit</a></td>

                    </tr>
                </c:forEach>
            </table>
</c:if>
</div>
</section>

<jsp:include page="../include/footer.jsp"/>
