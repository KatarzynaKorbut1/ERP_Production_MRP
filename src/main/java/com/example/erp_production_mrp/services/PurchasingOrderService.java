package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.PurchasingOrder;
import com.example.erp_production_mrp.repositories.PurchasingOrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PurchasingOrderService {
    PurchasingOrderRepository purchasingOrderRepository;

    public PurchasingOrderService(PurchasingOrderRepository purchasingOrderRepository) {
        this.purchasingOrderRepository = purchasingOrderRepository;
    }
@Transactional
    public void addPurchasingOrderService(PurchasingOrder purchasingOrder){
        purchasingOrderRepository.save(purchasingOrder);
    }
    public PurchasingOrder getPurchasingOrderById(Long id){
        return purchasingOrderRepository.findById(id).orElse(null);
    }
    public List<PurchasingOrder> getAll(){
        return purchasingOrderRepository.findAll();
    }

}
