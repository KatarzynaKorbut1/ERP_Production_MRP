package com.example.erp_production_mrp.model;

public enum Tax {
    VAT_8 ("VAT_8"), VAT_23("VAT_23");
    private final String typeOfTax;

    Tax(String typeOfTax) {
        this.typeOfTax = typeOfTax;
    }
}
