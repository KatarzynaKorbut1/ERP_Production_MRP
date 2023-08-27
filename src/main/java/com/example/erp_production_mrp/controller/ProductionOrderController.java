package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.ProductionOrder;
import com.example.erp_production_mrp.services.ProdOrderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductionOrderController {

    private final ProdOrderService prodOrderService;

    public ProductionOrderController(ProdOrderService prodOrderService) {
        this.prodOrderService = prodOrderService;
    }


    @PostMapping("/prodOrder")
    public ResponseEntity<ProductionOrder> createProductionOrder(@Valid @RequestBody ProductionOrder productionOrder){
        prodOrderService.createProdOrder(productionOrder);
        return new ResponseEntity<>(productionOrder, HttpStatus.CREATED);
    }


    @GetMapping("/prodOrder")
    public ResponseEntity<List<ProductionOrder>> getProductionOrders(){
        return new ResponseEntity<>(prodOrderService.getAll(), HttpStatus.OK);

    }

    //http://localhost:8080/api/prodOrder/indexName?indexName=index2
    @GetMapping("/prodOrder/indexName")
    public ResponseEntity<List<ProductionOrder>> getProductionOrderByIndexName(@RequestParam(name = "indexName") String indexName) {
//        if (prodOrderService.getProductionOrderByIndexName(indexName).contains(indexName)) {
            return new ResponseEntity<>(prodOrderService.getProductionOrderByIndexName(indexName), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }


    }
}
