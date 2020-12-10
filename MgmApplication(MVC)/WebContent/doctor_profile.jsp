<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOMEPAGE</h1></center>
<br><br><br>
<center>
<a href="Doctor_Home.html">Home</a> |
<a href="view_appointment.jsp">Check Appointments</a> |
<a href="index.html">Logout</a> 
</center>
<br><br><br>
<%@page import ="com.motivity.DoctorRegisterBean"%>
<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr><td>Doctor Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Specialisation</td><td>Date_Of_Birth</td><td>Timings</td><td>Experience</td></tr>
<%
DoctorRegisterBean dr=(DoctorRegisterBean)session.getAttribute("doctorDetails");
%>
<tr>
<td><%=dr.getId()%></td>
<td><%=dr.getDname() %></td>
<td><%=dr.getEmail() %></td>
<td><%=dr.getPhone() %></td>
<td><%=dr.getSpecialisation() %></td>
<td><%=dr.getDate_of_birth() %></td>
<td><%=dr.getTimings() %></td>
<td><%=dr.getExperience() %></td>
</tr>
</table><br><br>
<a href="update_doctor_profile.jsp? id=<%=dr.getId()%>"><center>update profile</center></a>
</body>
</html>