package com.ericsson.ms.module.entity.exceptions;

public class GenericMsEntityException extends RuntimeException  {
  
	private String code = null;
	private String message = null;
 
  
	public GenericMsEntityException(String code, String message) {
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
 
