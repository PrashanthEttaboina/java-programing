<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br><br>
<center><h1>WELCOME TO MANAGER PROFILE</h1></center>
<br><br><br>
<a href="Manager_Home.html">Home</a> |
<a href="index.html">Logout</a> 
<br><br><br>
<%@ page import="com.mlabs.ManagerRegisterBean"%>
<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr><td>Manager Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Department</td><td>Gender</td><td>Age</td><td>Salary</td><td>Experience</td></tr>
<%
ManagerRegisterBean mr=(ManagerRegisterBean)session.getAttribute("ManagerDetails");
%>
<tr>
<td><%=mr.getMid()%></td>
<td><%=mr.getName()%></td>
<td><%=mr.getEmail() %></td>
<td><%=mr.getPhone()%></td>
<td><%=mr.getDepartment()%></td>
<td><%=mr.getGender()%></td>
<td><%=mr.getAge()%></td>
<td><%=mr.getSalary()%></td>
<td><%=mr.getExperience()%></td>
</tr>
</table><br><br>
<a href="update_manager_profile.jsp?id=<%=mr.getMid()%>"><center>Update Profile</center></a>
</body></html>