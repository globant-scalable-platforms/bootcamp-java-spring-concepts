package com.globant.bootcamp.unittesting.com.globant.bootcamp.liveclass.business;

import com.globant.bootcamp.unittesting.com.globant.bootcamp.liveclass.data.AccountRepository;
import com.globant.bootcamp.unittesting.com.globant.bootcamp.liveclass.domain.Account;

public class AuthenticatorImpl implements Authenticator{
    private AccountRepository accountRepository;

    public AuthenticatorImpl(final AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public boolean authenticate(final String username, final String password){
        final Account account = accountRepository.getAccount(username);
        return account.getPassword().equals(password);
    }
}
