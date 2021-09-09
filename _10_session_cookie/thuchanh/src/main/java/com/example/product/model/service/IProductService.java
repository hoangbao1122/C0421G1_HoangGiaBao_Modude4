package com.example.product.model.service;


import com.example.product.model.bean.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}