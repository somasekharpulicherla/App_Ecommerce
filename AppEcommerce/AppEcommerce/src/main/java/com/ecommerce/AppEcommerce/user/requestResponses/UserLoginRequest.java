package com.ecommerce.AppEcommerce.user.requestResponses;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class UserLoginRequest {
	
	@NotBlank(message="Email or Username can not be blank")
	@Pattern(regexp = "^[a-zA-Z0-9@.]+$",message="Username or Email doesn't allow special characters except @ and dot.")
	private String usernameOrEmail;
	
	@NotBlank(message="Passcode can not be blank")
	private String passcode;

}
