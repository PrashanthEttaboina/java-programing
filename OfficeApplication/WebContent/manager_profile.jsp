<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE PROFILE</h1></center>
<br><br><br>
<a href="Employee_Home.html">Home</a> |
<a href="index.html">Logout</a> 
<br><br><br>
<%@ include file="connection.jsp" %>
<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr><td>Manager Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Department</td><td>Gender</td><td>Age</td><td>Salary</td>
<td>Experience</td></tr>
<%
String mid=(String)session.getAttribute("id");
ps=con.prepareStatement("select * from manager where mid=?");
ps.setString(1,mid);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
<td><%=rs.getInt("mid") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("phone") %></td>
<td><%=rs.getString("department") %></td>
<td><%=rs.getString("gender") %></td>
<td><%=rs.getString("age") %></td>
<td><%=rs.getInt("salary") %></td>
<td><%=rs.getString("experience") %></td>
</tr>
</table><br><br><br>
<a href="update_manager_profile.jsp?id=<%=rs.getInt(1)%>"><center>Update Profile</center></a>
<%} %>