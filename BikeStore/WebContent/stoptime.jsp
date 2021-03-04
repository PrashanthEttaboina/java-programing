<%@page import="java.sql.*"%>
<%
System.out.println("stop time");
String stophour=request.getParameter("stophour");
String stopmin=request.getParameter("stopmin");
String id=request.getParameter("id");
System.out.println(stophour);
System.out.println(stopmin);
System.out.println(id);
String bsemail=(String)session.getAttribute("bsemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="update rentstatus set stophour='"+stophour+"',stopmin='"+stopmin+"' where id='"+id+"'";
System.out.println(sql);
Statement ps=con.createStatement();
int x=ps.executeUpdate(sql);
if(x!=0){
	
	response.sendRedirect("bikescrent.jsp");
}
	%>