package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;
import jakarta.persistence.*;

@Entity
public class ClothingItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String brand;
    private ClothingCategory category;
    private String color;
    private String size;
    private String material;
    private String imageUrl;

    public ClothingItem() {

    }
    public ClothingItem(String name, String brand, ClothingCategory category, String color, String size, String material, String imageUrl) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.color = color;
        this.size = size;
        this.material = material;
        this.imageUrl = imageUrl;
    }

    public ClothingItem(String name, String brand, ClothingCategory category, String imageUrl) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ClothingCategory getCategory() {
        return category;
    }

    public void setCategory(ClothingCategory category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
