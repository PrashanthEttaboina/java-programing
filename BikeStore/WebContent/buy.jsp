<%@page import="java.sql.*"%>
<%

String rid=request.getParameter("id");

int id=Integer.parseInt(rid);

String uemail=(String)session.getAttribute("uemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="update bikespec set status=?, useremail=? where id=?";
System.out.println(sql);
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,"purchased");
ps.setString(2,uemail);
ps.setInt(3,id);

System.out.println(id);
int x=ps.executeUpdate();
System.out.println(x);
if(x!=0){
	System.out.println("hello");
	System.out.println(id);
	response.sendRedirect("userbfdetails.jsp");
}
	%>