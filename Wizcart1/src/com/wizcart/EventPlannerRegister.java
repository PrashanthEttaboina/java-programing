package com.wizcart;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class EventPlannerRegister extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config){
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/wizcart";
		String username="root";
		String password="root";
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String plannername=request.getParameter("plannername");
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String sql="insert into eventplanner(plannername,phone,email,password,address) values(?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, plannername);			
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setString(2, phone);
			ps.setString(5, address);
			int a=ps.executeUpdate();
			if(a!=0)
				response.sendRedirect("eventplanner_login.jsp?msg=registered sucessfully");
			else
				response.sendRedirect("eventplanner_register.jsp?msg=registered failed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
