package com.mlabs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateEmployee extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		int emp_id=Integer.parseInt(request.getParameter("emp_id"));				
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String department=request.getParameter("department");
		String designation=request.getParameter("designation");
		String gender=request.getParameter("gender");
		int salary=Integer.parseInt(request.getParameter("salary"));
		String date_of_joining=request.getParameter("date_of_joining");
		
		UpdateEmployeeBean ue=new UpdateEmployeeBean();
		ue.setName(name);
		ue.setEmail(email);
		ue.setPhone(phone);
		ue.setDepartment(department);
		ue.setDesignation(designation);
		ue.setGender(gender);
		ue.setSalary(salary);
		ue.setDate_of_joining(date_of_joining);
		
		HttpSession hs=request.getSession();
		EmployeeRegisterBean er=null;
		
		try {
			er=ue.update(name,email,phone,department,designation,gender,salary,date_of_joining,emp_id);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		if(er!=null)
		{
			hs.setAttribute("EmployeeDetails", er);
			response.sendRedirect("./employee_profile.jsp?msg=Profile updated");
		}
		else
			response.sendRedirect("./update_employee_profile.jsp?msg=update failed");		
	}
}
