<%@page import="java.sql.*"%>
<%
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
String storename=request.getParameter("storename");
String contact=request.getParameter("contact");
String bsemail=(String)session.getAttribute("bsemail");
String waiting="waiting";
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="insert into bikespec (bn,ft,ftc,gbt,ng,dis,mil,ts,bat,price,bsemail,bsname,bscontact,status) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,bn);
ps.setString(2,ft);
ps.setString(3,ftc);
ps.setString(4,gbt);
ps.setString(5,ng);
ps.setString(6,dis);
ps.setString(7,mil);
ps.setString(8,ts);
ps.setString(9,bat);
ps.setString(10,price);
ps.setString(11,bsemail);
ps.setString(12,storename);
ps.setString(13,contact);
ps.setString(14,waiting);
int x=ps.executeUpdate();
if(x!=0){
	response.sendRedirect("bikesbdetails.jsp");
}
	%>