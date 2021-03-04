<%@page import="java.sql.*"%>
<%
String bn=request.getParameter("bn");
String gs=request.getParameter("gs");
String oc=request.getParameter("oc");
String ei=request.getParameter("ei");
String cbs=request.getParameter("cbs");
String eni=request.getParameter("eni");
String csi=request.getParameter("csi");
String fc=request.getParameter("fc");
String rsr=request.getParameter("rsr");
String tpr=request.getParameter("tpr");
String bsemail=(String)session.getAttribute("bsemail");
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/bike";
String name="root";
String pwd="root";
Connection con=DriverManager.getConnection(url,name,pwd);
String sql="insert into bservice (bn,gs,oc,ei,cbs,eni,csi,fc,rsr,tpr,bsemail) values (?,?,?,?,?,?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1,bn);
ps.setString(2,gs);
ps.setString(3,oc);
ps.setString(4,ei);
ps.setString(5,cbs);
ps.setString(6,eni);
ps.setString(7,csi);
ps.setString(8,fc);
ps.setString(9,rsr);
ps.setString(10,tpr);
ps.setString(11,bsemail);
int x=ps.executeUpdate();
if(x!=0){
	
	response.sendRedirect("bikessdetails.jsp");
}
	%>