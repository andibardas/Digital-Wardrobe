package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;
import com.andibardas.server.model.enums.FitType;
import com.andibardas.server.model.enums.SweatshirtType;

public class Sweatshirt extends ClothingItem {
    private SweatshirtType sweatshirtType;
    private FitType fitType;

    public Sweatshirt() {

    }

    public Sweatshirt(String name, String brand, String color, String size, String material, String imageUrl, SweatshirtType sweatshirtType, FitType fitType) {
        super(name, brand, ClothingCategory.SWEATSHIRTS, color, size, material, imageUrl);
        this.sweatshirtType = sweatshirtType;
        this.fitType = fitType;
    }

    public SweatshirtType getSweatshirtType() {
        return sweatshirtType;
    }

    public void setSweatshirtType(SweatshirtType sweatshirtType) {
        this.sweatshirtType = sweatshirtType;
    }

    public FitType getFitType() {
        return fitType;
    }

    public void setFitType(FitType fitType) {
        this.fitType = fitType;
    }
}
