package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.controller.dto.ItemDTO;
import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.services.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class ItemController {


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

//    @GetMapping("/itemDTO")
//    public ResponseEntity<List<ItemDTO>> itemDTOResponseEntity(){
//        return new ResponseEntity<>(itemService.getAllItemDTO(), HttpStatus.OK);
//    }


}






