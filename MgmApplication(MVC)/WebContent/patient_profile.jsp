<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br>
<center><h1>WELCOME TO PATIENT HOMEPAGE</h1>
<br><br>
<a href="Patient_Home.html">Home</a> |
<a href="patient_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br><br><br>
</center>
<%@ page import ="com.motivity.PatientRegisterBean" %>
<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr><td>Patient Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Age</td><td>Gender</td><td>Prescription</td><td>BloodGroup</td></tr>
<%
PatientRegisterBean pr=(PatientRegisterBean)session.getAttribute("patientDetails");
%>
<tr>
<td><%=pr.getPatient_id() %></td>
<td><%=pr.getName() %></td>
<td><%=pr.getEmail() %></td>
<td><%=pr.getPhone()%></td>
<td><%=pr.getAge()%></td>
<td><%=pr.getGender()%></td>
<td><%=pr.getPrescription()%></td>
<td><%=pr.getBlood_group()%></td>
</tr>
</table>
<br><br>
<a href="update_patient_profile.jsp?id=<%=pr.getPatient_id()%>"><center>Update Profile</center></a>
</body>
</html>