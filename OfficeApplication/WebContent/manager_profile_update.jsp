<%@ include file="connection.jsp" %>
<%
int mid=Integer.parseInt(request.getParameter("mid"));
String name=request.getParameter("name");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String department=request.getParameter("department");
String gender=request.getParameter("gender");
int age=Integer.parseInt(request.getParameter("age"));
int salary=Integer.parseInt(request.getParameter("salary"));
String experience=request.getParameter("experience");

ps=con.prepareStatement("update manager set name=?,email=?,phone=?,department=?,gender=?,age=?,salary=?,experience=? where mid=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,phone);
ps.setString(4,department);
ps.setString(5,gender);
ps.setInt(6,age);
ps.setInt(7,salary);
ps.setString(8,experience);
ps.setInt(9,mid);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("manager_profile.jsp?msg=updated");
%>