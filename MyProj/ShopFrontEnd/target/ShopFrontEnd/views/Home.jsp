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

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<style type="text/css">
.marketing {
	text-align: center;
	margin-bottom: 20px;
}

.divider {
	margin: 80px 0;
}

hr {
	border: solid 1px #eee;
}

.thumbnail img {
	width: 100%;
}
#ex1_container {
	text-align: center;
	width: 300px;
	font-family: "Algerian", Georgia, Serif;
}
</style>



</head>
<body>
<script>
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip(); 
});
</script>
	<!-- -header -->
	<nav class="navbar navbar-default navbar-inverse"
		style="border-radius: 0px !important; margin-bottom: 0px;">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="Product">Movies</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="Supplier">Supplier <span class="sr-only">(current)</span></a></li>
					<li><a href="Category">CategoryPage</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Dropdown <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="UserDetails">UserDetails</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
				</ul>
				<form class="navbar-form navbar-left">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
					<li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Dropdown <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="Login1">Login1</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<br>
	<br>
	<!-- End header -->
	<!-- Slide Show -->
	<br>
	<br>
	<div class="panel-group">

		<div class="panel panel-default">
			<div class="panel-body">
				<div class="container">
					<div id="carousel-example-generic" class="carousel slide"
						data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#carousel-example-generic" data-slide-to="0"
								class="active"></li>
							<li data-target="#carousel-example-generic" data-slide-to="1"></li>
							<li data-target="#carousel-example-generic" data-slide-to="2"></li>
							<li data-target="#carousel-example-generic" data-slide-to="3"></li>
						</ol>

						<!-- Wrapper for slides -->
						<div class="carousel-inner" role="listbox">
							<div class="item active">
								<img src="resources/image2/Rustom.jpg" alt="Rustom">
								<div class="carousel-caption">
									<h3>Movie1 Here</h3>
									...
								</div>
							</div>
							<div class="item">
								<img src="resources/image2/Sultan.jpg" alt="Sultan">
								<div class="carousel-caption">
									<h3>Movie2 Here</h3>
									...
								</div>
							</div>
							<div class="item">
								<img src="resources/image2/Dishoom.jpg" alt="Dishoom">
								<div class="carousel-caption">
									<h3>Movie3 Here</h3>
									...
								</div>
							</div>
							<div class="item">
								<img src="resources/image2/Mohanjorado.jpg" alt="Mohanjorado">
								<div class="carousel-caption">
									<h3>Movie4 Here</h3>
									...
								</div>
							</div>

							<!-- Controls -->
							<a class="left carousel-control" href="#carousel-example-generic"
								role="button" data-slide="prev"> <span
								class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
								<span class="sr-only">Previous</span>
							</a> <a class="right carousel-control"
								href="#carousel-example-generic" role="button" data-slide="next">
								<span class="glyphicon glyphicon-chevron-right"
								aria-hidden="true"></span> <span class="sr-only">Next</span>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="clearfix" style="margin-bottom: 20px;"></div>
		<!-- <hr class="divider"> -->

		<div class="panel panel-default">
			<div class="well">
				<center>
					<div id="ex1_container">
						<font size="3" color="red" family="Algerian"><h1>This Weeks Top 3</h1></font>
					</div>
				</center>


				<br>

				<div class="container">

					<!-- End Slide Show -->
					<div class="row marketing">
						<div class="col-md-4 col-sm-4 col-xs-6">
							<img src="resources/image2/pk.jpg" alt="PK" class="img-circle">
							<h2>PK</h2>
							<p>pk pk pk pk pk pk pk pk pk pk pk pk pk pk pk pk pk pk</p>
							<a href="#" data-toggle="tooltip" title="Hooray!" class="btn btn-primary">Book Show</a>
						</div>

						<div class="col-md-4 col-sm-4 col-xs-6">
							<img src="resources/image2/Bajarangi.jpg" alt="Bajarangi"
								class="img-circle">
							<h2>Bajarangi</h2>
							<p>Bajarangi Bajarangi Bajarangi Bajarangi Bajarangi</p>
							<a href="#" class="btn btn-primary">Book Show</a>
						</div>

						<div class="col-md-4 col-sm-4 col-xs-12">
							<img src="resources/image2/Tevar.jpg" alt="Tevar"
								class="img-circle">
							<h2>Tevar</h2>
							<p>Tevar Tevar Tevar Tevar Tevar Tevar Tevar Tevar</p>
							<a href="#" class="btn btn-primary">Book Show</a>
						</div>

					</div>
				</div>
			</div>
			<!-- <hr class="divider"> -->
			<!-- Marketing -->

			<!-- Product Thumbnail -->
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="container">
						<div class="panel-heading">
							<center>
								<div class="btn-group">
									<a href="#"><button type="button" class="btn btn-default">
											<h1>Now Showing</h1>
										</button></a>
									<div class="btn-group">
										<a href="#"><button type="button" class="btn btn-primary">
												<h1>Coming Soon</h1>
											</button></a>
									</div>
								</div>
							</center>
						</div>
						<br> <br> <br> <br> <br> <br>
						<div class="panel-body">
							<div class="row">

								<div class="col-md-3 col-sm-4 col-xs-6">
									<div class="thumbnail">
										<img src="resources/thumnail/Krish3.jpg" alt="Krish3">
										<div class="caption">
											<h3>Thumbnail label</h3>
											<p>...</p>
											<p>
												<a href="#" class="btn btn-primary" role="button">Book
													Show</a> <a href="#" class="btn btn-info" role="button">Info</a>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-6">
									<div class="thumbnail">
										<img src="resources/thumnail/FlyingJat.jpg" alt="FlyingJat">
										<div class="caption">
											<h3>Thumbnail label</h3>
											<p>...</p>
											<p>
												<a href="#" class="btn btn-primary" role="button">Book
													Show</a> <a href="#" class="btn btn-info" role="button">Info</a>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-6">
									<div class="thumbnail">
										<img src="resources/thumnail/Mauli.jpg" alt="Mauli">
										<div class="caption">
											<h3>Thumbnail label</h3>
											<p>...</p>
											<p>
												<a href="#" class="btn btn-primary" role="button">Book
													Show</a> <a href="#" class="btn btn-info" role="button">Info</a>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-6">
									<div class="thumbnail">
										<img src="resources/thumnail/Ring.jpg" alt="Ring">
										<div class="caption">
											<h3>Thumbnail label</h3>
											<p>...</p>
											<p>
												<a href="#" class="btn btn-primary" role="button">Book
													Show</a> <a href="#" class="btn btn-info" role="button">Info</a>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-6">
									<div class="thumbnail">
										<img src="resources/thumnail/Mogali.jpg" alt="Mogali">
										<div class="caption">
											<h3>Thumbnail label</h3>
											<p>...</p>
											<p>
												<a href="#" class="btn btn-primary" role="button">Book
													Show</a> <a href="#" class="btn btn-info" role="button">Info</a>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-6">
									<div class="thumbnail">
										<img src="resources/thumnail/Sairat.jpg" alt="Sairat">
										<div class="caption">
											<h3>Thumbnail label</h3>
											<p>...</p>
											<p>
												<a href="#" class="btn btn-primary" role="button">Book
													Show</a> <a href="#" class="btn btn-info" role="button">Info</a>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-6">
									<div class="thumbnail">
										<img src="resources/thumnail/Titanic.jpg" alt="Titanic">
										<div class="caption">
											<h3>Thumbnail label</h3>
											<p>...</p>
											<p>
												<a href="#" class="btn btn-primary" role="button">Book
													Show</a> <a href="#" class="btn btn-info" role="button">Info</a>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-6">
									<div class="thumbnail">
										<img src="resources/thumnail/Wazir.jpg" alt="Wazir">
										<div class="caption">
											<h3>Thumbnail label</h3>
											<p>...</p>
											<p>
												<a href="#" class="btn btn-primary" role="button">Book
													Show</a> <a href="#" class="btn btn-info" role="button">Info</a>
											</p>
										</div>
									</div>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-6">
									<div class="thumbnail">
										<img src="resources/thumnail/Superman.jpg" alt="Superman">
										<div class="caption">
											<h3>Thumbnail label</h3>
											<p>...</p>
											<p>
												<a href="#" class="btn btn-primary" role="button">Book
													Show</a> <a href="#" class="btn btn-info" role="button">Info</a>
											</p>
										</div>
									</div>
								</div>
							</div>


						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- End Product Thumbnail -->
		<!-- <hr class="divider"> -->
		<div class="panel panel-default">
		<div class="panel-body">
		<footer>
			<p class="pull-right">
				<a href="#">Back To Top</a>
			</p>
			<P>
				<font size="5" color="Black">Designed by</font> <a href="Niit"> <font
					size="3" color="Blue">NIIT Deccan Pune...</font>
				</a> <a href="#"> <font size="3" color="#ffbb00">Terms</font></a>
			</P>
		</footer>
		</div>
		</div>
		
		<!-- Container (Contact Section) -->
<div class="container-fluid bg-grey">
  <h2 class="text-center">CONTACT</h2>
  <div class="row">
    <div class="col-sm-5">
      <p>Contact us and we'll get back to you within 24 hours.</p>
      <p><span class="glyphicon glyphicon-map-marker"></span> Pune, India</p>
      <p><span class="glyphicon glyphicon-phone"></span> +91-7276725450</p>
      <p><span class="glyphicon glyphicon-envelope"></span> rdgaikwad26@gmail.com</p>
    </div>
    <div class="col-sm-7">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
</div>

		<!-- </div> -->
		<!-- End Marketing -->


		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="resources/js/jquery.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="resources/js/bootstrap.min.js"></script>
	</div>
</body>
</html>