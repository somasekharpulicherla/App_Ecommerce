package com.ecommerce.AppEcommerce;


import io.jsonwebtoken.Jwts;
import jakarta.xml.bind.DatatypeConverter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.crypto.SecretKey;

public class JwtSecretMakerTest {

//    @Test
//    public void generateSecretKey() {
//        SecretKey key = Jwts.SIG.HS512.key().build();
//        String encodedKey = DatatypeConverter.printHexBinary(key.getEncoded());
//        System.out.printf("\nKey = [%s]\n", encodedKey);
//    }
//    
    
    @Autowired
	private PasswordEncoder passwordEncoder;

    @Test
    public void g() {
    	String s="$2a$10$7KajA4eGEq3822TjkQr/.egpMJn/jsdMGiGGjL/toaeDOhgY/2d.6";
         String ss="$2a$10$1ZfXNo8ps0.abX84W6/okeX8P6XGwXYlw1Y77x6Dp2VYmgFvbRtFK";
    	System.out.println(passwordEncoder.encode("Rgukt@123"));
    }
}