package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.services.ItemService;
import com.example.erp_production_mrp.services.ItemStructureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@Slf4j
public class ItemController {

    @Autowired
    private ItemStructureService itemStructureService;
    private final ItemService itemService;

    ArrayList<Item> items;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @PostMapping("/item")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        itemService.createItem(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @GetMapping("/items")
    public ResponseEntity<List<Item>> getItems() {
        return new ResponseEntity<>(itemService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/item/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
        if (itemService.getItemById(id).isPresent()) {
            return new ResponseEntity<>(itemService.getItemById(id).get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    @GetMapping("/items/type")
//    public ResponseEntity<Item> getItemByType(@PathVariable )

    @DeleteMapping("/item/{id}")
    public HttpStatus deleteItemById(@PathVariable int id) {
        items.remove(id);
        return HttpStatus.NO_CONTENT;
    }

//    @GetMapping("/itemStructures/{itemId}")
//    public ResponseEntity<ItemStructureDTO> getItemWithStructures(@PathVariable Long itemId) {
//        ItemStructureDTO itemStructureDTO = itemStructureService.getItemWithStructures(itemId);
//        if (itemStructureDTO == null) {
//            // Obsłuż brak znalezienia przedmiotu
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(itemStructureDTO);
//    }

//        @GetMapping("/itemStructures/{itemId}")
//    public ResponseEntity<ItemStructureDTO> getItemWithStructures(@PathVariable Long itemId) {
//        ItemStructureDTO itemStructureDTO = itemStructureService.getItemWithStructures(itemId);
//        if (itemStructureDTO == null) {
//            // Obsłuż brak znalezienia przedmiotu
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(itemStructureDTO);
//    }
//



}






