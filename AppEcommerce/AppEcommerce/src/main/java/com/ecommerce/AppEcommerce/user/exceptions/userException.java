package com.ecommerce.AppEcommerce.user.exceptions;

import lombok.Data;

@Data
public class userException {
	
	private String error;
	
	public userException(String error) {
		this.error=error;
	}

}
