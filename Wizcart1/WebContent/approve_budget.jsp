<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Approve Budget</title>
</head>
<body>

	<%@include file="admin.jsp"%>
	<%@include file="connect.jsp"%>
	<%
		int bid = Integer.parseInt(request.getParameter("id"));
	ps = con.prepareStatement("select * from budget where bid=?");
	ps.setInt(1, bid);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
	
	%>
	<h1 align="center">Welcome to Admin Approve Budget Page</h1>
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
				<td>Amount Sanctioned</td>

				<td><%=rs.getString("amount")%></td>
			</tr>
			
			<tr>
				<td>Approve or Reject</td>
				<td><a
					href="./descide_budget.jsp?id=<%=rs.getInt("bid")%>&eid=<%=rs.getInt("feid") %>&descide=approve"
					class="btn btn-primary">Approve</a> &nbsp;&nbsp;/&nbsp;&nbsp; <a
					class="btn btn-primary"
					href="./decide_budget.jsp?id=<%=rs.getInt("bid")%>&eid=<%=rs.getInt("feid") %>&descide=reject">reject</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>