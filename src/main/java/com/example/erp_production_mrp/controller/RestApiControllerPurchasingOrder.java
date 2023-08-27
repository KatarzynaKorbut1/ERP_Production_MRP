package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.PurchasingOrder;
import com.example.erp_production_mrp.services.PurchasingOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiControllerPurchasingOrder {
    private final PurchasingOrderService purchasingOrderService;  //pole musi być finalne jak chcemy wstrzyknac przez konstruktor

    public RestApiControllerPurchasingOrder(PurchasingOrderService purchasingOrderService) {
        this.purchasingOrderService = purchasingOrderService;
    }
@PostMapping("/purchasing_order")
public ResponseEntity<PurchasingOrder> createPurchasingOrder(@RequestBody PurchasingOrder purchasingOrder){
        purchasingOrderService.addPurchasingOrderService(purchasingOrder);
        return new ResponseEntity<>(purchasingOrder, HttpStatus.CREATED);
}
@GetMapping("/purchasing_order/{id}")
    public ResponseEntity<PurchasingOrder> getPurchasingOrder(@PathVariable Long id){
        return new ResponseEntity<>(purchasingOrderService.getPurchasingOrderById(id), HttpStatus.OK);
}
}

