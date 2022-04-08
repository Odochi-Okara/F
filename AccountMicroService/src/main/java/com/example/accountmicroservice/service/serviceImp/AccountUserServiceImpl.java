package com.example.accountmicroservice.service.serviceImp;

import com.example.accountmicroservice.dto.AccountUserDto;
import com.example.accountmicroservice.exception.ApiBadRequestException;
import com.example.accountmicroservice.model.AccountUser;
import com.example.accountmicroservice.payload.response.RegistrationResponse;
import com.example.accountmicroservice.repository.AccountUserRepository;
import com.example.accountmicroservice.service.AccountUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountUserServiceImpl implements AccountUserService {

    private final AccountUserRepository accountUserRepository;

    @Autowired
    public AccountUserServiceImpl(AccountUserRepository accountUserRepository) {
        this.accountUserRepository = accountUserRepository;
    }

    @Override
    public ResponseEntity<RegistrationResponse> registerUser(AccountUserDto accountUserDto) {

        Optional<AccountUser> accountUser = accountUserRepository.findByEmail(accountUserDto.getEmail());

        if(!accountUser.isPresent()){
            AccountUser accountUser1 = new AccountUser();
            accountUser1.setName(accountUserDto.getName());
            accountUser1.setEmail(accountUserDto.getEmail());
            accountUser1.setPassword(accountUserDto.getPassword());
            accountUser1.setPhone(accountUserDto.getPhone());
            accountUser1.setUsername(accountUserDto.getUsername());
            accountUserRepository.save(accountUser1);
            return ResponseEntity.ok(RegistrationResponse.build(accountUser1));
        }
        throw new ApiBadRequestException("User exists");
    }
}
