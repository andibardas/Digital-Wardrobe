package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;
import com.andibardas.server.model.enums.JewelleryType;

public class Jewellery extends ClothingItem {
    private JewelleryType type;

    public Jewellery() {

    }

    public Jewellery(String name, String brand, String color, String size, String material, String imageUrl, JewelleryType type) {
        super(name, brand, ClothingCategory.JEWELLERY, color, size, material, imageUrl);
        this.type = type;
    }

    public JewelleryType getType() {
        return type;
    }

    public void setType(JewelleryType type) {
        this.type = type;
    }
}
