package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.pojo.UrineTest;

public class ApplyUrineTest extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		UrineTest bt=new UrineTest();
		bt.setPat_id(Integer.parseInt(request.getParameter("pat_id")));
		bt.setPatient_name(request.getParameter("patient_name"));
		bt.setPatient_gender(request.getParameter("patient_gender"));
		bt.setDate_of_birth(request.getParameter("date_of_birth"));
		bt.setPatient_phone(request.getParameter("patient_phone"));
		bt.setTest_type(request.getParameter("test_type"));
		bt.setReferred_by_doctor(request.getParameter("referred_by_doctor"));
		bt.setDate_and_time(request.getParameter("date_and_time"));
	
	boolean test_apply_status=false;
	test_apply_status=ApplyUrineTestBean.apply(bt);

	 if(test_apply_status)
	 {
		 response.sendRedirect("./patient_home.jsp?msg=Test Applied Successfully");
	 }
	 else
		 response.sendRedirect("./apply_urine_test.jsp?msg=Test Application Faliled");
		
	}
}
