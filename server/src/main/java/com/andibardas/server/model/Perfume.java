package com.andibardas.server.model;

import com.andibardas.server.model.enums.ClothingCategory;
import com.andibardas.server.model.enums.Season;

public class Perfume extends ClothingItem {
    private Season season;

    public Perfume() {

    }

    public Perfume(String name, String brand, String imageUrl, Season season) {
        super(name, brand, ClothingCategory.PERFUMES, imageUrl);
        this.season = season;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
