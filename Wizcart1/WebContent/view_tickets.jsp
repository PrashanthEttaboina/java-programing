<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="student.jsp"%>

	<h1 align="center">Welcome to View Tickets Page</h1>
	<div class="container">
		<table class="table table-bordered table-info">
			<thead>
				<tr>
					<td>Event Name</td>
					<td>Date and Time</td>
					<td>Action</td>
				</tr>
			</thead>
			<%@include file="connect.jsp"%>
			<%
			String sname=(String)session.getAttribute("sname");
			ps=con.prepareStatement("select * from eventregister where rname=?");
			ps.setString(1, sname);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			%>
			<tr>
				<td><%=rs.getString("ename") %></td>
				<td><%=rs.getString("datetime") %></td>
				<td>
				<a href="ticket_details.jsp?id=<%=rs.getInt("rid") %>" class="btn btn-primary">View Ticket</a></td>
			</tr>
			<%} %>
		</table>
	</div>
</body>
</html>