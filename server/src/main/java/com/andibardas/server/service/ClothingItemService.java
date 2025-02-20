package com.andibardas.server.service;

import com.andibardas.server.model.ClothingItem;
import com.andibardas.server.repository.ClothingItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothingItemService {

    @Autowired
    private ClothingItemRepository clothingItemRepository;

    public List<ClothingItem> getAllClothingItems() {
        return clothingItemRepository.findAll();
    }

    public ClothingItem addItem(ClothingItem clothingItem) {
        return clothingItemRepository.save(clothingItem);
    }

    public void deleteItem(Long id) {
        clothingItemRepository.deleteById(id);
    }

}
