<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br>
<center><h1>WELCOME TO DOCTOR APPOINTMENT PAGE</h1></center>
<br>
<a href="Doctor_Home.html">Home</a> |
<a href="doctor_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br><br><br>
<%@include file="connection.jsp" %>
<table border="2" width="700" height="200" cellpadding="20" align ="center">
<tr><td>Patient Name</td><td>Phone Number</td><td>Email</td><td>Gender</td><td>Blood Group</td><td>Specialist</td><td>Date of Appointment</td>
<td>Time of Appointment</td><td>Status</td><td>Doctor Name</td><td>Action</td></tr>
<%
String specialist=(String)session.getAttribute("specialisation");
ps=con.prepareStatement("select * from appointment where specialist=?");
ps.setString(1,specialist);
ResultSet rs=ps.executeQuery();
while(rs.next()){
%> 
<tr>

<td><%=rs.getString("patient_name") %></td>
<td><%=rs.getInt("phone") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("gender") %></td>
<td><%=rs.getString("blood_group") %></td>
<td><%=rs.getString("specialist") %></td>
<td><%=rs.getString("date_of_appointment") %></td>
<td><%=rs.getString("time_of_appointment") %></td>
<td><%=rs.getString(10) %></td>
<td><%=rs.getString(11) %></td>
<% if(rs.getString(10).equalsIgnoreCase("Accepted")) {%>
<td>Accepted</td>
<%} else {%>
<td><a href="accept.jsp?id=<%=rs.getInt(1) %>">Accept</a></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>