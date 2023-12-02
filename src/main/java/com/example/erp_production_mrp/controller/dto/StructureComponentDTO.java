package com.example.erp_production_mrp.controller.dto;

import com.example.erp_production_mrp.model.Unit;

import java.util.List;

public record StructureComponentDTO(Unit unit, String indexDescription, Long quantity,
                                    String indexName, List<StructureComponentListDTO> structureComponentLists) {


    public static final class StructureComponentDTOBuilder {
        private Unit unit;
        private String indexDescription;
        private Long quantity;
        private String indexName;
        private List<StructureComponentListDTO> structureComponentLists;

        private StructureComponentDTOBuilder() {
        }

        public static StructureComponentDTOBuilder aStructureComponentDTO() {
            return new StructureComponentDTOBuilder();
        }

        public StructureComponentDTOBuilder withUnit(Unit unit) {
            this.unit = unit;
            return this;
        }

        public StructureComponentDTOBuilder withIndexDescription(String indexDescription) {
            this.indexDescription = indexDescription;
            return this;
        }

        public StructureComponentDTOBuilder withQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        public StructureComponentDTOBuilder withIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        public StructureComponentDTOBuilder withStructureComponentLists(List<StructureComponentListDTO> structureComponentLists) {
            this.structureComponentLists = structureComponentLists;
            return this;
        }

        public StructureComponentDTO build() {
            return new StructureComponentDTO(unit, indexDescription, quantity, indexName, structureComponentLists);
        }
    }
}
