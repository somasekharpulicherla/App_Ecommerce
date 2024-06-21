package com.ecommerce.AppEcommerce.user.exceptions;

public class UsernameAlreadyExistsException  extends RuntimeException{
 
	 public UsernameAlreadyExistsException(String message) {
	        super(message);
	    }
}
