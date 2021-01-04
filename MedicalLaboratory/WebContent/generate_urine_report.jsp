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
<center style="color:white;"><h2>WELCOME TO PATHOLOGIST URINE TEST REPORT PAGE</h2></center>
<a  style="color:white;" href="pathologist_home.jsp">Home</a> |
<a  style="color:white;" href="index.html">LogOut</a>
<div class="container">
<table class="table table-bordered table-light">
<tr class="table-success">
<center style="color:white;"><h3>REFERENCE TABLE FOR NORMAL URINE TEST VALUES</h3></center>
<td><b>Specific Gravity</b></td>
<td><b>ph</b></td>
<td><b>Protein</b></td>
<td><b>Glucose</b></td>
<td><b>Urobilinogen</b></td>
</tr>
<tr>
<td>1.003-1.030</td>
<td>4.5-7.8</td>
<td>3.5-5.0 g/dl</td>
<td>0-0.8 mmol/l</td>
<td>0.1-1.8 mg/dl</td>

</tr>
</table></div>
<div class="container">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
<%@page import="com.pojo.Pathologist,com.main.PathologistBean,com.main.UrineTestBean,com.pojo.UrineTest,java.util.*" %>
<%int id=Integer.parseInt(request.getParameter("id")); %>
<%
List<UrineTest> bl=UrineTestBean.searchById(id);
Iterator<UrineTest> i=bl.iterator();
while(i.hasNext())
{
	UrineTest sd=i.next();
	%>	

<form action="./generate_urine_report" method="post" align ="center">
<br>
<div class="form-group">
<label>Urine Test Id :</label>
<input type="text"  class="form-control" name="uid" value="<%=sd.getUid() %>" readonly>
</div>
<input type="hidden" name="pat_id" value="<%=sd.getPat_id() %>">
<input type="hidden" name="patient_gender" value="<%=sd.getPatient_gender() %>">
<input type="hidden" name="date_of_birth" value="<%=sd.getDate_of_birth() %>">
<input type="hidden" name="patient_phone" value="<%=sd.getPatient_phone() %>">

<input type="hidden" name="test_type" value="<%=sd.getTest_type() %>">
<input type="hidden" name="referred_by_doctor" value="<%=sd.getReferred_by_doctor() %>">
<input type="hidden" name="date_and_time" value="<%=sd.getDate_and_time() %>">
<div class="form-group">
<label>Patient Name : </label>
<input type="text"  class="form-control" name="patient_name" value="<%=sd.getPatient_name() %>" readonly>
</div>
<div class="form-group">
<label> Color : </label>
<select name="color">
<option value ="Color Less">Color Less</option>
<option value ="Yellow">Yellow</option>
<option value="Yellow-Amber">Yellow-Amber</option>
<option value="Yellow-Cloudy">Yellow-Cloudy</option>
</select>
</div>
<div class="form-group">
<label> Appearance : </label>
<select name="appearance">
<option value ="Clear">Clear</option>
<option value ="Medium-Dark">Medium-Dark</option>
<option value ="Dark">Dark</option>
</select></div>
<div class="form-group">
<label> Specific Gravity : </label>
<input type="text"  class="form-control" name="specific_gravity" placeholder="Enter specific gravity">
</div>
<div class="form-group">
<label>Ph value : </label>
<input type="text"  class="form-control" name="ph" placeholder="Enter ph">
</div>
<div class="form-group">
<label>Protein : </label>
<input type="text"  class="form-control" name="protein" placeholder="Enter protein">
</div>
<div class="form-group">
<label>Glucose : </label>
<input type="text" name="glucose"  class="form-control" placeholder="Enter Glucose">
</div>
<div class="form-group">
<label>Urobilinogen : </label>
<input type="text" name="urobilinogen"  class="form-control" placeholder="Enter urobilinogen">
</div>
<div class="form-group">
<label> Bilirubin : </label>
<input type = "radio" name= "bilirubin" value="Negative">Negative
<input type = "radio" name= "bilirubin" value="Positive">Positive
</div>
<div class="form-group">
<label> Ketones : </label>
<select name="ketones">
<option value ="Normal/Negative">Normal</option>
<option value ="Low">Low</option>
<option value ="High">High</option>
<option value="Very High">Very High</option>
</select>
</div>
<div class="form-group">
<label> Nitrites : </label>
<input type = "radio" name= "nitrites" value="Negative">Negative
<input type = "radio" name= "nitrites" value="Positive">Positive
</div>
<input type="hidden" name="status" value="updated">
<input type="Submit" class="btn btn-primary" value="Update">
<br><br>

</form>
<% }%>
</body>
</html>