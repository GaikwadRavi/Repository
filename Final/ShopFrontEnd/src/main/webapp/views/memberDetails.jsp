<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring Mvc WebFlow Demo</title>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<link href="resources/css/bootstrap.min.css" rel="stylesheet">
		<style>
form {
	width: 400px;
}

label {
	float: left;
	width: 150px;
}
input[type=password] {
	float: left;
	width: 250px;
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
		<div class="content">
			<fieldset>
				<legend>Register User</legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
				<%-- <a href="${flowExecutionUrl}&_eventId_home">Home</a> --%>
				<sf:form modelAttribute="userBean"><br />
					<sf:label path="userId">UserName:</sf:label>
					<sf:input path="userId" /><br />
					<!-- to display validation messages -->
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('userId')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
					<sf:label path="email">Email Id: </sf:label>
					<sf:input path="email" /><br />
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('email')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
					<sf:label path="age">Age: </sf:label>
					<sf:input path="age" /><br />
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('age')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
					<sf:label path="address">Address: </sf:label>
					<sf:input path="address" /><br />
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('address')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
					<sf:label path="contactno">ContactNo: </sf:label>
					<sf:input path="contactno" /><br />
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('contactno')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach><br />
					<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
					<br>
					
					
					<input name="_eventId_submit" type="submit" value="Submit" /><br />
					
					
					
				</sf:form>
			</fieldset>
		</div>
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="resources/js/jquery.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="resources/js/bootstrap.min.js"></script>
		</center>
	</body>
</html>