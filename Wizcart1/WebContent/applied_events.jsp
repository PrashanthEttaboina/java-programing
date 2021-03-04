<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="admin.jsp"%>

	<h1 align="center">Welcome to View Event Page</h1>
	<div class="container">
		<table class="table table-bordered table-info">
			<thead>
				<tr>
					<td>Forum Name</td>
					<td>Event Name</td>
					<td>Date and Time</td>
					<td>Venue</td>
					<td>Coordinator Name</td>
					<td>Facility Required</td>
					<td>Action</td>
				</tr>
			</thead>
			<%@include file="connect.jsp"%>
			<%
			ps=con.prepareStatement("select * from events where status=?");
			ps.setString(1, "none");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			%>
			<tr>
				<td><%=rs.getString("fname") %></td>
				<td><%=rs.getString("ename") %></td>
				<td><%=rs.getString("datetime") %></td>
				<td><%=rs.getString("venue") %></td>
				<td><%=rs.getString("coordinatorname") %></td>
				<td><%=rs.getString("facilityrequired") %></td>
				<td><a href="approve_event.jsp?id=<%=rs.getInt("eid") %>" class="btn btn-primary">view</a></td>
			</tr>
			<%} %>
		</table>
	</div>
</body>
</html>