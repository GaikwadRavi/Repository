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
</head>
<body>

	<center>
		<div class="">
	
		<font size="3" color="#ffbd85"><h1>Add a New Category</h1></font><br><br>
		
			<form:form action="saveCategory" modelAttribute="category">
			
				<%-- <form:label path="id">ID</form:label> --%> 
				<c:choose>
				<c:when test="${!empty categoryEdit.id }">
				<form:label path="id">ID</form:label> 
				<form:input path="id" readonly="true"/>
				
				</c:when>
				<c:otherwise>
				<form:label path="id">ID</form:label> 
				<form:input path="id"/>
				</c:otherwise>
				</c:choose>
				<br><br>
				
				<form:label path="name">Name</form:label> 
				<form:input path="name" value="${categoryEdit.name}"/><br><br>
				
				<form:label path="description">DESCRIPTION</form:label>
				<form:input path="description" value="${categoryEdit.description}"/><br><br>
				
				<br>

				<input type="submit" value="Add" />
				
				
				<input type="reset" value="Clear" /><br>
				<br>
	
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

					<td><c:out value="${category.id}" /></td>
					<td><c:out value="${category.name}" /></td>
					<td><c:out value="${category.description}" /></td>
					<td><a href="edit_category?id=${category.id}">Edit</a></td>
					<td><a href="deleteCategory?id=${category.id}">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		</div>
	</c:if>
	</div>
	</center>

	<a href="Register">New User Click Here</a>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="resources/js/jquery.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="resources/js/bootstrap.min.js"></script>
		

</body>
</html>