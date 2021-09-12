package com.example.baitap.model.service.Impl;


import com.example.baitap.model.bean.Blog;
import com.example.baitap.model.repository.IBlogRepository;
import com.example.baitap.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Iterable<Blog> findAll() {
        return this.iBlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return this.iBlogRepository.findById(id);
    }

    @Override
    public Blog save(Blog blog) {
        return this.iBlogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        this.iBlogRepository.deleteById(id);
    }
}
