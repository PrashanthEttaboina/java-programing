<%@ include file="connection.jsp" %>
<%
int emp_id=Integer.parseInt(request.getParameter("emp_id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String department=request.getParameter("department");
String designation=request.getParameter("designation");
String gender=request.getParameter("gender");
int salary=Integer.parseInt(request.getParameter("salary"));
String doj=request.getParameter("date_of_joining");

ps=con.prepareStatement("update employee set name=?,email=?,phone=?,department=?,designation=?,gender=?,salary=?,date_of_joining=? where emp_id=?");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,phone);
ps.setString(4,department);
ps.setString(5,designation);
ps.setString(6,gender);
ps.setInt(7,salary);
ps.setString(8,doj);
ps.setInt(9,emp_id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("employee_profile.jsp?msg=updated");
%>