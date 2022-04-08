package com.example.accountmicroservice.payload.request;

import com.example.accountmicroservice.validation.annotation.ValidEmail;
import com.example.accountmicroservice.validation.annotation.ValidPassword;
import javax.validation.constraints.NotBlank;

import com.example.accountmicroservice.validation.annotation.ValidPhoneNumber;
import lombok.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class RegistrationRequest implements Serializable{

    @NotNull(message = "Name cannot be null")
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotNull(message = "Email entered is not valid")
    @Email(message = "This must be a valid email")
    @Size(max = 50, message = "Email should contain characters not more than 50")
    @NotBlank(message = "Email field cannot be blank")
    @ValidEmail(message = "Email is not valid")
    private String email;

    @NotNull(message = "Password field cannot be null")
    @NotBlank(message = "Password field cannot be null")
    @Size(min = 8, max= 20, message = "Password should be 8 characters or more")
    @ValidPassword(message = "Password should be 8 characters or more and valid")
    private String password;

    @NotNull(message = "Password field cannot be null")
    @NotBlank(message = "Password field cannot be null")
    private String username;

    @NotNull(message = "Password field cannot be null")
    @NotBlank(message = "Password field cannot be null")
    @ValidPhoneNumber(message = "Phone number is invalid")
    private String phone;

    private Boolean isEnabled;
}
