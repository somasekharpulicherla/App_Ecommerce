package com.ecommerce.AppEcommerce.user.enums;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GenderValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})// Specify the validator class here
public @interface ValidGender {
    String message() default "Invalid gender. Accepted values are 'Male' or 'Female'.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}