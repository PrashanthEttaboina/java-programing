<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br>
<center><h1>WELCOME TO DOCTOR APPOINTMENT PAGE</h1></center>
<br>
<a href="Doctor_Home.html">Home</a> |
<a href="doctor_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br><br><br>
<%@page import="com.motivity.ViewAppointmentBean,java.util.*" %>
<table border="2" width="700" height="200" cellpadding="20" align ="center">
<tr><td>Patient Name</td><td>Phone Number</td><td>Email</td><td>Gender</td><td>Blood Group</td><td>Specialist</td><td>Date of Appointment</td>
<td>Time of Appointment</td><td>Status</td><td>Doctor Name</td><td>Action</td></tr>
<%
String specialist=(String)session.getAttribute("specialist");
List<ViewAppointmentBean> Alist=new ViewAppointmentBean().appointmentList(specialist);
Iterator i=Alist.iterator();
while(i.hasNext())
{
	ViewAppointmentBean va=(ViewAppointmentBean)i.next();
%> 
<tr>
<td><%=va.getPatient_name()%></td>
<td><%=va.getPhone() %></td>
<td><%=va.getEmail()%></td>
<td><%=va.getGender() %></td>
<td><%=va.getBlood_group()%></td>
<td><%=va.getSpecialist()%></td>
<td><%=va.getDate_of_appointment()%></td>
<td><%=va.getTime_of_appointment() %></td>
<td><%=va.getStatus()%></td>
<td><%=va.getDoctor_name()%></td>
<% if(va.getStatus().equalsIgnoreCase("Accepted")) {%>
<td>Accepted</td>
<%} else {%>
<td><a href="./accept?id=<%=va.getAid() %>">Accept</a></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>