<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<center><h2>WELCOME TO PATHOLOGIST APPOINTMENT PAGE</h2></center>
<br><br><center>
<a href="pathologist_home.jsp">Home</a> |
<a href="index.html">Log-Out</a><br><br><br>
</center>
<%@page import="javax.servlet.http.HttpSession,com.pojo.Pathologist,com.main.PathologistBean,com.main.BloodTestBean,com.pojo.BloodTest,java.util.*" %>
<table border="2" align="center" width="600" height="30" cellpadding="20">
<tr>
<td>Test Id</td>
<td>Patient Id</td>
<td>Patient Name</td>
<td>Gender</td>
<td>Date-Of-Birth</td>
<td>Phone</td>
<td>Test Type</td>
<td>Referred By Doctor</td>
<td>Date and Time</td>
<td>Action</td>
</tr>
<%
String specialisation=(String)session.getAttribute("specialisation");
if(specialisation.equalsIgnoreCase("Blood test"))
{
	List<BloodTest> bl=BloodTestBean.viewBloodTests();
	Iterator<BloodTest> i=bl.iterator();
	while(i.hasNext())
	{

	 	BloodTest sd=i.next();
%>
		<tr>
			<td><%=sd.getBid() %></td>
			<td><%=sd.getPat_id() %></td>
			<td><%=sd.getPatient_name() %></td>
			<td><%=sd.getPatient_gender() %></td>
			<td><%=sd.getDate_of_birth() %></td>
			<td><%=sd.getPatient_phone() %></td>
			<td><%=sd.getTest_type() %></td>
			<td><%=sd.getReferred_by_doctor() %></td>
			<td><%=sd.getDate_and_time() %></td>
			<td><a href="generate_blood_report.jsp?id=<%=sd.getBid()%>">Generate Report</a></td>
		</tr></table>
		<br><br><br>
		<%
		} 
} %>



</body>
</html>