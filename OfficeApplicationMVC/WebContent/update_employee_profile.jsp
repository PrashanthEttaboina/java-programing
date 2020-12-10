<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br>
<center><h1>WELCOME TO EMPLOYEE PROFILE UPDATE PAGE</h1>
<br>
<a href="Employee_Home.html">Home</a> |
<a href="employee_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br>
</center>
<%@ page import ="com.mlabs.EmployeeRegisterBean"%>
<%
EmployeeRegisterBean er=(EmployeeRegisterBean)session.getAttribute("EmployeeDetails");
if(er!=null){
%>
<form action="./update_employee_profile" method="post" align ="center">
<br>
<input type="hidden" name="emp_id" value="<%=er.getEmp_id()%>">
<label>Name : </label>
<input type="text" name="name" value="<%=er.getName()%>"><br><br>
<label>email : </label>
<input type="email" name="email" value="<%=er.getEmail()%>"><br><br>
<label>Phone : </label>
<input type="number" name="phone" value="<%=er.getPhone()%>"><br><br>
<label>Select Department : </label>
<select name="department">
<option value="<%=er.getDepartment()%>"><%=er.getDepartment()%></option>
<option value="Development">Development</option>
<option value="Testing">Testing</option>
<option value="Architecture">Architecture</option>
<option value="Management">Management</option>
</select><br><br>
<label>Designation : </label>
<input type="text" name="designation" value="<%=er.getDesignation()%>"><br><br>
<label>Select Gender : </label>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<br><br>
<label>Enter Salary :</label>
<input type="number" name="salary" value="<%=er.getSalary()%>"><br><br>
<label>Date of Joining</label>
<input type="date" name="date_of_joining" value="<%=er.getDate_of_joining()%>"><br><br>
<input type="submit" value="Update">
<br><br><br>
</form>
<%}%>
</body></html>