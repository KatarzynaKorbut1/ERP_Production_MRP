package com.example.erp_production_mrp.dto;

import com.example.erp_production_mrp.model.TypeOfItem;
import com.example.erp_production_mrp.model.Unit;

import java.util.List;

public record ItemDTO(TypeOfItem typeOfItem, Unit unit, String indexDescription,
                      Long quantity, Double cost, String partNumber, String indexName){

    }

