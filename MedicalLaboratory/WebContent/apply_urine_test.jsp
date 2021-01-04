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
<body bgcolor='lightskyblue' class="bg">
<br><br>
<center style="color:white;"><h2>WELCOME TO PATIENT URINE TEST APPLICATION PAGE </h2>
<br>
<a style="color:white;" href="index.html">
Home
</a></center>
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
<form action="./apply_urine_test" method="post" align ="center">
<br>
<div class="form-group">
<input type="hidden" class="form-control"  name="pat_id" value="<%=pt.getPatient_id() %>" readonly></div>
<div class="form-group">
<label>Name : </label>
<input type="text" class="form-control"  name="patient_name" value="<%=pt.getPatient_name() %>" readonly>
</div>

<div class="form-group">
<label> Gender : </label>
<input type = "radio" name= "patient_gender"  value="Male">Male
<input type = "radio"name= "patient_gender" value="Female">Female
</div>
<div class="form-group">
<label> Date of Birth :</label>
<input type="text" class="form-control"  name="date_of_birth" value="<%=pt.getDate_of_birth() %>" readonly>
</div>
<div class="form-group">
<label>Mobile Number : </label>
<input type="text" class="form-control"  name="patient_phone"  value="<%=pt.getPatient_phone() %>" readonly>
</div>
<div class="form-group">
<label>Referred by Doctor :</label>
<input type="text" class="form-control"  name="referred_by_doctor" placeholder="Enter Doctor Name ">
</div>
<div class="form-group">
<label>Application date and time :</label>
<input type="datetime-local" class="form-control"  name="date_and_time">
 </div>
 <div class="form-group">
<input type="hidden" class="form-control" name="test_type" value="Urine Test">
</div>
<input type="Submit" class="btn btn-primary" value="Apply">
<br><br>

</form>
<% } %>
</body>
</html>