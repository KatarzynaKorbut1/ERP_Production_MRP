package com.example.erp_production_mrp.model;

import javax.swing.*;

public enum TypeOfItem {

    INGREDIENT("Ingredient"), PRODUCT("Product");

    private final String typeOfComponent;

    TypeOfItem(String typeOfComponent) {
        this.typeOfComponent = typeOfComponent;
    }

    public String getTypeOfComponent() {
        return typeOfComponent;
    }
}
