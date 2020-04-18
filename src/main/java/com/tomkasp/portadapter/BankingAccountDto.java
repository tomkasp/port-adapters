package com.tomkasp.portadapter;

public class BankingAccountDto {

    private String userId;
    private String currencyCode;
    private String accountNumber;

    public String getUserID() {
        return userId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
