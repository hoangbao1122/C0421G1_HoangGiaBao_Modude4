package com.example.blog.model.service.Impl;

import com.example.blog.model.bean.Blog;
import com.example.blog.model.repository.IBlogRepository;
import com.example.blog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return this.iBlogRepository.findAll(pageable);
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public Optional<Blog> findByid(int id) {
        return this.iBlogRepository.findById(id);
    }

    @Override
    public void delete(Blog blog) {
        this.iBlogRepository.delete(blog);
    }

    @Override
    public void update(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public List<Blog> findAllByNameContaining(String name) {
        return this.iBlogRepository.findAllByNameContaining(name);
    }


}
