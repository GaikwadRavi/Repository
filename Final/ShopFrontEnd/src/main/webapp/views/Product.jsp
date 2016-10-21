<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.min2.css" />"
	rel="stylesheet">

<script src="resources/css/bootstrap.min.css"></script>
<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
form {
	width: 400px;
}

label {
	float: left;
	width: 150px;
}

input[type=text] {
	float: left;
	width: 250px;
}

.clear {
	clear: both;
	height: 0;
	line-height: 0;
}

.floatright {
	float: right;
}
</style>
</head>
<body>
	<jsp:include page="_admin_header.jsp" />
	<center>
		<div class="container">

			<font size="3" color="#ffbd85" family="Algerian"><h1>Add
					Product</h1></font><br> <br>

			<form:form action="saveProduct" modelAttribute="product"
				enctype="multipart/form-data">

				<%-- <form:label path="id">ID</form:label> --%>
				<table>
					<tr>
						<c:choose>
							<c:when test="${!empty productEdit.id }">
								<td><form:label path="id">ID</form:label></td>
								<td><form:input path="id" readonly="true" /></td>
								<br>
								<br>

							</c:when>
							<%-- <c:otherwise>
								<td><form:label path="id">ID</form:label></td>
								<td><form:input path="id" /><br><br></td>
								<br>
							</c:otherwise> --%>
						</c:choose>
					</tr>
					<tr>
						<td><form:label path="name">Name</form:label></td>
						<td><form:input path="name" value="${productEdit.name}" /><br><br></td>
					</tr>
					<tr>
						<td><form:label path="description">DESCRIPTION</form:label></td>
						<td><form:input path="description"
								value="${productEdit.description}" /><br><br></td>
					</tr>

					<tr>
						<td><form:label path="category.categoryId">Movie Category:</form:label></td>
						<td><form:select path="category.categoryId"
								cssStyle="width: 150px;">
								<option value="-1">Select a type</option>
								<c:forEach items="${categoryList}" var="category">
									<option value="${category.categoryId}">${category.categoryName}</option>
								</c:forEach>
							</form:select><br><br></td>
					</tr>
					<tr>
						<td><form:label path="supplier.supplierId">Theater:</form:label></td>
						<td><form:select path="supplier.supplierId"
								cssStyle="width: 150px;">
								<option value="-1">Select Theater</option>
								<c:forEach items="${supplierList}" var="supplier">
									<option value="${supplier.supplierId}">${supplier.supplierName}</option>
								</c:forEach>
							</form:select><br><br></td>
					</tr>
					<tr>
						<td><form:label path="price">PRICE</form:label></td>
						<td><form:input path="price" value="${productEdit.price}" /><br><br></td>
					
					</tr>
					<tr>
						<td><form:label path="">Image</form:label></td>
						<td><input type="file" name="fileUpload" size="50" /><br><br></td>
						
					</tr>
					<tr>
						<td><c:if test="${!empty productEdit.id}">

								<td><input type="submit" value="Update" /></td>
								<td><input type="reset" value="Clear" /></td>
							</c:if></td>

						<td><c:if test="${empty productEdit.id}">

								<td><input type="submit" value="Add" /></td>
								<td><input type="reset" value="Clear" /></td>
							</c:if></td>
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
								<th>Movie Type</th>
								<th>Theater</th>
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
									<td><c:out value="${product.category.categoryName}" /></td>
									<td><c:out value="${product.supplier.supplierName}" /></td>
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