package com.example.accountmicroservice.service.serviceImp;

import com.example.accountmicroservice.model.Account;
import com.example.accountmicroservice.model.AccountUser;
import com.example.accountmicroservice.repository.AccountRepository;
import com.example.accountmicroservice.service.AccountService;
import com.example.accountmicroservice.service.AccountUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImp implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountUserService accountUserService;


    public AccountServiceImp(AccountRepository accountRepository, AccountUserService accountUserService) {
        this.accountRepository = accountRepository;
        this.accountUserService = accountUserService;
    }

    @Override
    public ResponseEntity<Account> createAccount(Long userId) {
        AccountUser accountUser = accountUserService.findUserById(userId);
        Account account = new Account();
        account.setAccountUser(accountUser);
        accountRepository.save(account);
        return ResponseEntity.ok(account);
    }

}
