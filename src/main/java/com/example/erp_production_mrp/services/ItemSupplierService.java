//package com.example.erp_production_mrp.services;
//import com.example.erp_production_mrp.model.ItemSupplier;
//import com.example.erp_production_mrp.repositories.ItemSupplierRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ItemSupplierService {
//    private final ItemSupplierRepository itemSupplierRepository;
//
//    public ItemSupplierService(ItemSupplierRepository itemSupplierRepository) {
//        this.itemSupplierRepository = itemSupplierRepository;
//    }
//
//    public ItemSupplier getItemSupplier(Long suppId) {
//        ItemSupplier itemSupplier = itemSupplierRepository.findById(suppId).get();
//        return itemSupplier;
//    }
//    public void createSupplier(ItemSupplier itemSupplier) {
//        itemSupplierRepository.save(itemSupplier);
//    }
//}
