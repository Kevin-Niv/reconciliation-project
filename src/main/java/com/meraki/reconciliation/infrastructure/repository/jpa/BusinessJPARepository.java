package com.meraki.reconciliation.infrastructure.repository.jpa;

import com.meraki.reconciliation.infrastructure.repository.jpa.model.BusinessRecon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessJPARepository extends JpaRepository<BusinessRecon, String> {


}
