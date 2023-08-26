package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.PurchasingOrder;
import com.example.erp_production_mrp.services.PurchasingOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiControllerPurchasingOrder {
    PurchasingOrderService purchasingOrderService;

    public RestApiControllerPurchasingOrder(PurchasingOrderService purchasingOrderService) {
        this.purchasingOrderService = purchasingOrderService;
    }
}

