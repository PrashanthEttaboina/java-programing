<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br>
<center><h1>WELCOME TO PATIENT UPDATE PAGE</h1></center>
<br><br>
<center>
<a href="Patient_Home.html">Home</a> |
<a href="patient_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
</center>
<br><br>
<%@ page import="com.motivity.PatientRegisterBean" %>
<%
PatientRegisterBean pr=(PatientRegisterBean)session.getAttribute("patientDetails");
if(pr!=null){
%>
<form action="./update_patient_profile" method= "post" align ="center">
<br>
<input type="hidden" name="patient_id" value="<%=pr.getPatient_id()%>">

<label>Name : </label>
<input type="text" name="name" value="<%=pr.getName()%>">
<br><br>
<label>Email id : </label>
<input type="email" name="email" value="<%=pr.getEmail()%>">
<br><br>
<label>Mobile Number : </label>
<input type="text" name="phone" value="<%=pr.getPhone()%>">
<br><br>
<label>Enter Age : </label>
<input type="text" name="age" value="<%=pr.getAge()%>">
<br><br>

<p>Select your Gender : </p>
<input type = "radio" name= "gender" value="Male">Male
<input type = "radio" name= "gender" value="Female">Female
<input type = "radio" name= "gender" value="Others">Others
<br><br>
<label>Prescription : </label>
<select name="prescription">
<option value="<%=pr.getPrescription()%>"><%=pr.getPrescription()%></option>
<option value ="ENT">ENT</option>
<option value =Dermatology>Dermatology</option>
<option value="Neurology">Neurology</option>
<option value="Dentist">Dentist</option>
<option value="Cardiology">Cardiology</option>
<option value ="Psychiatrist">Psychiatrist</option>
<option value ="Pediatrician">Pediatrician</option>
<option value ="Gynecologist">Gynecologist</option>
</select>
<br><br>
<label>Enter your Blood Group : </label>
<input type="text" name="blood_group" value="<%=pr.getBlood_group()%>">
<br><br>
<input type="Submit" value="Update">
</form>
<%}%>