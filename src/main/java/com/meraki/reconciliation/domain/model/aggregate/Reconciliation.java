package com.meraki.reconciliation.domain.model.aggregate;


import com.meraki.reconciliation.domain.model.valueobjects.Amount;

import java.math.BigDecimal;
import java.util.Date;

public class Reconciliation {

  private String account;
  private String fundsTransfer;
  private String product;
  private String assetType;



  public Amount createReconciliationItem(){
    Amount amount = Amount.of(BigDecimal.valueOf(10000),"KES");
    return amount;
  }
}
