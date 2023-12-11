<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>

<section>
<div class = "container pt-2">
<h1 class="pb-2"> Customer search <h1>

<form action="/customer/search">

 <input type="text" name="search" placeholder="Search by name" value="${search}"/>
<button type = "submit" class="btn btn-primary">Submit</button>
</form>

<%--  if we want to add table on searchbyname then we can make similar table like below: --%>

<c:if test="${not empty customersVar}">
<h1> Customers Found ${customersVar.size()}</h1>
 <table class="table">
                <tr>
                    <td>Id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Phone</td>
                    <td>City</td>
                     <td>Image</td>

                    <td>Edit</td>
                </tr>
                <c:forEach items="${customersVar}" var="customer">
                    <tr>
                        <td>${customer.id}</td>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.phone}</td>
                        <td>${customer.city}</td>
                        <td><img src="${customer.imageUrl}" style="max-width:100px"></td>
                        <td><a href="/customer/edit/${customer.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
</c:if>
</div>
</section>

<jsp:include page="../include/footer.jsp"/>