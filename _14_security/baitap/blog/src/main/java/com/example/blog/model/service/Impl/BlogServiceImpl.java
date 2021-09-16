package com.example.blog.model.service.Impl;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.repository.BlogRepository;
import com.example.blog.model.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return this.blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public Optional<Blog> findById(long id) {
        return this.blogRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        this.blogRepository.deleteById(id);
    }

    @Override
    public Blog edit(Blog blog) {
        return this.blogRepository.save(blog);
    }
}
