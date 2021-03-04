<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#profile {
	width: 100px;
	height: 100px;
}
</style>
</head>
<body>
	<%@include file="student.jsp"%>

	<h1 align="center">Welcome to Event details Page</h1>
	<%@include file="connect.jsp"%>
	<%int id=Integer.parseInt(request.getParameter("id"));
			ps=con.prepareStatement("select * from events where eid=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
	%>
	<div class="container">
		<table class="table table-bordered table-info">
			<tr>
				<td>Forum Name:</td>
				<td><%=rs.getString("fname")%></td>
			</tr>
			<tr>
				<td>Event Name:</td>
				<td><%=rs.getString("ename")%></td>
			</tr>
			<tr>
				<td>Date And Time</td>
				<td><%=rs.getString("datetime")%></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><%=rs.getString("description")%></td>
			</tr>
			<tr>
				<td>Registration link</td>
				<%String sname=(String)session.getAttribute("sname"); 
				ps=con.prepareStatement("select * from eventregister where feid=? and rname=?");
				ps.setInt(1, id);
				ps.setString(2,sname);
				ResultSet rs1=ps.executeQuery();
				if(rs1.next()){
					if(rs1.getString("ticket").equals("ticket generated"))
						%><td>Already Registered</td>
				<% }else{
				%>
				<td><a href="event_register.jsp?id=<%=rs.getInt("eid")%>" class="btn btn-primary">Register</a></td>
				<%} %>
			</tr>
		</table>
	</div>
	<%} %>
</body>
</html>