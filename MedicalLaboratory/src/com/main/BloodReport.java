package com.main;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.BloodTest;

public class BloodReport extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		BloodTest bt=new BloodTest();
		bt.setBid(Integer.parseInt(request.getParameter("bid")));
		bt.setPat_id(Integer.parseInt(request.getParameter("pat_id")));
		bt.setPatient_name(request.getParameter("patient_name"));
		bt.setPatient_gender(request.getParameter("patient_gender"));
		bt.setDate_of_birth(request.getParameter("date_of_birth"));
		bt.setPatient_phone(request.getParameter("patient_phone"));
		bt.setTest_type(request.getParameter("test_type"));
		bt.setReferred_by_doctor(request.getParameter("referred_by_doctor"));
		bt.setDate_and_time(request.getParameter("date_and_time"));	
		bt.setBlood_group(request.getParameter("blood_group"));
		bt.setHemoglobin(request.getParameter("hemoglobin"));
		bt.setRbc_count(request.getParameter("rbc_count"));
		bt.setMcv(request.getParameter("mcv"));
		bt.setMch(request.getParameter("mch"));
		bt.setMchc(request.getParameter("mchc"));
		bt.setRdw(request.getParameter("rdw"));
		bt.setWbc_count(request.getParameter("wbc_count"));
		bt.setStatus(request.getParameter("status"));
		
		boolean test_report_status=false;
		test_report_status=BloodReportBean.report(bt);

		if(test_report_status)
		 {
			 response.sendRedirect("./view_test_appointments.jsp?msg=Reported Successfully");
		 }
		 else
			 response.sendRedirect("./generate_blood_report.jsp?msg=Reporting Faliled");		
	}	
}
