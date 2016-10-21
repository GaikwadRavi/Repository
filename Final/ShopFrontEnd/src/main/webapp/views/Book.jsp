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
<center>
		<div class="container">

			<font size="3" color="#ffbd85"><h1>You are Booking.....</h1></font><br>
			<br>

			<form:form action="memberShip" modelAttribute="product"
				enctype="multipart/form-data">

				<%-- <form:label path="id">ID</form:label> --%> 
				<c:choose>
				<c:when test="${!empty productEdit.id }">
				<form:label path="id">ID</form:label> 
				<form:input path="id" readonly="true"/>
				
				</c:when>
				<c:otherwise>
				<form:label path="id">ID</form:label> 
				<form:input path="id"/>
				<br>
				</c:otherwise>
				</c:choose>
				<br>
				<form:label path="name">Name</form:label> 
				<form:input path="name" value="${productEdit.name}" readonly="true"/>
				<br>
				<br>
				<form:label path="description">DESCRIPTION</form:label>
				<form:input path="description" value="${productEdit.description}" readonly="true"/>
				<br>
				<br>
				<form:label path="price">PRICE</form:label>
				<form:input path="price" value="${productEdit.price}" readonly="true"/><br><br>
				<br>
				<input type="submit" value="Book" />

				<br>
				<br>



			</form:form>
		</div>
	</center>

</body>
</html>