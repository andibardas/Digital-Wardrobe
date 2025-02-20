package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;
import com.andibardas.server.model.enums.ShoesType;

public class Shoes extends ClothingItem {
    private ShoesType shoesType;

    public Shoes() {

    }

    public Shoes(String name, String brand, String color, String size, String material, String imageUrl, ShoesType shoesType) {
        super(name, brand, ClothingCategory.SHOES, color, size, material, imageUrl);
        this.shoesType = shoesType;
    }

    public ShoesType getShoesType() {
        return shoesType;
    }

    public void setShoesType(ShoesType shoesType) {
        this.shoesType = shoesType;
    }
}
