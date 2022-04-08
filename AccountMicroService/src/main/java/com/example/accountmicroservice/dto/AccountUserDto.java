package com.example.accountmicroservice.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountUserDto {

    private String names;

    private String email;

    private String password;

    private String username;

    private String phone;

    private Boolean isEnabled;
}
