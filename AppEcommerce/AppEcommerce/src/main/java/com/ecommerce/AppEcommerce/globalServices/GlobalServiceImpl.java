package com.ecommerce.AppEcommerce.globalServices;

import java.security.SecureRandom;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import com.ecommerce.AppEcommerce.global.entities.EmailRequest;

import jakarta.mail.MessagingException;

@Service
public class GlobalServiceImpl implements GlobalService {

	public static final Logger log = LoggerFactory.getLogger(GlobalServiceImpl.class);
	
	private static final String DIGITS = "0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();

	@Autowired
	private EmailService emailService;


	public boolean sendEmail(EmailRequest emailRequest, Map<String, Object> mapVariables) {
		try {

			emailService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody(), mapVariables);
			log.info("Email sent Successfully to :" + emailRequest.toString());
			return true;
		} catch (MessagingException e) {
			log.error("Failed to send email: " + e.getMessage());
		}
		return false;
	}
	
	
	 public String generateOtp() {
		    int length=6;
	        StringBuilder otp = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            otp.append(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
	        }
	        return otp.toString();
	    }

}
