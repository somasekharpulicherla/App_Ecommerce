package com.ecommerce.AppEcommerce.globalServices;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;


@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;
    

	@Autowired
	private SpringTemplateEngine templateEngine;

    public void sendEmail(String to, String subject, String template, Map<String, Object> mapVariables) throws MessagingException {
    	
    	
    	
    	Context context = new Context();
		context.setVariables(mapVariables);
		String htmlContent = templateEngine.process(template, context);

        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true,"UTF-8");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(htmlContent, true); // true indicates HTML content
        javaMailSender.send(message);
    }
}
