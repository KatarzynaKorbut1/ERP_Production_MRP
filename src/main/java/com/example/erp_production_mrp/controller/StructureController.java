package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.Structure;
import com.example.erp_production_mrp.services.ItemService;
import com.example.erp_production_mrp.services.StructureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class StructureController {
    ItemService itemService;
    StructureService structureService;

    public StructureController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PutMapping("/assign")
    public ResponseEntity assignItemToItem(@RequestParam Long itemId,      // powiązqanie specjalizacji z vetem
                                           @RequestParam Long structureId) {


        Optional<Item> item = itemService.getItemById(itemId);
        Structure structureToSet = structureService.getStructure(structureId);
        Set<Structure> structuresFromItem = item.get().getStructures();
//        Set<Structure> structuresFromItem = item.getStructures();
        structuresFromItem.add(structureToSet);

        item.get().setStructures(structuresFromItem);

        List<Item> items = structureToSet.getComponents();
        item.ifPresent(items::add); // gry są optionale to robimy referencję do metody (items::add)
        structureToSet.setComponents(items);
        structureService.saveStructure(structureToSet);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}


