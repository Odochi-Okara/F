package com.example.accountmicroservice.service;

import com.example.accountmicroservice.dto.AccountUserDto;
import com.example.accountmicroservice.model.AccountUser;
import com.example.accountmicroservice.payload.request.RegistrationRequest;
import com.example.accountmicroservice.payload.response.RegistrationResponse;
import org.springframework.http.ResponseEntity;

public interface AccountUserService {
      ResponseEntity<RegistrationResponse> registerUser(AccountUserDto accountUserDto);
      AccountUser findUserById(Long userId);
}
