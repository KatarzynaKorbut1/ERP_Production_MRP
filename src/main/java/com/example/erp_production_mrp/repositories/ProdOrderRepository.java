package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.model.ProductionOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdOrderRepository extends JpaRepository<ProductionOrder, Long> {
}
