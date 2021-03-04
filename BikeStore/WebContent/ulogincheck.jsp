<%@page import="java.sql.*"%>
<%
String uemail=request.getParameter("uemail");
String password=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="select * from cinfo where uemail=? and password=?";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,uemail);
ps.setString(2,password);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
	
	session.setAttribute("uemail",uemail);
	
response.sendRedirect("uoptions.jsp");

}else
response.sendRedirect("ulogin.jsp");
%>