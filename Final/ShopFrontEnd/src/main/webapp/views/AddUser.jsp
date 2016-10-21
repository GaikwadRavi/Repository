<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<center>
		<div class="">
	
		<font size="3" color="#ffbd85"><h1>Add a New UserDetails</h1></font><br><br>
		
			<form:form action="saveUserDetails1" modelAttribute="userdetails">
			
				<%-- <form:label path="id">ID</form:label> --%> 
				<c:choose>
				<c:when test="${!empty userdetailsEdit.id }">
				<form:label path="id">ID</form:label> 
				<form:input path="id" readonly="true"/>
				
				</c:when>
				<c:otherwise>
				<form:label path="id">ID</form:label> 
				<form:input path="id"/>
				</c:otherwise>
				</c:choose>
				<br><br>
				
				<form:label path="name">NAME</form:label> 
				<form:input path="name" value="${userdetailsEdit.name}"/><br><br>
				
				<form:label path="password">PASSWORD</form:label>
				<form:input type="password" path="password" value="${userdetailsEdit.password}"/><br><br>
				
				
				<form:label path="contact">CONTACT</form:label>
				<form:input path="contact" value="${userdetailsEdit.contact}"/><br><br>
				
				<form:label path="address">ADDRESS</form:label>
				<form:input path="address" value="${userdetailsEdit.address}"/><br><br>

				<input type="submit" value="Add" />
				<%-- <td><a href="AddUser?id=${product.id}">Book</a></td> --%>
				
				
				<input type="reset" value="Clear" /><br>
				<br>
	
			</form:form>
		</div>
	</center>

</body>
</html>