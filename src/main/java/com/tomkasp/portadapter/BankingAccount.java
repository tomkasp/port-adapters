package com.tomkasp.portadapter;

/**
 * @author Tomasz Kasprzycki
 */
class BankingAccount {

    private final String accountNumber;
    private final String currencyCode;
    private final String userIdentifier;

    BankingAccount(String accountNumber, String currencyCode, String userIdentifier) {
        this.accountNumber = accountNumber;
        this.currencyCode = currencyCode;
        this.userIdentifier = userIdentifier;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getUserIdentifier() {
        return userIdentifier;
    }
}
