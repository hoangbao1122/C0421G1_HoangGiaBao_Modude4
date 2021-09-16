package com.example.blog.model.repository;

import com.example.blog.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
