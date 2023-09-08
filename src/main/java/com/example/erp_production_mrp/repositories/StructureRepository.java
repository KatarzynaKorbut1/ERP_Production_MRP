package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StructureRepository extends JpaRepository<Structure, Long> {

    List<Structure> findByItem(Item item);
}
