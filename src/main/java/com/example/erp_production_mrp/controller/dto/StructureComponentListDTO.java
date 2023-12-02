package com.example.erp_production_mrp.controller.dto;

import com.example.erp_production_mrp.model.Component;
import com.example.erp_production_mrp.model.StatusType;
import com.example.erp_production_mrp.model.StructureComponentList;

import java.time.LocalDate;

public record StructureComponentListDTO(
        Long structureId, Long version, LocalDate startDate, LocalDate stopDate,
        StatusType statusType, StructureComponentList structureComponentList) {


    public static final class StructureComponentListDTOBuilder {
        private Long structureId;
        private Long version;
        private LocalDate startDate;
        private LocalDate stopDate;
        private StatusType statusType;
        private StructureComponentList structureComponentList;

        private StructureComponentListDTOBuilder() {
        }

        public static StructureComponentListDTOBuilder aStructureComponentListDTO() {
            return new StructureComponentListDTOBuilder();
        }

        public StructureComponentListDTOBuilder withStructureId(Long structureId) {
            this.structureId = structureId;
            return this;
        }

        public StructureComponentListDTOBuilder withVersion(Long version) {
            this.version = version;
            return this;
        }

        public StructureComponentListDTOBuilder withStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public StructureComponentListDTOBuilder withStopDate(LocalDate stopDate) {
            this.stopDate = stopDate;
            return this;
        }

        public StructureComponentListDTOBuilder withStatusType(StatusType statusType) {
            this.statusType = statusType;
            return this;
        }

        public StructureComponentListDTOBuilder withStructureComponentList(StructureComponentList structureComponentList) {
            this.structureComponentList = structureComponentList;
            return this;
        }

        public StructureComponentListDTO build() {
            return new StructureComponentListDTO(structureId, version, startDate, stopDate, statusType, structureComponentList);
        }
    }
}
