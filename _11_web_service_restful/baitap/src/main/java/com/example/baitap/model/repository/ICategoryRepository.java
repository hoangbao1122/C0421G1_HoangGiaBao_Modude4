package com.example.baitap.model.repository;


import com.example.baitap.model.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Long> {

}
