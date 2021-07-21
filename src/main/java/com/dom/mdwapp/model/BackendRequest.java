package com.dom.mdwapp.model;

import java.io.Serializable;
import java.math.BigDecimal;

@Deprecated
public class BackendRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1549884574327638899L;
	
	private String fromAccount;
	private String toAccount;
	private BigDecimal amount;
	
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
