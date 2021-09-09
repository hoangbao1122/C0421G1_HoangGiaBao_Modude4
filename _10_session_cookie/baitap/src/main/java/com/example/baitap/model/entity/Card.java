package com.example.baitap.model.entity;

import com.example.baitap.model.dto.ProductDto;

import java.util.HashMap;
import java.util.Map;

public class Card {
    private Map<Product, Integer> productMap = new HashMap<>();

    public Card() {

    }

    public Card(Map<Product, Integer> products) {
        this.productMap = products;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }
}
