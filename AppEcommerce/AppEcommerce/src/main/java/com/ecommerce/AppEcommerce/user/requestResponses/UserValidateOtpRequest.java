package com.ecommerce.AppEcommerce.user.requestResponses;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserValidateOtpRequest {
	
	@NotBlank(message="Email or Username can not be blank")
	@Pattern(regexp = "^[a-zA-Z0-9@.]+$",message="Username or Email doesn't allow special characters except @ and dot.")
	private String usernameOrEmail;
	
	@NotBlank(message="Passcode can not be blank")
	@Size(min = 8, max = 50, message = "Passcode must be between 3 and 50 characters")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]*$",
    message = "Passcode must contain at least one uppercase, one lowercase, one digit, one special characters")
	private String passcode;
	
	@NotBlank(message="One Time Passcode can not be blank")
	@Pattern(regexp = "^[0-9]{6}$",message="One Time Passcod should contain only 6 digits.")
	private String otp;

}
