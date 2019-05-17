package springbootcamp.unittest.business;

import javax.security.auth.login.AccountException;

import springbootcamp.unittest.domain.Account;
import springbootcamp.unittest.domain.AccountType;
import springbootcamp.unittest.domain.TransferResponse;

public interface AccountService {
    Account retrieveAccount(String username, AccountType accountType);
    TransferResponse transferMoney(Account currentAccount, Account savingAccount, final int amount) throws AccountException;
}
