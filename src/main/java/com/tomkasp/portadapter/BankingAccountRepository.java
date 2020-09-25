package com.tomkasp.portadapter;

import java.util.Collection;

/**
 * @author Tomasz Kasprzycki
 */
interface BankingAccountRepository {

    void save(BankingAccount bankingAccount);

    void delete(String accountNumber);

    Collection<BankingAccount> getAll();
}
