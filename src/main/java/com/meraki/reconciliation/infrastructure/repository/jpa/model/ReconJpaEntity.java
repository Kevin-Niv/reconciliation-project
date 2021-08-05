package com.meraki.reconciliation.infrastructure.repository.jpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "ReconJpaEntity")
public class ReconJpaEntity {
    @Id
    private String transactionReference;
    private String dealNumber;
    private String valueDate;
    private String amount;
    private String secondaryStatusCode;
    private String description;
    private String nextSend;
    private String numberOfSend;
    private String dateCreated;

    public ReconJpaEntity(){
    }

    public ReconJpaEntity(String transactionReference, String dealNumber, String valueDate, String amount, String secondaryStatusCode, String description, String nextSend, String numberOfSend, String dateCreated) {
        this.transactionReference = transactionReference;
        this.dealNumber = dealNumber;
        this.valueDate = valueDate;
        this.amount = amount;
        this.secondaryStatusCode = secondaryStatusCode;
        this.description = description;
        this.nextSend = nextSend;
        this.numberOfSend = numberOfSend;
        this.dateCreated = dateCreated;
    }

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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String isSecondaryStatusCode() {
        return secondaryStatusCode;
    }

    public void setSecondaryStatusCode(String secondaryStatusCode) {
        this.secondaryStatusCode = secondaryStatusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNextSend() {
        return nextSend;
    }

    public void setNextSend(String nextSend) {
        this.nextSend = nextSend;
    }

    public String getNumberOfSend() {
        return numberOfSend;
    }

    public void setNumberOfSend(String numberOfSend) {
        this.numberOfSend = numberOfSend;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
