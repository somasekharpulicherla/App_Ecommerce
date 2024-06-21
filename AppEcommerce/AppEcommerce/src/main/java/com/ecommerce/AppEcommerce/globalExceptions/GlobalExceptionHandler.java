package com.ecommerce.AppEcommerce.globalExceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailAuthenticationException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	public static final Logger log=LoggerFactory.getLogger(GlobalExceptionHandler.class);

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
//        Map<String, String> errors = new HashMap<>();
//        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
//            errors.put(error.getField(), error.getDefaultMessage());
//        }
//        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
//    }
    
    @ExceptionHandler(MailAuthenticationException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public String handleMailAuthenticationException(MailAuthenticationException ex) {
        // Log the error
        // logger.error("Mail authentication failed: {}", ex.getMessage());
        
        // Return a meaningful error response to the client
    	log.error("EMAIL FAILED :"+ex.getMessage());
        return "Mail authentication failed: " + ex.getMessage();
    }
    
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGeneralException(Exception ex, WebRequest request) {
        return new ResponseEntity<>("Invalid JWT token", HttpStatus.UNAUTHORIZED);
    }
    
    @ExceptionHandler(IOException.class)
    public ResponseEntity<?> handleGeneralExcepteion(Exception ex, WebRequest request) {
        return new ResponseEntity<>("Invalid unalbe token", HttpStatus.UNAUTHORIZED);
    }
    
    

}
