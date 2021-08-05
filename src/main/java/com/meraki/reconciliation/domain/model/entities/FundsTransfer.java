package com.meraki.reconciliation.domain.model.entities;

import com.meraki.reconciliation.domain.model.valueobjects.Amount;

public class FundsTransfer {
    private final String txnRef;
    private final String txnCode;
    private final String paymentDetails;
    private final String paidBy;
    private final String chequeNo;
    private final String systemId;
    private final String recordStatus;
    private final String eslipTaxCode;
    private final String eslipTaxComp;
    private final String eslipDate;
    private final String consolKey;
    private final Amount amountLcy;
    private final Amount amountFcy;



    public FundsTransfer(String txnRef, String txnCode, String paymentDetails, String paidBy, String chequeNo, String systemId, String recordStatusId, String recordStatus, String eslipTaxCode, String eslipTaxComp, String eslipDate, String consolKey, Amount amountLcy, Amount amountFcy) {
        this.txnRef = txnRef;
        this.txnCode = txnCode;
        this.paymentDetails = paymentDetails;
        this.paidBy = paidBy;
        this.chequeNo = chequeNo;
        this.systemId = systemId;
        this.recordStatus = recordStatus;
        this.eslipTaxCode = eslipTaxCode;
        this.eslipTaxComp = eslipTaxComp;
        this.eslipDate = eslipDate;
        this.consolKey = consolKey;
        this.amountLcy = amountLcy;
        this.amountFcy = amountFcy;
    }
}
