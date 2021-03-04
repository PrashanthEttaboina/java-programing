package com.wizcart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class BudgetPlanning extends HttpServlet {
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
		int amount=Integer.parseInt(request.getParameter("amount"));
		int feid=Integer.parseInt(request.getParameter("feid"));
		String fname=request.getParameter("fname");
		String ename=request.getParameter("ename");
		String datetime=request.getParameter("datetime");
		PrintWriter pw=response.getWriter();
		String sql="insert into budget(amount,fname,ename,datetime) values(?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, amount);
			ps.setString(1, fname);
			ps.setString(2, ename);
			ps.setString(3, datetime);
			int a=ps.executeUpdate();
			if(a!=0)
				response.sendRedirect("./student_home.jsp?msg=registered sucessfully");
			else
				response.sendRedirect("./add_budget.jsp?id="+feid+"&msg=registered failed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
