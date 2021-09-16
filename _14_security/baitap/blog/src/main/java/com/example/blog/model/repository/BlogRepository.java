package com.example.blog.model.repository;

import com.example.blog.model.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
