<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<!-- header -->
<jsp:include page="_user_header.jsp" />
<!-- End header -->
 <!-- Slide Show -->
	
	<jsp:include page="_slider.jsp" />
	
	<!-- End Slide Show -->
	
		<div class="clearfix" style="margin-bottom: 20px;"></div>
	<!-- Today's Top3 -->
	<jsp:include page="_top3.jsp" />
	
	<!--End Today's Top3 -->
		
			

			<!-- Product Thumbnail -->
			
			<jsp:include page="_thumbnail.jsp" />

		<!-- End Product Thumbnail -->
		
		<!-- End Footer -->
		
		<jsp:include page="_footer.jsp" />
		
		<!-- End Footer -->
 

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="resources/js/jquery.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>