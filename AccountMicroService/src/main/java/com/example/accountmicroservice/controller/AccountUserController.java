package com.example.accountmicroservice.controller;

import com.example.accountmicroservice.dto.AccountUserDto;
import com.example.accountmicroservice.model.AccountUser;
import com.example.accountmicroservice.payload.request.RegistrationRequest;
import com.example.accountmicroservice.payload.response.RegistrationResponse;
import com.example.accountmicroservice.service.AccountUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class AccountUserController {

    private final AccountUserService accountUserService;

    @Autowired
    public AccountUserController(AccountUserService accountUserService) {
        this.accountUserService = accountUserService;
    }

    @PostMapping("/")
    public ResponseEntity<RegistrationResponse> createUser(AccountUserDto accountUserDto){
        return accountUserService.registerUser(accountUserDto);
    }

}
