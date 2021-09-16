package com.example.blog.model.service;

import com.example.blog.model.entity.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAll();
    void save(Blog blog);
    Optional<Blog> findById(long id);
    void delete(long id);
    Blog edit(Blog blog);
}
