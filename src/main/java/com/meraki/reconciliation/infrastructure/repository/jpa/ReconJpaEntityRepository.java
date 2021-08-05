package com.meraki.reconciliation.infrastructure.repository.jpa;

import com.meraki.reconciliation.domain.model.aggregate.ReconProcess;
import com.meraki.reconciliation.infrastructure.repository.jpa.model.ReconJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReconJpaEntityRepository extends JpaRepository<ReconJpaEntity, String> {

   //List<ReconProcess> findByTransactionReference(String transactionReference);

}
