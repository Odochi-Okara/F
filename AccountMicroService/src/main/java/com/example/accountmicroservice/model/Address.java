package com.example.accountmicroservice.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotNull
    private String street;

    @NotNull
    private String city;

    @NotNull
    private String state;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = AccountUser.class)
    @JoinColumn(name = "account_user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private AccountUser user;
}
