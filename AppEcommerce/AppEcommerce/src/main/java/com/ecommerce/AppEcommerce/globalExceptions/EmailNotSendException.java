package com.ecommerce.AppEcommerce.globalExceptions;

public class EmailNotSendException extends RuntimeException{
	
	public EmailNotSendException(String message) {
		super(message);
	}

}
