package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Patient;

public class PatientRegister extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		Patient pat=new Patient();
		pat.setPatient_name(request.getParameter("name"));
		pat.setPatient_gender(request.getParameter("gender"));
		pat.setDate_of_birth(request.getParameter("date_of_birth"));
		pat.setPatient_email(request.getParameter("email"));
		pat.setPatient_password(request.getParameter("password"));
		pat.setPatient_phone(request.getParameter("phone"));
		pat.setPatient_address(request.getParameter("address"));
		
		boolean patient_registration_status=false;
		 patient_registration_status=PatientRegisterBean.register(pat);

		 if(patient_registration_status)
		 {
			 response.sendRedirect("./patient_login.html?msg=Registered Successfully");
		 }
		 else
			 response.sendRedirect("./patient_registration.html?msg=Registration Faliled");
		
	}
}	
