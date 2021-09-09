package com.example.baitap.model.service.Impl;

import com.example.baitap.model.dto.ProductDto;
import com.example.baitap.model.entity.Product;
import com.example.baitap.model.repository.IProductRepository;
import com.example.baitap.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public Iterable<Product> findAll() {
        return this.iProductRepository.findAll();
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.iProductRepository.findById(id);
    }
    @Override
    public void delete(Product product) {
        this.iProductRepository.delete(product);
    }
}
