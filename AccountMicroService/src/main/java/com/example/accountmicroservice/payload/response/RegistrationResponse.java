package com.example.accountmicroservice.payload.response;
import com.example.accountmicroservice.model.AccountUser;
import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class RegistrationResponse {
    private String message;

    private String name;

    public static RegistrationResponse build(AccountUser user) {

        return new RegistrationResponse("Registered successfully",
                user.getName());

    }

}
