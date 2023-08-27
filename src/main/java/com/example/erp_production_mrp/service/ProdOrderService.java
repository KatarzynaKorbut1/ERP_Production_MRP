package com.example.erp_production_mrp.service;

import com.example.erp_production_mrp.model.ProductionOrder;
import com.example.erp_production_mrp.repositories.ProdOrderRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdOrderService {


    private final ProdOrderRepository prodOrderRepository;

    private final EntityManager entityManager;

    protected ProdOrderService(ProdOrderRepository prodOrderRepository, EntityManager entityManager) {
        this.prodOrderRepository = prodOrderRepository;
        this.entityManager = entityManager;
    }


    public void createProdOrder(ProductionOrder productionOrder){
        prodOrderRepository.save(productionOrder);
    }

    public ProductionOrder getProductionOrderById(Long id) {
        return prodOrderRepository.findById(id).orElse(null);

    }

    public List<ProductionOrder> getProductionOrderByIndexName(String indexName) {
        TypedQuery<ProductionOrder> query = entityManager.createQuery("FROM ProductionOrder WHERE indexName=:indexName", ProductionOrder.class);
        query.setParameter("indexName", indexName);
        return query.getResultList();
    }

     public List<ProductionOrder> getAll(){
        return prodOrderRepository.findAll();
    }


}
