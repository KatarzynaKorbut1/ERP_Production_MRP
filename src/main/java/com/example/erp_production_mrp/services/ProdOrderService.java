package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.ProductionOrder;
import com.example.erp_production_mrp.repositories.ProdOrderRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
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


    public ProductionOrder getProductionOrderById(@Min(1) @NotNull Long id) {
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



    public void updateQuantityById(@Min(1) @NotNull Long poId, @Valid ProductionOrder productionOrderToUpdate) {

        ProductionOrder productionOrder = getProductionOrderById(poId);
        productionOrder.setQuantity(productionOrderToUpdate.getQuantity());
        prodOrderRepository.save(productionOrder);

    }

    public void updateStatusById(@Min(1) @NotNull Long poId, @Valid ProductionOrder productionOrderToUpdate) {

        ProductionOrder productionOrder = getProductionOrderById(poId);
        productionOrder.setStatusType(productionOrderToUpdate.getStatusType());
        prodOrderRepository.save(productionOrder);

    }
}
