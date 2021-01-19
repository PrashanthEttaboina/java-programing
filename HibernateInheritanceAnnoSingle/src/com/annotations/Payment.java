package com.annotations;

import javax.persistence.*;

@Entity
@Table(name="payment15")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="paymenttype",discriminatorType=DiscriminatorType.STRING,length=20)

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
