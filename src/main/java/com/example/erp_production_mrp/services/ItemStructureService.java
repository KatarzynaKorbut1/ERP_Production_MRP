package com.example.erp_production_mrp.services;


import com.example.erp_production_mrp.dto.ItemStructureDTO;
import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.Structure;
import com.example.erp_production_mrp.repositories.ItemRepository;
import com.example.erp_production_mrp.repositories.StructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemStructureService {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private StructureRepository structureRepository;


public ItemStructureDTO getItemWithStructures(Long itemId){
    Item item = itemRepository.findById(itemId).orElse(null);
    if(item == null){
        return null;
    }
    List<Structure> structures = structureRepository.findByItem(item);
    ItemStructureDTO itemStructureDTO = new ItemStructureDTO();
    assert item != null;
    itemStructureDTO.setIndexName(item.getIndexName());
    itemStructureDTO.setStructures(structures);
    return itemStructureDTO;
}

}
