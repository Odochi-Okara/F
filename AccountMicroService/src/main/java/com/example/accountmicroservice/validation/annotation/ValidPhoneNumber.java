package com.example.accountmicroservice.validation.annotation;

import com.example.accountmicroservice.validation.validator.PhoneNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface ValidPhoneNumber{
    String message() default "{custom.valid.phoneNumber.message}";

    Class<?>[] groups() default {};

    public abstract Class<? extends Payload>[] payload() default {};

}
