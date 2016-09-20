<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<center>
		<div class="">
	
		<font size="3" color="#ffbd85"><h1>Add a New Category</h1></font><br><br>
		
			<form:form action="update_Category" modelAttribute="category">
			
				<form:label path="id">ID</form:label>
				<form:input path="id" value="${employeeObject.id}"/><br><br>
				
				<form:label path="name">Name</form:label>
				<form:input path="name" value="${employeeObject.name}"/><br><br>
				
				<form:label path="description">DESCRIPTION</form:label>
				<form:input path="description" value="${employeeObject.description}"/><br><br>
				
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
	<%-- <center>
	<c:if test="${!empty categoryList}">
		<table border="1" bgcolor="black" width="600px">
			<tr style="background-color: #ffbd85; color: white; text-align: center;"
				height="40px">

				<td>Id</td>
				<td>Name</td>
				<td>Description</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>
			<c:forEach items="${categoryList}" var="category">
				<tr
					style="background-color: white; color: black; text-align: center;"
					height="30px">

					<td><c:out value="${category.id}" /></td>
					<td><c:out value="${category.name}" /></td>
					<td><c:out value="${category.description}" /></td>
					<td><a href="update_category?id=${category.id}">Edit</a></td>
					<td><a href="deleteCategory?id=${category.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	</center>

	<a href="Register">New User Click Here</a>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="resources/js/jquery.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="resources/js/bootstrap.min.js"></script>
		Hi Me ahe Category.jsp! --%>

</body>
</html>