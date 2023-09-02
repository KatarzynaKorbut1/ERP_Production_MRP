package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.Structure;
import com.example.erp_production_mrp.repositories.ItemRepository;
import com.example.erp_production_mrp.repositories.StructureRepository;


public class StructureService {

    private StructureRepository structureRepository;
    private ItemRepository itemRepository;

    public StructureService(StructureRepository structureRepository, ItemRepository itemRepository) {
        this.structureRepository = structureRepository;
        this.itemRepository = itemRepository;
    }

    public Structure getStructure(Long structureId) {
        return structureRepository.findById(structureId).orElse(null);

    }

    public void saveStructure(Structure structureToSet) {
        structureRepository.save(structureToSet);
    }

//    public void saveStructure(Structure structureToSet) {
//    }

//    @PutMapping("/assign")
//    public ResponseEntity assignItemToItem(@RequestParam Long itemId,      // powiązqanie specjalizacji z vetem
//                                           @RequestParam Long structureId){
//        Item item = itemService.getItemById(itemId);
//        Structure structureToSet = structureService.getStructure(structureId);
//        Set<Structure> structuresFromItem = item.getStructures();
//        structuresFromItem.add(structureToSet);
//
//        item.setStructures(structuresFromItem);
//        itemService.createStructure(item);
//
//        Set<Item> items = structureToSet.getComponents();
//        items.add(item);
//        structureToSet.setComponents(items);
//        structureService.saveStructure(structureToSet);
//        return new ResponseEntity(HttpStatus.CREATED);


    }

