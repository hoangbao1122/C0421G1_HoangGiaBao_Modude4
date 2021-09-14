package com.example.blog.model.repository;


import com.example.blog.model.bean.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    List<Blog> findAllByNameContaining(String name);
}
