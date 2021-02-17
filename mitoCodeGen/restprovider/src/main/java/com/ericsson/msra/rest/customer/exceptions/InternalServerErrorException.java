package com.ericsson.msra.rest.customer.exceptions;

public class InternalServerErrorException extends Exception  {
  
	private String code = null;

	private String message = null;
 
  
	public InternalServerErrorException(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
 
