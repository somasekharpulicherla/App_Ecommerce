package com.ecommerce.AppEcommerce.globalServices;

import java.util.Map;

import com.ecommerce.AppEcommerce.global.entities.EmailRequest;

public interface GlobalService {
	
	boolean sendEmail(EmailRequest emailRequest,Map<String,Object> mapVariables);
    String generateOtp();
}
