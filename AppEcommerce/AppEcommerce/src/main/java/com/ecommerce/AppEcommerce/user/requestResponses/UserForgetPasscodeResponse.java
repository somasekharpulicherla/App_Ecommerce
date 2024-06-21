package com.ecommerce.AppEcommerce.user.requestResponses;

import com.ecommerce.AppEcommerce.user.exceptions.userException;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=false)
public class UserForgetPasscodeResponse extends userException {
	
	private String userStatusMsg;

	public UserForgetPasscodeResponse( String userStatusMsg,String error) {
		super(error);
		this.userStatusMsg = userStatusMsg;
	}
	
}
