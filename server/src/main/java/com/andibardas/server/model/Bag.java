package com.andibardas.server.model;

import com.andibardas.server.model.enums.BagType;
import com.andibardas.server.model.enums.ClothingCategory;

public class Bag extends ClothingItem {
    private BagType bagType;

    public Bag() {

    }

    public Bag(String name, String brand, String color, String size, String material, String imageUrl, BagType bagType) {
        super(name, brand, ClothingCategory.BAGS, color, size, material, imageUrl);
        this.bagType = bagType;
    }

    public BagType getBagType() {
        return bagType;
    }

    public void setBagType(BagType bagType) {
        this.bagType = bagType;
    }
}
