<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<center><h2>WELCOME TO PATHOLOGIST PROFILE PAGE</h2></center>
<br><br><center>
<a href="view_test_appointments.jsp">View Test Appointments</a> |
<a href="index.html">Log-Out</a><br><br><br>
</center>
<%@page import="com.pojo.Pathologist,com.main.PathologistBean,java.util.*" %>
<table border="2" align="center" width="600" height="30" cellpadding="20">
<tr>
<td>Lab Doctor Id</td>
<td>Name</td>
<td>Gender</td>
<td>Email</td>
<td>Phone</td>
<td>Specialisation</td>
<td>Experience</td>
<td>Address</td>
</tr>

<%
int id=(Integer)session.getAttribute("pathologist_id");
List<Pathologist> pa=PathologistBean.getById(id);
Iterator<Pathologist> i=pa.iterator();
while(i.hasNext())
{

 	Pathologist sd=i.next();
 	%>
	<tr>
		<td><%=sd.getLab_doctor_id() %></td>
		<td><%=sd.getDoctor_name() %></td>
		<td><%=sd.getGender() %></td>
		<td><%=sd.getDoctor_email() %></td>
		<td><%=sd.getDoctor_phone() %></td>
		<td><%=sd.getDoctor_specialisation() %></td>
		<td><%=sd.getDoctor_experience() %></td>
		<td><%=sd.getDoctor_address() %></td>
	</tr></table>
	<br><br><br>
	<a href="update_pathologist_profile.jsp? id=<%=sd.getLab_doctor_id()%>"><center>update profile</center></a>	
<% } %>
</body>
</html>