package com.example.blog.model.service.Impl;


import com.example.blog.model.bean.Category;
import com.example.blog.model.repository.ICategoryRepository;
import com.example.blog.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findAll() {
        return this.iCategoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        this.iCategoryRepository.save(category);
    }

    @Override
    public Category findByid(int id) {
        return this.iCategoryRepository.findById(id).get();
    }

    @Override
    public void delete(Category category) {
        this.iCategoryRepository.delete(category);
    }

    @Override
    public void update(Category category) {

    }
}
