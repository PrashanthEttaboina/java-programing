<%@page import="java.sql.*"%>
<%
String bn=request.getParameter("bn");
String bm=request.getParameter("bm");
String yp=request.getParameter("yp");
String sp=request.getParameter("sp");
String col=request.getParameter("col");
String distra=request.getParameter("distra");
String uemail=(String)session.getAttribute("uemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="insert into sellbike (bn,bm,yp,sp,uemail,col,distra) values (?,?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,bn);
ps.setString(2,bm);
ps.setString(3,yp);
ps.setString(4,sp);
ps.setString(5,uemail);
ps.setString(6,col);
ps.setString(7,distra);
int x=ps.executeUpdate();
if(x!=0){
	
	response.sendRedirect("uoptions.jsp");
}
	%>