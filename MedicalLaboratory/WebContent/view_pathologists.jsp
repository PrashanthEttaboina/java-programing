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
<center style="color:white;"><h2>WELCOME TO (ADMIN)PATHOLOGISTS PROFILE PAGE</h2></center>
<br><br><center>
<a style="color:white;" href="admin_home.html">Home</a>|
<a style="color:white;" href="index.html">Log-Out</a><br><br><br>
</center>
<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
<form action="view_pathologists.jsp" align="center">
<div class="form-group">
<label>Search By Specialisation:</label>
<input type="text" class="form-control" name="doctor_specialisation">

<label>Or Search By Pathologist Name:</label> 
<input type="text" class="form-control" name="doctor_name">
<input type="submit" class="btn btn-primary" value="search"><br>
</form>
</div>
</div>
</div>
</div>
</div>
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
String specialisation=request.getParameter("doctor_specialisation");
String doctor_name=request.getParameter("doctor_name");
List<Pathologist> pa=null;
if((specialisation==null&&doctor_name==null)||(specialisation.equals("")&&doctor_name.equals("")))
{
	pa=PathologistBean.viewPathologists();

}
else
{
	pa=PathologistBean.search(specialisation,doctor_name);
}
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
	</tr>	
	<% } %>
	</table></div>
</body>
</html>