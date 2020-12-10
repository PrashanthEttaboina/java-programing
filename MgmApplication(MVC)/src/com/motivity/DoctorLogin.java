package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DoctorLogin extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		DoctorRegisterBean dr=null;
		
		HttpSession hs=request.getSession();
	
		try {
			dr=new DoctorLoginBean().loginValidate(email,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(dr!=null)
		{
			hs.setAttribute("doctorDetails", dr);
			hs.setAttribute("id",dr.getId());
			hs.setAttribute("name",dr.getDname());
			hs.setAttribute("specialist", dr.getSpecialisation());
			response.sendRedirect("./Doctor_Home.html?msg=login successful");
		}
		else
			response.sendRedirect("./DoctorLogin.html?msg=login failed");
	}
}
