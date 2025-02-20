package com.andibardas.server.model;

import com.andibardas.server.model.enums.AccessoriesType;
import com.andibardas.server.model.enums.ClothingCategory;

public class Accessories extends ClothingItem {
    private AccessoriesType type;

    public Accessories() {

    }

    public Accessories(String name, String brand, String color, String size, String material, String imageUrl, AccessoriesType type) {
        super(name, brand, ClothingCategory.ACCESSORIES, color, size, material, imageUrl);
        this.type = type;
    }

    public AccessoriesType getType() {
        return type;
    }

    public void setType(AccessoriesType type) {
        this.type = type;
    }
}
