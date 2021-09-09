package com.example.baitap.model.dto;

import com.example.baitap.model.entity.Product;

import java.util.HashMap;
import java.util.Map;

public class CardDto {
    private  Map<ProductDto, Integer> productMap = new HashMap<>();

    public CardDto() {

    }

    public CardDto(Map<ProductDto, Integer> products) {
        this.productMap = products;
    }

    public Map<ProductDto, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<ProductDto, Integer> productMap) {
        this.productMap = productMap;
    }

    public void addProduct(ProductDto productDto) {    // pt them product vao trong gio hang
        if (productMap.containsKey(productDto)) {   // containkey la da ton tai roi
            Integer currenValue = productMap.get(productDto);
            productMap.put(productDto, currenValue + 1);
        } else {
            productMap.put(productDto, 1);
        }
    }
    public void delete(ProductDto productDto) {    // pt them product vao trong gio hang
        productMap.remove(productDto);
    }

    public Integer countProductQuatity(){
        Integer productCount = 0;
        for (Map.Entry<ProductDto,Integer>entry:productMap.entrySet()){
            productCount += entry.getValue();
        }
        return productCount;
    }
    public Integer countItemQuatity(){
      return   productMap.size();

    }
    public Float countTotalPayment(){
        float payment = 0;
        for (Map.Entry<ProductDto,Integer>entry:productMap.entrySet()){
            payment += entry.getKey().getPrice() * entry.getValue();
        }
        return payment;
    }
    public void deleteCard(ProductDto productDto){
        productMap.remove(productDto);
    }
}
