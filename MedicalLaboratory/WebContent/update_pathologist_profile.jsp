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

<center style="color:white;"><h2>WELCOME TO PATHOLOGIST PROFILE PAGE</h2></center>
<br><br><center>
<a style="color:white;" href="pathologist_home.jsp">Pathologist Home</a> |
<a style="color:white;" href="index.html">Log-Out</a>
<br><br><br>
</center>
<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
<%@page import="com.pojo.Pathologist,com.main.PathologistBean,java.util.*" %>
<%
int id=(Integer)session.getAttribute("pathologist_id");
List<Pathologist> pa=PathologistBean.getById(id);
Iterator<Pathologist> i=pa.iterator();
while(i.hasNext())
{
 	Pathologist sd=i.next();
 	%>
<form action="./update_pathologist_profile" method= "post" align ="center">
<br>
<input type="hidden" name="lab_doctor_id" value="<%=sd.getLab_doctor_id()%>">
<div class="form-group">
<label>Name : </label>
<input type="text" class="form-control" name="doctor_name" value="<%=sd.getDoctor_name()%>">
</div>
<div class="form-group">
<label>Gender : </label>
<input type="text" class="form-control" name="gender" value="<%=sd.getGender()%>" readonly>
</div>
<div class="form-group">
<label>Email id : </label>
<input type="email" class="form-control" name="doctor_email" value="<%=sd.getDoctor_email()%>">
</div>

<input type="hidden" name="doctor_password" value="<%=sd.getDoctor_password()%>">
<div class="form-group">
<label>Mobile Number : </label>
<input type="text" class="form-control" name="doctor_phone" value="<%=sd.getDoctor_phone()%>">
</div>
<div class="form-group">
<label>Specialisation : </label>
<select name="doctor_specialisation" >
<option value="<%=sd.getDoctor_specialisation()%>"><%=sd.getDoctor_specialisation()%></option>
<option value ="BLOOD TEST">Blood Test</option>
<option value ="URINE TEST">Urine Test</option>
</select>
</div>
<div class="form-group">
<label>Experience in years : </label>
<input type="text" class="form-control" name="doctor_experience" value="<%=sd.getDoctor_experience()%> ">
</div>
<div class="form-group">
<label>Address : </label>
<input type="text" class="form-control" name="doctor_address" value="<%=sd.getDoctor_address()%> ">
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