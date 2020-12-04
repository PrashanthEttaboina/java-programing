<%@ include file="connection.jsp"%>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String department=request.getParameter("department");
int no_of_holidays=Integer.parseInt(request.getParameter("no_of_holidays"));
String holiday_begin_date=request.getParameter("holiday_begin_date");

ps=con.prepareStatement("insert into holiday(name,email,phone,department,no_of_holidays,holiday_begin_date) values(?,?,?,?,?,?)");
ps.setString(1,name);
ps.setString(2,email);
ps.setString(3,phone);
ps.setString(4,department);
ps.setInt(5,no_of_holidays);
ps.setString(6,holiday_begin_date);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("employee_profile.jsp?msg=applied_Holidays");
%>