package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;

public class Suit extends ClothingItem {
    public Suit(String name, String brand, String color, String size, String material, String imageUrl) {
        super(name, brand, ClothingCategory.SUITS, color, size, material, imageUrl);
    }
}
