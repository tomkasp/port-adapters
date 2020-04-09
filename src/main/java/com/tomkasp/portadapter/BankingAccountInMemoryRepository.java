package com.tomkasp.portadapter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Tomasz Kasprzycki
 */
public class BankingAccountInMemoryRepository implements BankingAccountRepository {

    private final Map<String, BankingAccount> bankingAccountsMap = new ConcurrentHashMap<>();

    @Override
    public void save(BankingAccount bankingAccount) {
        bankingAccountsMap.put(bankingAccount.getAccountNumber(), bankingAccount);
    }

    @Override
    public void delete(String accountNumber) {
        bankingAccountsMap.remove(accountNumber);
    }

    public Map<String, BankingAccount> getBankingAccountsMap() {
        return bankingAccountsMap;
    }
}
