package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.Supplier;
import com.example.erp_production_mrp.repositories.SupplierRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SupplierService {
    SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

}

