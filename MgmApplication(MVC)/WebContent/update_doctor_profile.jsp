<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br>
<center><h1>WELCOME TO DOCTOR UPDATE PAGE</h1>
<br>
<a href="Doctor_Home.html">Home</a> |
<a href="doctor_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br>
</center>
<%@ page import="com.motivity.DoctorRegisterBean" %>
<%
DoctorRegisterBean dr=(DoctorRegisterBean)session.getAttribute("doctorDetails");
if(dr!=null){
%>
<form action="./update_doctor_profile" method= "post" align ="center">
<br>
<input type="hidden" name="doctor_id" value="<%=dr.getId()%>">

<label>Name : </label>
<input type="text" name="dname" value="<%=dr.getDname()%>">
<br><br>
<label>Email id : </label>
<input type="email" name="email" value="<%=dr.getEmail()%>">
<br><br>
<label>Mobile Number : </label>
<input type="text" name="phone" value="<%=dr.getPhone()%>">
<br><br>
<label>Specialisation : </label>
<select name="specialisation" >
<option value="<%=dr.getSpecialisation()%>"><%=dr.getSpecialisation()%></option>
<option value ="ENT">ENT</option>
<option value =Dermatologist>Dermatologist</option>
<option value="Neurologist">Neurologist</option>
<option value="Dentist">Dentist</option>
<option value="Cardiologist">Cardiologist</option>
<option value ="Psychiatrist">Psychiatrist</option>
<option value ="Pediatrician">Pediatrician</option>
<option value ="Gynecologist">Gynecologist</option>
</select>
<br><br>
<label>Date of Birth : </label>
<input type ="date"  name="date_of_birth" placeholder="Enter Date of Birth : ">
<br><br>
<p>Select your timings : </p>
<input type = "radio" name= "timings" value="Morning">Morning
<input type = "radio" name= "timings" value="Afternoon">Afternoon
<input type = "radio" name= "timings" value="Evening">Evening
<br><br>
<label>Experience in years : </label>
<input type="text" name="experience" value="<%=dr.getExperience()%> ">
<br><br>
<input type="Submit" value="Update">
</form>
<%} %>
</body>
</html>