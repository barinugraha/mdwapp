package com.dom.mdwapp.model;

import java.io.Serializable;

public class TransferResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4109279222995089195L;
	
	private String transactionId;
	private String statusCode;
	private String statusMessage;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}		

}
