package com.annotations;

import javax.persistence.*;

@Entity
@Table(name="payment")
@Inheritance(strategy=InheritanceType.JOINED)
public class Payment {
	
	@Id
	@Column(name="pid")
	private int pid;
	
	@Column(name="amount")
	private int amount;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
