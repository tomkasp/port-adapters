package com.tomkasp.portadapter;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This is primary port. It is used by primary adapters. This is entry (API) of our business logic.
 *
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

    public List<BankingAccountDto> getBankingAccounts() {
        return bankingAccountRepository.getAll().stream()
                .map(bankingAccount -> new BankingAccountDto(
                        bankingAccount.getUserIdentifier(),
                        bankingAccount.getCurrencyCode(),
                        bankingAccount.getAccountNumber()))
                .collect(Collectors.toList());
    }
}
