<%@page import="java.sql.*"%>
<%
String bsname=request.getParameter("bsname");
String bsemail=request.getParameter("bsemail");
String bsphone=request.getParameter("bsphone");
String bsadd=request.getParameter("bsadd");
String pincode=request.getParameter("pincode");
String password=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="insert into bsinfo (bsname,bsemail,bsphone,bsadd,pincode,password) values (?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,bsname);
ps.setString(2,bsemail);
ps.setString(3,bsphone);
ps.setString(4,bsadd);
ps.setString(5,pincode);
ps.setString(6,password);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("bslogin.jsp");
%>