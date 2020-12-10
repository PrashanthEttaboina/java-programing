<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br>
<center><h1>WELCOME TO MANAGER PROFILE UPDATE PAGE</h1>
<br>
<a href="Manager_Home.html">Home</a> |
<a href="manager_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br>
</center>
<%@ page import="com.mlabs.ManagerRegisterBean"%>
<%
ManagerRegisterBean mr=(ManagerRegisterBean)session.getAttribute("ManagerDetails");
if(mr!=null){
%>
<form action="./update_manager_profile" method="post" align ="center">
<br>
<input type="hidden" name="mid" value="<%=mr.getMid()%>">
<label>Name : </label>
<input type="text" name="name" value="<%=mr.getName()%>"><br><br>
<label>email : </label>
<input type="email" name="email" value="<%=mr.getEmail()%>"><br><br>
<label>Phone : </label>
<input type="number" name="phone" value="<%=mr.getPhone()%>"><br><br>
<label>Select Department : </label>
<select name="department">
<option value="<%=mr.getDepartment()%>"><%=mr.getDepartment()%></option>
<option value="Development">Development</option>
<option value="Testing">Testing</option>
<option value="Architecture">Architecture</option>
<option value="Management">Management</option>
</select><br><br>
<label>Select Gender : </label>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<br><br>
<label>Age : </label>
<input type="number" name="age" value="<%=mr.getAge()%>"><br><br>

<label>Enter Salary :</label>
<input type="number" name="salary" value="<%=mr.getSalary()%>"><br><br>
<label>Experience :</label>
<input type="text" name="experience" value="<%=mr.getExperience()%>"><br><br>
<input type="submit" value="Update">
<br><br><br>
</form>
<%}%>
</body></html>