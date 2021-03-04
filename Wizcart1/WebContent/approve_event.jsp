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
	<%@include file="connect.jsp"%>
	<%
		int eid = Integer.parseInt(request.getParameter("id"));
	ps = con.prepareStatement("select * from events where eid=?");
	ps.setInt(1, eid);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	%>
	<h1 align="center">Welcome to Admin Approve Event Page</h1>
	<div class="container">
		<table class="table table-bordered table-info">

			<tr>
				<td>Forum Name</td>
				<td><%=rs.getString("fname")%></td>
			</tr>
			<tr>
				<td>Event Name</td>
				<td><%=rs.getString("ename")%></td>
			</tr>
			<tr>
				<td>Date and Time</td>
				<td><%=rs.getString("datetime")%></td>
			</tr>
			<tr>
				<td>Venue</td>

				<td><%=rs.getString("venue")%></td>
			</tr>
			<tr>
				<td>Coordinator Name</td>

				<td><%=rs.getString("coordinatorname")%></td>
			</tr>
			<tr>
				<td>Facility Required</td>
				<td><%=rs.getString("facilityrequired")%></td>
			</tr>
			<tr>
				<td>Approve or Reject</td>
				<td><a
					href="./descide_event.jsp?id=<%=rs.getInt("eid")%>&descide=approve"
					class="btn btn-primary">Approve</a> &nbsp;&nbsp;/&nbsp;&nbsp; <a
					class="btn btn-primary"
					href="./decide_event.jsp?id=<%=rs.getInt("eid")%>&descide=reject">reject</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>