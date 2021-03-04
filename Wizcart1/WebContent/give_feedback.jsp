<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="student.jsp"%>
	<h1 align="center">Welcome to Give Feedback Page</h1>
	<br>
	<%@include file="connect.jsp"%>
	<%
		int id=Integer.parseInt(request.getParameter("id"));
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
						<form action="./give_feedback" method="post" >
							<div class="form-group">
								Name: <input type="text" name="personname" class="form-control"
									value="<%=rs1.getString("sname")%>" readonly="readonly">
							</div>
							
							<div class="form-group">
								Rate Us:  <input type="radio" name="rating" value="1">&nbsp;&nbsp;<label>1 star</label>
									<input type="radio" name="rating" value="2">&nbsp;&nbsp;<label>2 star</label>
									<input type="radio" name="rating" value="3">&nbsp;&nbsp;<label>3 star</label>
									<input type="radio" name="rating" value="4">&nbsp;&nbsp;<label>4 star</label>
									<input type="radio" name="rating" value="5">&nbsp;&nbsp;<label>5 star</label>									
							</div>
							<div class="form-group">
								Feedback: <textarea rows="3" cols="8" class="form-control" name="feedback" placeholder="Enter FeedBack"
								 required="required"></textarea>
							</div>
							<div class="form-group">
								Suggestions: <textarea rows="3" cols="8" class="form-control" name="suggestions" placeholder="Enter Suggestion"
								 required="required"></textarea>
							</div>
							<input type="hidden" name="feid" value="<%=rs.getString("eid")%>">
							<input type="hidden" name="ename" value="<%=rs.getString("ename")%>">
							<input type="hidden" name="rollnumber" value="<%=rs1.getString("rollno") %>">
							
							<input type="hidden" name="datetime" value="<%=rs.getString("datetime")%>">
							<input type="hidden" name="coordinatorname" value="<%=rs.getString("coordinatorname")%>">
							<center>
								<input type="submit" class="btn btn-primary" value="Send Feedback">
							</center>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<%} %>

</body>
</html>