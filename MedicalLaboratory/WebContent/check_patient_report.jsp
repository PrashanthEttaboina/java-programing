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
<center style="color:white;"><h2>WELCOME TO (ADMIN)PATHOLOGISTS TEST REPORT PAGE</h2></center>
<br><br><center>
<a  style="color:white;" href="admin_home.html">Home</a>|
<a  style="color:white;" href="index.html">Log-Out</a><br><br><br>
</center>
<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
<form action="check_patient_report.jsp" align="center">
<div class="form-group">
<label>Enter Patient Name: </label>
<input type="text" class="form-control" name="patient_name">

<label>Enter Test Type: </label>
<input type="text" class="form-control" name="test_type">
<input type="submit" class="btn btn-primary" value="search"><br>
<br><br></form>
</div>
</div>
</div>
</div>
</div>
<%@page import="com.pojo.BloodTest,com.main.BloodTestBean,com.pojo.UrineTest,com.main.UrineTestBean,java.util.*" %>
<%
String patient_name=request.getParameter("patient_name");
String test_type=request.getParameter("test_type");
if((patient_name==null&&test_type==null)||(test_type.equals("")&&patient_name.equals("")))
{
	%>
	<center style="color:white;"><h3>ENTER THE NAME AND TEST TYPE OF THE REPORT YOU WANT TO SEARCH</h3></center>	
<% }
else if(test_type.equalsIgnoreCase("Blood Test"))
{
List<BloodTest> bt=BloodTestBean.searchAdmin(patient_name,test_type);
Iterator<BloodTest> i=bt.iterator();
while(i.hasNext())
{
 	BloodTest pt=i.next();
 	if(pt.getStatus()==null)
 	{ %>
		<center style="color:white;"><h3>THE REPORT IS NOT UPDATED PLEASE COME BACK LATER </h3></center>
	<%}
 	else
 	{
 		%>
 		<div class="container">
 		<center style="color:white;"><h3>HERE IS THE PATIENT REPORT YOU NEEDED </h3></center><br><br>
 		<table style="width: 50%;" class="table table-bordered table-light">
		<tr class="table-success">
 		<td><b>Test Id : </b></td><td><%=pt.getBid() %></td></tr>
 		<tr>
 		<td><b>Patient Id : </b></td><td><%=pt.getPat_id() %></td></tr>
 		<tr>
 		<td><b>Patient Name : </b></td><td><%=pt.getPatient_name() %></td></tr>
 		<tr>
 		<td><b>Referred_by_doctor : </b> </td><td><%=pt.getReferred_by_doctor() %></td></tr>
 		<tr>
 		<td><b>Date and Time : </b></td><td><%=pt.getDate_and_time() %></td></tr>
 		<tr>
 		<td><b>Blood_group : </b></td><td><%=pt.getBlood_group() %></td></tr>
 		<tr>
 		<td><b>Hemoglobin : </b></td><td><%=pt.getHemoglobin() %></td></tr>
 		<tr>
 		<td><b>RBC Count : </b></td><td><%=pt.getRbc_count() %></td></tr>
 		<tr>
 		<td><b>MCV : </b></td><td><%=pt.getMcv() %></td></tr>
 		<tr>
 		<td><b>MCH : </b></td><td><%=pt.getMch() %></td></tr>
 		<tr>
 		<td><b>MCHC :</b> </td><td><%=pt.getMchc() %></td></tr>
 		<tr>
 		<td><b>RDW : </b></td><td><%=pt.getRdw() %></td></tr>
 		<tr>
 		<td><b>WBC Count :</b> </td><td><%=pt.getWbc_count() %></td></tr>
 		</table></div>
 		<center> <button class="btn btn-primary" onclick="window.print()"> Print Report </button></center><br><br>
 		<%}	break;
 	
} 
}
else if(test_type.equalsIgnoreCase("Urine Test"))
{
	List<UrineTest> bt=UrineTestBean.searchAdmin(patient_name,test_type);
	Iterator<UrineTest> i=bt.iterator();
	while(i.hasNext())
	{
	 	UrineTest pt=i.next();
	 	if(pt.getStatus()==null)
	 	{ %>
			<center style="color:white;"><h3>THE REPORT IS NOT UPDATED PLEASE COME BACK LATER </h3></center>
		<%}
	 	else
	 	{
	 		%>
	 		<center style="color:white;"><h3>HERE IS THE PATIENT REPORT YOU NEEDED </h3></center><br><br>
	 		<table style="width: 50%;" class="table table-bordered table-light">
 			<tr class="table-success">
	 		<td><b>Test Id : </b></td><td><%=pt.getUid() %></td></tr>
	 		<tr>
	 		<td><b>Patient Id : </b></td><td><%=pt.getPat_id() %></td></tr>
	 		<tr>
	 		<td><b>Patient Name : </b></td><td><%=pt.getPatient_name() %></td></tr>
	 		<tr>
	 		<td><b>Referred_by_doctor :  </b></td><td><%=pt.getReferred_by_doctor() %></td></tr>
	 		<tr>
	 		<td><b>Date and Time :</b> </td><td><%=pt.getDate_and_time() %></td></tr>
	 		<tr>
	 		<td><b>Color : </b></td><td><%=pt.getColor() %></td></tr>
	 		<tr>
	 		<td><b>Appearance :</b> </td><td><%=pt.getAppearance() %></td></tr>
	 		<tr>
	 		<td><b>Specific Gravity :</b> </td><td><%=pt.getSpecific_gravity() %></td></tr>
	 		<tr>
	 		<td><b>ph Value : </b></td><td><%=pt.getPh() %></td></tr>
	 		<tr>
	 		<td><b>Protein : </b></td><td><%=pt.getProtein() %></td></tr>
	 		<tr>
	 		<td><b>Glucose : </b></td><td><%=pt.getGlucose() %></td></tr>
	 		<tr>
	 		<td><b>Urobilinogen :</b> </td><td><%=pt.getUrobilinogen() %></td></tr>
	 		<tr>
	 		<td><b>Bilirubin : </b></td><td><%=pt.getBilirubin() %></td></tr>
	 		<tr>
	 		<td><b>Ketones : </b></td><td><%=pt.getKetones() %></td></tr>
	 		<tr>
	 		<td><b>Nitrites :</b> </td><td><%=pt.getNitrites() %></td></tr>
	 		<center> <button style="color:white;" onclick="window.print()"> Print Report </button></center><br><br>
	 		<%}break;
	}
}
%>
</body>
</html>