package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.ProductionOrder;
import com.example.erp_production_mrp.services.ProdOrderService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
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
    public ResponseEntity<ProductionOrder> createProductionOrder(@Valid @RequestBody ProductionOrder productionOrder) {
        prodOrderService.createProdOrder(productionOrder);
        return new ResponseEntity<>(productionOrder, HttpStatus.CREATED);
    }


    @GetMapping("/prodOrder")
    public ResponseEntity<List<ProductionOrder>> getAllProductionsOrders() {
        return new ResponseEntity<>(prodOrderService.getAll(), HttpStatus.OK);

    }

    @GetMapping("/prodOrder/{id}")
    public ResponseEntity<ProductionOrder> getOrderProductionById(@Min(1) @NotNull @PathVariable(value = "id") Long poId) {
        return new ResponseEntity<>(prodOrderService.getProductionOrderById(poId), HttpStatus.OK);

    }

    //http://localhost:8080/api/prodOrder/indexName?indexName=index2
    @GetMapping("/prodOrder/indexName")
    public ResponseEntity<List<ProductionOrder>> getProductionOrderByIndexName(@RequestParam(name = "indexName") String indexName) {
        if (prodOrderService.getProductionOrderByIndexName(indexName).stream().findAny().isPresent()) {
            return new ResponseEntity<>(prodOrderService.getProductionOrderByIndexName(indexName), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @PatchMapping("/prodOrder/updateQuantity/{id}")
    public ResponseEntity<ProductionOrder> updateQuantityOfProductionOrder(@Valid @RequestBody ProductionOrder updatedQuantity, @Min(1) @NotNull @PathVariable(value = "id") Long poId) {
        prodOrderService.updateQuantityById(poId, updatedQuantity);
        return ResponseEntity.ok(updatedQuantity);
    }

    @PatchMapping("/prodOrder/updateStatus/{id}")
    public ResponseEntity<ProductionOrder> updateStatusTypeOfProductionOrder(@Valid @RequestBody ProductionOrder updatedStatus, @Min(1) @NotNull @PathVariable(value = "id") Long poId) {
        prodOrderService.updateStatusById(poId, updatedStatus);
        return ResponseEntity.ok(updatedStatus);
    }

    //metoda do responsywnego przeglądania strony
//    @GetMapping("/prodOrder/date")
//    public ResponseEntity<Page<ProductionOrder>> getData(@RequestParam(defaultValue = "0")int page, @RequestParam(defaultValue = "1") int size){
//        List<ProductionOrder> productionOrderList = getAllProductionsOrders().getBody();
//
//        int totalSize = productionOrderList.size();
//        int startIndex = page + size;
//        int endIndex = Math.min(startIndex + size, totalSize);
//
//        List<ProductionOrder> pageContent = productionOrderList.subList(startIndex, endIndex);
//
//        Page<ProductionOrder> productionOrder = new PageImpl<>(pageContent, PageRequest.of(page, size), totalSize);
//        return ResponseEntity.ok().body(productionOrder);
//
//
//    }


}

