<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor='lightskyblue'>
<br><br>
<center><h2>WELCOME TO PATIENT BLOOD TEST APPLICATION PAGE </h2></center>
<br>
<%@page import="com.pojo.Patient,com.main.PatientBean,java.util.*" %>
<%
int id=(Integer)session.getAttribute("patient_id");
List<Patient> pa=PatientBean.getById(id);
Iterator<Patient> i=pa.iterator();
while(i.hasNext())
{
 	Patient pt=i.next();
 	%>
<form action="./apply_blood_test" method="post" align ="center">
<br>
<input type="hidden" name="pat_id" value="<%=pt.getPatient_id() %>">
<label>Name : </label>
<input type="text" name="patient_name" value="<%=pt.getPatient_name() %>">
<br><br>
<label> Gender :</label> 
<input type="text" name="patient_gender" value="<%=pt.getPatient_gender() %>">
<br><br>
<label> Date of Birth :</label>
<input type="text" name="date_of_birth" value="<%=pt.getDate_of_birth() %>">
<br><br>
<label>Mobile Number : </label>
<input type="text" name="patient_phone"  value="<%=pt.getPatient_phone() %>">
<br><br>
<label>Referred by Doctor :</label>
<input type="text" name="referred_by_doctor" placeholder="Enter Doctor Name ">
<br><br>
<label>Application date and time :</label>
<input type="datetime-local" name="date_and_time">
 <br><br>
<input type="hidden" name="test_type" value="Blood Test">

<input type="Submit" value="Apply">
<br><br>
<a href="index.html">
Home
</a>
</form>
<% } %>
</body>
</html>