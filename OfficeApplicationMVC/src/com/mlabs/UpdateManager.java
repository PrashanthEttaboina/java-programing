package com.mlabs;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateManager extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		int mid=Integer.parseInt(request.getParameter("mid"));				
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String department=request.getParameter("department");
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		int salary=Integer.parseInt(request.getParameter("salary"));
		String experience=request.getParameter("experience");
		
		UpdateManagerBean um=new UpdateManagerBean();
		um.setName(name);
		um.setEmail(email);
		um.setPhone(phone);
		um.setDepartment(department);
		um.setGender(gender);
		um.setAge(age);
		um.setSalary(salary);
		um.setExperience(experience);
		
		HttpSession hs=request.getSession();
		ManagerRegisterBean mr=null;
		
		try {
			mr=um.update(name,email,phone,department,gender,age,salary,experience,mid);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		if(mr!=null)
		{
			hs.setAttribute("ManagerDetails", mr);
			response.sendRedirect("./manager_profile.jsp?msg=Profile updated");
		}
		else
			response.sendRedirect("./update_manager_profile.jsp?msg=update failed");		
	}
}
