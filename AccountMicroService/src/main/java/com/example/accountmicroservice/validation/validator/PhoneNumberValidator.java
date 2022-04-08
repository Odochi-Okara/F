package com.example.accountmicroservice.validation.validator;

import com.example.accountmicroservice.validation.annotation.ValidPhoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, String> {

    @Override
    public void initialize(ValidPhoneNumber constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        String regex = "//d{11}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}
