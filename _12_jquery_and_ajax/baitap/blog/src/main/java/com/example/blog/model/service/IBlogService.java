package com.example.blog.model.service;

import com.example.blog.model.bean.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    Optional<Blog> findByid(int id);
    void delete(Blog blog);
    void update(Blog blog);
    List<Blog> findAllByNameContaining(String name);
}
