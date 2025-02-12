package com.andibardas.server.controller;

import com.andibardas.server.model.ClothingItem;
import com.andibardas.server.service.ClothingItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wardrobe")
@CrossOrigin(origins = "http://localhost:3000")
public class ClothingItemController {

    @Autowired
    private ClothingItemService clothingItemService;

    @GetMapping("/items")
    public List<ClothingItem> getAllItems() {
        return clothingItemService.getAllClothingItems();
    }

    @PostMapping("/add")
    public ClothingItem addItem(@RequestBody ClothingItem item) {
        return clothingItemService.addItem(item);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable Long id) {
        clothingItemService.deleteItem(id);
        return "Item deleted";
    }
}
