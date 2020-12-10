<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE PROFILE</h1></center>
<br><br><br>
<a href="Employee_Home.html">Home</a> |
<a href="index.html">Logout</a> 
<br><br><br>
<%@ page import="com.mlabs.EmployeeRegisterBean"%>
<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr><td>Employee Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Department</td><td>Designation</td><td>Gender</td><td>Salary</td>
<td>Date of Joining</td></tr>
<%
EmployeeRegisterBean er=(EmployeeRegisterBean)session.getAttribute("EmployeeDetails");
%>
<tr>
<td><%=er.getEmp_id() %></td>
<td><%=er.getName() %></td>
<td><%=er.getEmail() %></td>
<td><%=er.getPhone() %></td>
<td><%=er.getDepartment()%></td>
<td><%=er.getDesignation()%></td>
<td><%=er.getGender()%></td>
<td><%=er.getSalary()%></td>
<td><%=er.getDate_of_joining()%></td>
</tr>
</table><br><br>
<a href="update_employee_profile.jsp?id=<%=er.getEmp_id()%>"><center>Update Profile</center></a>
</body>
</html>