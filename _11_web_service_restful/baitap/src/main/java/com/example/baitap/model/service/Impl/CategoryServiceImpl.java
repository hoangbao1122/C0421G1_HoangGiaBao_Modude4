package com.example.baitap.model.service.Impl;

import com.example.baitap.model.bean.Category;
import com.example.baitap.model.repository.ICategoryRepository;
import com.example.baitap.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;


    @Override
    public Iterable<Category> findAll() {
        return this.iCategoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return this.iCategoryRepository.findById(id);
    }

    @Override
    public Category save(Category category) {
        return this.iCategoryRepository.save(category);
    }

    @Override
    public void remove(Long id) {
        this.iCategoryRepository.deleteById(id);
    }
}
