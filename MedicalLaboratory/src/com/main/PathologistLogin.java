package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Pathologist;

public class PathologistLogin extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Pathologist p=PathologistLoginBean.login(email, password);
		HttpSession hs=request.getSession();
		if(p!=null) {
			
			hs.setAttribute("pathologist_id",p.getLab_doctor_id());
			hs.setAttribute("specialisation",p.getDoctor_specialisation());
			hs.setAttribute("pathologist_name",p.getDoctor_name());
			hs.setAttribute("pathologist", p);
			response.sendRedirect("./pathologist_home.jsp?msg=login sucessfully");
		}
		else
			response.sendRedirect("./pathologist_login.html?msg=login failed");
	}
}

