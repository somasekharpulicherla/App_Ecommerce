package com.ecommerce.AppEcommerce.user.exceptions;

public class UserNotFoundException  extends RuntimeException{
  
	public UserNotFoundException(String message) {
		super(message);
	}
}
