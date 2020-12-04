<%@ include file="connection.jsp" %>
<%
int doctor_id=Integer.parseInt(request.getParameter("doctor_id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String specialisation=request.getParameter("specialisation");
String date_of_birth=request.getParameter("date_of_birth");
String timings=request.getParameter("timings");
String experience=request.getParameter("experience");

ps=con.prepareStatement("update doctor set name=?,email=?,phone=?,specialisation=?,date_of_birth=?,timings=?,experience=? where doctor_id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,phone);
ps.setString(4,specialisation);
ps.setString(5,date_of_birth);
ps.setString(6,timings);
ps.setString(7,experience);
ps.setInt(8,doctor_id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("doctor_profile.jsp?msg=updated");
%>