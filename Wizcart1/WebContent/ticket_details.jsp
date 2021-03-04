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

	<h1 align="center">Welcome to Ticket details Page</h1>
	<%@include file="connect.jsp"%>
	<%int id=Integer.parseInt(request.getParameter("id"));
			ps=con.prepareStatement("select * from eventregister where rid=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				String file=request.getServletContext().getInitParameter("file-download")+rs.getString("filename"); 
	%>
	<h3 align="center"><%=rs.getString("ename") %></h3>
	<div class="container">
		<table class="table table-bordered table-info">
			<tr>
				<td>Name:</td>
				<td><%=rs.getString("rname")%></td>
			</tr>
			<tr>
				<td>Branch:</td>
				<td><%=rs.getString("branch")%></td>
			</tr>
			<tr>
				<td>Roll Number</td>
				<td><%=rs.getString("rollno")%></td>
			</tr>
			
			<tr>
				<td>Permmision letter</td>
				<td><a href="<%=file%>" download class="btn btn-primary">Download letter</a></td>
			</tr>
		</table>
	</div>
	<%} %>
</body>
</html>