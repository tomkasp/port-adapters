package com.tomkasp.portadapter;

import org.springframework.stereotype.Service;

/**
 * @author Tomasz Kasprzycki
 */
@Service
public class BankingAccountService {

    BankingAccountRepository bankingAccountRepository;

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
}
