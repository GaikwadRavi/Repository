<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->

    <link href="<c:url value="/resources/css/bootstrap.min2.css" />" rel="stylesheet">

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
		<div class="">
	
		<font size="3" color="#ffbd85"><h1>Add a New Category</h1></font><br><br>
		
			<form:form action="saveCategory" modelAttribute="category">
			
				<%-- <form:label path="id">ID</form:label> --%> 
				<c:choose>
				<c:when test="${!empty categoryEdit.categoryId }">
				<form:label path="categoryId">ID</form:label> 
				<form:input path="categoryId" readonly="true"/>
				
				</c:when>
				<c:otherwise>
				<%-- <form:label path="categoryId">ID</form:label> 
				<form:input path="categoryId"/> --%>
				</c:otherwise>
				</c:choose>
				<br><br>
				
				<form:label path="categoryName">Name</form:label> 
				<form:input path="categoryName" value="${categoryEdit.categoryName}"/><br><br>
				
				<form:label path="description">DESCRIPTION</form:label>
				<form:input path="description" value="${categoryEdit.description}"/><br><br>
				
				<br>
				<c:if test="${!empty categoryEdit.categoryId}">
				
				<input type="submit" value="Update" />
				<input type="reset" value="Clear" /><br>
				</c:if>
				
				<c:if test="${empty categoryEdit.categoryId}">
				
				<input type="submit" value="Add" />
				<input type="reset" value="Clear" /><br>
				</c:if>
				
	
			</form:form>
		</div>
	</center>
	<br>
	<br>
	<br>
	<br>
	<center>
	<div class="container">
	<c:if test="${!empty categoryList}">
		<div class="table-responsive">
			<table class="table table-striped">
			<thead>
			<tr>

				<th>ID</th>
				<th>NAME</th>
				<th>DESCRIPTION</th>
				<th>EDIT</th>
				<th>DELETE</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${categoryList}" var="category">
				<tr>

					<td><c:out value="${category.categoryId}" /></td>
					<td><c:out value="${category.categoryName}" /></td>
					<td><c:out value="${category.description}" /></td>
					<td><a href="edit_category?categoryId=${category.categoryId}">Edit</a></td>
					<td><a href="deleteCategory?categoryId=${category.categoryId}">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		</div>
	</c:if>
	</div>
	</center>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="resources/js/jquery.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="resources/js/bootstrap.min.js"></script>
		

</body>
</html>