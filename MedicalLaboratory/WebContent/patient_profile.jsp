<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<center><h2>WELCOME TO PATIENT PROFILE PAGE</h2></center>
<br><br><center>
<a href="view_test_status.jsp">View Test Status</a> |
<a href="patient_home.jsp">Home</a> |
<a href="index.html">Log-Out</a><br><br><br>
</center>
<%@page import="com.pojo.Patient,com.main.PatientBean,java.util.*" %>
<table border="2" align="center" width="600" height="30" cellpadding="20">
<tr>
<td>Patient Id</td>
<td>Name</td>
<td>Gender</td>
<td>Date-of-Birth</td>
<td>Email</td>
<td>Phone</td>
<td>Address</td>
</tr>
<%
int id=(Integer)session.getAttribute("patient_id");
List<Patient> pa=PatientBean.getById(id);
Iterator<Patient> i=pa.iterator();
while(i.hasNext())
{
 	Patient pt=i.next();
 	%>
	<tr>
		<td><%=pt.getPatient_id() %></td>
		<td><%=pt.getPatient_name() %></td>
		<td><%=pt.getPatient_gender() %></td>
		<td><%=pt.getDate_of_birth() %></td>
		<td><%=pt.getPatient_email() %></td>
		<td><%=pt.getPatient_phone() %></td>
		<td><%=pt.getPatient_address() %></td>
		
	</tr></table>
	<br><br><br>
	<a href="update_patient_profile.jsp? id=<%=pt.getPatient_id() %>"><center>update profile</center></a>	
<% } %>

</body>
</html>