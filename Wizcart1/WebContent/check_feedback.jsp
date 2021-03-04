<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback page</title>
</head>
<body>

	<%@include file="connect.jsp"%>
	<%
		String pages = request.getParameter("page");
	if (pages.equals("eventplanner")) {
	%>
	<%@include file="eventplanner.jsp"%>
	<h1 align="center">Welcome to Check FeedBack Page</h1>
	<div class="container">
		<table class="table table-bordered table-info">
			<thead>
				<tr>
					<td>Event Id</td>
					<td>Event Name</td>
					<td>Date and Time</td>
					<td>Coordinator name</td>
					<td>FeedBack given by</td>
					<td>Roll Number</td>
					<td>Rating</td>
					<td>FeedBack</td>
					<td>Suggestions</td>
				</tr>
			</thead>
			<%
				String cname = (String) session.getAttribute("pname");
			ps = con.prepareStatement("select * from feedback where coordinatorname=?");
			ps.setString(1, cname);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getString("feid")%></td>
				<td><%=rs.getString("ename")%></td>
				<td><%=rs.getString("datetime")%></td>
				<td><%=rs.getString("coordinatorname")%></td>
				<td><%=rs.getString("personname")%></td>
				<td><%=rs.getString("rollnumber")%></td>
				<td><%=rs.getString("rating")%></td>
				<td><%=rs.getString("feedback")%></td>
				<td><%=rs.getString("suggestions")%></td>

			</tr>
			<%
				}
			} else {
			%>
			<%@include file="eventplanner.jsp"%>
			<h1 align="center">Welcome to Check FeedBack Page</h1>
			<div class="container">
				<table class="table table-bordered table-info">
					<thead>
						<tr>
							<td>Event Id</td>
							<td>Event Name</td>
							<td>Date and Time</td>
							<td>Coordinator name</td>
							<td>FeedBack given by</td>
							<td>Roll Number</td>
							<td>Rating</td>
							<td>FeedBack</td>
							<td>Suggestions</td>
						</tr>
					</thead>
					<%
						ps = con.prepareStatement("select * from feedback ");

					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
					%>
					<tr>
						<td><%=rs.getString("feid")%></td>
						<td><%=rs.getString("ename")%></td>
						<td><%=rs.getString("datetime")%></td>
						<td><%=rs.getString("coordinatorname")%></td>
						<td><%=rs.getString("personname")%></td>
						<td><%=rs.getString("rollnumber")%></td>
						<td><%=rs.getString("rating")%></td>
						<td><%=rs.getString("feedback")%></td>
						<td><%=rs.getString("suggestions")%></td>

					</tr>
					<%
						}
					}
					%>
				</table>
			</div>
</body>
</html>