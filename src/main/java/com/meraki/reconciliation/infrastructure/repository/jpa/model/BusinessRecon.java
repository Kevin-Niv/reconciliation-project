package com.meraki.reconciliation.infrastructure.repository.jpa.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Data
@Builder
@Table(name = "BusinessRecon")
public class BusinessRecon {

    private String accessArea;
    private String valueDate;
    private BigDecimal amount;
    private String s;
    private String origin;
    private String type;
    private String status;
    private String bookDate;
    private String account;
    private String curr;
    private String ourReference1;
    private String theirReference1;
    private String ourReference2;
    private String theirReference2;
    private String matchingType;
    private String msgType;
    @Id
    private String bookingText1;
    private String bookingText2;
    private String comment;
    private String origTrt;
    private String userTrt;
    private String departmentCode;
    private String investigationStatus;
    private String euroStatus;
    private String dataSource;
    private String entryTimestamp;
    private String entryUser;
    private String matchingTimestamp;
    private String matchingUser;
    private String transCode1;
    private String transCode2;
    private String transCode3;
    private String operatingStatus;
    private String operatingUser;
    private String itemSource;
    private String baseCurr;
    private BigDecimal baseCurrAmount;
    private BigDecimal creditAmount;
    private BigDecimal debitAmount;
    private String backValueDated;
    private String nickname;
    private String physAccNickname;
    private String physicalAccount;
    private String ownerUser;
    private String clas;
    private String quality;
    private String senderTs;
    private String receiverTs;

    public void setAccessArea(String accessArea) {
        this.accessArea = accessArea;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }

    public void setOurReference1(String ourReference1) {
        this.ourReference1 = ourReference1;
    }

    public void setTheirReference1(String theirReference1) {
        this.theirReference1 = theirReference1;
    }

    public void setOurReference2(String ourReference2) {
        this.ourReference2 = ourReference2;
    }

    public void setTheirReference2(String theirReference2) {
        this.theirReference2 = theirReference2;
    }

