package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
