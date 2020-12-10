package com.mlabs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLogin extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		EmployeeRegisterBean er=null;
		HttpSession hs=request.getSession();
		
		try {
			er= new EmployeeLoginBean().loginValidate(email,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(er!=null)
		{
			hs.setAttribute("EmployeeDetails", er);
			hs.setAttribute("emp_id",er.getEmp_id());
			hs.setAttribute("emp_email",er.getEmail());
			hs.setAttribute("emp_name",er.getName());
			hs.setAttribute("emp_department", er.getDepartment());
			response.sendRedirect("./Employee_Home.html?msg=login successful");
		}
		else
			response.sendRedirect("./Employee_Login.html?msg=login failed");
	
	}
}
