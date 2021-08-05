package com.meraki.reconciliation.domain.model.valueobjects;

import java.math.BigDecimal;

public class Amount {

    private final BigDecimal value;
    private final String currency;

    protected Amount(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }
    public static Amount of(BigDecimal value, String currency){
        return new Amount(value,currency);
    }
}
