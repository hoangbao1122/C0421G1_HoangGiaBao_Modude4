package com.example.thi.model.service.product.Impl;

import com.example.thi.model.entity.product.Product;
import com.example.thi.model.respository.product.IProdductRepository;
import com.example.thi.model.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class ProductServiceimpl implements IProductService {
    @Autowired
    private IProdductRepository iProdductRepository;


    @Override
    public Page<Product> findAll(Pageable pageable) {
        return this.iProdductRepository.findAll(pageable);
    }

    @Override
    public void save(Product product) {
        this.iProdductRepository.save(product);
    }

    @Override
    public Optional<Product> findById(long id) {
        return this.iProdductRepository.findById(id);
    }

    @Override
    public void remove(long id) {
        this.iProdductRepository.deleteById(id);
    }

    @Override
    public void update(Product product) {
        this.iProdductRepository.save(product);
    }

    @Override
    public Page<Product> search(Pageable pageable, String name) {
        return null;
    }
}
