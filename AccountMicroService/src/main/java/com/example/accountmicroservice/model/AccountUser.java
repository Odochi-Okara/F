package com.example.accountmicroservice.model;
import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "account_user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountUser extends BaseModel{
    private String name;

    private String email;

    private String password;

    private String username;

    private String phone;

    private Boolean isEnabled;

}
