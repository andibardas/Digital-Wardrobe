package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;
import com.andibardas.server.model.enums.JacketType;

public class Jacket extends ClothingItem {
    private JacketType jacketType;

    public Jacket() {

    }

    public Jacket(String name, String brand, String color, String size, String material, String imageUrl, JacketType jacketType) {
        super(name, brand, ClothingCategory.JACKETS, color, size, material, imageUrl);
        this.jacketType = jacketType;
    }

    public JacketType getJacketType() {
        return jacketType;
    }

    public void setJacketType(JacketType jacketType) {
        this.jacketType = jacketType;
    }
}
