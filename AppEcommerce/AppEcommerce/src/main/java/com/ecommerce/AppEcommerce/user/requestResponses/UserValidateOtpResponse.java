package com.ecommerce.AppEcommerce.user.requestResponses;

import com.ecommerce.AppEcommerce.user.exceptions.userException;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class UserValidateOtpResponse extends userException{

	private String userStatusMsg;

	public UserValidateOtpResponse( String userStatusMsg,String error) {
		super(error);
		this.userStatusMsg = userStatusMsg;
	}
	
}
