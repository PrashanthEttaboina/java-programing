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
<center style="color:white;"><h2>WELCOME TO BLOOD TEST REPORT PAGE</h2></center>
<a style="color:white;" href="patient_home.jsp">Home</a> |
<a style="color:white;" href="index.html">Log-Out</a>
<br>
<div class="container">
<%@page import="com.pojo.BloodTest,com.main.BloodTestBean,java.util.*" %>
<%
int id=(Integer)session.getAttribute("patient_id");
List<BloodTest> bt=BloodTestBean.getByPatientId(id);
Iterator<BloodTest> i=bt.iterator();
while(i.hasNext())
{
 	BloodTest pt=i.next();
 	if(pt.getStatus()==null)
 	{ %>
 		<center style="color:white;"><h2>YOUR REPORT IS NOT UPDATED PLEASE COME BACK LATER </h2></center>
 	<%}
 	else
 	{
%>
<center>
<table style="width: 50%;" class="table table-bordered table-light">
<tr class="table">
<th> Blood Test Report </th></tr>
<th  style="width: 9%;"><b>Test Id : </b></th><td  style="width: 9%;"><%=pt.getBid() %></td></tr>
<tr>
<th  style="width: 9%;"><b>Patient Id : </b></th><td  style="width: 9%;"><%=pt.getPat_id() %></td></tr>
<tr>
<th  style="width: 9%;"><b>Patient Name : </b></th><td  style="width: 9%;"><%=pt.getPatient_name() %></td></tr>
<tr>
<th  style="width: 9%;"><b>Referred_by_doctor :  </b></th><td  style="width: 9%;"><%=pt.getReferred_by_doctor() %></td></tr>
<tr>
<th  style="width: 9%;"><b>Date and Time : </b></th><td  style="width: 9%;"><%=pt.getDate_and_time() %></td></tr>
<tr>
<th style="width: 9%;"><b>Blood_group : </b></th><td  style="width: 9%;"><%=pt.getBlood_group() %></td></tr>
<tr>
<th style="width: 9%;"><b>Hemoglobin : </b></th><td  style="width: 9%;"><%=pt.getHemoglobin() %></td></tr>
<tr>
<th style="width: 9%;"><b>RBC Count : </b></th><td  style="width: 9%;"><%=pt.getRbc_count() %></td></tr>
<tr>
<th style="width: 9%;"><b>MCV : </b></th><td  style="width: 9%;"><%=pt.getMcv() %></td></tr>
<tr>
<th style="width: 9%;"><b>MCH : </b></th><td style="width: 9%;"><%=pt.getMch() %></td></tr>
<tr>
<th style="width: 9%;"><b>MCHC : </b></th><td  style="width: 9%;"><%=pt.getMchc() %></td></tr>
<tr>
<th style="width: 9%;"><b>RDW : </b></th><td style="width: 9%;"><%=pt.getRdw() %></td></tr>
<tr>
<th style="width: 9%;"><b>WBC Count : </b></th><td style="width: 9%;"><%=pt.getWbc_count() %></td></tr>
</table></center></div>
<center> <button class="btn btn-primary" onclick="window.print()"> Print Report </button></center><br><br>
<%}
 }%>
</body>
</html>