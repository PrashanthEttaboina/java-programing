package com.mlabs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ManagerLogin extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		ManagerRegisterBean mr=null;
		HttpSession hs=request.getSession();
		
		try {
			mr= new ManagerLoginBean().loginValidate(email,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(mr!=null)
		{
			hs.setAttribute("ManagerDetails", mr);
			hs.setAttribute("mid",mr.getMid());
			hs.setAttribute("mname",mr.getName());
			hs.setAttribute("mdepartment", mr.getDepartment());
			response.sendRedirect("./Manager_Home.html?msg=login successful");
		}
		else
			response.sendRedirect("./Manager_Login.html?msg=login failed");
	
	}
}
