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
<%@ include file="connection.jsp" %>
<%
String patient_id=(String)session.getAttribute("aid");
ps=con.prepareStatement("select * from patient where patient_id = ? ");
ps.setString(1,patient_id);
ResultSet rs=ps.executeQuery();
if(rs.next()){
%>
<form action="./patient_profile_update.jsp" align ="center">
<br>
<input type="hidden" name="patient_id" value="<%=rs.getString("patient_id")%>">

<label>Name : </label>
<input type="text" name="name" value="<%=rs.getString("name")%>">
<br><br>
<label>Email id : </label>
<input type="email" name="email" value="<%=rs.getString("email")%>">
<br><br>
<label>Mobile Number : </label>
<input type="text" name="phone" value="<%=rs.getString("phone")%>">
<br><br>
<label>Enter Age : </label>
<input type="text" name="age" value="<%=rs.getInt("age")%>">
<br><br>

<p>Select your Gender : </p>
<input type = "radio" name= "gender" value="Male">Male
<input type = "radio" name= "gender" value="Female">Female
<input type = "radio" name= "gender" value="Others">Others
<br><br>
<label>Prescription : </label>
<select name="prescription">
<option value="<%=rs.getString("prescription")%>"><%=rs.getString("prescription")%></option>
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
<input type="text" name="blood_group" value="<%=rs.getString("blood_group")%>">
<br><br>
<input type="Submit" value="Update">
</form>
<%}%>