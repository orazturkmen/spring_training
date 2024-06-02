package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.security.auth.login.AccountException;

@Entity
@NoArgsConstructor
@Table(name = "user_account")
@Data
public class User extends BaseEntity{
    private String email;
    private String password;
    private String username;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_datails_id")
    private Account account;

}
