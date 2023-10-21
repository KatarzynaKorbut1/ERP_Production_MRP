package com.example.erp_production_mrp.controller.dto;

import com.example.erp_production_mrp.model.TypeOfItem;
import com.example.erp_production_mrp.model.Unit;

public record ComponentDTO(TypeOfItem typeOfItem, Unit unit, String indexDescription, Long quantity, Double cost,
                           String partNumber, String indexName) {
    public static final class ComponentDTOBuilder {
        private TypeOfItem typeOfItem;
        private Unit unit;
        private String indexDescription;
        private Long quantity;
        private Double cost;
        private String partNumber;
        private String indexName;

        private ComponentDTOBuilder() {
        }

        public static ComponentDTOBuilder aComponentDTO() {
            return new ComponentDTOBuilder();
        }

        public ComponentDTOBuilder withTypeOfItem(TypeOfItem typeOfItem) {
            this.typeOfItem = typeOfItem;
            return this;
        }

        public ComponentDTOBuilder withUnit(Unit unit) {
            this.unit = unit;
            return this;
        }

        public ComponentDTOBuilder withIndexDescription(String indexDescription) {
            this.indexDescription = indexDescription;
            return this;
        }

        public ComponentDTOBuilder withQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        public ComponentDTOBuilder withCost(Double cost) {
            this.cost = cost;
            return this;
        }

        public ComponentDTOBuilder withPartNumber(String partNumber) {
            this.partNumber = partNumber;
            return this;
        }

        public ComponentDTOBuilder withIndexName(String indexName) {
            this.indexName = indexName;
            return this;
        }

        public ComponentDTO build() {
            return new ComponentDTO(typeOfItem, unit, indexDescription, quantity, cost, partNumber, indexName);
        }
    }
}
