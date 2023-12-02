package com.example.erp_production_mrp.repositories;

import com.example.erp_production_mrp.controller.dto.StructureDTO;
import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.Structure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StructureRepository extends JpaRepository<Structure, Long> {

    List<StructureDTO> findByItem(Item item);


    List<Structure> findAllByItem(Item item);

    List<StructureDTO> findAllByItem_ItemId(Long itemId);

    StructureDTO findByStructureId(Long structureId);
}
