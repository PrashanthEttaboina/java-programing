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
<%@ include file="connection.jsp" %>
<%
int doctor_id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from doctor where doctor_id=?");
ps.setInt(1,doctor_id);
ResultSet rs=ps.executeQuery();
if(rs.next()){
%>
<form action="./doctor_profile_update.jsp" align ="center">
<br>
<input type="hidden" name="doctor_id" value="<%=rs.getString("doctor_id")%>">

<label>Name : </label>
<input type="text" name="name" value="<%=rs.getString("name")%>">
<br><br>
<label>Email id : </label>
<input type="email" name="email" value="<%=rs.getString("email")%>">
<br><br>
<label>Mobile Number : </label>
<input type="text" name="phone" value="<%=rs.getString("phone")%>">
<br><br>
<label>Specialisation : </label>
<select name="specialisation" >
<option value="<%=rs.getString("specialisation")%>"><%=rs.getString("specialisation")%></option>
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
<input type="text" name="experience" placeholder= "Enter your Experience : ">
<br><br>
<input type="Submit" value="Update">
</form>
<%}%>