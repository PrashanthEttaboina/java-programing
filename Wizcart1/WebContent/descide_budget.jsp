<%@include file="connect.jsp"%>
<%String descide=request.getParameter("descide");
int id=Integer.parseInt(request.getParameter("id"));
int id1=Integer.parseInt(request.getParameter("eid"));
ps=con.prepareStatement("update budget set status=?,approvedby =? where bid=?");
int a=0;
if(descide.equals("approve")){
	ps.setString(1, "Approved");
	ps.setString(2,"Admin");
	ps.setInt(3, id);
	a=ps.executeUpdate();
	if(a>0)
	{
		ps=con.prepareStatement("update events set budgetstatus=? where eid=?");
		ps.setString(1,"Approved");
		ps.setInt(2,id1);
		int c=ps.executeUpdate();
		if(c>0)
			System.out.println("budget status in events approved");
		else
			System.out.println(" approval failed");
		
		response.sendRedirect("applied_budgets.jsp?msg=Approved");
	}
	else
		response.sendRedirect("approve_budget.jsp?id="+id+"&msg=Approved failed");
}else{
	ps.setString(1, "Rejected");
	ps.setString(2,"Admin");
	ps.setInt(3, id);
	a=ps.executeUpdate();
	if(a>0)
	{
		ps=con.prepareStatement("update events set budgetstatus=? where eid=?");
		ps.setString(1,"not approved");
		ps.setInt(2,id1);
		int c=ps.executeUpdate();
		if(c>0)
			System.out.println("budget status in events not approved");
		else
			System.out.println(" not approval failed");
		
		response.sendRedirect("applied_budgets.jsp?msg=Approved");	
	}
	else
		response.sendRedirect("approve_budget.jsp?id="+id+"&msg=Approved failed");
}
%>