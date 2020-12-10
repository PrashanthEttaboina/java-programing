package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class PatientLogin extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		PatientRegisterBean pr=null;
		
		HttpSession hs=request.getSession();
	
		try {
			pr=new PatientLoginBean().loginValidate(email,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pr!=null)
		{
			hs.setAttribute("patientDetails", pr);
			hs.setAttribute("id",pr.getPatient_id());
			hs.setAttribute("name",pr.getName());
			hs.setAttribute("prescription", pr.getPrescription());
			response.sendRedirect("./Patient_Home.html?msg=login successful");
		}
		else
			response.sendRedirect("./PatientLogin.html?msg=login failed");
	}
}
