package com.meraki.reconciliation.infrastructure.repository.jpa;

import com.meraki.reconciliation.infrastructure.repository.jpa.model.ReconJpaEntity;
import org.aspectj.lang.annotation.Before;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReconJpaEntityRepositoryTest {

    @Autowired
    private ReconJpaEntityRepository reconJpaEntityRepository;

    @Before(value = "1")
    public static void Before(){

    }
    @Test
    public void saveReconJpaEntity(){
    }

    @Test
    public void createReconJpaEntity(){
        ReconJpaEntity reconJpaEntity = new ReconJpaEntity("FT16233Q2KDJ",
                "KES1652100040001","20160820","500.00","10",
                " Pending","1:50pm","5","20160820");
        ReconJpaEntity createReconJpaEntity = reconJpaEntityRepository.save(reconJpaEntity);
    }

    @Test
    public void getReconJpaEntityById(){
        ReconJpaEntity reconJpaEntity = reconJpaEntityRepository.findById("FT16233Q2KDJ").get();
        Assertions.assertThat(reconJpaEntity.getTransactionReference()).isEqualTo("FT16233Q2KDJ");
    }
    public void ListReconJpaEntity(){

    }
}