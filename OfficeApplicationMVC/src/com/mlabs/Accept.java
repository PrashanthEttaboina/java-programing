package com.mlabs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Accept extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		HttpSession hs=request.getSession();
		int hid=Integer.parseInt(request.getParameter("id"));
		String manager_name=(String)hs.getAttribute("mname");
		boolean flag=false;
		
		try {
			flag=new AcceptBean().accept(manager_name,hid);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag)
			response.sendRedirect("view_holiday_appointment.jsp?msg=Appointment Accepted");
	}

}
