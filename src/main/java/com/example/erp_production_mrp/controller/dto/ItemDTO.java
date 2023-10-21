package com.example.erp_production_mrp.controller.dto;

import com.example.erp_production_mrp.model.TypeOfItem;
import com.example.erp_production_mrp.model.Unit;

import java.util.List;

public record ItemDTO(TypeOfItem typeOfItem, Unit unit, String indexDescription,
                      Long quantity, Double cost, String partNumber, String indexName){


    public static final class ItemDTOBuilder {
        private TypeOfItem typeOfItem;
        private Unit unit;
        private String indexDescription;
        private Long quantity;
        private Double cost;
        private String partNumber;
        private String indexName;
        private List<StructureDTO> structures;

        private ItemDTOBuilder() {
        }

        public static ItemDTOBuilder anItemDTO() {
            return new ItemDTOBuilder();
        }

        public ItemDTOBuilder withTypeOfItem(TypeOfItem typeOfItem) {
            this.typeOfItem = typeOfItem;
            return this;
        }

        public ItemDTOBuilder withUnit(Unit unit) {
            this.unit = unit;
            return this;
        }

        public ItemDTOBuilder withIndexDescription(String indexDescription) {
            this.indexDescription = indexDescription;
            return this;
        }

        public ItemDTOBuilder withQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        public ItemDTOBuilder withCost(Double cost) {
            this.cost = cost;
            return this;
        }

        public ItemDTOBuilder withPartNumber(String partNumber) {
            this.partNumber = partNumber;
            return this;
        }

        public ItemDTOBuilder withIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        public ItemDTOBuilder withStructures(List<StructureDTO> structures) {
            this.structures = structures;
            return this;
        }

        public ItemDTO build() {
            return new ItemDTO(typeOfItem, unit, indexDescription, quantity, cost, partNumber, indexName);
        }
    }
}

