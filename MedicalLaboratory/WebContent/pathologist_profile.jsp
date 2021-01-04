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
<a  style="color:white;" href="view_test_appointments.jsp">View Test Appointments</a> |
<a style="color:white;" href="index.html">Log-Out</a><br><br>
</center>
<br><br><br><br>
<div class="container">
<%@page import="com.pojo.Pathologist,com.main.PathologistBean,java.util.*" %>
<table class="table table-bordered table-light">
<tr class="table-success">
<td><b>Lab Doctor Id</b></td>
<td><b>Name</b></td>
<td><b>Gender</b></td>
<td><b>Email</b></td>
<td><b>Phone</b></td>
<td><b>Specialisation</b></td>
<td><b>Experience</b></td>
<td><b>Address</b></td>
</tr>

<%
int id=(Integer)session.getAttribute("pathologist_id");
List<Pathologist> pa=PathologistBean.getById(id);
Iterator<Pathologist> i=pa.iterator();
while(i.hasNext())
{

 	Pathologist sd=i.next();
 	%>
	<tr>
		<td><%=sd.getLab_doctor_id() %></td>
		<td><%=sd.getDoctor_name() %></td>
		<td><%=sd.getGender() %></td>
		<td><%=sd.getDoctor_email() %></td>
		<td><%=sd.getDoctor_phone() %></td>
		<td><%=sd.getDoctor_specialisation() %></td>
		<td><%=sd.getDoctor_experience() %></td>
		<td><%=sd.getDoctor_address() %></td>
	</tr></table>
	<br><br><br></div>
	<a style="color:white;" href="update_pathologist_profile.jsp? id=<%=sd.getLab_doctor_id()%>"><center>Update Profile</center></a>	
<% } %>
</body>
</html>