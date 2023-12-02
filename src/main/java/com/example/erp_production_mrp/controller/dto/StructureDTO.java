package com.example.erp_production_mrp.controller.dto;

import com.example.erp_production_mrp.model.StatusType;

import java.time.LocalDate;

public record StructureDTO(Long version, LocalDate startDate, LocalDate stopDate,
                           StatusType statusType) {


    public static final class StructureDTOBuilder {
        private Long version;
        private LocalDate startDate;
        private LocalDate stopDate;
        private StatusType statusType;

        private StructureDTOBuilder() {
        }

        public static StructureDTOBuilder aStructureDTO() {
            return new StructureDTOBuilder();
        }



        public StructureDTOBuilder withVersion(Long version) {
            this.version = version;
            return this;
        }

        public StructureDTOBuilder withStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public StructureDTOBuilder withStopDate(LocalDate stopDate) {
            this.stopDate = stopDate;
            return this;
        }

        public StructureDTOBuilder withStatusType(StatusType statusType) {
            this.statusType = statusType;
            return this;
        }

        public StructureDTO build() {
            return new StructureDTO(version, startDate, stopDate, statusType);
        }


    }
}
