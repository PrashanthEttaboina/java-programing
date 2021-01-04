<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body, html {
	height: 100%;
	margin: 0;
}
.bg {
	/* The image used */
	background-image: url("bg1.jpg");
	/* Full height */
	height: 100%;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="lightskyblue" class="bg">
<center style="color:white;"><h2>WELCOME TO PATIENT PROFILE UPDATE PAGE</h2></center>
<br><br><center>
<a style="color:white;" href="patient_home.jsp">Patient Home</a> |
<a style="color:white;" href="index.html">Log-Out</a>
<br><br><br>
</center>
<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
<%@page import="com.pojo.Patient,com.main.PatientBean,java.util.*" %>
<%
int id=(Integer)session.getAttribute("patient_id");
List<Patient> pa=PatientBean.getById(id);
Iterator<Patient> i=pa.iterator();
while(i.hasNext())
{
 	Patient pt=i.next();
 	%>
<form action="./update_patient_profile" method= "post" >
<br>
<input type="hidden" name="patient_id" value="<%=pt.getPatient_id() %>">
<div class="form-group">
<label>Enter Name:</label>
<input type="text"  class="form-control" name="patient_name" value="<%=pt.getPatient_name() %>">
</div>
<div class="form-group">
<label>Gender : </label>
<input type="text" class="form-control" name="patient_gender" value="<%=pt.getPatient_gender()%>" readonly>
</div>
<div class="form-group">
<label>Enter Date Of Birth:</label>
<input type="date"  class="form-control" name="date_of_birth" value="<%=pt.getDate_of_birth() %>">
</div>
<div class="form-group">
<label>Enter Email Id:</label>
<input type="email"  class="form-control" name="patient_email" value="<%=pt.getPatient_email() %>">
</div>
<input type="hidden" name="patient_password" value="<%=pt.getPatient_password() %>">
<div class="form-group">
<label>Enter Phone No:</label>
<input type="number"  class="form-control" name="patient_phone" value="<%=pt.getPatient_phone() %>">
</div>
<div class="form-group">
<label>Enter Your Address:</label>
<input type="text"  class="form-control" name="patient_address" value="<%=pt.getPatient_address() %>">
</div>
<input type="Submit" class="btn btn-primary" value="Update">
<%} %>
</form>
</div>
</div>
</div>
</div>
</div>
</body>
</html>