<!DOCTYPE html>
<html>
<body bgcolor="lightskyblue">
<br>
<center><h1>WELCOME TO APPOINTMENT STATUS PAGE</h1></center>
<br>
<a href="Employee_Home.html">Home</a> |
<a href="employee_profile.jsp">Profile</a> |
<a href="index.html">Logout</a> 
<br><br><br>
<%@page import="com.mlabs.ApplyHolidayBean,java.util.*" %>
<table border="2" width="700" height="200" cellpadding="20" align ="center">
<tr><td>Employee Name</td><td>Email</td><td>Phone Number</td><td>Department</td><td>No of Holidays</td><td>Holiday Begin Date</td>
<td>Status</td><td>Manager Name</td></tr>
<%
String emp_email=(String)session.getAttribute("emp_email");
List<ApplyHolidayBean> Alist=new ApplyHolidayBean().status(emp_email);
Iterator i=Alist.iterator();
while(i.hasNext())
{
	ApplyHolidayBean ah=(ApplyHolidayBean)i.next();
%> 
<tr>
<td><%=ah.getName()%></td>
<td><%=ah.getEmail()%></td>
<td><%=ah.getPhone() %></td>
<td><%=ah.getDepartment()%></td>
<td><%=ah.getNo_of_holidays()%></td>
<td><%=ah.getHoliday_begin_date()%></td>
<td><%=ah.getStatus()%></td>
<td><%=ah.getManager_name()%></td>
</tr>
<%} %>
</table>
</body>
</html>