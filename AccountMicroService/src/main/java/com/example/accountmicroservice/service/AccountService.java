package com.example.accountmicroservice.service;

import com.example.accountmicroservice.model.Account;
import org.springframework.http.ResponseEntity;

public interface AccountService {
    ResponseEntity<Account> createAccount(Long userId);
}
