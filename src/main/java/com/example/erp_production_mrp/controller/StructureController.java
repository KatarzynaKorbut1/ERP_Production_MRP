package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.dto.StructureDTO;
import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.Structure;
import com.example.erp_production_mrp.services.ItemService;
import com.example.erp_production_mrp.services.StructureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class StructureController {

    private final StructureService structureService;
    private final ItemService itemService;



    public StructureController(StructureService structureService, ItemService itemService) {
        this.structureService = structureService;
        this.itemService = itemService;
    }


    //Could not get response
    @GetMapping("/structures")
    public ResponseEntity<List<Structure>> getStructures() {
        return new ResponseEntity<>(structureService.getAll(), HttpStatus.OK);
    }


    //Dodać DTO class z builderem !!!
//    @GetMapping("structureComponents")
//    public List<Structure> getStructurWithComponents(){
//        return structureService.getAll().stream().map(structure ->
//                StructureDTO.)
//    }


//    @GetMapping("/structure/all")
//    public ResponseEntity<List<StructureDTO>> getStructureAll() {
//
//        List<StructureDTO> structureDTO = structureService.getStructureDTO();
//        return new ResponseEntity<>(structureDTO, HttpStatus.OK);
//    }

//    @PutMapping("/assign")
//    public ResponseEntity assignItemToItem(@RequestParam Long itemId,      // powiązqanie specjalizacji z vetem
//                                           @RequestParam Long structureId) {
//
//        Optional<Item> item = itemService.getItemById(itemId);
//        Structure structureToSet = structureService.getStructure(structureId);
//        Set<Structure> structuresFromItem = item.get().getStructures();
////        Set<Structure> structuresFromItem = item.getStructures();
//        structuresFromItem.add(structureToSet);
//
//        item.get().setStructures(structuresFromItem);
//
//        List<Item> items = structureToSet.getComponents();
//        item.ifPresent(items::add); // gry są optionale to robimy referencję do metody (items::add)
//        structureToSet.setComponents(items);
//        structureService.saveStructure(structureToSet);
//        return new ResponseEntity(HttpStatus.CREATED);
//    }


}
