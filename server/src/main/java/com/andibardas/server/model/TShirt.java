package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;
import com.andibardas.server.model.enums.FitType;
import com.andibardas.server.model.enums.SleeveType;

public class TShirt extends ClothingItem {
    private SleeveType sleeveType;
    private FitType fitType;

    public TShirt() {

    }

    public TShirt(String name, String brand, String color, String size, String material, String imageUrl, SleeveType sleeveType, FitType fitType) {
        super(name, brand, ClothingCategory.TSHIRTS, color, size, material, imageUrl);
        this.sleeveType = sleeveType;
        this.fitType = fitType;
    }

    public SleeveType getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(SleeveType sleeveType) {
        this.sleeveType = sleeveType;
    }

    public FitType getFitType() {
        return fitType;
    }

    public void setFitType(FitType fitType) {
        this.fitType = fitType;
    }
}
