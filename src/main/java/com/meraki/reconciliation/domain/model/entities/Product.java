package com.meraki.reconciliation.domain.model.entities;

public class Product {
    private final String productCode;
    private final String productName;

    public Product(String productCode, String productName) {
        this.productCode = productCode;
        this.productName = productName;
    }
}
