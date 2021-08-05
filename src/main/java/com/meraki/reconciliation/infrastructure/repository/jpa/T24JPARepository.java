package com.meraki.reconciliation.infrastructure.repository.jpa;

import com.meraki.reconciliation.infrastructure.repository.jpa.model.T24Recon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface T24JPARepository extends JpaRepository<T24Recon, String> {

    //T24Recon getT24ReconByTableId(String tableId);
    //void updateT24Recon(String tableId);
    //void deleteByTableId(String tableId);
    //boolean getT24ReconByTableId();

    Optional<T24Recon> findByDealNumber(String dealNumber);

}
