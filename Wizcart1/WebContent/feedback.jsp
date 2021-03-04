<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback List</title>
</head>
<body>
	<%@include file="student.jsp"%>
	<%@include file="connect.jsp"%>
	<h1 align="center">Welcome to Feedback Page</h1>
	<div class="container">
		<table class="table table-bordered table-info">
			<thead>
				<tr>
					<td>Event Id</td>
					<td>Event Name</td>
					<td>Coordinator Name</td>
					<td>Date and Time</td>
					<td>Feedback Status</td>
					<td>Action</td>
				</tr>
			</thead>
			<%
				String sname = (String) session.getAttribute("sname");
			ps = con.prepareStatement("select * from eventregister where rname=?");
			ps.setString(1, sname);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getInt("feid") %></td>
				<td><%=rs.getString("ename")%></td>
				<td><%=rs.getString("coordinatorname")%></td>
				<td><%=rs.getString("datetime")%></td>
				<td><%=rs.getString("feedback")%></td>
				<% if(rs.getString("feedback").equals("not given"))
					{%>
				<td><a href="give_feedback.jsp?id=<%=rs.getInt("feid")%>"
					class="btn btn-primary">Give FeedBack</a></td>
					<%} 
					else
					%><td>Given Feedback</td>
			</tr>
			<%
			}
			%>
			</table>		
</body>
</html>