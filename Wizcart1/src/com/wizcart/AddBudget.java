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


public class AddBudget extends HttpServlet {
	
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname=request.getParameter("fname");
		String ename=request.getParameter("ename");
		String datetime=request.getParameter("datetime");
		int  amount=Integer.parseInt(request.getParameter("amount"));
		int feid=Integer.parseInt(request.getParameter("feid"));
		
		
		String sql="insert into budget(fname,ename,datetime,amount,feid) values(?,?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, fname);
			ps.setString(2, ename);
			ps.setString(3, datetime);
			ps.setInt(4, amount);
			ps.setInt(5, feid);
			
			int a=ps.executeUpdate();
			if(a!=0) {
				String s="update events set addbudget=? where eid=?";
				ps=con.prepareStatement(s);
				ps.setString(1, "added");
				ps.setString(2, "feid");
				
				int b=ps.executeUpdate();
				if(b!=0)
				{
					System.out.println("budget added");
				}
				else
					System.out.println("Unable to add budget");
			
				response.sendRedirect("./eventplanner_home.jsp?msg=Budget Added registered sucessfully");				
				
			}
			else
				response.sendRedirect("./add_budget.jsp?msg=Adding Budget failed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
