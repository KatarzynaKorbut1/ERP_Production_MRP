package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.model.PurchasingOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchasingOrderRepository extends JpaRepository<PurchasingOrder, Long> {
}
