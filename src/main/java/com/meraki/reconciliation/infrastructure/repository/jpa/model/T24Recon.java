package com.meraki.reconciliation.infrastructure.repository.jpa.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Builder
@Table(name = "T24Recon")
public class T24Recon {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tableId;
    private String currency;
    private String amountLcy;
    private String  amountFcy;
    private String bookingDate;
    private String valueDate;
    private String dealNumber;
    private String custId;
    private String accountName;
    private String txnRef;
    private String chequeNo;
    private String paymentDetails;
    private String eslipDate;
    private String eslipTaxCode;
    private String eslipTaxComp;
    private String offUniqRef;
    private String paidInBy;
    private String recordStatus;
    private String txnCode;
    private String productCode;
    private String productName;
    private String assetType;
    private String consolKey;
    private String systemId;

    public T24Recon(){}

    public T24Recon(String tableId, String currency, String amountLcy, String amountFcy, String bookingDate, String valueDate, String dealNumber, String custId, String accountName, String txnRef, String chequeNo, String paymentDetails, String eslipDate, String eslipTaxCode, String eslipTaxComp, String offUniqRef, String paidInBy, String recordStatus, String txnCode, String productCode, String productName, String assetType, String consolKey, String systemId) {
        this.tableId = tableId;
        this.currency = currency;
        this.amountLcy = amountLcy;
        this.amountFcy = amountFcy;
        this.bookingDate = bookingDate;
        this.valueDate = valueDate;
        this.dealNumber = dealNumber;
        this.custId = custId;
        this.accountName = accountName;
        this.txnRef = txnRef;
        this.chequeNo = chequeNo;
        this.paymentDetails = paymentDetails;
        this.eslipDate = eslipDate;
        this.eslipTaxCode = eslipTaxCode;
        this.eslipTaxComp = eslipTaxComp;
        this.offUniqRef = offUniqRef;
        this.paidInBy = paidInBy;
        this.recordStatus = recordStatus;
        this.txnCode = txnCode;
        this.productCode = productCode;
        this.productName = productName;
        this.assetType = assetType;
        this.consolKey = consolKey;
        this.systemId = systemId;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmountLcy() {
        return amountLcy;
    }

    public void setAmountLcy(String amountLcy) {
        this.amountLcy = amountLcy;
    }

    public String getAmountFcy() {
        return amountFcy;
    }

    public void setAmountFcy(String amountFcy) {
        this.amountFcy = amountFcy;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getDealNumber() {
        return dealNumber;
    }

    public void setDealNumber(String dealNumber) {
        this.dealNumber = dealNumber;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTxnRef() {
        return txnRef;
    }

    public void setTxnRef(String txnRef) {
        this.txnRef = txnRef;
    }

    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public String getEslipDate() {
        return eslipDate;
    }

    public void setEslipDate(String eslipDate) {
        this.eslipDate = eslipDate;
    }

    public String getEslipTaxCode() {
        return eslipTaxCode;
    }

    public void setEslipTaxCode(String eslipTaxCode) {
        this.eslipTaxCode = eslipTaxCode;
    }

    public String getEslipTaxComp() {
        return eslipTaxComp;
    }

    public void setEslipTaxComp(String eslipTaxComp) {
        this.eslipTaxComp = eslipTaxComp;
    }

    public String getOffUniqRef() {
        return offUniqRef;
    }

    public void setOffUniqRef(String offUniqRef) {
        this.offUniqRef = offUniqRef;
    }

    public String getPaidInBy() {
        return paidInBy;
    }

    public void setPaidInBy(String paidInBy) {
        this.paidInBy = paidInBy;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getTxnCode() {
        return txnCode;
    }

    public void setTxnCode(String txnCode) {
        this.txnCode = txnCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getConsolKey() {
        return consolKey;
    }

    public void setConsolKey(String consolKey) {
        this.consolKey = consolKey;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    @Override
    public String toString() {
        return "T24Recon{" +
                "tableId='" + tableId + '\'' +
                ", currency='" + currency + '\'' +
                ", amountLcy='" + amountLcy + '\'' +
                ", amountFcy='" + amountFcy + '\'' +
                ", bookingDate='" + bookingDate + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", dealNumber='" + dealNumber + '\'' +
                ", custId='" + custId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", txnRef='" + txnRef + '\'' +
                ", chequeNo='" + chequeNo + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                ", eslipDate='" + eslipDate + '\'' +
                ", eslipTaxCode='" + eslipTaxCode + '\'' +
                ", eslipTaxComp='" + eslipTaxComp + '\'' +
                ", offUniqRef='" + offUniqRef + '\'' +
                ", paidInBy='" + paidInBy + '\'' +
                ", recordStatus='" + recordStatus + '\'' +
                ", txnCode='" + txnCode + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", assetType='" + assetType + '\'' +
                ", consolKey='" + consolKey + '\'' +
                ", systemId='" + systemId + '\'' +
                '}';
    }
}