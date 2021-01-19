package com.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="cheque")
@PrimaryKeyJoinColumn(name="pid")
public class Cheque extends Payment {

	@Column(name="chequetype")
	private String chequetype;

	public String getChequetype() {
		return chequetype;
	}

	public void setChequetype(String chequetype) {
		this.chequetype = chequetype;
	}

	
}
