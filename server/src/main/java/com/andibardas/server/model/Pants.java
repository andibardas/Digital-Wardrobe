package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;
import com.andibardas.server.model.enums.FitType;
import com.andibardas.server.model.enums.PantsCategory;

public class Pants extends ClothingItem {
    private PantsCategory pantsCategory;
    private FitType fitType;

    public Pants() {

    }

    public Pants(String name, String brand, String color, String size, String material, String imageUrl, PantsCategory pantsCategory, FitType fitType) {
        super(name, brand, ClothingCategory.PANTS, color, size, material, imageUrl);
        this.pantsCategory = pantsCategory;
        this.fitType = fitType;
    }

    public PantsCategory getPantsCategory() {
        return pantsCategory;
    }

    public void setPantsCategory(PantsCategory pantsCategory) {
        this.pantsCategory = pantsCategory;
    }

    public FitType getFitType() {
        return fitType;
    }

    public void setFitType(FitType fitType) {
        this.fitType = fitType;
    }
}
