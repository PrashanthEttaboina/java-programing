<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<center><h2>WELCOME TO (ADMIN)PATHOLOGISTS PROFILE PAGE</h2></center>
<br><br><center>
<a href="admin_home.html">Home</a>|
<a href="index.html">Log-Out</a><br><br><br>
</center>

<form action="view_pathologists.jsp" align="center">
Search By Specialisation: <input type="text" name="doctor_specialisation">

Or Search By Pathologist Name: <input type="text" name="doctor_name">
<input type="submit" value="search"><br>
<br><br>
</form>

<%@page import="com.pojo.Pathologist,com.main.PathologistBean,java.util.*" %>
<table border="2" align="center" width="100" height="20" cellpadding="10">
<tr>
<td>Lab Doctor Id</td>
<td>Name</td>
<td>Gender</td>
<td>Email</td>
<td>Phone</td>
<td>Specialisation</td>
<td>Experience</td>
<td>Address</td>
</tr>

<%
String specialisation=request.getParameter("doctor_specialisation");
String doctor_name=request.getParameter("doctor_name");
List<Pathologist> pa=null;
if((specialisation==null&&doctor_name==null)||(specialisation.equals("")&&doctor_name.equals("")))
{
	pa=PathologistBean.viewPathologists();

}
else
{
	pa=PathologistBean.search(specialisation,doctor_name);
}

Iterator<Pathologist> i=pa.iterator();
while(i.hasNext())
{
 	Pathologist sd=i.next();
 	%>
	<tr>
		<td><%=sd.getLab_doctor_id() %></td>
		<td><%=sd.getDoctor_name() %></td>
		<td><%=sd.getGender() %></td>
		<td><%=sd.getDoctor_email() %></td>
		<td><%=sd.getDoctor_phone() %></td>
		<td><%=sd.getDoctor_specialisation() %></td>
		<td><%=sd.getDoctor_experience() %></td>
		<td><%=sd.getDoctor_address() %></td>		
	</tr>	
	<% } %>
	</table>
</body>
</html>