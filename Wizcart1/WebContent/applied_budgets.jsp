<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Event Budget </title>
</head>
<body>
	<%@include file="admin.jsp"%>

	<h1 align="center">Welcome to View  Event Budget Page</h1>
	<div class="container">
		<table class="table table-bordered table-info">
			<thead>
				<tr>
					<td>Forum Name</td>
					<td>Event Name</td>
					<td>Date and Time</td>
					<td>Amount Sanctioned</td>
					<td>Approved By</td>
					<td>Action</td>
				</tr>
			</thead>
			<%@include file="connect.jsp"%>
			<%
			ps=con.prepareStatement("select * from budget where status=?");
			ps.setString(1, "none");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			%>
			<tr>
				<td><%=rs.getString("fname") %></td>
				<td><%=rs.getString("ename") %></td>
				<td><%=rs.getString("datetime") %></td>
				<td><%=rs.getString("amount") %></td>
				<td><%=rs.getString("approvedby") %></td>
				
				<td><a href="approve_budget.jsp?id=<%=rs.getInt("bid") %>" class="btn btn-primary">View</a></td>
			</tr>
			<%} %>
		</table>
	</div>
</body>
</html>