package com.example.erp_production_mrp.dto;

import com.example.erp_production_mrp.model.Component;
import com.example.erp_production_mrp.model.StatusType;

import java.time.LocalDate;

public record StructureComponentListDTO(
        Long structureId, Long version, LocalDate startDate, LocalDate stopDate,
        StatusType statusType, Long structureComponentListId, Component component) {

}
