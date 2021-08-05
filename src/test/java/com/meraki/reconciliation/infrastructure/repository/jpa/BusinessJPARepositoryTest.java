package com.meraki.reconciliation.infrastructure.repository.jpa;

import com.meraki.reconciliation.infrastructure.repository.jpa.model.BusinessRecon;
import com.meraki.reconciliation.infrastructure.repository.jpa.model.T24Recon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BusinessJPARepositoryTest {

    @Autowired
    private BusinessJPARepository businessJPARepository;

    @Test
    public void saveBusinessRecon() {
    }

    @Test
    public void saveBusinessTest() {
        BusinessRecon businessRecon = BusinessRecon.builder().accessArea("").valueDate("").amount(BigDecimal.valueOf(3000.0)).s("").origin("")
                .type("").status("").bookDate("").account("").curr("").ourReference1("").theirReference1("").ourReference2("")
                .theirReference2("").matchingType("").msgType("").bookingText1("").bookingText2("").comment("").origTrt("").userTrt("")
                .departmentCode("").investigationStatus("").euroStatus("").dataSource("").entryTimestamp("").entryUser("").matchingTimestamp("")
                .matchingUser("").transCode1("").transCode2("").transCode3("").operatingStatus("").operatingUser("").itemSource("")
                .baseCurr("").baseCurrAmount(BigDecimal.valueOf(23)).creditAmount(BigDecimal.valueOf(34)).debitAmount(BigDecimal.valueOf(0)).backValueDated("").nickname("").physAccNickname("")
                .physicalAccount("").ownerUser("").clas("").quality("").senderTs("").receiverTs("").build();
        businessJPARepository.save(businessRecon);
        org.assertj.core.api.Assertions.assertThat(businessRecon);
        System.out.println("Business Record added: " + businessRecon);
    }


}