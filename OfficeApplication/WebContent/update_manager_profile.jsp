<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br>
<center><h1>WELCOME TO EMPLOYEE PROFILE UPDATE PAGE</h1>
<br>
<a href="Manager_Home.html">Home</a> |
<a href="manager_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br>
</center>
<%@ include file="connection.jsp" %>
<%
int mid=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from manager where mid=?");
ps.setInt(1,mid);
ResultSet rs=ps.executeQuery();
if(rs.next()){
%>
<form action="./manager_profile_update.jsp" align ="center">
<br>
<input type="hidden" name="mid" value="<%=rs.getString("mid")%>">
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
<label>Select Gender : </label>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<br><br>
<label>Age : </label>
<input type="number" name="age" value="<%=rs.getString("age")%>"><br><br>

<label>Enter Salary :</label>
<input type="number" name="salary" value="<%=rs.getString("salary")%>"><br><br>
<label>Experience :</label>
<input type="text" name="experience" value="<%=rs.getString("experience")%>"><br><br>
<input type="submit" value="Update">
<br><br><br>
</form>
<%}%>