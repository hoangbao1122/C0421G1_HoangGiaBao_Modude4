package com.example.baitap.model.repository;

import com.example.baitap.model.bean.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog,Long> {
}
