package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLogin extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String admin_id=request.getParameter("admin_id");
		String password=request.getParameter("password");
		boolean admin_login_status=false;
		if(admin_id.equalsIgnoreCase("Admin")&&password.equals("admin"))
			admin_login_status=true;
		else
			admin_login_status=false;
		if(admin_login_status) {
			response.sendRedirect("./admin_home.html?msg=login sucessfully");
		}
		else
			response.sendRedirect("./admin_login.html?msg=login failed");
	}	
}
