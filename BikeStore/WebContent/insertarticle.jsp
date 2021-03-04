<%@page import="java.sql.*"%>
<%
String bn=request.getParameter("bn");
String bm=request.getParameter("bm");
String des=request.getParameter("des");
String uemail=(String)session.getAttribute("uemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="insert into particle (bn,bm,des,uemail) values (?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,bn);
ps.setString(2,bm);
ps.setString(3,des);
ps.setString(4,uemail);
int x=ps.executeUpdate();
if(x!=0){
	
	response.sendRedirect("userbrdetails.jsp");
}
	%>