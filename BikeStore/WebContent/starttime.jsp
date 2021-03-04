<%@page import="java.sql.*"%>
<%
System.out.println("start time");
String shour=request.getParameter("starthour");
String smin=request.getParameter("startmin");
String rid=request.getParameter("id");
int starthour=Integer.parseInt(shour);
int startmin=Integer.parseInt(smin);
int id=Integer.parseInt(rid);
System.out.println(starthour);
System.out.println(startmin);
System.out.println(id);
String bsemail=(String)session.getAttribute("bsemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="update rentstatus set starthour=?,startmin=? where id=?";
System.out.println(sql);
PreparedStatement ps=con.prepareStatement(sql);
ps.setInt(1,starthour);
System.out.println(starthour);
ps.setInt(2,startmin);
System.out.println(startmin);
ps.setInt(3,id);
System.out.println(id);
int x=ps.executeUpdate();
System.out.println("startmin");
System.out.println(x);
if(x!=0){
	System.out.println("hello");
	System.out.println(id);
	response.sendRedirect("bikescrent.jsp");
}
	%>