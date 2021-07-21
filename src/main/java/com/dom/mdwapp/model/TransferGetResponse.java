package com.dom.mdwapp.model;

import java.io.Serializable;

public class TransferGetResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6518627667568799741L;
	
	private String fromAccount;
	private String toAccount;
	private String amount;
	
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
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
