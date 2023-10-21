package com.example.erp_production_mrp.controller.dto;

import com.example.erp_production_mrp.model.TypeOfItem;
import com.example.erp_production_mrp.model.Unit;

import java.util.List;

public record ItemStructureDTO(String IndexName, TypeOfItem typeOfItem, Unit unit, String indexDescription,
                               List<StructureDTO> structures) {
    public static final class ItemStructureDTOBuilder {
        private String IndexName;
        private TypeOfItem typeOfItem;
        private Unit unit;
        private String indexDescription;
        private List<StructureDTO> structures;

        private ItemStructureDTOBuilder() {
        }

        public static ItemStructureDTOBuilder anItemStructureDTO() {
            return new ItemStructureDTOBuilder();
        }

        public ItemStructureDTOBuilder withIndexName(String IndexName) {
            this.IndexName = IndexName;
            return this;
        }

        public ItemStructureDTOBuilder withTypeOfItem(TypeOfItem typeOfItem) {
            this.typeOfItem = typeOfItem;
            return this;
        }

        public ItemStructureDTOBuilder withUnit(Unit unit) {
            this.unit = unit;
            return this;
        }

        public ItemStructureDTOBuilder withIndexDescription(String indexDescription) {
            this.indexDescription = indexDescription;
            return this;
        }

        public ItemStructureDTOBuilder withStructures(List<StructureDTO> structures) {
            this.structures = structures;
            return this;
        }

        public ItemStructureDTO build() {
            return new ItemStructureDTO(IndexName, typeOfItem, unit, indexDescription, structures);
        }
    }
}



