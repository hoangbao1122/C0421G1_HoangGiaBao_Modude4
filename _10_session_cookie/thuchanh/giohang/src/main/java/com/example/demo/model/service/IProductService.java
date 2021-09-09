package com.example.demo.model.service;

import com.example.demo.model.bean.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}