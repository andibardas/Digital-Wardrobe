package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;
import com.andibardas.server.model.enums.SleeveType;

public class Shirt extends ClothingItem {
    private SleeveType sleeveType;
    private boolean hasCollar;

    public Shirt() {

    }

    public Shirt(String name, String brand, String color, String size, String material, String imageUrl, SleeveType sleeveType, boolean hasCollar) {
        super(name, brand, ClothingCategory.SHIRTS, color, size, material, imageUrl);
        this.sleeveType = sleeveType;
        this.hasCollar = hasCollar;
    }

    public SleeveType getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(SleeveType sleeveType) {
        this.sleeveType = sleeveType;
    }

    public boolean isHasCollar() {
        return hasCollar;
    }

    public void setHasCollar(boolean hasCollar) {
        this.hasCollar = hasCollar;
    }
}
