<%@page import="java.sql.*"%>
<%
int id=Integer.parseInt(request.getParameter("id"));
String gs=request.getParameter("gs");
String oc=request.getParameter("oc");
String ei=request.getParameter("ei");
String cbi=request.getParameter("cbi");
String esi=request.getParameter("esi");
String csi=request.getParameter("csi");
String fc=request.getParameter("fc");
String rsr=request.getParameter("rsr");
String tpr=request.getParameter("tpr");
String bn=request.getParameter("bn");
String bsemail=request.getParameter("bsemail");
String uemail=(String)session.getAttribute("uemail");
String sd=request.getParameter("sd");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="insert into servicestatus (id,gs,oc,ei,cbi,esi,csi,fc,rsr,tpr,bn,bsemail,uemail,sd) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setInt(1,id);
ps.setString(2,gs);
ps.setString(3,oc);
ps.setString(4,ei);
ps.setString(5,cbi);
ps.setString(6,esi);
ps.setString(7,csi);
ps.setString(8,fc);
ps.setString(9,rsr);
ps.setString(10,tpr);
ps.setString(11,bn);
ps.setString(12,bsemail);
ps.setString(13,uemail);
ps.setString(14,sd);
int x=ps.executeUpdate();
if(x!=0){	
	response.sendRedirect("uoptions.jsp");
}
	%>