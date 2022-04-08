package com.example.accountmicroservice.validation.annotation;

import com.example.accountmicroservice.validation.validator.EmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
public @interface ValidEmail {
    String message() default "{custom.valid.email.message}";
    Class<?>[] groups() default {};

    public abstract Class<? extends Payload> [] payload() default {};
}
