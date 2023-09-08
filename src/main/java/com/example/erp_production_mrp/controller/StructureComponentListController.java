package com.example.erp_production_mrp.controller;

import com.example.erp_production_mrp.model.StructureComponentList;
import com.example.erp_production_mrp.services.StructureComponentListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StructureComponentListController {

    private final StructureComponentListService structureComponentListService;

    public StructureComponentListController(StructureComponentListService structureComponentListService) {
        this.structureComponentListService = structureComponentListService;
    }

    @GetMapping("/StructureComponents")
    public ResponseEntity <List<StructureComponentList>> getStructureComponentList(){
        return new ResponseEntity<>(structureComponentListService.getStructureComponentList(), HttpStatus.OK);

    }

    @PostMapping("/StructureComponent")
    public ResponseEntity<StructureComponentList> addComponentsToStructure(
            @RequestBody StructureComponentList structureComponentList){
            structureComponentListService.saveStructureComponentList(structureComponentList);
            return new ResponseEntity<>(structureComponentList, HttpStatus.OK);

    }


}
