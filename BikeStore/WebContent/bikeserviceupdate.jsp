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

					<li><a href="bikessdetails.jsp" class="smoothScroll">Back</a></li>
				</ul>
			</div>

		</div>
	</div>


	<!-- Home Section -->

	<section id="home" class="main">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">



				<div class="col-md-6 col-sm-7 col-xs-12" style="margin-left: 350px;">

					<div class="panel-heading">
						<h3 class="panel-title">
							<span class="fa fa-pencil-square-o"></span><font size="6">Servicing
								Costs
						</h3>
						</font>
						<%@page import="java.sql.*"%>
						<%
							String id = request.getParameter("id");
						Class.forName("com.mysql.jdbc.Driver");
						String url = "jdbc:mysql://localhost:3306/bike";
						String name = "root";
						String pwd = "root";
						Connection con = DriverManager.getConnection(url, name, pwd);
						String sql = "select * from bservice where id='" + id + "'";
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery(sql);
						if (rs.next()) {
						%>
						<form action="bikeserviceupdate1.jsp" method="post">
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label>Bike id</label> <input type="text" name="id"
											value="<%=id%>" class="form-control" style="width: 260px;"
											readonly>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label>Bike Name</label> <input type="text" name="bn"
											value="<%=rs.getString(11)%>" class="form-control"
											style="width: 260px;" readonly>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label>General Service</label> <input type="text" name="gs"
											value="<%=rs.getString(2)%>" class="form-control"
											style="width: 260px;" required>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label>Oil Change</label> <input type="text" name="oc"
											value="<%=rs.getString(3)%>" class="form-control"
											style="width: 260px;" required>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label>Electrical Issues</label> <input type="text" name="ei"
											value="<%=rs.getString(4)%>" class="form-control"
											style="width: 260px;" required>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label>Clutch/Break Issues</label> <input type="text"
											name="cbs" value="<%=rs.getString(5)%>" class="form-control"
											style="width: 260px;" required>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label>Engine/Silencer Issues</label> <input type="text"
											name="eni" required value="<%=rs.getString(6)%>"
											class="form-control" style="width: 260px;">
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label>Chain/Sprocket Issues</label> <input type="text"
											name="csi" value="<%=rs.getString(7)%>" class="form-control"
											style="width: 260px;" required>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label>Filter Change</label> <input type="text" name="fc"
											value="<%=rs.getString(8)%>" class="form-control"
											style="width: 260px;" required>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<label>Repaint/Scratch Issues</label> <input type="text"
											name="rsr" value="<%=rs.getString(9)%>" class="form-control"
											style="width: 260px;" required>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<div class="form-group">
										<label>Tyre Puncture/Replacement</label> <input type="text"
											name="tpr" value="<%=rs.getString(10)%>" class="form-control"
											style="width: 260px;" required>
									</div>
								</div>
							</div>
							<input type="submit" value="update" class="btn btn-success">
							<input type="reset" value="reset" class="btn btn-primary">


						</form>
						<%
							}
						%>

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