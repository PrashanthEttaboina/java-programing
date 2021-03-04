<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<title>Seller</title>
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

<link href='https://fonts.googleapis.com/css?family=Unica+One' rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,700' rel='stylesheet' type='text/css'>

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
			<button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
				<span class="icon icon-bar"></span>
			</button>
			<a href="#index.html" class="navbar-brand"><span>Bike</span>Store</a>
		</div>

		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<!--<li><a href="#home" class="smoothScroll">Home</a></li>
				<li><a href="login.jsp" class="smoothScroll">Login</a></li>
				<li><a href="#screenshot" class="smoothScroll">Bike Features</a></li>
                <li><a href="#pricing" class="smoothScroll">Parts Features</a></li>
                <li><a href="#newsletter" class="smoothScroll">Rent</a></li>
        		<li><a href="#newsletter" class="smoothScroll">Bike Review</a></li>-->
				<li><a href="bikescrent.jsp" class="smoothScroll">Back</a></li>
				
				
			</ul>
		</div>

	</div>
</div>


<!-- Home Section -->


<%@page import="java.sql.*"%>
<%
String id=request.getParameter("id");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
String bsemail=(String)session.getAttribute("bsemail");
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="select * from rentstatus where id='"+id+"'";
Statement ps=con.createStatement();
ResultSet rs=ps.executeQuery(sql);
while(rs.next()){
%>


<section id="home" class="main">
     <div class="overlay"></div>
	<div class="container">
		<div class="row">

               <div class="wow fadeInUp col-md-6 col-sm-5 col-xs-10 col-xs-offset-1 col-sm-offset-0" data-wow-delay="0.2s">
                    <img src="images/home-img.png" class="img-responsive" alt="Home" style="padding-right: 10‒; padding-right: 100px; padding-left: 50px;">
               </div>

               <div class="col-md-6 col-sm-7 col-xs-12">
			   
			   <div class="panel-heading">
									<h3 class="panel-title"><span class="fa fa-pencil-square-o"></span><font size="6">Timings</h3>
									</font></div>
								
								
							
								<form action="starttime.jsp" method="get">
								
								
									<input type="hidden" name="id" value="<%=id%>">
									
									<label>Start</label>
									
									<!-- <input type="time" name="starthour" placeholder="hrs:mins" pattern="^([0-1]?[0-9]|2[0-4]):([0-5][0-9])(:[0-5][0-9])?$" class="form-control" style="width: 260px;" required>
									 --><select name="starthour"  id="starthour" class="form-control" style="width: 260px;" required>  
									<option value="00">00</option>  
									<option value="01">01</option>  
									<option value="02">02</option>  
									<option value="03">03</option>  
									<option value="04">04</option> 
									<option value="05">05</option>  
									<option value="06">06</option>  
									<option value="07">07</option>  
									<option value="08">08</option>  
									<option value="09">09</option> 
									<option value="10">10</option>  
									<option value="11">11</option>  
									<option value="12">12</option>  
									<option value="13">13</option>  
									<option value="14">14</option> 
									<option value="15">15</option>  
									<option value="16">16</option>  
									<option value="17">17</option>  
									<option value="18">18</option>  
									<option value="19">19</option> 
									<option value="20">20</option>  
									<option value="21">21</option>  
									<option value="22">22</option>  
									<option value="23">23</option>  
									<option value="24">24</option> 									
									</select>
									<select name="startmin"  class="form-control" style="width: 260px;" id="startmin"  required>  
									<option value="00">00</option>  
									<option value="01">01</option>  
									<option value="02">02</option>  
									<option value="03">03</option>  
									<option value="04">04</option> 
									<option value="05">05</option>  
									<option value="06">06</option>  
									<option value="07">07</option>  
									<option value="08">08</option>  
									<option value="09">09</option> 
									<option value="10">10</option>  
									<option value="11">11</option>  
									<option value="12">12</option>  
									<option value="13">13</option>  
									<option value="14">14</option> 
									<option value="15">15</option>  
									<option value="16">16</option>  
									<option value="17">17</option>  
									<option value="18">18</option>  
									<option value="19">19</option> 
									<option value="20">20</option>  
									<option value="21">21</option>  
									<option value="22">22</option>  
									<option value="23">23</option>  
									<option value="24">24</option> 	
									<option value="25">25</option>  
									<option value="26">26</option>  
									<option value="27">27</option>  
									<option value="28">28</option>  
									<option value="29">29</option> 
									<option value="30">30</option>  
									<option value="31">31</option>  
									<option value="32">32</option>  
									<option value="33">33</option>  
									<option value="34">34</option> 
									<option value="35">35</option>  
									<option value="36">36</option>  
									<option value="37">37</option>  
									<option value="38">38</option>  
									<option value="39">39</option> 
									<option value="40">40</option>  
									<option value="41">41</option>  
									<option value="42">42</option>  
									<option value="43">43</option>  
									<option value="44">44</option> 
									<option value="45">45</option>  
									<option value="46">46</option>  
									<option value="47">47</option>  
									<option value="48">48</option>  
									<option value="49">49</option>
									<option value="50">50</option>  
									<option value="51">51</option>  
									<option value="52">52</option>  
									<option value="53">53</option>  
									<option value="54">54</option> 
									<option value="55">55</option>  
									<option value="56">56</option>  
									<option value="57">57</option>  
									<option value="58">58</option>  
									<option value="59">59</option> 
									</select>
									<input type="submit" value="Set Start Time" class="btn btn-success">
									
									</form>

									<form action="stoptime.jsp" method="post">
									
									<input type="hidden" name="id" value="<%=id%>">
									<label>Stop</label>
									<select name="stophour" id="stophour" class="form-control" style="width: 260px;" required>
									<option value="00">00</option>  
									<option value="01">01</option>  
									<option value="02">02</option>  
									<option value="03">03</option>  
									<option value="04">04</option> 
									<option value="05">05</option>  
									<option value="06">06</option>  
									<option value="07">07</option>  
									<option value="08">08</option>  
									<option value="09">09</option> 
									<option value="10">10</option>  
									<option value="11">11</option>  
									<option value="12">12</option>  
									<option value="13">13</option>  
									<option value="14">14</option> 
									<option value="15">15</option>  
									<option value="16">16</option>  
									<option value="17">17</option>  
									<option value="18">18</option>  
									<option value="19">19</option> 
									<option value="20">20</option>  
									<option value="21">21</option>  
									<option value="22">22</option>  
									<option value="23">23</option>  
									<option value="24">24</option> 									
									</select>
									<select name="stopmin" id="stopmin" class="form-control" style="width: 260px;" required>  
									<option value="00">00</option>  
									<option value="01">01</option>  
									<option value="02">02</option>  
									<option value="03">03</option>  
									<option value="04">04</option> 
									<option value="05">05</option>  
									<option value="06">06</option>  
									<option value="07">07</option>  
									<option value="08">08</option>  
									<option value="09">09</option> 
									<option value="10">10</option>  
									<option value="11">11</option>  
									<option value="12">12</option>  
									<option value="13">13</option>  
									<option value="14">14</option> 
									<option value="15">15</option>  
									<option value="16">16</option>  
									<option value="17">17</option>  
									<option value="18">18</option>  
									<option value="19">19</option> 
									<option value="20">20</option>  
									<option value="21">21</option>  
									<option value="22">22</option>  
									<option value="23">23</option>  
									<option value="24">24</option> 	
									<option value="25">25</option>  
									<option value="26">26</option>  
									<option value="27">27</option>  
									<option value="28">28</option>  
									<option value="29">29</option> 
									<option value="30">30</option>  
									<option value="31">31</option>  
									<option value="32">32</option>  
									<option value="33">33</option>  
									<option value="34">34</option> 
									<option value="35">35</option>  
									<option value="36">36</option>  
									<option value="37">37</option>  
									<option value="38">38</option>  
									<option value="39">39</option> 
									<option value="40">40</option>  
									<option value="41">41</option>  
									<option value="42">42</option>  
									<option value="43">43</option>  
									<option value="44">44</option> 
									<option value="45">45</option>  
									<option value="46">46</option>  
									<option value="47">47</option>  
									<option value="48">48</option>  
									<option value="49">49</option>
									<option value="50">50</option>  
									<option value="51">51</option>  
									<option value="52">52</option>  
									<option value="53">53</option>  
									<option value="54">54</option> 
									<option value="55">55</option>  
									<option value="56">56</option>  
									<option value="57">57</option>  
									<option value="58">58</option>  
									<option value="59">59</option> 
									</select>


									<input type="submit" value="Set End Time" class="btn btn-success">
									
									</form>
									<form action="calculate.jsp" method="post">
									
									<div>
									<input type="hidden" name="id" value="<%=id%>">
									
									<label>Amount</label><br>
									<input type="submit" class="btn btn-success" value="Generate Amount" >
									</div></form>
								
									
									
									
														
<%}%>
								
									

</div>									</div>

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

<div class="modal fade" id="modal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
     <div class="modal-dialog">
      <div class="modal-content modal-popup">
          <div class="modal-header">
               <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
               <h2 class="modal-title">Contact Form</h2>
          </div>

               <form action="#" method="post">
                    <input name="name" type="text" class="form-control" id="name" placeholder="Your Name" required>
                 	<input name="email" type="email" class="form-control" id="email" placeholder="Email Address" required>
                 	<textarea name="message" rows="3" class="form-control" id="message" placeholder="Message" required></textarea>
                    <input name="submit" type="submit" class="form-control" id="submit" value="Send Message">
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