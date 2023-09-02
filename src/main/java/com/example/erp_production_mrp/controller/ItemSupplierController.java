package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.ItemSupplier;
import com.example.erp_production_mrp.services.ItemService;
import com.example.erp_production_mrp.services.ItemSupplierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Set;

@RestController
@RequestMapping("/api")
@Slf4j
public class ItemSupplierController {

    ItemSupplierService itemSupplierService;
    ItemService itemService;
    ArrayList<ItemSupplier> suppliers;


    public ItemSupplierController(ItemSupplierService itemSupplierService, ItemService itemService) {
        this.itemSupplierService = itemSupplierService;
        this.itemService = itemService;
    }

    @PutMapping("/assignSupplier")
    public ResponseEntity assignSupplierToItem(@RequestParam Long suppId,
                                               @RequestParam Long itemId) {
        ItemSupplier itemSupplier = itemSupplierService.getItemSupplier(suppId);
        Item itemToSet = itemService.getItem(itemId);
        Set<Item> itemFromSupplier = itemSupplier.getItems();   //wyciągnięcie
        itemFromSupplier.add(itemToSet);                        //aktualizacja zmiennej
        itemSupplier.setItems(itemFromSupplier);                //nadpisanie i wrzucenie spowrotem do ItemSupplier
        itemSupplierService.createSupplier(itemSupplier);       //zapisanie do bazy ItemSupplier

        Set<ItemSupplier> itemSuppliers = itemToSet.getItems();  //pobranie istniejących Supplierów z itemów
        itemSuppliers.add(itemSupplier);                         //dodanie nowego ItemSupplier
        itemToSet.setItems(itemSuppliers);                        //przypisanie nowej listy do Itemów
        itemService.saveItem(itemToSet);                          //zapisanie w DB
        return new ResponseEntity<>(HttpStatus.CREATED);


    }


    @DeleteMapping("/itemSupplier/{id}")
    public HttpStatus deleteItemSupplierBySuppId(@PathVariable int id) {
        suppliers.remove(id);
        return HttpStatus.NO_CONTENT;
    }
}
