package com.ahd.hexagon.clean.domain.account.repository;

import com.ahd.hexagon.clean.domain.account.entities.Account;
import com.ahd.hexagon.clean.domain.account.valueobjects.AccountId;
import com.ahd.hexagon.clean.domain.account.valueobjects.AccountNumber;

import java.util.Optional;

//in find() and findRequired() to be AccountNumber value object instead of Long
// in nextAccountId() and nextAccountNumber() to be AccountId value object instead of Long
public interface AccountRepository {

    Optional<Account> find(AccountNumber accountNumber);

    Account findRequired(AccountNumber accountNumber);

    void add(Account account);

    void update(Account account);

    AccountId nextAccountId();

    AccountId nextAccountNumber();
}
