package com.dom.mdwapp.model;

import java.io.Serializable;

@Deprecated
public class BackendResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4109279222995089195L;
	
	private String statusCode;
	private String statusMessage;
	
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
