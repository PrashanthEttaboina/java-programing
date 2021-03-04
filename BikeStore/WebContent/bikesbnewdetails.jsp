<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<title>Bike Store</title>
<!--
App Starter Template
http://www.templatemo.com/tm-492-app-starter
-->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/font-awesome.min.css">

<link rel="stylesheet" href="css/magnific-popup.css">

<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/owl.carousel.css">

<link href='https://fonts.googleapis.com/css?family=Unica+One'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,700'
	rel='stylesheet' type='text/css'>

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">

</head>
<body data-spy="scroll" data-target=".navbar-collapse" data-offset="50">


	<!-- PRE LOADER -->

	<div class="preloader">
		<div class="sk-spinner sk-spinner-pulse"></div>
	</div>



	<!-- Navigation Section -->

	<div class="navbar navbar-default navbar-fixed-top">
		<div class="container">

			<div class="navbar-header">
				<button class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon icon-bar"></span> <span class="icon icon-bar"></span>
					<span class="icon icon-bar"></span>
				</button>
				<a href="#index.html" class="navbar-brand"><span>Bike</span>Store</a>
			</div>

			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">

					<li><a href="bikesbdetails.jsp" class="smoothScroll">Back</a></li>
				</ul>
			</div>

		</div>
	</div>


	<!-- Home Section -->

	<section id="home" class="main">
		<div class="overlay"><div>
			<div class="container"></div>
				<div class="row"></div>

<%@page import="java.sql.*"%>
					<%
						Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/bike";
					String name = "root";
					String pwd = "root";
					Connection con = DriverManager.getConnection(url, name, pwd);
					
					String bsemail=(String)session.getAttribute("bsemail");
					
					String sql = "select * from bsinfo where bsemail='"+bsemail+"'";
					Statement ps = con.createStatement();
					ResultSet rs = ps.executeQuery(sql);

					%>

					<div class="col-md-6 col-sm-7 col-xs-12"
						style="margin-left: 350px;">

						<div class="panel-heading">
							<h3 class="panel-title">
								<span class="fa fa-pencil-square-o"></span><font size="6">Bike
									Specifications</font>
							</h3>

							<form action="insertbnew.jsp" method="post">
								<div class="row">
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Bike Name</label> <input type="text" name="bn"
												placeholder="enter bike name" required class="form-control"
												style="width: 150px;">
										</div>
									</div>
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Fuel Type</label> <input type="text" name="ft"
												placeholder="enter fuel type" class="form-control"
												style="width: 150px;" required>
										</div>
									</div>
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Fuel Tank Capacity</label> <input type="text"
												name="ftc" placeholder="enter fuel tank capacity"
												class="form-control" style="width: 150px;" required>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Gear Box Type</label> <input type="text"
												class="form-control" style="width: 150px;" name="gbt"
												placeholder="enter gear box type" required>
										</div>
									</div>
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>No. Gears</label> <input type="text" name="ng"
												placeholder="enter number of gears" class="form-control"
												style="width: 150px;" required>
										</div>
									</div>
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Displacement</label> <input type="text" name="dis"
												placeholder="enter displacement" class="form-control"
												style="width: 150px;" required>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Milage</label> <input type="text" name="mil"
												placeholder="enter milage" class="form-control"
												style="width: 150px;" required>
										</div>
									</div>
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Top Speed</label> <input type="text" name="ts"
												placeholder="enter top speed" class="form-control"
												style="width: 150px;" required>
										</div>
									</div>
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Battery</label> <input type="text" name="bat"
												placeholder="enter battery" class="form-control"
												style="width: 150px;" required>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Price</label> <input type="text" name="price"
												placeholder="enter price" class="form-control"
												style="width: 150px;" required>
										</div>
									</div>
									<%
							while (rs.next()) {
							
						%>
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Bike Store Name</label> <input type="text"
												name="storename" class="form-control" style="width: 150px;"
												 value="<%=rs.getString(2) %>" readonly >
										</div>
									</div>
									<div class="col-sm-4 tight-gutter">
										<div class="form-group">
											<label>Bike StoreContact</label> <input type="text"
												name="contact" value="<%=rs.getString(4) %>" readonly
												class="form-control" style="width: 150px;" >
										</div>
									</div>
								</div>
								<%} %>
								<div class="form-group">
								<input type="submit" class="btn btn-primary" value="Submit">
								<input type="reset" class="btn btn-primary" value="Reset"><br>
							</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>


	<!-- About Section -->




	<!-- Screenshot Section -->

	<!-- Pricing Section -->



	<!-- Newsletter Section -->




	<!-- Footer Section -->

	<footer>
		<div class="container">
			<div class="row">

				<div class="col-md-8 col-sm-6">
					<div class="wow fadeInUp footer-copyright" data-wow-delay="0.4s">


					</div>
				</div>



			</div>
		</div>
	</footer>


	<!-- Modal Contact -->

	<div class="modal fade" id="modal1" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content modal-popup">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h2 class="modal-title">Contact Form</h2>
				</div>

				<form action="#" method="post">
					<input name="name" type="text" class="form-control" id="name"
						placeholder="Your Name" required> <input name="email"
						type="email" class="form-control" id="email"
						placeholder="Email Address" required>
					<textarea name="message" rows="3" class="form-control" id="message"
						placeholder="Message" required></textarea>
					<input name="submit" type="submit" class="form-control" id="submit"
						value="Send Message">
				</form>
			</div>
		</div>
	</div>


	<!-- Back top -->

	<a href="#" class="go-top"><i class="fa fa-angle-up"></i></a>


	<!-- SCRIPTS -->

	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/smoothscroll.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/custom.js"></script>

</body>
</html>