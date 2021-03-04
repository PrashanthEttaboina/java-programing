<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Winner List</title>
</head>
<body>
	<%@include file="connect.jsp"%>
	<%
		String pages = request.getParameter("page");
	if (pages.equals("student")) {
	%>
	<%@include file="student.jsp"%>
	<h1 align="center">Welcome to Winner List Page</h1>
	<div class="container">
		<table class="table table-bordered table-info">
			<thead>
				<tr>

					<td>Winner name(Event Planner)</td>
					<td>Average Rating for 5star</td>
				</tr>
			</thead>
			<%
				ps = con.prepareStatement(
					"select coordinatorname,avg(rating) as avg_rating from feedback group by coordinatorname order by avg(rating) desc limit 3");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getString("coordinatorname")%></td>
				<td><%=rs.getString("avg_rating")%></td>

			</tr>
			<%
				}
			} else if (pages.equals("eventplanner")) {
			%>
			<%@include file="eventplanner.jsp"%>
			<h1 align="center">Welcome to Winner List Page</h1>
			<div class="container">
				<table class="table table-bordered table-info">
					<thead>
						<tr>

							<td>Winner name(Event Planner)</td>
							<td>Average Rating for 5 star</td>
						</tr>
					</thead>
					<%
						ps = con.prepareStatement(
							"select coordinatorname,avg(rating) as avg_rating from feedback group by coordinatorname order by avg(rating) desc limit 3");
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
					%>
					<tr>
						<td><%=rs.getString("coordinatorname")%></td>
						<td><%=rs.getString("avg_rating")%></td>

					</tr>
					<%
						}
					}

					else {
					%>
					<%@include file="admin.jsp"%>
					<h1 align="center">Welcome to Winner List Page</h1>
					<div class="container">
						<table class="table table-bordered table-info">
							<thead>
								<tr>

									<td>Winner name(Event Planner)</td>
									<td>Average Rating for 5 star</td>
								</tr>
							</thead>
							<%
								ps = con.prepareStatement(
									"select coordinatorname,avg(rating) as avg_rating from feedback group by coordinatorname order by avg(rating) desc limit 3");
							ResultSet rs = ps.executeQuery();
							while (rs.next()) {
							%>
							<tr>
								<td><%=rs.getString("coordinatorname")%></td>
								<td><%=rs.getString("avg_rating")%></td>

							</tr>
							<%
								}
							}
							%>
						
</body>
</html>