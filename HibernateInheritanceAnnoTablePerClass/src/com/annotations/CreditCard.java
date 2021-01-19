package com.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="creditcard1")
@PrimaryKeyJoinColumn(name="pid")
public class CreditCard extends Payment{

	
	@Column(name="cctype")
	private String cctype;

	public String getCctype() {
		return cctype;
	}

	public void setCctype(String cctype) {
		this.cctype = cctype;
	}
	
	
}
