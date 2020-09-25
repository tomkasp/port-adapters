package com.tomkasp.portadapter;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Tomasz Kasprzycki
 */
@Component
class BankingAccountInMemoryRepository implements BankingAccountRepository {

    private final Map<String, BankingAccount> bankingAccountsMap = new ConcurrentHashMap<>();

    @Override
    public void save(BankingAccount bankingAccount) {
        bankingAccountsMap.put(bankingAccount.getAccountNumber(), bankingAccount);
    }

    @Override
    public void delete(String accountNumber) {
        bankingAccountsMap.remove(accountNumber);
    }

    @Override
    public Collection<BankingAccount> getAll() {
        return bankingAccountsMap.values();
    }

    public Map<String, BankingAccount> getBankingAccountsMap() {
        return bankingAccountsMap;
    }
}
