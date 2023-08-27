package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {

}
