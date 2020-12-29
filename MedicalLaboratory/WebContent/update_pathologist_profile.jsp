<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<center><h2>WELCOME TO PATHOLOGIST PROFILE PAGE</h2></center>
<br><br><center>
<a href="pathologist_home.jsp">Pathologist Home</a> |
<a href="index.html">Log-Out</a>
<br><br><br>
</center>
<%@page import="com.pojo.Pathologist,com.main.PathologistBean,java.util.*" %>
<%
int id=(Integer)session.getAttribute("pathologist_id");
List<Pathologist> pa=PathologistBean.getById(id);
Iterator<Pathologist> i=pa.iterator();
while(i.hasNext())
{
 	Pathologist sd=i.next();
 	%>
<form action="./update_pathologist_profile" method= "post" align ="center">
<br>
<input type="hidden" name="lab_doctor_id" value="<%=sd.getLab_doctor_id()%>">

<label>Name : </label>
<input type="text" name="doctor_name" value="<%=sd.getDoctor_name()%>">
<br><br>
<label>Gender : </label>
<input type="text" name="gender" value="<%=sd.getGender()%>">
<br><br>
<label>Email id : </label>
<input type="email" name="doctor_email" value="<%=sd.getDoctor_email()%>">
<br><br>
<input type="hidden" name="doctor_password" value="<%=sd.getDoctor_password()%>">

<label>Mobile Number : </label>
<input type="text" name="doctor_phone" value="<%=sd.getDoctor_phone()%>">
<br><br>
<label>Specialisation : </label>
<select name="doctor_specialisation" >
<option value="<%=sd.getDoctor_specialisation()%>"><%=sd.getDoctor_specialisation()%></option>
<option value ="BLOOD TEST">Blood Test</option>
<option value ="URINE TEST">Urine Test</option>
</select>
<br><br>
<label>Experience in years : </label>
<input type="text" name="doctor_experience" value="<%=sd.getDoctor_experience()%> ">
<br><br>
<label>Address : </label>
<input type="text" name="doctor_address" value="<%=sd.getDoctor_address()%> ">
<br><br>
<input type="Submit" value="Update">
<%} %>
</form>
</body>
</html>