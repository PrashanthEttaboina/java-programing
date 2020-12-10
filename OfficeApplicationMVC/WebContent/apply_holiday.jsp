<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br>
<center><h1>WELCOME TO HOLIDAY APPOINTMENT PAGE</h1></center>
<br>
<a href="Employee_Home.html">Home</a> |
<a href="employee_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<%@ page import ="com.mlabs.EmployeeRegisterBean"%>
<%
EmployeeRegisterBean er=(EmployeeRegisterBean)session.getAttribute("EmployeeDetails");
if(er!=null){
%>
<form action="./apply_holiday" method="post" align="center">
<label>Employee Name :</label>
<input type="text" name="name"  value="<%=er.getName()%>"><br><br>
<label>Email id :</label>
<input type="email" name="email"  value="<%=er.getEmail()%>"><br><br>
<label>Mobile Number :</label>
<input type="number" name="phone"  value="<%=er.getPhone()%>"><br><br>

<label>Select Department : </label>
<select name="department">
<option value="<%=er.getDepartment()%>"><%=er.getDepartment()%></option>
<option value="Development">Development</option>
<option value="Testing">Testing</option>
<option value="Architecture">Architecture</option>
<option value="Management">Management</option>
</select><br><br>
<label>Enter number of Holidays : </label>
<input type="number" name="no_of_holidays" value="Enter days"><br><br>
<label>Enter starting Date : </label>
<input type="date" name="holiday_begin_date" value="Enter date">
<br><br><br>
<input type="submit" value ="Apply">
</form>
<%} %>
</body>
</html>