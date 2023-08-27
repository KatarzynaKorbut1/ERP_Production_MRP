package com.example.erp_production_mrp.controller;
import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.services.ItemService;
import com.example.erp_production_mrp.services.ItemSupplierService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@Slf4j
public class RestApiController {
    ItemService itemService;
    ItemSupplierService itemSupplierService;
    ArrayList<Item> items;



    public RestApiController(ItemService itemService, ItemSupplierService itemSupplierService) {
        this.itemService = itemService;
        this.itemSupplierService = itemSupplierService;
    }
    @PostMapping("/item")
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        itemService.createItem(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }
    @GetMapping("/item/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
        if (itemService.getItemById(id).isPresent()) {
            return new ResponseEntity<>(itemService.getItemById(id).get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/item/{id}")
    public HttpStatus deleteItemById(@PathVariable Long id) {
       items.remove(id);
        return HttpStatus.NO_CONTENT;
    }


}
