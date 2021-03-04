<%@page import="java.sql.*"%>
<%
	String uname = request.getParameter("uname");
String password = request.getParameter("password");
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/bike";
String name = "root";
String pwd = "root";
Connection con = DriverManager.getConnection(url, name, pwd);
if (uname.equals("admin") && password.equals("admin"))
	response.sendRedirect("aoptions.jsp");
else
	response.sendRedirect("alogin.jsp");
%>