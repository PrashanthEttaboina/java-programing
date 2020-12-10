package com.mlabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcceptBean {

	public String manager_name,status;
	public int hid;
	
	
	public boolean accept(String manager_name, int hid) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("update holiday set status=?,manager_name=? where hid=?");
		ps.setString(1,"Accepted");
		ps.setString(2, manager_name);
		ps.setInt(3, hid);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}

}
