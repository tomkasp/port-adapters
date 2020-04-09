package com.tomkasp.portadapter;

/**
 * @author Tomasz Kasprzycki
 */
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
