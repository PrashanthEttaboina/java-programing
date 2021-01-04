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
<center style="color:white;"><h2>URINE TEST REPORT PAGE</h2></center>
<a style="color:white;" href="patient_home.jsp">Home</a> |
<a style="color:white;" href="index.html">Log-Out</a>
<br>
<div class="container">
<%@page import="com.pojo.UrineTest,com.main.UrineTestBean,java.util.*" %>
<%
int id=(Integer)session.getAttribute("patient_id");
List<UrineTest> bt=UrineTestBean.getByPatientId(id);
Iterator<UrineTest> i=bt.iterator();
while(i.hasNext())
{
 	UrineTest pt=i.next();
 	if(pt.getStatus()==null)
 	{ %>
 		<center style="color:white;"><h3>REPORT IS NOT UPDATED PLEASE COME BACK LATER</h3></center>
 	<%}
 	else
 	{
%>
<table style="width: 50%;" class="table table-bordered table-light">
<tr class="table">
<td><b>Test Id : </b></td><td><%=pt.getUid() %></td></tr>
<tr>
<td><b>Patient Id : </b></td><td><%=pt.getPat_id() %></td></tr>
<tr>
<td><b>Patient Name : </b></td><td><%=pt.getPatient_name() %></td></tr>
<tr>
<td><b>Referred_by_doctor :  </b></td><td><%=pt.getReferred_by_doctor() %></td></tr>
<tr>
<td><b>Date and Time : </b></td><td><%=pt.getDate_and_time() %></td></tr>
<tr>
<td><b>Color : </b></td><td><%=pt.getColor() %></td></tr>
<tr>
<td><b>Appearance : </b></td><td><%=pt.getAppearance() %></td></tr>
<tr>
<td><b>Specific Gravity : </b></td><td><%=pt.getSpecific_gravity() %></td></tr>
<tr>
<td><b>ph Value : </b></td><td><%=pt.getPh() %></td></tr>
<tr>
<td><b>Protein : </b></td><td><%=pt.getProtein() %></td></tr>
<tr>
<td><b>Glucose : </b></td><td><%=pt.getGlucose() %></td></tr>
<tr>
<td><b>Urobilinogen : </b></td><td><%=pt.getUrobilinogen() %></td></tr>
<tr>
<td><b>Bilirubin : </b></td><td><%=pt.getBilirubin() %></td></tr>
<tr>
<td><b>Ketones : </b></td><td><%=pt.getKetones() %></td></tr>
<tr>
<td><b>Nitrites : </b></td><td><%=pt.getNitrites() %></td></tr>
<center> <button class="btn btn-primary" onclick="window.print()"> Print Report </button></center><br><br>
<%}
}%>
</body>
</html>