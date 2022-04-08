package com.example.accountmicroservice.model;

import com.example.accountmicroservice.model.enums.AccountType;
import lombok.*;

import javax.persistence.*;


@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account extends BaseModel {
    private String accountName;
    private AccountType accountType;
    private Long accountNumber;
    @OneToOne
    @JoinColumn(name = "account_user_id", referencedColumnName = "id")
    private AccountUser accountUser;
    private Double accountBalance;
}
