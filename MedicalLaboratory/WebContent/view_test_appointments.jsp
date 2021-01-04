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
  background-repeat: repeat;
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
<center style="color:white;"><h2>WELCOME TO PATHOLOGIST APPOINTMENT PAGE</h2></center>
<br><br><center>
<a style="color:white;" href="pathologist_home.jsp">Home</a> |
<a style="color:white;" href="index.html">Log-Out</a><br><br><br>
</center>
<%@page import="javax.servlet.http.HttpSession,com.pojo.Pathologist,com.main.PathologistBean,com.main.BloodTestBean,
com.pojo.BloodTest,java.util.*,com.main.UrineTestBean,com.pojo.UrineTest" %>
<div class="container">
<table class="table table-bordered table-light">
	<tr class="table-success">
<td><b>Test Id</b></td>
<td><b>Patient Id</b></td>
<td><b>Patient Name</b></td>
<td><b>Gender</b></td>
<td><b>Date-Of-Birth</b></td>
<td><b>Phone</b></td>
<td><b>Test Type</b></td>
<td><b>Referred By Doctor</b></td>
<td><b>Date and Time</b></td>
<td><b>Status</b></td>
<td><b>Action</b></td>
</tr>
<%
String specialisation=(String)session.getAttribute("specialisation");
if(specialisation.equalsIgnoreCase("Blood test"))
{
	List<BloodTest> bl=BloodTestBean.viewBloodTests();
	Iterator<BloodTest> i=bl.iterator();
	while(i.hasNext())
	{%>
		<tr>
	 <% 	BloodTest sd=i.next();
%>
		
			<td><%=sd.getBid() %></td>
			<td><%=sd.getPat_id() %></td>
			<td><%=sd.getPatient_name() %></td>
			<td><%=sd.getPatient_gender() %></td>
			<td><%=sd.getDate_of_birth() %></td>
			<td><%=sd.getPatient_phone() %></td>
			<td><%=sd.getTest_type() %></td>
			<td><%=sd.getReferred_by_doctor() %></td>
			<td><%=sd.getDate_and_time() %></td>
			
			<%if(sd.getStatus()==null)
				{%>
					<td>Not Generated</td>
					<td><a href="generate_blood_report.jsp?id=<%=sd.getBid()%>">Generate Report</a></td>
				<%}
			else
				{%>
					<td><%=sd.getStatus() %></td>
					<td>Report Generated</td>
				<%} 
		 }%> </tr>
<%}
else if(specialisation.equalsIgnoreCase("Urine test"))
{
	List<UrineTest> bl=UrineTestBean.viewUrineTests();
	Iterator<UrineTest> i=bl.iterator();
	while(i.hasNext())
	{%>
		<tr>
	 <% UrineTest sd=i.next(); %>
		
			<td><%=sd.getUid() %></td>
			<td><%=sd.getPat_id() %></td>
			<td><%=sd.getPatient_name() %></td>
			<td><%=sd.getPatient_gender() %></td>
			<td><%=sd.getDate_of_birth() %></td>
			<td><%=sd.getPatient_phone() %></td>
			<td><%=sd.getTest_type() %></td>
			<td><%=sd.getReferred_by_doctor() %></td>
			<td><%=sd.getDate_and_time() %></td>
			
			<%if(sd.getStatus()==null)
				{%>
					<td>Not Generated</td>
					<td><a href="generate_urine_report.jsp?id=<%=sd.getUid()%>">Generate Report</a></td>
				<%}
			else
				{%>
					<td><%=sd.getStatus() %></td>
					<td>Report Generated</td>
				<%} 
		 }%> </tr>

<%} %>
</table></div>
</body>
</html>