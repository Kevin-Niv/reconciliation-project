package com.meraki.reconciliation.domain.model.entities;

public class Account {
    private final String dealNumber;
    private final String accountName;
    private final String customerId;
    private final String consolKey;


    public Account(String dealNumber, String accountName, String cusId, String customerId, String consolKey) {
        this.dealNumber = dealNumber;
        this.accountName = accountName;
        this.customerId = customerId;
        this.consolKey = consolKey;
    }
}
