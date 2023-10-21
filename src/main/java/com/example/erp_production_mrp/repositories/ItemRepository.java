package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.TypeOfItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByIndexName(String indexName);

    Item findByTypeOfItem(TypeOfItem typeOfItem);

}
