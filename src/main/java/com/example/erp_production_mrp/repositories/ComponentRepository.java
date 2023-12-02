package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.model.Component;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentRepository extends JpaRepository<Component, Long> {

}
