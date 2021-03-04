<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="eventplanner.jsp"%>

	<h1 align="center">Welcome to Approved Event Page</h1>
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
					<td>Status</td>
					<td>Budget Status</td>
					<td>Action</td>
				</tr>
			</thead>
			<%@include file="connect.jsp"%>
			<%
				String pname = (String) session.getAttribute("pname");
			ps = con.prepareStatement("select * from events where coordinatorname=?");
			ps.setString(1, pname);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getString("fname")%></td>
				<td><%=rs.getString("ename")%></td>
				<td><%=rs.getString("datetime")%></td>
				<td><%=rs.getString("venue")%></td>
				<td><%=rs.getString("coordinatorname")%></td>
				<td><%=rs.getString("facilityrequired")%></td>
				<td><%=rs.getString("status") %></td>
				<td><%=rs.getString("addbudget") %></td>
				<td>
					<%
						if (rs.getString("status").equals("Approved")){
							if(rs.getString("addbudget").equalsIgnoreCase("not added"))
							{
					%><a
					href="add_budget.jsp?id=<%=rs.getInt("eid")%>"
					class="btn btn-primary">Add Budget</a>
					<%}
							else
							{%>
								Budget Added
						<% 	}
						}else if(rs.getString("status").equals("none")){ %>
					Waiting for approval
					<%}else{ %>
					Rejected
					<%} %>
				</td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>