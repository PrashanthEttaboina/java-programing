<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Achievements</title>
</head>
<body>
	<%@include file="faculty.jsp"%>
	<%@page
		import="com.pojo.faculty.Achievements,com.faculty.AchievementsBean,java.util.*"%>
	<h1 align="center">Welcome to View Achievement Page</h1>
	<div class="container">
		<table class="table table-bordered table-info">
			<thead>
				<tr>

					<td>Faculty Name</td>
					<td>Department</td>
					<td>Position</td>
					<td>Achievement</td>

				</tr>
			</thead>
			<%
				int fid = (Integer) session.getAttribute("fid");
			List li = AchievementsBean.getAchievementById(fid);
			Iterator i = li.iterator();
			while (i.hasNext()) {
				Achievements s = (Achievements) i.next();
			%>
			<tr>

				<td><%=s.getName()%></td>
				<td><%=s.getDepartment()%></td>
				<td><%=s.getPosition()%></td>
				<td><%=s.getAchievements()%></td>
			</tr>

			<%
				}
			%>
		</table>
	</div>
</body>
</html>