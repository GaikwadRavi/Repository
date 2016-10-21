<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min2.css" />" rel="stylesheet">

	<script src="resources/css/bootstrap.min.css"></script>
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<center>
		

			<font size="3" color="#ffbd85"><h1>Book a Movie</h1></font><br>
			<br>

			<form:form modelAttribute="product">

				

	<div class="container">
	
		<c:if test="${!empty productList}">
			
		<div class="table-responsive">
			<table class="table table-striped">
				<thead>
					<tr>
						
						<!-- <th>ID</th> -->
						<th>NAME</th>
						<th>DESCRIPTION</th>
						<th>MOVIE TYPE</th>
						<th>THEATER</th>
						<th>PRICE</th>
						<th>BOOK</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${productList}" var="product">
					<tr>
						
						<%-- <td><c:out value="${product.id}" /></td> --%>
						<td><c:out value="${product.name}" /></td>
						<td><c:out value="${product.description}" /></td>
						<td><c:out value="${product.category.categoryName}" /></td>
						<td><c:out value="${product.supplier.supplierName}" /></td>
						<td><c:out value="${product.price}" /></td>
						<%-- <td><a href="edit_product1?id=${product.id}">Book</a></td> --%>
						<td><a href="memberShip">Book</a></td>
						

					</tr>
				</c:forEach>
				</tbody>
			</table>
			</div>

		</c:if>
		</div>
		</form:form>
		
	</center>

</body>
</html>