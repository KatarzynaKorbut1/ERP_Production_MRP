package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.model.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemStructureRepository extends JpaRepository<Structure, Long> {
}