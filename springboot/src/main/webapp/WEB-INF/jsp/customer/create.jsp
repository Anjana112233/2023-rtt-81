<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
          crossorigin="anonymous">
</head>
<body>
<h1>Create customer</h1>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>


<section>
    <div class="container">
        <form method="get" action="/customer/createSubmit">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" aria-describedby="emailHelp">
                <div id="firstNameHelp" class="form-text">Please let me know your first name</div>
            </div>
             <div class="mb-3">
                            <label for="f
                            lastName" class="form-label">Last Name</label>
                            <input type="text" class="form-control" id="lastName" name="lastName" aria-describedby="emailHelp">
                            <div id="lastNameHelp" class="form-text">Please let me know your last name</div>
                        </div>
              <div class="mb-3">
                             <label for="phone" class="form-label">Phone</label>
                             <input type="text" class="form-control" id="phone" name="phone" aria-describedby="emailHelp">
                             <div id="phoneHelp" class="form-text">Your phone number</div>
                         </div>
                <div class="mb-3">
                               <label for="city" class="form-label">City</label>
                               <input type="text" class="form-control" id="city" name="city" aria-describedby="emailHelp">
                               <div id="cityHelp" class="form-text">City name</div>
                           </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>

</body>
</html>























