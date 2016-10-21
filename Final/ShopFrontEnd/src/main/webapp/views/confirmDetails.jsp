<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring Mvc WebFlow Demo</title>
		<link href="style.css" rel="stylesheet" type="text/css" />
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
				<legend>Confirm Details</legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
				<%-- <a href="${flowExecutionUrl}&_eventId_home">Home</a><br /><br /> --%>
				<sf:form modelAttribute="userBean">
					<sf:label path="userId">UserName:</sf:label>${userBean.userId}
					<br /><br />
					<sf:label path="email">Email Id:</sf:label>${userBean.email}
					<br /><br />
					<sf:label path="age">Age :</sf:label>${userBean.age}
					<br /><br />
					<sf:label path="address">Address :</sf:label>${userBean.address}
					<br /><br />
					<sf:label path="contactno">ContactNO :</sf:label>${userBean.contactno}
					<br /><br />
					<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
					<input name="_eventId_edit" type="submit" value="Edit" /> 
					<input name="_eventId_submit" type="submit" value="Confirm Details" /><br />
				</sf:form>
			</fieldset>
		</div>
		</center>
	</body>
</html>