package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.Stock;
import com.example.erp_production_mrp.services.StockService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StockController {
private final StockService stockService;
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/stock")
    public ResponseEntity<Stock> createStock(@Valid @RequestBody Stock stock){
        stockService.createStock(stock);
        return new ResponseEntity<>(stock, HttpStatus.CREATED);
    }

}



