package com.ecommerce.AppEcommerce.user.requestResponses;

import com.ecommerce.AppEcommerce.user.entities.User;
import com.ecommerce.AppEcommerce.user.exceptions.userException;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AddUserResponse extends userException{

	private String userMessage;
	
	private User user;
	
	public AddUserResponse(String userMessage, User user,String error) {
		super(error);
		this.userMessage=userMessage;
		this.user=user;
	}
	


}
