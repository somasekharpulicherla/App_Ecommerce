package com.ecommerce.AppEcommerce.user.requestResponses;

import com.ecommerce.AppEcommerce.user.entities.User;
import com.ecommerce.AppEcommerce.user.exceptions.userException;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class UserLoginResponse extends userException{
	
	private String userStatusMsg;
	
	private boolean isUserAuth;
	
	private User user;
	
	private String jwt;

	public UserLoginResponse(String userStatusMsg, boolean isUserAuth, User user,String error) {
		super(error);
		this.userStatusMsg = userStatusMsg;
		this.isUserAuth = isUserAuth;
		this.user = user;
	}
	
}
