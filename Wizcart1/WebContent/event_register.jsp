<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<%@include file="student.jsp"%>
	<h1 align="center">Welcome to Student Register Page</h1>
	<br>
	<%@include file="connect.jsp"%>
	<%
		int id = Integer.parseInt(request.getParameter("id"));
	ps = con.prepareStatement("select * from events where eid=?");
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
	if (rs.next()) {
		ResultSet rs1 = (ResultSet) session.getAttribute("student");
	%>
	<h3 align="center"><%=rs.getString("ename")%></h3>
	<div class="container-fulid">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-4">
				<div class="card">
					<div class="card-body">
						<form action="./event_register" method="post" enctype="multipart/form-data">
							<div class="form-group">
								Name: <input type="text" name="rname" class="form-control"
									value="<%=rs1.getString("sname")%>" readonly="readonly">
							</div>
							<div class="form-group">
								Branch: <input type="text" name="branch" class="form-control"
									value="<%=rs1.getString("branch")%>" readonly="readonly">
							</div>
							<div class="form-group">
								Rollno: <input type="text" name="rollno" class="form-control"
									value="<%=rs1.getString("rollno")%>" readonly="readonly">
							</div>
							<div class="form-group">
								Email: <input type="email" class="form-control" name="email"
									value="<%=rs1.getString("email")%>" readonly="readonly">
							</div>
							<div class="form-group">
								Phone: <input type="number" name="phone" class="form-control"
									value="<%=rs1.getString("phone")%>" readonly="readonly">
							</div>
							
							<div class="form-group">
								Permission letters: <input type="file" name="file"
									required="required">
							</div>
							<input type="hidden" name="feid" value="<%=rs.getString("eid")%>">
							<input type="hidden" name="ename" value="<%=rs.getString("ename")%>">
							<input type="hidden" name="datetime" value="<%=rs.getString("datetime")%>">
							<input type="hidden" name="coordinatorname" value="<%=rs.getString("coordinatorname") %>">
							<center>
								<input type="submit" class="btn btn-primary" value="register">
							</center>														
							
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%
		}
	%>
</body>
</html>