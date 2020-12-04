<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br><br>
<center><h1>WELCOME TO DOCTOR HOMEPAGE</h1></center>
<br><br><br>
<a href="Doctor_Home.html">Home</a> |
<a href="doctor_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br><br><br>
<%@ include file="connection.jsp" %>
<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr><td>Doctor Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Specialisation</td><td>Date_Of_Birth</td><td>Timings</td><td>Experience</td></tr>
<%
String doctor_id=(String)session.getAttribute("id");
ps=con.prepareStatement("select * from doctor where doctor_id = ?");
ps.setString(1,doctor_id);
ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>
<tr>
<td><%=rs.getInt("doctor_id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("phone") %></td>
<td><%=rs.getString("specialisation") %></td>
<td><%=rs.getString("date_of_birth") %></td>
<td><%=rs.getString("timings") %></td>
<td><%=rs.getString("experience") %></td>
<td><a href="update_doctor_profile.jsp?id=<%=rs.getInt(1)%>">Update Profile</a></td>
</tr>
<%} %>
</body>
</html>