package com.example.erp_production_mrp.dto;

import com.example.erp_production_mrp.model.Item;
import com.example.erp_production_mrp.model.Structure;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
//@ToString
public class ItemStructureDTO  {

    private String IndexName;
    private List<Structure> structures;


}

//        this.indexDescription = indexDescription;
//        this.quantity = quantity;
//        this.cost = cost;
//        this.partNumber = partNumber;
//        this.indexName = indexName;

