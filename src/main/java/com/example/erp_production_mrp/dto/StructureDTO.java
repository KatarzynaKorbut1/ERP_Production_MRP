package com.example.erp_production_mrp.dto;

import com.example.erp_production_mrp.model.StatusType;

import java.time.LocalDate;

public record StructureDTO(Long structureId, Long version, LocalDate startDate, LocalDate stopDate,
                           StatusType statusType) {


}
