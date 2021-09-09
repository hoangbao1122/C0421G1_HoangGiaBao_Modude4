package com.example.baitap.model.service;


import com.example.baitap.model.dto.ProductDto;
import com.example.baitap.model.entity.Product;


import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    void save(Product product);
    Optional<Product>findById(Long id);
    void delete(Product product);

}
