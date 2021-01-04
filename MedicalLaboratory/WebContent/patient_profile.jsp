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
<center><h2>WELCOME TO PATIENT PROFILE PAGE</h2></center>
<br><br><center>
<a style="color:white;" href="patient_home.jsp">Home</a> |
<a style="color:white;" href="index.html">Log-Out</a><br><br><br>
</center>
<div class="container">
<%@page import="com.pojo.Patient,com.main.PatientBean,java.util.*" %>
<table class="table table-bordered table-light">
<tr class="table-success">
<td>Patient Id</td>
<td>Name</td>
<td>Gender</td>
<td>Date-of-Birth</td>
<td>Email</td>
<td>Phone</td>
<td>Address</td>
</tr>
<%
int id=(Integer)session.getAttribute("patient_id");
List<Patient> pa=PatientBean.getById(id);
Iterator<Patient> i=pa.iterator();
while(i.hasNext())
{
 	Patient pt=i.next();
 	%>
	<tr>
		<td><%=pt.getPatient_id() %></td>
		<td><%=pt.getPatient_name() %></td>
		<td><%=pt.getPatient_gender() %></td>
		<td><%=pt.getDate_of_birth() %></td>
		<td><%=pt.getPatient_email() %></td>
		<td><%=pt.getPatient_phone() %></td>
		<td><%=pt.getPatient_address() %></td>
		
	</tr></table>
	<br><br><br></div>
	<a style="color:white;" href="update_patient_profile.jsp? id=<%=pt.getPatient_id() %>"><center>update profile</center></a>	
<% } %>

</body>
</html>