<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<h1>Create customer</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>


<section>
    <div class="container">
      <c:if test="${not empty success}">
            <div class="row justify-content-center">
                 <div class="col-6 text-center">
                       <div class="alert alert-success" role="alert">
                             ${success}
                       </div>
                 </div>
            </div>
      </c:if>
    <div class="container">
        <form method="get" action="/customer/createSubmit">
        <input type = "hidden" name = "id" value="${form.id}">
            <div class="mt-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" aria-describedby="emailHelp" value="${form.firstName}">
                <div id="firstNameHelp" class="form-text">Please let me know your first name</div>
            </div>
            <c:if test="${errors.hasFieldErrors('firstName')}">
                            <div style="color:red">
                                <c:forEach items="${errors.getFieldErrors('firstName')}" var="error">
                                    ${error.defaultMessage}<br>
                                </c:forEach>
                            </div>
                        </c:if>

             <div class="mt-3">
                            <label for="f
                            lastName" class="form-label">Last Name</label>
                            <input type="text" class="form-control" id="lastName" name="lastName" aria-describedby="emailHelp" value="${form.lastName}" >
                            <div id="lastNameHelp" class="form-text">Please let me know your last name</div>
                        </div>
              <c:if test="${errors.hasFieldErrors('lastName')}">
                              <div style="color:red">
                                  <c:forEach items="${errors.getFieldErrors('lastName')}" var="error">
                                      ${error.defaultMessage}<br>
                                  </c:forEach>
                              </div>
                          </c:if>

              <div class="mt-3">
                             <label for="phone" class="form-label">Phone</label>
                             <input type="text" class="form-control" id="phone" name="phone" aria-describedby="emailHelp" value="${form.phone}">
                             <div id="phoneHelp" class="form-text">Your phone number</div>
                         </div>
                <c:if test="${errors.hasFieldErrors('phone')}">
                                <div style="color:red">
                                    <c:forEach items="${errors.getFieldErrors('phone')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </c:if>

                <div class="mt-3">
                               <label for="city" class="form-label">City</label>
                               <input type="text" class="form-control" id="city" name="city" aria-describedby="emailHelp" value="${form.city}">
                               <div id="cityHelp" class="form-text">City name</div>
                           </div>
                 <c:if test="${errors.hasFieldErrors('city')}">
                                 <div style="color:red">
                                     <c:forEach items="${errors.getFieldErrors('city')}" var="error">
                                         ${error.defaultMessage}<br>
                                     </c:forEach>
                                 </div>
                             </c:if>

                 <div class="mt-3">
                        <label for="imageurl" class="form-label">Image Url</label>
                           <input type="text" class="form-control" id="imageUrl" name="imageUrl"

                              </div>
                                 <c:if test="${errors.hasFieldErrors('imageUrl')}">
                                       <div style="color:red">
                                                     <c:forEach items="${errors.getFieldErrors('imageUrl')}" var="error">
                                                         ${error.defaultMessage}<br>
                                                     </c:forEach>
                                                 </div>
                                             </c:if>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>


<jsp:include page="../include/footer.jsp"/>






















