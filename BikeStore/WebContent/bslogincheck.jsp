<%@page import="java.sql.*"%>
<%
String bsemail=request.getParameter("bsemail");
String password=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="select * from bsinfo where bsemail=? and password=?";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,bsemail);
ps.setString(2,password);
ResultSet rs=ps.executeQuery();
if(rs.next()){
	session.setAttribute("bsemail",bsemail);

	response.sendRedirect("bsoptions.jsp");
}
else
	response.sendRedirect("bslogin.jsp");
%>