package com.motivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcceptBean {

	public String doctor_name,status;
	public int aid;
	
	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public boolean accept(String doctor_name, int aid) throws ClassNotFoundException, SQLException {
		Connection con=ConnectionEst.connectivity();
		PreparedStatement ps=con.prepareStatement("update appointment set status=?,doctor_name=? where aid=?");
		ps.setString(1,"Accepted");
		ps.setString(2, doctor_name);
		ps.setInt(3, aid);
		int x=ps.executeUpdate();
		if(x!=0)
			return true;
		else
			return false;
	}

}
