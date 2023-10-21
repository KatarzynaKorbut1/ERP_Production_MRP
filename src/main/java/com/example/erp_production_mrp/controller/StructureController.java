package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.controller.dto.ItemStructureDTO;
import com.example.erp_production_mrp.model.Structure;
import com.example.erp_production_mrp.services.ItemService;
import com.example.erp_production_mrp.services.ItemStructureService;
import com.example.erp_production_mrp.services.StructureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StructureController {

    private final StructureService structureService;
    private final ItemService itemService;
    private final ItemStructureService itemStructureService;



    public StructureController(StructureService structureService, ItemService itemService, ItemStructureService itemStructureService) {
        this.structureService = structureService;
        this.itemService = itemService;
        this.itemStructureService = itemStructureService;
    }


    //działa
    @GetMapping("/structures")
    public ResponseEntity<List<Structure>> getStructures() {
        return new ResponseEntity<>(structureService.getAll(), HttpStatus.OK);
    }

    //http://localhost:8080/api/itemStructures/indexName/index2
    @GetMapping("/itemStructures/indexName/{indexName}")
    public ResponseEntity<List<ItemStructureDTO>> getItemWithStructures(@PathVariable String indexName) {
        List<ItemStructureDTO> itemStructureDTO = itemStructureService.getItemWithStructuresByIndexName(indexName);
        if (itemStructureDTO == null) {
            // Obsłuż brak znalezienia przedmiotu
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(itemStructureDTO);
    }


    @GetMapping("/itemStructures/allItems")
    public ResponseEntity<List<ItemStructureDTO>> getAllItemsWithStructures() {
        List<ItemStructureDTO> itemStructureDTO = itemStructureService.getItemStructureDTOList();
        if (itemStructureDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(itemStructureDTO);

    }


//    @GetMapping("/itemStructures/allItemsWithComponents")
//    public List<ItemStructureDTO> getAllItemsWithStructuresAndComponents(){
//
//        return getItemStructureDTOList();
//
//    }


//        @GetMapping("/itemStructures")
//    public ResponseEntity<ItemStructureDTO> getItemWithStructures() {
//        ItemStructureDTO itemStructureDTO = itemStructureService.getItemsWithStructures();
//        if (itemStructureDTO == null) {
//            // Obsłuż brak znalezienia przedmiotu
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(itemStructureDTO);
//    }


//    @GetMapping("/itemsStructures")
//    public ResponseEntity getAllItemsStructures (){
//        return new ResponseEntity<>(itemStructureService.getItemsWithStructures(), HttpStatus.CREATED);
//    }



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


    //nie działa
    @PutMapping("/assign")
    public ResponseEntity assignStructureToItem(@RequestParam Long itemId,      // powiązqanie specjalizacji z vetem
                                                @RequestParam Long structureId) {

        //Optional<Item> item = itemService.getItemById(itemId);

List<Structure> structuresFromItem = structureService.findStructuresByItemId(itemId);
                Structure structureToSet = structureService.getStructure(structureId);
                structuresFromItem.add(structureToSet);
        System.out.println(Arrays.asList(structureToSet));

//                List<Structure> updatedStructures = item.get().getStructures();
//                updatedStructures.add(structureToSet);
//
//                item.ifPresent(item1 -> item1.setStructures(updatedStructures));


//        if(item.isPresent()) {
//            Item updatedItem = item.get();
//
//            List<Structure> updatedStructureList = updatedItem.getStructures();
//
        System.out.println("Breakpoint");

           // itemService.createItem(updatedItem);
           return new ResponseEntity<>(HttpStatus.OK);
//        }else {
//            return ResponseEntity.notFound().build();
    }

    //localhost:8080/api/assign?itemId=1&structureId=1
//    @PutMapping("/assign")
//    public ResponseEntity assignStructureToItem(@RequestParam Long itemId,      // powiązqanie specjalizacji z vetem
//                                           @RequestParam Long structureId) {

//        Optional<Item> item = itemService.getItemById(itemId);
//        Structure structureToSet = structureService.getStructure(structureId);
//        List<Structure> structuresFromItem = item.get().getStructures();
////        Set<Structure> structuresFromItem = item.getStructures();
//        structuresFromItem.add(structureToSet);
//        item.get().setStructures(structuresFromItem);
//        itemService.createItem(item.get());
//
//        List<Item> items = (List<Item>) structureToSet.getItem();
//        item.ifPresent(items::add); // gry są optionale to robimy referencję do metody (items::add)
//        structureToSet.setItem((Item) items);
//        structureService.saveStructure(structureToSet);
//        System.out.println("Break point");
//        return new ResponseEntity(HttpStatus.CREATED);

//        List<Item> items = structureToSet.getComponents();
//        item.ifPresent(items::add); // gry są optionale to robimy referencję do metody (items::add)
//        structureToSet.setComponents(items);
//        structureService.saveStructure(structureToSet);
//        return new ResponseEntity(HttpStatus.CREATED);

    }



