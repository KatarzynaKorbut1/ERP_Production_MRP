package com.example.erp_production_mrp.model;

public enum Unit {

    PIECES("pieces"), KILOGRAM("kg"),  LITRE("l"), METER("m"), SQUARE_METER("m2");

    private final String typeOfUnit;

    Unit(String typeOfUnit) {
        this.typeOfUnit = typeOfUnit;
    }

    public String getTypeOfUnit() {
        return typeOfUnit;
    }
}
