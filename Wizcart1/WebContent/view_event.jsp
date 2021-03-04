<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
		String pages = request.getParameter("page");
	if (pages.equals("student")) {
	%>
			<%@include file="student.jsp"%>
			<h1 align="center">Welcome to Student View Event Page</h1>
			<div class="container">
			<table class="table table-bordered table-info">
			<thead>
				<tr>
					<td>Event Name</td>
					<td>Date and Time</td>
					<td>Venue</td>
					<td>Coordinator Name</td>
					<td>Action</td>
				</tr>
			</thead>
			<%@include file="connect.jsp"%>
			<%
			//String sname=(String)session.getAttribute("sname");
			ps=con.prepareStatement("select * from events where status=? and budgetstatus=?");
			ps.setString(1, "Approved");
			ps.setString(2, "Approved");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			%>
			<tr>
				<td><%=rs.getString("ename") %></td>
				<td><%=rs.getString("datetime") %></td>
				<td><%=rs.getString("venue") %></td>
				<td><%=rs.getString("coordinatorname") %></td>
				<td><a href="view_details.jsp?id=<%=rs.getInt("eid")%>"
					class="btn btn-primary">View</a></td>
			</tr>	
			<%} %>
			
			<%}else
				{
				%>
			<%@include file="eventplanner.jsp"%>
			<h1 align="center">Welcome to Event Planner View Event Page</h1>
			
			<div class="container">
			<table class="table table-bordered table-info">
			<thead>
				<tr>
					<td>Event Name</td>
					<td>Date and Time</td>
					<td>Venue</td>
					<td>Coordinator Name</td>
					<td>Action</td>
				</tr>
			</thead>
			<%@include file="connect.jsp"%>
			<%
			String pname=(String)session.getAttribute("pname");
			ps=con.prepareStatement("select * from events where coordinatorname=? and status=? and budgetstatus=?");
			ps.setString(1, pname);
			ps.setString(2, "Approved");
			ps.setString(3, "Approved");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			%>
			<tr>
				<td><%=rs.getString("ename") %></td>
				<td><%=rs.getString("datetime") %></td>
				<td><%=rs.getString("venue") %></td>
				<td><%=rs.getString("coordinatorname") %></td>
				<td>This is your event</td>
			</tr>
			<%}
			}%>

		</table>
	</div>
</body>
</html>