<%@page import="java.sql.*"%>
<%

String uname=request.getParameter("uname");
String uemail=request.getParameter("uemail");
String uphone=request.getParameter("uphone");
String uadd=request.getParameter("uadd");
String gender=request.getParameter("gender");
String password=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="insert into cinfo(uname,uemail,uphone,uadd,gender,password) values(?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,uname);
ps.setString(2,uemail);
ps.setString(3,uphone);
ps.setString(4,uadd);
ps.setString(5,gender);
ps.setString(6,password);
int x=ps.executeUpdate();
if(x>0)
	response.sendRedirect("ulogin.jsp");
%>