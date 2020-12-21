package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatientLogin extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		boolean patient_login_status=false;
		patient_login_status=PatientLoginBean.login(email, password);
		HttpSession hs=request.getSession();
		
		if(patient_login_status) {
			
			response.sendRedirect("./patient_home.jsp?msg=login sucessfully");
		}
		else
			response.sendRedirect("./patient_login.html?msg=login failed");
	}

}

