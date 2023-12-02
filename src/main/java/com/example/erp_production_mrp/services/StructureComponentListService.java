package com.example.erp_production_mrp.services;

import com.example.erp_production_mrp.model.StructureComponentList;
import com.example.erp_production_mrp.repositories.StructureComponentListRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StructureComponentListService {

    private final StructureComponentListRepository structureComponentListRepository;

    public StructureComponentListService(StructureComponentListRepository structureComponentListRepository) {
        this.structureComponentListRepository = structureComponentListRepository;
    }


    public void saveStructureComponentList(StructureComponentList structureComponentList) {
        structureComponentListRepository.save(structureComponentList);

    }

    public List<StructureComponentList> getStructureComponentList() {
        return structureComponentListRepository.findAll();
    }
}