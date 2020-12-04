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
<%@ include file="connection.jsp" %>
<%
int emp_id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from employee where emp_id=?");
ps.setInt(1,emp_id);
ResultSet rs=ps.executeQuery();
if(rs.next()){
%>
<form action="./employee_profile_update.jsp" align ="center">
<br>
<input type="hidden" name="emp_id" value="<%=rs.getString("emp_id")%>">
<label>Name : </label>
<input type="text" name="name" value="<%=rs.getString("name")%>"><br><br>
<label>email : </label>
<input type="email" name="email" value="<%=rs.getString("email")%>"><br><br>
<label>Phone : </label>
<input type="number" name="phone" value="<%=rs.getString("phone")%>"><br><br>
<label>Select Department : </label>
<select name="department">
<option value="<%=rs.getString("department")%>"><%=rs.getString("department")%></option>
<option value="Development">Development</option>
<option value="Testing">Testing</option>
<option value="Architecture">Architecture</option>
<option value="Management">Management</option>
</select><br><br>
<label>Designation : </label>
<input type="text" name="designation" value="<%=rs.getString("designation")%>"><br><br>
<label>Select Gender : </label>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<br><br>
<label>Enter Salary :</label>
<input type="number" name="salary" value="<%=rs.getString("salary")%>"><br><br>
<label>Date of Joining</label>
<input type="date" name="date_of_joining" value="<%=rs.getString("date_of_joining")%>"><br><br>
<input type="submit" value="Update">
<br><br><br>
</form>
<%}%>