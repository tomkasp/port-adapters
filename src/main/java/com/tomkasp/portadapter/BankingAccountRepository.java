package com.tomkasp.portadapter;

/**
 * @author Tomasz Kasprzycki
 */
interface BankingAccountRepository {

    void save(BankingAccount bankingAccount);

    void delete(String accountNumber);
}
