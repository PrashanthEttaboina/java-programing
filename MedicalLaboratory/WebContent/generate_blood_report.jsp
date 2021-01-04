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
<center style="color:white;"><h2>WELCOME TO PATHOLOGIST BLOOD TEST REPORT PAGE</h2></center>
<br>

<a style="color:white;" href="pathologist_home.jsp">Home</a> 
<a style="color:white;" href="index.html">LogOut</a>
<div class="container">
<table class="table table-bordered table-light">
<tr class="table-success">
<center style="color:white;"><h3>REFERENCE TABLE FOR NORMAL BLOOD TEST VALUES</h3></center>
<td><b>Hemoglobin</b></td>
<td><b>RBC Count</b></td>
<td><b>MCV</b></td>
<td><b>MCH</b></td>
<td><b>MCHC</b></td>
<td><b>RDW</b></td>
<td><b>WBC Count</b></td>
</tr>
<tr>
<td>13.0-17.0g/dl</td>
<td>4.5-5.5 millions</td>
<td>83.0-101.0 fl</td>
<td>27.32 pg</td>
<td>31.5-34.5 gm/dl</td>
<td>11.6-14.0 %</td>
<td>4000-10,000 cells/ml</td>
</tr>
</table>
</div>
<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
<%@page import="com.pojo.Pathologist,com.main.PathologistBean,com.main.BloodTestBean,com.pojo.BloodTest,java.util.*" %>
<%int id=Integer.parseInt(request.getParameter("id")); %>
<%

List<BloodTest> bl=BloodTestBean.searchById(id);
Iterator<BloodTest> i=bl.iterator();
while(i.hasNext())
{
	BloodTest sd=i.next();
	%>	

<form action="./generate_blood_report" method="post" >
<br>
<div class="form-group">
<label>Blood Test Id :</label>
<input type="text" class="form-control" name="bid" value="<%=sd.getBid() %>" readonly></div>
<input type="hidden" name="pat_id" value="<%=sd.getPat_id() %>">
<input type="hidden" name="patient_gender" value="<%=sd.getPatient_gender() %>">
<input type="hidden" name="date_of_birth" value="<%=sd.getDate_of_birth() %>">
<input type="hidden" name="patient_phone" value="<%=sd.getPatient_phone() %>">

<input type="hidden" name="test_type" value="<%=sd.getTest_type() %>">
<div class="form-group">
<label>Referred By :</label>
<input type="text" class="form-control" name="referred_by_doctor" value="<%=sd.getReferred_by_doctor() %>" readonly>
</div>
<input type="hidden" name="date_and_time" value="<%=sd.getDate_and_time() %>">
<div class="form-group">
<label>Name : </label>
<input type="text" class="form-control" name="patient_name" value="<%=sd.getPatient_name() %>" readonly>
</div>
<div class="form-group">
<label> Blood Group : </label>
<select name="blood_group">
<option value ="A+">A+</option>
<option value ="A-">A-</option>
<option value="B+">B+</option>
<option value="B-">B-</option>
<option value="O+">O+</option>
<option value ="O-">O-</option>
<option value ="AB+">AB+</option>
<option value ="AB-">AB-</option>
</select></div>
<div class="form-group">
<label> Hemoglobin : </label>
<input type="text" class="form-control" name="hemoglobin" placeholder="Enter hemoglobin"></div>
<div class="form-group">
<label>RBC count : </label>
<input type="text" class="form-control" name="rbc_count" placeholder="Enter rbc count">
</div>
<div class="form-group">
<label>MCV : </label>
<input type="text" class="form-control"  name="mcv" placeholder="Enter mcv">
</div>
<div class="form-group">
<label>MCH : </label>
<input type="text" class="form-control"  name="mch" placeholder="Enter mch">
</div>
<div class="form-group">
<label>MCHC : </label>
<input type="text" class="form-control" name="mchc" placeholder="Enter mchc">
</div>
<div class="form-group">
<label>RDW : </label>
<input type="text" class="form-control" name="rdw" placeholder="Enter rdw">
</div>
<div class="form-group">
<label>WBC count : </label>
<input type="text" class="form-control" name="wbc_count" placeholder="Enter wbc">
</div>
<input type="hidden" name="status" value="updated">
<input type="Submit" class="btn btn-primary" value="Update">
<br><br>
</form>
<% }%>
</body>
</html>