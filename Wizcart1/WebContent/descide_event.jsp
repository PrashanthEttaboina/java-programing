<%@include file="connect.jsp"%>
<%String descide=request.getParameter("descide");
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("update events set status=? where eid=?");
int a=0;
if(descide.equals("approve")){
	ps.setString(1, "Approved");
	ps.setInt(2, id);
	a=ps.executeUpdate();
	if(a>0)
		response.sendRedirect("applied_events.jsp?msg=Approved");
	else
		response.sendRedirect("approve_event.jsp?id="+id+"&msg=Approved failed");
}else{
	ps.setString(1, "Rejected");
	ps.setInt(2, id);
	a=ps.executeUpdate();
	if(a>0)
		response.sendRedirect("applied_events.jsp?msg=Approved");
	else
		response.sendRedirect("approve_event.jsp?id="+id+"&msg=Approved failed");
}
%>