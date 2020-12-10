package com.motivity;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdatePatient extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int patient_id=Integer.parseInt(request.getParameter("patient_id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String prescription=request.getParameter("prescription");
		String blood_group=request.getParameter("blood_group");
		
		UpdatePatientBean up=new UpdatePatientBean();
		up.setName(name);
		up.setEmail(email);
		up.setPhone(phone);
		up.setAge(age);
		up.setGender(gender);
		up.setPrescription(prescription);
		up.setBlood_group(blood_group);
		
		HttpSession hs=request.getSession();
		PatientRegisterBean pr=null;
		
		try {
			pr=up.update(name, email, phone, age, gender, prescription, blood_group, patient_id);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(pr!=null)
		{
			hs.setAttribute("patientDetails",pr);
			response.sendRedirect("./patient_profile.jsp?msg=profile updated");
		}
		else
			response.sendRedirect("./update_patient_profile.jsp?msg=update failed");
	}
}
