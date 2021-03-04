<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Budget</title>
</head>
<body>
<%@include file="eventplanner.jsp"%>
	<h1 align="center">Welcome to Add Event Budget Page</h1>
	<br>
	<%@include file="connect.jsp"%>
	<% int feid=Integer.parseInt(request.getParameter("id"));
	ps=con.prepareStatement("select * from events where eid=?");
	ps.setInt(1, feid);
	
	ResultSet rs=ps.executeQuery();
	while(rs.next()){ %>
		
		<div class="container-fulid">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						
						<form action="./add_budget" method="post">
							<div class="form-group">
								Forum Name: <input type="text" class="form-control" name="fname"
									value="<%=rs.getString("fname")%>" readonly="readonly">
							</div>
							<div class="form-group">
								Event Name: <input type="text" class="form-control" name="ename"
									value="<%=rs.getString("ename")%>" readonly="readonly">
							</div>
							<div class="form-group">
								Date and Time: <input type="datetime-local" class="form-control" name="datetime"
									value="<%=rs.getString("datetime")%>" readonly="readonly">
							</div>
							<div class="form-group">
								Amount: <input type="number" class="form-control" name="amount"
									placeholder="Enter Amount ">
							</div>
							<input type="hidden" name="feid" value="<%=feid %>">	
							<center>
								<input type="submit" class="btn btn-primary" value="Add Budget">
							</center>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%}	%>	
</body>
</html>