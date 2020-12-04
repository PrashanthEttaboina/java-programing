<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br><br>
<center><h1>WELCOME TO PATIENT HOMEPAGE</h1>
<br><br>
<a href="Patient_Home.html">Home</a> |
<a href="patient_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br><br><br>
</center>
<%@ include file = "connection.jsp" %>
<table border="2" align="center" width="600" height="100" cellpadding="20">
<tr><td>Patient Id</td><td>Name</td><td>Email</td><td>Phone</td><td>Age</td><td>Gender</td><td>Prescription</td><td>BloodGroup</td></tr>
<%
String patient_id=(String)session.getAttribute("aid");
ps=con.prepareStatement("select * from patient where patient_id = ?");
ps.setString(1,patient_id);
ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>
<tr>
<td><%=rs.getInt("patient_id") %></td>
<td><%=rs.getString("name") %></td>
<td><%=rs.getString("email") %></td>
<td><%=rs.getString("phone") %></td>
<td><%=rs.getInt("age") %></td>
<td><%=rs.getString("gender") %></td>
<td><%=rs.getString("prescription") %></td>
<td><%=rs.getString("blood_group") %></td>
<td><a href="update_patient_profile.jsp?id=<%=rs.getInt(1)%>">Update Profile</a></td>
</tr>
<%} %>
</body>
</html>