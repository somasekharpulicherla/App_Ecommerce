package com.ecommerce.AppEcommerce.user.enums;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<ValidGender, Gender> {

    @Override
    public void initialize(ValidGender constraintAnnotation) {
        // No initialization needed
    }

    @Override
    public boolean isValid(Gender value, ConstraintValidatorContext context) {
        return value != null && (value == Gender.Male || value == Gender.Female);
    }
}
