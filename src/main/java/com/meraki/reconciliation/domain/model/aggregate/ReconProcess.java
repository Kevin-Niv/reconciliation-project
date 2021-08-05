package com.meraki.reconciliation.domain.model.aggregate;

import com.meraki.reconciliation.domain.model.valueobjects.Amount;


public class ReconProcess {

    private String transactionReference;
    private String dealNumber;
    private String valueDate;
    private Amount amount;

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public String getDealNumber() {
        return dealNumber;
    }

    public void setDealNumber(String dealNumber) {
        this.dealNumber = dealNumber;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    /*public boolean reconcile(ReconProcess reconProcess) {
        if (transactionReference.equalsIgnoreCase(reconProcess.getTransactionReference())) {
            return true;
        } else {
            return false;
        }
        if (dealNumber.equalsIgnoreCase(reconProcess.getDealNumber())) {
            return true;
        } else {
            return false;
        }
        if (valueDate.equalsIgnoreCase(reconProcess.getValueDate())) {
            return true;
        } else {
            return false;
        }
    }*/

    public boolean compare(ReconProcess reconProcess) {
        if (transactionReference.equalsIgnoreCase(reconProcess.getTransactionReference())) {
            return true;
        }
        if (dealNumber.equalsIgnoreCase(reconProcess.getDealNumber())) {
            return true;
        }
        if (valueDate.equalsIgnoreCase(reconProcess.getValueDate())){
            return true;
        }else {
            return false;
        }
    }
}