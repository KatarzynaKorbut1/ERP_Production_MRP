package com.example.erp_production_mrp.service;

import com.example.erp_production_mrp.repositories.ProdOrderRepository;

public class ProdOrderService {

    private final ProdOrderRepository prodOrderRepository;

    public ProdOrderService(ProdOrderRepository prodOrderRepository) {
        this.prodOrderRepository = prodOrderRepository;
    }


}
