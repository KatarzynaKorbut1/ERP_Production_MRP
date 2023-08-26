package com.example.erp_production_mrp.model;

public enum Unit {
    KG("kg"), M("m"), M2("m2"), M3("m3"), PCS("pcs");

    private final String displayName;

    Unit(String displayName){
        this.displayName = displayName;

    }

    public String getDisplayName(){
        return displayName;
    }
}
