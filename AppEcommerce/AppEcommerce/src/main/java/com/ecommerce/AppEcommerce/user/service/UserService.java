package com.ecommerce.AppEcommerce.user.service;

import java.util.Optional;

import com.ecommerce.AppEcommerce.user.requestResponses.AddUserRequest;
import com.ecommerce.AppEcommerce.user.requestResponses.AddUserResponse;
import com.ecommerce.AppEcommerce.user.requestResponses.UserForgetPasscodeRequest;
import com.ecommerce.AppEcommerce.user.requestResponses.UserForgetPasscodeResponse;
import com.ecommerce.AppEcommerce.user.requestResponses.UserLoginRequest;
import com.ecommerce.AppEcommerce.user.requestResponses.UserLoginResponse;
import com.ecommerce.AppEcommerce.user.requestResponses.UserValidateOtpRequest;
import com.ecommerce.AppEcommerce.user.requestResponses.UserValidateOtpResponse;

import jakarta.validation.Valid;

public interface  UserService {
       Optional<AddUserResponse> addUser(AddUserRequest addUserRequest);
       
       Optional<UserLoginResponse> userLogin(UserLoginRequest userLoginRequest);

	   Optional<UserForgetPasscodeResponse> forgetPasscode(UserForgetPasscodeRequest userForgetPasscodeRequest);

	Optional<UserValidateOtpResponse> userValidateOtp(UserValidateOtpRequest userValidateOtpRequest);
}
