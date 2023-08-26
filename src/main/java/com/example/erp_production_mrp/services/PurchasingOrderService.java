package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.PurchasingOrder;
import com.example.erp_production_mrp.repositories.PurchasingOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class PurchasingOrderService {
    PurchasingOrderRepository purchasingOrderRepository;

    public PurchasingOrderService(PurchasingOrderRepository purchasingOrderRepository) {
        this.purchasingOrderRepository = purchasingOrderRepository;
    }
    public void createPurchasingOrderService(PurchasingOrder purchasingOrder){
        purchasingOrderRepository.save(purchasingOrder);
    }
    public PurchasingOrder getPurchasingOrder(Long id){
        return purchasingOrderRepository.findById(id).orElse(null);
    }

}
