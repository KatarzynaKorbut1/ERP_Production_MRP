package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.controller.dto.ItemStructureDTO;
import com.example.erp_production_mrp.controller.dto.StructureDTO;
import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.Structure;
import com.example.erp_production_mrp.repositories.ItemRepository;
import com.example.erp_production_mrp.repositories.StructureRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StructureService {

    private StructureRepository structureRepository;
    private ItemRepository itemRepository;
    private StructureService itemStructureRepository;

    public StructureService(StructureRepository structureRepository, ItemRepository itemRepository) {
        this.structureRepository = structureRepository;
        this.itemRepository = itemRepository;
    }

    public Structure getStructure(Long structureId) {
        return structureRepository.findById(structureId).orElse(null);

    }

    public StructureDTO getStructureDTO(Long structureId) {
        return structureRepository.findByStructureId(structureId);
    }

    public void saveStructure(Structure structureToSet) {
        structureRepository.save(structureToSet);
    }

    public List<Structure> getAll() {
        return structureRepository.findAll();
    }

    //do sprawdzenia
//    public List<StructureDTO> getStructureDTO() {
//        return structureRepository.findAll().stream().map(StructureModelMapper::mapStructureEntityToStructureDTP).toList();
//    }

    //getStructureByItemId


    public List<Structure> findStructuresByItemId(Long itemId) {
        if (itemRepository.findById(itemId).isPresent()) {
            return itemRepository.findById(itemId).get().getStructures();
        }
        return new ArrayList<>();
    }

    public List<StructureDTO> findStructureDTOByItemId(Long itemId){
        List <StructureDTO> structureDTO = structureRepository.findAllByItem_ItemId(itemId);
       if (structureDTO.stream().findAny().isPresent()) {
           return structureDTO;
       }
       return new ArrayList<>();


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


}}

