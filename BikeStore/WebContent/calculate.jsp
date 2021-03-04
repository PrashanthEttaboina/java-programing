<%@page import="java.sql.*"%>
<%
String id=request.getParameter("id");
String bsemail=(String)session.getAttribute("bsemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql1="select * from rentstatus where id='"+id+"'";
PreparedStatement ps1=con.prepareStatement(sql1);
ResultSet rs=ps1.executeQuery();
if(rs.next()){
int starthour=rs.getInt("starthour");
int startmin=rs.getInt("startmin");
int stophour=rs.getInt("stophour");
int stopmin=rs.getInt("stopmin");
int rent=rs.getInt("rent");
int amount=((stophour-starthour)*rent);
String sql="update rentstatus set amount='"+amount+"' where id='"+id+"'";
PreparedStatement ps=con.prepareStatement(sql);
int x=ps.executeUpdate();
if(x!=0){
	
	response.sendRedirect("bikescrent.jsp");
}
}
	%>