package springbootcamp.unittest.data;

import springbootcamp.unittest.domain.Account;
import springbootcamp.unittest.domain.AccountType;

public interface AccountRepository {
    Account findAccountByUsernameAndType(String username, AccountType accountType);
    Account updateAccount(Account account);
}
