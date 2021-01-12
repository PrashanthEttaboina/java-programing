package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.UrineTest;

public class UrineReport extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		UrineTest bt=new UrineTest();
		bt.setUid(Integer.parseInt(request.getParameter("uid")));
		bt.setPat_id(Integer.parseInt(request.getParameter("pat_id")));
		bt.setPatient_name(request.getParameter("patient_name"));
		bt.setPatient_gender(request.getParameter("patient_gender"));
		bt.setDate_of_birth(request.getParameter("date_of_birth"));
		bt.setPatient_phone(request.getParameter("patient_phone"));
		bt.setTest_type(request.getParameter("test_type"));
		bt.setReferred_by_doctor(request.getParameter("referred_by_doctor"));
		bt.setDate_and_time(request.getParameter("date_and_time"));	
		bt.setColor(request.getParameter("color"));
		bt.setAppearance(request.getParameter("appearance"));
		bt.setSpecific_gravity(request.getParameter("specific_gravity"));
		bt.setPh(request.getParameter("ph"));
		bt.setProtein(request.getParameter("protein"));
		bt.setGlucose(request.getParameter("glucose"));
		bt.setUrobilinogen(request.getParameter("urobilinogen"));
		bt.setBilirubin(request.getParameter("bilirubin"));
		bt.setKetones(request.getParameter("ketones"));
		bt.setNitrites(request.getParameter("nitrites"));
		bt.setStatus(request.getParameter("status"));
		
		boolean test_report_status=false;
		test_report_status=UrineReportBean.report(bt);

		if(test_report_status)
		 {
			 response.sendRedirect("./view_test_appointments.jsp?msg=Reported Successfully");
		 }
		 else
			 response.sendRedirect("./generate_urine_report.jsp?msg=Reporting Faliled");		
	}	
}
