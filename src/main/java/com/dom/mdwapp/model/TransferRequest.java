package com.dom.mdwapp.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TransferRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1400932310895302576L;
	
	private String transactionId;
	private String fromAccount;
	private String toAccount;
	private BigDecimal amount;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
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
