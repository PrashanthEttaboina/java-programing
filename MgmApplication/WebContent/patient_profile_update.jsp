<%@ include file="connection.jsp" %>
<%
String patient_id=request.getParameter("patient_id");
String name=request.getParameter("name");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
int age=Integer.parseInt(request.getParameter("age"));
String gender=request.getParameter("gender");
String prescription=request.getParameter("prescription");
String blood_group=request.getParameter("blood_group");

ps=con.prepareStatement("update patient set name=?,email=?,phone=?,age=?,gender=?,prescription=?,blood_group=? where patient_id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,phone);
ps.setInt(4,age);
ps.setString(5,gender);
ps.setString(6,prescription);
ps.setString(7,blood_group);
ps.setString(8,patient_id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("patient_profile.jsp?msg=updated");
%>