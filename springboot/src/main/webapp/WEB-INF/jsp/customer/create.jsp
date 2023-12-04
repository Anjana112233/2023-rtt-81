
<jsp:include page="../include/header.jsp"/>

<h1>Create customer</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>


<section>
    <div class="container">
        <form method="get" action="/customer/createSubmit">
        <input type = "hidden" name = "id" value="${form.id}">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" aria-describedby="emailHelp" value="${form.firstName}">
                <div id="firstNameHelp" class="form-text">Please let me know your first name</div>
            </div>
             <div class="mb-3">
                            <label for="f
                            lastName" class="form-label">Last Name</label>
                            <input type="text" class="form-control" id="lastName" name="lastName" aria-describedby="emailHelp" value="${form.lastName}" >
                            <div id="lastNameHelp" class="form-text">Please let me know your last name</div>
                        </div>
              <div class="mb-3">
                             <label for="phone" class="form-label">Phone</label>
                             <input type="text" class="form-control" id="phone" name="phone" aria-describedby="emailHelp" value="${form.phone}">
                             <div id="phoneHelp" class="form-text">Your phone number</div>
                         </div>
                <div class="mb-3">
                               <label for="city" class="form-label">City</label>
                               <input type="text" class="form-control" id="city" name="city" aria-describedby="emailHelp" value="${form.city}">
                               <div id="cityHelp" class="form-text">City name</div>
                           </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>


<jsp:include page="../include/footer.jsp"/>






















