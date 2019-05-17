package com.globant.bootcamp.unittesting.com.globant.bootcamp.liveclass.data;

import com.globant.bootcamp.unittesting.com.globant.bootcamp.liveclass.domain.Account;

public interface AccountRepository {

    Account getAccount(String username);
}