    public void setMatchingType(String matchingType) {
        this.matchingType = matchingType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public void setBookingText1(String bookingText1) {
        this.bookingText1 = bookingText1;
    }

    public void setBookingText2(String bookingText2) {
        this.bookingText2 = bookingText2;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setOrigTrt(String origTrt) {
        this.origTrt = origTrt;
    }

    public void setUserTrt(String userTrt) {
        this.userTrt = userTrt;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setInvestigationStatus(String investigationStatus) {
        this.investigationStatus = investigationStatus;
    }

    public void setEuroStatus(String euroStatus) {
        this.euroStatus = euroStatus;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public void setEntryTimestamp(String entryTimestamp) {
        this.entryTimestamp = entryTimestamp;
    }

    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser;
    }

    public void setMatchingTimestamp(String matchingTimestamp) {
        this.matchingTimestamp = matchingTimestamp;
    }

    public void setMatchingUser(String matchingUser) {
        this.matchingUser = matchingUser;
    }

    public void setTransCode1(String transCode1) {
        this.transCode1 = transCode1;
    }

    public void setTransCode2(String transCode2) {
        this.transCode2 = transCode2;
    }

    public void setTransCode3(String transCode3) {
        this.transCode3 = transCode3;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    public void setOperatingUser(String operatingUser) {
        this.operatingUser = operatingUser;
    }

    public void setItemSource(String itemSource) {
        this.itemSource = itemSource;
    }

    public void setBaseCurr(String baseCurr) {
        this.baseCurr = baseCurr;
    }

    public void setBaseCurrAmount(BigDecimal baseCurrAmount) {
        this.baseCurrAmount = baseCurrAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    public void setBackValueDated(String backValueDated) {
        this.backValueDated = backValueDated;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPhysAccNickname(String physAccNickname) {
        this.physAccNickname = physAccNickname;
    }

    public void setPhysicalAccount(String physicalAccount) {
        this.physicalAccount = physicalAccount;
    }

    public void setOwnerUser(String ownerUser) {
        this.ownerUser = ownerUser;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setSenderTs(String senderTs) {
        this.senderTs = senderTs;
    }

    public void setReceiverTs(String receiverTs) {
        this.receiverTs = receiverTs;
    }

    public String getAccessArea() {
        return accessArea;
    }

    public String getValueDate() {
        return valueDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getS() {
        return s;
    }

    public String getOrigin() {
        return origin;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getBookDate() {
        return bookDate;
    }

    public String getAccount() {
        return account;
    }

    public String getCurr() {
        return curr;
    }

    public String getOurReference1() {
        return ourReference1;
    }

    public String getTheirReference1() {
        return theirReference1;
    }

    public String getOurReference2() {
        return ourReference2;
    }

    public String getTheirReference2() {
        return theirReference2;
    }

    public String getMatchingType() {
        return matchingType;
    }

    public String getMsgType() {
        return msgType;
    }

    public String getBookingText1() {
        return bookingText1;
    }

    public String getBookingText2() {
        return bookingText2;
    }

    public String getComment() {
        return comment;
    }

    public String getOrigTrt() {
        return origTrt;
    }

    public String getUserTrt() {
        return userTrt;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getInvestigationStatus() {
        return investigationStatus;
    }

    public String getEuroStatus() {
        return euroStatus;
    }

    public String getDataSource() {
        return dataSource;
    }

    public String getEntryTimestamp() {
        return entryTimestamp;
    }

    public String getEntryUser() {
        return entryUser;
    }

    public String getMatchingTimestamp() {
        return matchingTimestamp;
    }

    public String getMatchingUser() {
        return matchingUser;
    }

    public String getTransCode1() {
        return transCode1;
    }

    public String getTransCode2() {
        return transCode2;
    }

    public String getTransCode3() {
        return transCode3;
    }

    public String getOperatingStatus() {
        return operatingStatus;
    }

    public String getOperatingUser() {
        return operatingUser;
    }

    public String getItemSource() {
        return itemSource;
    }

    public String getBaseCurr() {
        return baseCurr;
    }

    public BigDecimal getBaseCurrAmount() {
        return baseCurrAmount;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    public String getBackValueDated() {
        return backValueDated;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPhysAccNickname() {
        return physAccNickname;
    }

    public String getPhysicalAccount() {
        return physicalAccount;
    }

    public String getOwnerUser() {
        return ownerUser;
    }

    public String getClas() {
        return clas;
    }

    public String getQuality() {
        return quality;
    }

    public String getSenderTs() {
        return senderTs;
    }

    public String getReceiverTs() {
        return receiverTs;
    }

    @Override
    public String toString() {
        return "BusinessRecon{" +
                "accessArea='" + accessArea + '\'' +
                ", valueDate='" + valueDate + '\'' +
                ", amount=" + amount +
                ", s='" + s + '\'' +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", bookDate='" + bookDate + '\'' +
                ", account='" + account + '\'' +
                ", curr='" + curr + '\'' +
                ", ourReference1='" + ourReference1 + '\'' +
                ", theirReference1='" + theirReference1 + '\'' +
                ", ourReference2='" + ourReference2 + '\'' +
                ", theirReference2='" + theirReference2 + '\'' +
                ", matchingType='" + matchingType + '\'' +
                ", msgType='" + msgType + '\'' +
                ", bookingText1='" + bookingText1 + '\'' +
                ", bookingText2='" + bookingText2 + '\'' +
                ", comment='" + comment + '\'' +
                ", origTrt='" + origTrt + '\'' +
                ", userTrt='" + userTrt + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", investigationStatus='" + investigationStatus + '\'' +
                ", euroStatus='" + euroStatus + '\'' +
                ", dataSource='" + dataSource + '\'' +
                ", entryTimestamp='" + entryTimestamp + '\'' +
                ", entryUser='" + entryUser + '\'' +
                ", matchingTimestamp='" + matchingTimestamp + '\'' +
                ", matchingUser='" + matchingUser + '\'' +
                ", transCode1='" + transCode1 + '\'' +
                ", transCode2='" + transCode2 + '\'' +
                ", transCode3='" + transCode3 + '\'' +
                ", operatingStatus='" + operatingStatus + '\'' +
                ", operatingUser='" + operatingUser + '\'' +
                ", itemSource='" + itemSource + '\'' +
                ", baseCurr='" + baseCurr + '\'' +
                ", baseCurrAmount=" + baseCurrAmount +
                ", creditAmount=" + creditAmount +
                ", debitAmount=" + debitAmount +
                ", backValueDated='" + backValueDated + '\'' +
                ", nickname='" + nickname + '\'' +
                ", physAccNickname='" + physAccNickname + '\'' +
                ", physicalAccount='" + physicalAccount + '\'' +
                ", ownerUser='" + ownerUser + '\'' +
                ", clas='" + clas + '\'' +
                ", quality='" + quality + '\'' +
                ", senderTs='" + senderTs + '\'' +
                ", receiverTs='" + receiverTs + '\'' +
                '}';
    }
}
