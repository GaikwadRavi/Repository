<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min2.css" />" rel="stylesheet">

	<script src="resources/css/bootstrap.min.css"></script>
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<center>
		<div class="container">

			<font size="3" color="#ffbd85"><h1>Add a New Product</h1></font><br>
			<br>

			<form:form action="saveProduct" modelAttribute="product"
				enctype="multipart/form-data">

				<%-- <form:label path="id">ID</form:label> --%> 
				<c:choose>
				<c:when test="${!empty productEdit.id }">
				<form:label path="id">ID</form:label> 
				<form:input path="id" readonly="true"/>
				<br>
				<br>
				
				</c:when>
				<c:otherwise>
				<form:label path="id">ID</form:label> 
				<form:input path="id"/>
				<br>
				</c:otherwise>
				</c:choose>
				<br>
				<form:label path="name">Name</form:label> 
				<form:input path="name" value="${productEdit.name}"/>
				<br>
				<br>
				<form:label path="description">DESCRIPTION</form:label>
				<form:input path="description" value="${productEdit.description}"/>
				<br>
				<br>
				<form:label path="price">PRICE</form:label>
				<form:input path="price" value="${productEdit.price}"/><br><br>
				<br>
				<br>
				<br>

				<input type="submit" value="Add" />


				<input type="reset" value="Clear" />
				<br>
				<br>

				<table border="0">
					<tr>
						<td>Pick file #1:</td>
						<td><input type="file" name="fileUpload" size="50" /></td>
					</tr>
				</table>


			</form:form>
		</div>
	</center>
	<br>
	<br>
	<br>
	<br>
	<center>
	<div class="container">
	
		<c:if test="${!empty productList}">
			
		<div class="table-responsive">
			<table class="table table-striped">
				<thead>
					<tr>
						
						<th>ID</th>
						<th>NAME</th>
						<th>DESCRIPTION</th>
						<th>PRICE</th>
						<th>EDIT</th>
						<th>DELETE</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${productList}" var="product">
					<tr>
						
						<td><c:out value="${product.id}" /></td>
						<td><c:out value="${product.name}" /></td>
						<td><c:out value="${product.description}" /></td>
						<td><c:out value="${product.price}" /></td>
						<td><a href="edit_product?id=${product.id}">Edit</a></td>
						<td><a href="deleteProduct?id=${product.id}">Delete</a></td>
						

					</tr>
				</c:forEach>
				</tbody>
			</table>
			</div>

		</c:if>
		</div>
		
	</center>
	
	


</body>
</html>