<%@page import="java.sql.*"%>
<%
String id=request.getParameter("id");
String bn=request.getParameter("bn");
String bm=request.getParameter("bm");
String bt=request.getParameter("bt");
String rent=request.getParameter("rent");
String bsemail=request.getParameter("bsemail");
String bd=request.getParameter("bd");
String uemail=(String)session.getAttribute("uemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="insert into rentstatus (id,bn,bm,bt,rent,bsemail,bd,uemail) values (?,?,?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,id);
ps.setString(2,bn);
ps.setString(3,bm);
ps.setString(4,bt);
ps.setString(5,rent);
ps.setString(6,bsemail);
ps.setString(7,bd);
ps.setString(8,uemail);

int x=ps.executeUpdate();
if(x!=0){
	
	response.sendRedirect("uoptions.jsp");
}
	%>