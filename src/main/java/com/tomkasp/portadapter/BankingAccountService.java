package com.tomkasp.portadapter;

import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author Tomasz Kasprzycki
 */
@Service
public class BankingAccountService {

    private final BankingAccountRepository bankingAccountRepository;

    public BankingAccountService(BankingAccountRepository bankingAccountRepository) {
        this.bankingAccountRepository = bankingAccountRepository;
    }

    public void createBankingAccount(String accountNumber, String currencyCode, String userIdentifier) {
        bankingAccountRepository.save(new BankingAccount(
                accountNumber,
                currencyCode,
                userIdentifier
        ));
    }

    public void removeBankingAccount(String accountNumber) {
        bankingAccountRepository.delete(accountNumber);
    }

    public Collection<BankingAccount> getBankingAccounts() {
        return bankingAccountRepository.getAll();
    }
}
