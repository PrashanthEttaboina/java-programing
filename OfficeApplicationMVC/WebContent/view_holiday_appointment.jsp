<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br>
<center><h1>WELCOME TO MANAGER HOLIDAY APPOINTMENT PAGE</h1></center>
<br>
<a href="Manager_Home.html">Home</a> |
<a href="manager_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br><br><br>
<%@page import="com.mlabs.ViewHolidayAppointmentBean,java.util.*" %>
<table border="2" width="700" height="200" cellpadding="20" align ="center">
<tr><td>Holiday Id</td><td>Employee Name</td><td>Email</td><td>Phone Number</td><td>Department</td><td>No of Holidays</td><td>Holiday Begin Date</td>
<td>Status</td><td>Manager Name</td></tr>
<%
String department=(String)session.getAttribute("mdepartment");
List<ViewHolidayAppointmentBean> Alist=new ViewHolidayAppointmentBean().holidayList(department);
Iterator i=Alist.iterator();
while(i.hasNext())
{
	ViewHolidayAppointmentBean vh=(ViewHolidayAppointmentBean)i.next();
%> 
<tr>
<td><%=vh.getHid() %></td>
<td><%=vh.getName()%></td>
<td><%=vh.getEmail()%></td>
<td><%=vh.getPhone()%></td>
<td><%=vh.getDepartment() %></td>
<td><%=vh.getNo_of_holidays()%></td>
<td><%=vh.getHoliday_begin_date()%></td>
<td><%=vh.getStatus()%></td>
<td><%=vh.getManager_name()%></td>
<% if(vh.getStatus().equalsIgnoreCase("Accepted")) {%>
<td>Accepted</td>
<%} else {%>
<td><a href="./accept?id=<%=vh.getHid()%>">Accept</a></td>
<%} %>
</tr>
<%} %>
</table>
</body>
</html>