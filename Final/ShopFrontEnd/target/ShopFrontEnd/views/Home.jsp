<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Ecommerce WebSite</title>

<!-- Bootstrap -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<!-- -header -->
	<jsp:include page="_home_header.jsp" />
	<br>
	<br>
	<!-- End header -->
	<!-- Slide Show -->
	
	<jsp:include page="_slider.jsp" />
	
	<!-- End Slide Show -->
	
		<div class="clearfix" style="margin-bottom: 20px;"></div>
	<!-- Today's Top3 -->
	<%-- <jsp:include page="_top3.jsp" /> --%>
	
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