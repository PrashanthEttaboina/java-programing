package com.motivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionEst {
	
	public static Connection connectivity() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mgm";
		String username = "root";
		String password = "root";
		Connection con= DriverManager.getConnection(url, username, password);
		return con;
	}
	
}
