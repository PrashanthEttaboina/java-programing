<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<%@include file="eventplanner.jsp"%>
	<h1 align="center">Welcome to Add Event Page</h1>
	<br>
	<%
		String pname = (String) session.getAttribute("pname");
	%>
	<div class="container-fulid">
		<div class="row justify-content-center align-items-center"
			style="height: 50vh">
			<div class="col-8">
				<div class="card">
					<div class="card-body">
						<form action="./add_event" method="post"
							enctype="multipart/form-data">
							<div class="form-group">
								Forum Name: <select name="fname" class="form-control"
									required="required">
									<option value="Stumagz">Stumagz</option>
									<option value="Stutalk ">Stutalk</option>
									<option value="IEEE">IEEE</option>
									<option value="Eco club ">Eco club</option>
									<option value="NSS">NSS</option>
								</select>
							</div>
							<div class="form-group">
								Event Name: <input type="text" class="form-control" name="ename"
									placeholder="Enter Event Name" required="required">
							</div>
							<div class="form-group">
								Date and Time: <input type="datetime-local" class="form-control"
									name="datetime" placeholder="Enter date&time"
									required="required">
							</div>
							<div class="form-group">
								Venue: <input type="text" name="venue" class="form-control"
									placeholder="Enter Venue Name" required="required">
							</div>
							<div class="form-group">
								Coordinator Name: <input type="text" class="form-control"
									name="coordinatorname" value="<%=pname%>"  readonly="readonly">
							</div>
							<div class="form-group">
								<label>Facility Required:</label><br> <input
									type="checkbox" name="facilityrequired" value="Mics">&nbsp;&nbsp;<label>Mics</label>&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="checkbox" name="facilityrequired" value="Soundbox">&nbsp;&nbsp;<label>Soundbox</label>&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="checkbox" name="facilityrequired"
									value="Auditorium">&nbsp;&nbsp;<label>Auditorium</label>&nbsp;&nbsp;&nbsp;&nbsp;
								<br> <input type="checkbox" name="facilityrequired"
									value="TNP Halls">&nbsp;&nbsp;<label>TNP Halls</label>&nbsp;&nbsp;
								&nbsp;&nbsp;<input type="checkbox" name="facilityrequired"
									value="Chairs">&nbsp;&nbsp;<label>Chairs</label>&nbsp;&nbsp;
								&nbsp;&nbsp;<input type="checkbox" name="facilityrequired"
									value="Resting area for guest">&nbsp;&nbsp;<label>Resting
									area for guest</label>&nbsp;&nbsp; &nbsp;&nbsp;<br> <input
									type="checkbox" name="facilityrequired" value="Lunch for guest">&nbsp;&nbsp;<label>Lunch
									for guest</label>&nbsp;&nbsp; <input type="checkbox"
									name="facilityrequired" value="Goodies">&nbsp;&nbsp;<label>Goodies</label>&nbsp;&nbsp;
							</div>
							<div class="form-group">
								Description: <textarea rows="8" cols="8" class="form-control" name="description" placeholder="Enter Description"
								 required="required"></textarea>
							</div>
							<div class="form-group">
								Permission letters: <input type="file" name="file"
									required="required">
							</div>
							<input type="hidden" name="sname" value="<%=pname%>">
							<center>
								<input type="submit" class="btn btn-primary" value="Add Event">
							</center>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>