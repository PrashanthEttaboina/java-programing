<%@page import="java.sql.*"%>
<%
String id=request.getParameter("id");
String bn=request.getParameter("bn");
String ft=request.getParameter("ft");
String ftc=request.getParameter("ftc");
String gbt=request.getParameter("gbt");
String ng=request.getParameter("ng");
String dis=request.getParameter("dis");
String mil=request.getParameter("mil");
String ts=request.getParameter("ts");
String bat=request.getParameter("bat");
String price=request.getParameter("price");
String bsemail=(String)session.getAttribute("bsemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="update bikespec set gbt=?,ng=?,mil=?,price=? where id=?";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,gbt);
ps.setString(2,ng);
ps.setString(3,mil);
ps.setString(4,price);
ps.setString(5,id);
int x=ps.executeUpdate();
if(x!=0){
	response.sendRedirect("bikesbdetails.jsp");
}
	%>