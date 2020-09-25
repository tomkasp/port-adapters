package com.tomkasp.portadapter;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/bankingaccounts")
class BankingAccountController {

    private final BankingAccountService bankingAccountService;

    public BankingAccountController(BankingAccountService bankingAccountService) {
        this.bankingAccountService = bankingAccountService;
    }

    @GetMapping
    public Collection<BankingAccount> getBankingAccounts() {
        return bankingAccountService.getBankingAccounts();
    }

    @PostMapping
    public void createAccount(@RequestBody BankingAccountDto bankingAccountDto) {
        bankingAccountService.createBankingAccount(
                bankingAccountDto.getAccountNumber(),
                bankingAccountDto.getCurrencyCode(),
                bankingAccountDto.getUserID()
        );
    }

    @DeleteMapping(path = "{accountNumber}")
    public void deleteAccount(@PathVariable String accountNumber) {
        bankingAccountService.removeBankingAccount(accountNumber);
    }
}
